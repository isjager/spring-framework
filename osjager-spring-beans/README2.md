##### 一、Spring Core Container（核心容器）
**模块作用：** Core 和 Beans 模块是框架的基础部分，提供 IoC（转控制）和依赖注入特性。 这里的基础概念是 BeanFactory，它提供对 Factory 模式的经典实 现来消除对程序性单例模式的需要，
并真正地允许你从程序逻辑中分离出依赖关系和配置。

1.1 Core
- 主要包含 Spring 框架基本的核心工具类， Spring 的其他组件都要用到这个包里的类， Core 模块是其他组件的基本核心。

1.2 Beans（BeanFactory 的作用）
- 它包含访问配直文件、创建和管理 bean 以及进行 Inversion of Control I Dependency Injection ( IoC/DI ）操作相关的所有类

1.3 Context（处理 BeanFactory，以及还是 ApplicationContext 的作用）
- 模构建于 Core 和 Beans 模块基础之上，提供了一种类似 JNDI 注册器的框架式的对象访问方法。Context 模块继承了 Beans 的特性，为 Spring 核心提供了大量扩展，
添加了对国际化（例如资源绑定）、事件传播、资源加载和对 Context 的透明创建的支持。 Context 模块同时也支持 J2EE 的一些特性，ApplicationContext 接口是 Context 模块的关键。

- 本质区别：（使用 BeanFactory 的 bean 是延时加载的，ApplicationContext 是非延时加载的）

1.4 Expression Language
- 模块提供了强大的表达式语言，用于在运行时查询和操纵对象。 它是 JSP2.1 规范中定义的 unified expression language 的扩展。该语言支持设值／获取属性的值，属性的分配，方法的调用，访问数
组上下文（accessing the context of arrays）、 容器和索引器、逻辑和算术运算符、命名变量以及从 Spring 的 IoC 容器中根据名称检索对象。它也支持 list 投影、选择和一般的 list 聚合。

---
##### 二、Spring Data Access/Integration

2.1 JDBC
- 模块提供了一个 JDBC 抽象层，它可以消除冗长的 JDBC 编码和解析数据库厂商特有的错误代码。这个模块包含了 Spring 对 JDBC 数据访问进行封装的所有类。

2.2 ORM 模块为流行的对象 — 关系映射 API
- 如：JPA、 JDO、 Hibernate、 iBatis 等，提供了一个交互层。利用 ORM 封装包，可以混合使用所有 Spring 提供的特性进行 O/R 映射，如：简单声明性事务管理。

2.3 OXM 模块提供了一个对 Object/XML 映射实现的抽象层
- Object/XML 映射实现包括 JAXB、 Castor、 XMLBeans、 JiBX 和 XStearn。

2.4 JMS（Java Messaging Service）
- 模块主要包含了一些制造和消费消息的特性。

2.5 Transaction
- 支持编程和声明性的事务管理，这些事务类必须实现特定的接口，并且对所有的 POJO 都适用。
  
---
##### 三、Spring Web
- Web 模块：提供了基础的面向 Web 的集成特性， 例如：多文件上传、使用 servlet listeners 初始化 IoC 容器以及一个面向 Web 的应用上下文。它还包含 Spring 远程支持中 Web 的相关部分。
 
---
##### 四、Spring Aop
- 4.1 Aspects 模块提供了对 AspectJ 的集成支持。

- 4.2 Instrumentation 模块提供了 class instrumentation 支持和 classloader 实现，使得可以在特定的应用服务器上使用。

---
##### 五、Test
- Test 模块支持使用 JUnit 和 TestNG 对 Spring 组件进行测试。

---
##### 六、Spring 容器继承图

---
##### 七、控制反转和依赖注入
- 7.1 什么是控制反转？我觉得有必要先了解软件设计的一个重要思想：依赖倒置原则（Dependency Inversion Principle）

- 什么是依赖倒置原则？
    - 假设我们设计一辆汽车：先设计轮子，然后根据轮子大小设计底盘，接着根据底盘设计车身，最后根据车身设计好整个汽车。这里就出现了一个“依赖”关系：汽车依赖车身，车身依赖底盘，底盘依赖轮子。
    
- ioc 的思想最核心的地方在于，资源不由使用资源的双方管理，而由不使用资源的第三方管理，这可以带来很多好处。
    - 第一，资源集中管理，实现资源的可配置和易管理。
    - 第二，降低了使用资源双方的依赖程度，也就是我们说的耦合度。   




