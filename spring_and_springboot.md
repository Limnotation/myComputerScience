## Spring

### 1、spring的特点

1. **轻量级**：spring是非侵入式框架，其中的对象不依赖spring的特定类
2. **控制反转(IoC)**：通过IoC，促进了低耦合，一个对象依赖的其他对象通过被动的方式传递进来，而不用该对象主动创建或查找
3. **面向切面(AOP)**：支持面向切面编程，将应用业务逻辑和系统服务层分开
4. **容器**：包含管理应用对象的配置以及生命周期，此时spring相当于一个容器
5. **框架集合**：能将简单的组件进行配置，组合成更为复杂的应用；在spring中，应用对象被声明式地组合在一个xml文件中；此外，spring也提供了事务管理、持久化框架集成等基础功能，将应用逻辑的开发留给开发者

### 2、spring有哪些核心组件

![Spring主要模块](../mdPics/Spring%E4%B8%BB%E8%A6%81%E6%A8%A1%E5%9D%97.png)

1. **Spring Core**:提供Spring框架基本功能，主要组件是BeanFactory，是工厂模式的实现，通过IoC机制将应用程序的配置和依赖性规范与实际的应用程序代码分开
2. **Spring Context**:一个配置文件，给Spring框架提供上下文信息，上下文包括JNDI、EJB、电子邮件、国际化、校验和和调度等企业服务
3. **Spring AOP**:通过配置管理特性，Spring AOP直接将AOP功能集成到Spring框架，从而使得我们能够十分方便的使用Spring框架来管理任何支持AOP的对象。该模块为基于Spring的应用程序中的对象提供了事务管理服务。通过使用该组件，可以不依赖其他组件就将声明性事务管理集成到应用程序中
4. **Spring DAO**:JDBC DAO抽象层提供了有意义的异常层次结构，可以用来管理异常处理和不同数据供应商抛出的错误信息。异常层次结构简化了错误处理，而且极大降低了需要编写的异常代码数量。Spring DAO面向JDBC的异常遵从通用的DAO异常层次结构
5. **Spring ORM**:Spring 框架中插入了若干了ORM框架，从而提供了ORM的对象关系工具，其中包括了JDO、Hibernate和iBatis SQL Map，这些都遵从Spring的通用事务和DAO异常层次结构
6. **Spring Web**:Web上下文模块建立在应用程序上下文模块之上，为基于Web的应用程序提供了上下文，同时还简化了处理多部分请求以及请求参数绑定到域对象的工作

### 3、Spring常用注解

