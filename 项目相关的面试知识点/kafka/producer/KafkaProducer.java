import org.graalvm.compiler.lir.CompositeValue.Component;

/**
 * 消息生产者
 */
@Component
public class KafkaProducer {
    private IKafkaProducer kafkaProducerPool;

    /**
     * kafka监视器url
     */
    @Value("${kafka.monitorUrl}")
    private String monitorUrl;

    /**
     * kafka集群名称
     */
    @Value("${kafka.clusterName}") 
    private String clusterName;

    /**
     * 生产者资源池大小
     */
    @Value("${kafka.producer.poolSize}")
    private int producerPoolSize;

    @Value("${kafka.producer.topicTokens}")
    private String topicTokens;

    /**
     * 投保异步请求的topic
     */
    @Value("${kafka.producer.topic.applyInsureAsync}")
    private String ptopicApplyInsureAsync;

    /**
     * 保单同步核心的topic
     */
    @Value("${kafka.producer.topic.policyToIbsAsync}")
    private String ptopicPolicyToIbsAsync;


    /**
     * 初始化kafka生产者配置
     */
    @PostConstruct
    public void init() {
        // 创建连接
        try {
            ProduceConfig produceConfig = new ProduceConfig(producerPoolSize, monitorUrl, clusterName, topicTokens);
            kafkaProducerPool = new ProducerPool(produceConfig);
        } catch(Exception e) {
            // 异常处理
        }
    }

    /**
     * 发送投保请求异步处理消息
     */
    public boolean pushApplyInsureAsyncMsg(String message) {
        if(StringUtils.isBlank(message)) {
            return false;
        }
        try {
            // 日志记录
            logger.info(".....");
            kafkaProducerPool.sendString(ptopicApplyInsureAsync, message);
            return true;
        } catch (Exception e) {
            // 日志记录
            logger.info(".....");
        }
        return false;
    }

    /**
     * 发送保单同步核心异步处理消息
     */
    public boolean pushPolicyTIbsAsync(String message) {
        if(StringUtils.isBlank(message)) {
            return false;
        }
        try {
            // 日志记录
            logger.info(".....");
            kafkaProducerPool.sendString(ptopicPolicyToIbsAsync, message);
            return true;
        } catch (Exception e) {
            // 日志记录
            logger.info(".....");
        }
        return false;
    }

    /**
     * 发送指定topic的消息
     */
    public boolean pushMsgByTopic(String topic, String message) {
        if(StringUtils.isAnyBlank(topic, message)) {
            return false;
        }
        try {
            // 日志记录
            logger.info(".....");
            kafkaProducerPool.sendString(topic, message);
            return true;
        } catch (Exception e) {
            // 日志记录
            logger.info(".....");
        }
        return false;
    }
}