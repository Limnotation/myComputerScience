import java.awt.List;

import org.graalvm.compiler.lir.CompositeValue.Component;

/**
 * 异步处理投保消息kafka监听
 */
@Component
public class AsyncInsuranceListener implements IStringMessageConsumeListener<String>{

    @Autowired
    private ApplyInsureService applyInsureService;

    /**
     * 监听消息
     */
    @Override
    public void onMessage(List<String> messageList) throws KafkaConsumeRetryException {
        logger.info("kafka消费处理开始，异步处理投保，处理数据量:{}", messageList.size());
        long ts = System.currentTimeMillis();
        String transBizId = null;
        String orderSn = null;
        for(String msg:messageList) {
            if(StringUtils.isBlank(msg)) {
                logger.warn("异步处理投保-接收到的消息内容为空");
                continue;
            }
            logger.info("异步处理投保-消息内容:{}", msg);
            try {
                JSONObject msgJson = JSON.parseObject(msg);
                orderSn = msgJson.getString("orderSn");
                transBizId = msgJson.getString("transBizId");
                Integer cusSysId = msgJson.getInteger("cusSysId");
                Integer retryType = msgJson.getInteger("retryType");
                // 异步处理投保业务
                GeneralRtnVO<?> rs = applyInsureService.handleApplyInsure(transBizId, orderSn, cusSysId, retryType);
                logger.info("异步处理投保业务-返回结果:{}", JSON.toJSONString(rs));
            } catch (JSONException je){
                logger.error("异步处理投保业务-json格式转换异常");
            } catch (Exception e) {
                logger.error("异步处理投保业务-异常，交易号:{}, 订单号:{}", transBizId, orderSn, e);
                throw e;
            }
        }
        logger.info("kafka消费处理完成，异步处理投保-耗时:{}ms", (System.currentTimeMillis() - ts));
    }
}