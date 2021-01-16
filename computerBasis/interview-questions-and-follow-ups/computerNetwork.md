## TCP

### 1、TIME_WAIT出现在哪个阶段，并发量大的情况下TIME_WAIT同时大量存在有什么措施？

① 出现在主动关闭连接方的最后一个阶段，在收到对方的FIN码以及自己发送ACK码后。TIME_WAIT大量存在造成端口号不足使得建立其他新连接失败。

②措施: 

​	 第一是降低TIME_WAIT的等待时间

​	第二是设置处于TIME_WAIT的端口可重用

具体分析参考:https://blog.csdn.net/zl1zl2zl3/article/details/107676367

------