> [javaguide:spring常用注解详解](https://snailclimb.gitee.io/javaguide/#/./docs/system-design/framework/spring/SpringBoot+Spring%E5%B8%B8%E7%94%A8%E6%B3%A8%E8%A7%A3%E6%80%BB%E7%BB%93)

### 4、IoC原理

#### 4.1、定义

Spring通过一个配置文件来描述Bean之间的相互依赖关系，利用java的反射功能来示例化Bean并建立Bean之间的依赖关系。Spring的IoC容器在完成这些底层功能的基础上，还提供Bean实例化缓存、声明周期管理、Bean实例代理、事件发布、资源装载等高级服务

总结而言：**IoC负责创建对象、管理对象(通过依赖注入)、整合对象、配置对象以及管理对象的生命周期**

> IoC 即**控制反转**，简单来说就是把原来代码里需要实现的对象创建、依赖反转给容器来帮忙实现，需要创建一个容器并且需要一种描述让容器知道要创建的对象间的关系，在 Spring 中管理对象及其依赖关系是通过 Spring 的 IoC 容器实现的。
>
> IoC 的实现方式有**依赖注入**和**依赖查找**，由于依赖查找使用的很少，因此 IoC 也叫做依赖注入。依赖注入指对象被动地接受依赖类而不用自己主动去找，对象不是从容器中查找它依赖的类，而是在容器实例化对象时主动将它依赖的类注入给它
>
> DI是对IoC更为准确的描述，即组件之间的关系由容器在运行期决定，即**由容器动态地将某种依赖关系注入到组件之中**
>
> - 依赖注入是从应用程序的角度阐述：**应用程序依赖容器**创建并注入它所需要的外部资源
> - 控制反转是从容器的角度在描述：**容器控制应用程序**，由容器反向地向应用程序注入应用程序所需要的外部资源

#### 4.2、Spring容器高层视图

![img](../mdPics/imgiIOC.png)

1. Spring启动时先读取Bean配置信息，并在Spring容器中生成一份对应的Bean配置注册表；
2. 根据上一步生成的Bean配置注册表来实例化Bean，并装配好Bean之间的依赖关系；
3. 将示例化后的Bean装载到Spring容器中的Bean缓存池中，供上层的应用程序使用；

#### 4.3、Spring Bean的作用域及生命周期

> Spring中，用来组成应用程序的主体以及由Spring IoC容器所管理的对象叫做Bean。简而言之，Bean就是由IoC容器来进行初始化、装配及管理的对象

##### 4.3.1 作用域

1. **Singleton**
    - 作用域为Singleton，表明IoC容器中只会存在一个共享Bean实例，而且所有对Bean的请求，主要id和该Bean定义匹配，那么就会返回Bean的同一实例
    - Singleton是单例模型，即在创建容器的同时就会自动创建该Bean的一个对象，无论是否使用，而且**每次获取到的对象都是同一个对象**
    - **该模式在多线程下不安全**。
    - Spring中的Bean**默认**都是单例的
2. **Prototype**
    - 作用域为Prototype，表明一个Bean定义对应多个实例，该作用域中的Bean会在每次对该Bean请求均创建一个新的Bean实例
    - Prototype是一个原型类型，在创建容器时并未示例化Bean，只当需要获取Bean时采取创建一个对象，所以每次获取的对象都不一样
3. **Request**
    - 作用域为Request，表明**在一次HTTP请求中，容器返回该Bean的同一个实例**，记每个HTTP请求均有各自的Bean实例，依据某个Bean定义创建而成，只在基于Web的Spring ApplicationContext情形下有效
    - 当一次HTTP请求处理结束时，该作用域中的Bean实例均被销毁
4. **Session**
    - 作用域为Session，表明**在一个HTTP Session中，容器返回该Bean的同一个实例**，对不同的Session则创建新的实例，该Bean仅在当前Session内有效，直在基于Web 的Spring ApplicationContext情形下有效
    - 当一个HTTP Session被废弃时，在该作用域内的Bean将失效

| 作用域类别      | 描述                                                         |
| --------------- | ------------------------------------------------------------ |
| singleton(单例) | 在Spring IoC容器中仅存在一个Bean实例 （默认的scope）         |
| prototype(多例) | 每次从容器中调用Bean时，都返回一个新的实例，即每次调用getBean()时 ，相当于执行new XxxBean()：不会在容器启动时创建对象 |
| request(请求)   | 用于web开发，将Bean放入request范围 ，request.setAttribute(“xxx”) ， 在同一个request 获得同一个Bean |
| session(会话)   | 用于web开发，将Bean 放入Session范围，在同一个Session 获得同一个Bean |

##### 4.3.2 生命周期

1. Bean容器找到配置文件Spring Bean的定义

2. Bean容器使用Java Reflection API创建一个Bean的实例

3. 如果涉及到一些属性值则利用set()方法设置

4. 检查Aware相关接口并设置相关依赖

    - 如果Bean实现了BeanNameAware接口，调用setBeanName()方法，传入Bean的名字

    - 如果Bean实现了BeanClassLoaderAware接口，调用setBeanClassLoader()方法，传入ClassLoader对象的实例

    - 如果实现了其他*.Aware接口，调用相应的set()方法

5. 如果有和加载这个Bean的Spring容器相关的BeanPostProcessor对象，执行postProcessBeforeInitialization()方法

6. 如果Bean实现了InitializingBean接口，执行afterPropetiesSet()方法

7. 如果Bean在配置文件中的定义包含init-method属性，执行指定的方法

8. 如果有和加载这个Bean的Spring容器相关的BeanPostProcessor对象，执行postProcessAfterInitialization()方法

9. 此时，Bean已经准备就绪，可以被应用程序使用，它们将一直驻留在应用程序上下文中，直到该应用容器被销毁

10. 当要销毁Bean时，如果Bean实现了DisposableBean接口，执行destroy()方法;如果Bean在配置文件的定义中包含了destroy-method属性，也会执行该属性指定的方法

图示1：

![Spring Bean 生命周期](../mdPics/48376272.jpg)

图示2：

![Spring Bean 生命周期](../mdPics/5496407.jpg)

#### 4.4、Spring依赖注入的四种方式

1. 构造器注入

    IoC Service Provider会检查被注入对象的构造器，取得它所需要的依赖对象列表，进而为其注入相应的对象

    - 优点：对象构造完成后就处于就绪状态，可以马上使用
    - 缺点：当依赖对象较多时，构造器的参数列表会比较长，构造器无法被继承，无法设置默认值；对于非必须的依赖处理可能需要引入多个构造器，参数的变动可能会造成维护的困难

    ```java
    public CatDaoImpl(String name) {
        this.name = name
    }
    ```

    ```xml
    <bean id = "CatDaoImpl" class = "com.cunyu.CatDaoImpl">
        <constructor-arg value="name"></constructor-arg>
    </bean>
    ```

    

2. setter方法注入

    当前对象只需要为其依赖对象对应的属性添加setter方法，就可通过setter方法将依赖对象注入到被依赖对象中

    - 优点：setter方法注入在描述性上要比构造器注入强，并且可以被继承，允许设置默认值
    - 缺点：无法在对象构造完成后马上进入就绪状态

    ```java
    public class Id {
        private int id;
        
        public int getId() {
            return id;
        }
        
        public void setId(int id) {
            this.id = id;
        }
    }
    ```

    ```xml
    <bean id="id" class = "com.cunyu.Id">
        <property name="id" value="1801333"></property>
    </bean>
    ```

3. 静态工厂注入

    所谓静态工厂注入就是通过调用静态工厂的方法来获取自己所需对象，而且为了方便Spring管理，我们不能通过 类.静态方法 的方式来获取对象，而应该通过Spring注入的形式

    ```java
    // 静态工厂
    public class DaoFactory {
        public static final FactoryDao getStaticFactoryDaoImpl(){
            return new StaticFacotryDaoImpl();
        }
    }
    public class SpringAction {
        // 需要注入的对象
        private FactoryDao staticFactoryDao; 
        // 注入对象的 set 方法
        public void setStaticFactoryDao(FactoryDao staticFactoryDao) {
            this.staticFactoryDao = staticFactoryDao;
        }
    }
    ```

    ```xml
    <bean name="springAction" class="com.cunyu.SpringAction" >
        <!--利用静态工厂的方法注入对象-->
        <property name="staticFactoryDao" ref="staticFactoryDao"></property>
    </bean>
    <!--从工厂类获取静态方法-->
    <bean name="staticFactoryDao" class="com.cunyu.DaoFactory" factory-method="getStaticFactoryDaoImpl"></bean>
    ```

4. 实例工厂

    实例工厂表示获取对象实例的方法不是静态的，所以需要先new工厂类，然后再调用普通的实例方法

    ```java
    // 实例工厂
    public class DaoFactory { 
        public FactoryDao getFactoryDaoImpl(){
            return new FactoryDaoImpl();
        }
    }
    public class SpringAction {
        // 注入对象
        private FactoryDao factoryDao; 
        public void setFactoryDao(FactoryDao factoryDao) {
            this.factoryDao = factoryDao;
        }
    }
    ```

    ```xml
    <bean name="springAction" class="com.cunyu.SpringAction">
        <!--使用实例工厂的方法注入对象,对应下面的配置文件-->
        <property name="factoryDao" ref="factoryDao"></property>
    </bean>
    
    <!--此处获取对象的方式是从工厂类中获取实例方法-->
    <bean name="daoFactory" class="com.cunyu.DaoFactory"></bean>
    <bean name="factoryDao" factory-bean="daoFactory" factory-method="getFactoryDaoImpl"></bean>
    ```

#### 4.5、Spring自动装配方式

要实现自动装配，主要从如下两个角度来实现：

1. **组件扫描(Component Scanning)**:Spring会自动发现上下文中所创建的Bean
2. **自动装配(Autowiring)**:Spring自动满足Bean之间的依赖

Spring装配包括 **手动装配和自动装配**

- **手动装配是通过XML装配、构造方法、setter等方式**
- **自动装配包括如下几种，使得spring容器通过自动装配方式进行依赖注入**

|  装配方式   |                             说明                             |
| :---------: | :----------------------------------------------------------: |
|     no      |      默认不进行自动装配，通过显示设置ref属性来进行装配       |
|   byName    | 通过参数名自动装配，Spring容器在配置文件中发现Bean的autowire属性被设置为byName后试图匹配、装载和该Bean的属性具有相同名字的Bean |
|   byType    | 通过参数类型自动装配，Spring容器在配置文件中发现Bean的autowire属性被设置为byType后试图匹配、装载和该Bean的属性具有相同类型的Bean。若发现多个Bean符合条件，则抛出错误 |
| constructor | 类似于byType，但需要提供构造器参数，若无固定的带参的构造器参数类型，则抛出异常 |
| autodetect  | 首先尝试使用constructor来装配，若无法工作，则使用byType方式  |

#### 4.6、IoC的优缺点

1. 优点：组件之间的解耦，提高程序可维护性、灵活性
2. 缺点：创建对象步骤复杂，有一定学习成本；利用反射创建对象，效率会降低

### 5、AOP原理

#### 5.1 定义

即剖开封装的对象内部，并将那些影响了多个类的公共行为封装到一个可重用模块，并将其命名为Aspect，即**切面**。所谓切面即 **与业务无关，但被业务模块所共用的逻辑，便于减少系统的重复代码，降低模块间的耦合度，利于后续的可操作性和可维护性**

通过使用横切，AOP将软件划分为：核心关注点和横切关注点。业务处理的主要流程是核心关注点，与横切关注点关系不大。**横切关注点的特点是经常发生在核心关注点的多处，且各处基本相似**。AOP的作用就在于分离系统中的各种关注点，将核心关注点与横切关注点分离开

> AOP即**面向切面编程**，简单地说就是将代码中重复的部分抽取出来，在需要执行的时候使用**动态代理**的技术，在不修改源码的基础上对方法进行增强。可以减少代码的冗余，提高开发效率，维护方便

#### 5.2 AOP的两种代理方式

> Spring提供了两种方式来生成代理对象：JDK Proxy和CGlib，默认的策略是如果目标类是接口，则使用JDK动态代理技术，否则使用CGlib来生成代理

1. **JDK动态接口代理**

    主要涉及Proxy和InvocationHandler。

    InvocationHandler是一个接口，通过实现该接口定义横切逻辑，并通过反射机制调用目标类的代码，动态地将横切逻辑与业务逻辑编织在一起。而Proxy则利用InvocationHandler动态地创建符合某一个接口的实例，生成目标类的代理对象

2. **CGlib动态代理**

    全称Code Generation Library,是一个高性能高质量的代码生成类库，能在运行期间扩展JAVA类与实现JAVA接口。CGlib封装了ASM，能在运行期间动态生成新的类

3. **JDK动态代理和CGlib动态代理的区别**

    JDK动态代理只能为实现了接口的类创建代理实例，而对于没有通过接口定义业务方法的类，则需要通过CGlib创建动态代理

#### 5.3 切面的通知类型

1. **前置通知(Before)**:目标方法在被调用前调用通知
2. **后置通知(After)**:目标方法完成后调用通知
3. **返回通知(After-returning)**:目标方法成功执行后调用通知
4. **异常通知(After-throwing)**:目标方法抛出异常后调用通知
5. **环绕通知(Around)**:在被通知的方法调用之前和调用之后执行自定义的行为

#### 5.4 AOP的应用场景

- Authentication 权限 
- Caching 缓存 
- Context passing 内容传递
- Error handling 错误处理 
- Lazy loading 懒加载 
- Debugging 调试 
- logging, tracing, profiling and monitoring 记录跟踪　优化　校准，Performance optimization 性能优化
- Persistence 持久化 
- Resource pooling 资源池 
- Synchronization 同步
- Transactions 事务。

### 6、Spring MVC

#### 6.1、什么是MVC框架

MVC，全称Model View Controller，是模型(model)、视图(view)、控制器(controller)的缩写，是一种软件设计典范。用一种业务逻辑、数据、界面显示分离的方法组织代码，将业务逻辑聚集到一个部件中，然后在改进和个性化界面及用户交互的同时，不用重写业务逻辑

采用MVC设计模式主要有如下好处：

1. 通过分层设计，实现了业务系统各组件之间的解构，有利于业务系统的可扩展性和可维护性
2. 有利于系统的并行开发，提升开发效率

#### 6.2、Spring MVC

##### 6.2.1 定义

Spring MVC是Spring框架的一个模块，一个基于MVC的框架

![img](../mdPics/60679444.jpg)

##### 6.2.2 组件

1. DispatcherServlet:核心组件，前端控制器，也叫中央控制器，由它来调度相关组件，用于接收请求、响应结果，相当于转发器，有了DispatcherServlet就减少了其他组件之间的耦合度
2. HandlerMapping:处理器映射器，根据URL路径映射不同的Handler
3. HandlerAdapter:处理器适配器，按照HandlerAdapter的规则来执行Handler
4. Handler：处理器，由我们自己根据业务进行开发
5. ViewResolver:视图解析器，根据逻辑视图解析成具体的视图
6. View：一个接口，支持不同的视图类型

##### 6.2.3 MVC工作流程

1. 浏览器发送请求，前端控制器DispatcherServlet拦截该请求
2. DispatcherServlet拦截到请求后，对请求URL进行解析，得到请求资源标识符URI，根据URI调用HandlerMapping后获取对应Handler
3. DispatcherServlet拿到Handler之后，找到HandlerAdapter,通过它来访问Handler，并执行处理器
4. 执行Handler的逻辑，返回一个ModelAndView对象给DispatcherServlet,Model是返回的数据对象，View是个逻辑上的View
5. 然后DispatcherServlet请求ViewResolver解析视图，根据逻辑视图名解析真正的View
6. 然后ViewResolver将解析后的View返回给DispatcherServlet,然后把model传给View进行渲染
7. 然后由DispatcherServlet响应视图给浏览器
8. ![SpringMVC运行原理](../mdPics/49790288.jpg)

##### 6.2.4 Spring MVC的优点

1. 具有Spring的特性
2. 支持多种视图
3. 配置方便，非侵入
4. 分层更加清晰，利于团队开发的代码维护，以及可读性好

#### 6.3、注解

注解本质上是一个集成了Annotation的特殊接口，其具体实现类是JAVA运行时生成的动态代理类。通过反射获取注解时，返回的是Java运行时生成的动态代理对象。通过代理对象调用自定义注解的方法，将最终调用AnnotationInvocationHandler的invoke方法，然后该方法从memberValues的map中索引处对应的值

### 7、Spring Data JPA框架

#### 7.1、定义

Spring Data JPA是Spring基于ORM框架、JPA规范的基础上封装的一套JPA应用框架，可供开发者使用极简的代码实现对数据库的访问和操作。它提供了包括增删改查在内的常用功能，且易于扩展，可以极大提高开发效率

ORM即Object-Relation Mapping,表示对象关系映射，映射的不只是对象的值还有对象之间的关系，通过ORM就可以把对象映射到关系型数据库中。操作实体类就相当于操作数据库表，可以不再重点关注sql语句

使用时只需要持久层接口继承JpaRepository即可，泛型参数列表中第一个参数是实体类类型，第二个参数是主键类型。运行时通过JdkDynamicAopProxy的invoke方法创建了一个动态代理对象SimpleJpaRepository,这个对象中封装了JPA的操作，通过hibernate(封装了JDBC)完成数据库操作

#### 7.2、相关注解

- @Entity:表明当前类是一个实体类
- @Table:关联实体类和数据库表
- @Column:关联实体类属性和数据库表中字段
- @Id:声明当前属性为数据库表主键对应的属性
- @GenerateValue:配置主键生成策略

#### 7.3、对象导航查询

- 通过get方法查询一个对象的同时，通过此对象可以查询它的关联对象
- 对象导航查询一到多默认使用延迟加载的方式，关联对象是集合，因此使用立即加载可能浪费资源

------

## SpringBoot

### 1、SpringBoot自动装配原理

[AutoConfigure](https://www.cnblogs.com/javaguide/p/springboot-auto-config.html)

-----

## 一些面试题的笔记

### 1、Spring有几种方式定义Bean?

主要是注解和XML

### 2、SpringBoot提供了哪几种注解声明Bean？

**声明Bean的注解有：**

- @Component 没有明确角色的组件
- @Service 在业务逻辑层（Service层）使用
- @Repositpry 在数据访问层（dao层）使用
- @Controller 用于标注控制层组件
- @RestController

参考：[声明Bean的注解](https://blog.csdn.net/lipinganq/article/details/79155072)