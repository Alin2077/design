## 设计模式介绍
* 代表了代码的最佳实践，被有经验的开发人员使用
* 设计模式是很多被反复使用并知晓的，主要是对代码和经验的总结
* 使用设计模式是为了重用代码，让代码更容易被他人理解，保证代码的可靠性
* 对接口编程而不是实现编程
* 有限使用对象组合而不是继承关系
## 设计模式内容
* 我们将设计模式分类为 创建型、结构型、行为型。
* 创建型（Creational）：这些模式关注对象的创建机制，用于在创建对象时隐藏创建逻辑，而不是使用新的运算符直接实例化对象。这允许程序在判断对象的正确实例化方式时更加灵活。
* 结构型（Structural）：这些模式涉及类和对象的组合，用于形成更大的结构。结构型模式关注类和对象的组合，继承的概念被用来组合接口和定义组合对象获得新功能的方式。
* 行为型（Behavioral）：这些模式特别关注对象之间的通信，是用于处理对象之间的交互和职责分配的模式。行为型模式不仅描述对象或类的模式，还描述它们之间的通信模式。
### 创建型设计模式
1. 单例模式
    * 不同的类的实例只存在一个
    * 分为懒汉式和饿汉式
    * 日常使用中用的最多的是枚举类来实现单例
2. 工厂方法模式
    * 通常需要一个工厂接口和成品接口
    * 工厂接口的不同实现类中可以获取到不同的成品接口实现类
    * 对于调用者来说，实例的创建方式是未知的，只负责拿到实例
3. 建造者模式
    * 建造者通常作为静态内部类
    * 建造者的内部属性变量和外部类一致，建造者提供方法来设置属性
    * 外部类的构造函数私有化并接收一个建造者实例
    * 通过建造者内部的builder()方法返回一个外部类对象
4. 抽象工厂模式
5. 原型模式
### 结构型设计模式
1. 适配器模式
   * 一般用于兼容已存在的类（例如Adaptee类）到接口
   * 通常需要定义一个目标Target接口，一个Adapter类（Adapter类实现Target接口）
   * Adapter类中注入Adaptee类，实现调用Adaptee的方法
2. 代理模式
   * 代理类Proxy和原始类Common都实现同一个接口
   * 代理类Proxy中注入原始类Common，代理类中的方法调用原始类执行方法
3. 装饰者模式
   * 通常使用一个抽象的Decorated类实现Common类相同的接口，抽象类中注入接口基本类型
   * 具体的Decorated类继承抽象类，重写方法以实现增强方法
4. 桥接模式
5. 组合模式
6. 外观模式
7. 享元模式
### 行为型设计模式
1. 模板方法模式
   * 通常定义一个抽象类作为模板，其中具体方法决定其他抽象方法的执行顺序
   * 具体类继承模板类，实现抽象方法
2. 策略模式
   * 通常定义一个Strategy接口，不同的具体策略类实现该接口
   * 上下文类Context提供注入策略的方法，通过注入不同的策略执行不同的实现
3. 责任链模式
   * 通常有一个责任链接口Handler
   * 不同的责任链类实现Handler接口，并拥有下一责任链的属性，提供注入责任链方法
   * 责任链类的业务方法判断是否处理，如不处理则传入下一责任链
4. 观察者模式
   * 通常有一个观察者接口Observe
   * 具体的实现类内部管理一个Observe的集合，提供增加和删除功能
   * 具体的实现类内部提供一个notify()方法，遍历所有Observe并传入消息
5. 迭代器模式
   * 通常定义一个自定义集合接口和自定义迭代器接口
   * 迭代器实现类通常作为私有内部类位于自定义集合类内部（不同集合有自己的迭代器）
   * 迭代器中提供hasNext()方法和next()方法
6. 命令模式
7. 解释器模式
8. 中介者模式
9. 备忘录模式
10. 状态模式
11. 访问者模式