## 计算机网络

### TCP

#### 1、TIME_WAIT出现在哪个阶段，并发量大的情况下TIME_WAIT同时大量存在有什么措施？

① 出现在主动关闭连接方的最后一个阶段，在收到对方的FIN码以及自己发送ACK码后。TIME_WAIT大量存在造成端口号不足使得建立其他新连接失败。

②措施: 

​	 第一是降低TIME_WAIT的等待时间

​	第二是设置处于TIME_WAIT的端口可重用

具体分析参考:https://blog.csdn.net/zl1zl2zl3/article/details/107676367

------

## 操作系统

### 内存

####  操作系统为什么要设置虚拟内存，主要用于解决什么问题？

1. 虚拟内存可以结合磁盘和物理内存的优势为进程提供看起来速度足够快并且容量足够大的存储，它把主存看作一个存储在硬盘上的虚拟地址空间的高速缓存，并且只在主存中缓存活动区域（按需缓存）
2. 它为每个进程提供了一个一致的地址空间，从而降低内存管理的复杂性
3. 它保护了每个进程的地址空间不被其他进程破坏

-----

### 进程

#### copy-on-write

写入时复制（英语：Copy-on-write，简称COW）是一种计算机[程序设计](https://wikipedia.hk.wjbk.site/baike-程式設計)领域的优化策略。其核心思想是: 如果有多个调用者（callers）同时请求相同资源（如内存或磁盘上的数据存储），他们会共同获取相同的指针指向相同的资源，直到某个调用者试图修改资源的内容时，系统才会真正复制一份专用副本（private copy）给该调用者，而其他调用者所见到的最初的资源仍然保持不变。这过程对其他的调用者都是透明的。此作法主要的优点是如果调用者没有修改该资源，就不会有副本（private copy）被创建，因此多个调用者只是读取操作时可以共享同一份资源

----

## Linux

### linux查看进程怎么看？

- ps: 查看某个时间点的进程信息

    > ​	ps -l : 进查看自己的bash相关进程
    >
    > ​	ps aux: 查看系统所有进程

- top: 动态查看进程的变化
- pstree: 查看进程树

参考：《鸟哥私房菜》p524

-----

## mysql

### mysql如何解除死锁

```mysql
解除正在死锁的状态有两种方法：

第一种：
	1.查询是否锁表
	  show OPEN TABLES where In_use > 0;
	2.查询进程（如果您有SUPER权限，您可以看到所有线程。否则，您只能看到您自己的线程）
	  show processlist
	3.杀死进程id（就是上面命令的id列）
	  kill id
	  
第二种：
	1.查看下在锁的事务 
	  SELECT * FROM INFORMATION_SCHEMA.INNODB_TRX;
	2.杀死进程id（就是上面命令的trx_mysql_thread_id列）
	  kill 线程ID

其它关于查看死锁的命令：
    1：查看当前的事务
      SELECT * FROM INFORMATION_SCHEMA.INNODB_TRX;

    2：查看当前锁定的事务
      SELECT * FROM INFORMATION_SCHEMA.INNODB_LOCKS;

    3：查看当前等锁的事务
      SELECT * FROM INFORMATION_SCHEMA.INNODB_LOCK_WAITS;
```



------

## Redis

### redis持久化有哪几种方式

- RDB：将某一时刻的数据库状态全量保存到二进制格式文件中

    ​		特点：文件体积小，恢复速度快；由于需要遍历数据库，存在时效性和停机风险

- AOF：将所有修改数据库的写命令以协议文本格式存储

    ​		特点：数据丢失的时间窗口小；文件体积较大，恢复速度较慢

- RDB-AOF混合持久化：基于AOF持久化模式构建，发生在AOF重写过程中

    ​		特点：1、重写后的AOF文件前半部分是RDB格式的全量数据，后半段是AOF格式的增量						数据

    ​				   2、混合持久化的优势在于通过RDB实现数据快速恢复，同时通过AOF控制数据丢						失的时间在1s之内

### 2、redis主从同步（复制）是怎样的过程？

1. 使用 SLAVEOF命令或设置slaveof选项可以进行主从同步
2. 主从同步分为同步和命令传播两个步骤
    - 同步：将从服务器的数据库状态更新成主服务器当前的数据库状态
    - 命令传播：当主服务器数据库状态被修改后，导致主从服务器数据库状态不一致，此时需要让主从数据同步到一致的过程
3. 主从同步过程分为初次复制和断线后复制两种情况

参考：https://www.jb51.net/article/156147.htm

### 3、redis的zset是怎么实现的？

跳表



-----

## kafka

### kafka选主是怎么做的

- 参考：https://www.cnblogs.com/tonggc1668/p/12051030.html

### **kafka** 分区怎么同步的

- kafka的分区存在多副本机制，有leader和follower两种角色；
- leader负责与生产者和消费者交互，follower会从leader拉取消息实现与leader的同步

-----

## 分布式

### raft算法和paxos算法

- 参考：《从paxos到zookeeper》、http://blog.itpub.net/31556438/viewspace-2637112/