import org.graalvm.compiler.lir.CompositeValue.Component;

/**
 * 投保业务的消费者
 */

 @Component
 public class ApplyInsureConsumer {

    @Autowired
    private AsyncInsuranceListener asyncInsuranceListener;

    @Autowired
    private PolicyToIbsListener policyToIbsListener;

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
     * 消费者应用的token
     */
    @Value("${kafka.consumer.systemIdToken}")
    private String systemIdToken;

    /**
     * 消息消费线程数
     */
    @Value(value = "${kafka.consumer.threadCount}")
    private int consumeThreadCount;

    /**
     * 要消费的消息主题-投保异步处理
     */
    @Value(value = "${kafka.consumer.topic.applyInsureAsync}") 
    private String ctopicApplyInsureAsync;

    /**
     * 要消费的消息主题-保单同步核心异步处理
     */
    @Value(value = "${kafka.consumer.topic.policyToIbsAsync}")
    private String ctopicPolicyToIbsAsync;

    /**
     * 网销中心服务消费者注册
     */
    @PostConstruct
    public void init() throws KafkaException {
        // 记录日志信息，包括各种配置和初始化信息
        logger.info("....");

        // 1、处理投保消费者注册
        ConsumeConfig aiaConsumeCfg = new ConsumeConfig(systemIdToken, monitorUrl, 
            clusterName, ctopicApplyInsureAsync, consumeThreadCount);
        // 注册异步处理投保消费任务，String方式，简易模式
        boolean applyHandleRegisterFlag = KafkaConsumerRegister.registerStringConsumer(aiaConsumeCfg, asyncInsuranceListener);
        logger.info("...");

        // 2、保单同步核心消费者注册
        ConsumeConfig ptiConsumeCfg = new ConsumeConfig(systemIdToken, monitorUrl, 
        clusterName, ctopicPolicyToIbsAsync, consumeThreadCount);
        boolean policyToIbsRegisterFlag = KafkaConsumerRegister.registerStringConsumer(ptiConsumeCfg, policyToIbsListener);
        logger.info("...");
    }

    /**
     * 注销消费者
     */
    public void close() {
        KafkaConsumerRegister.unregister(ctopicApplyInsureAsync);
        logger.info("...");

        KafkaConsumerRegister.unregister(ctopicPolicyToIbsAsync);
        logger.info("...");
    }
 }