# 设计模式简介

## GOF

在 1994 年，由 Erich Gamma、Richard Helm、Ralph Johnson 和 John Vlissides 四人合著出版了一本名为 Design Patterns - Elements of Reusable Object-Oriented Software（中文译名：设计模式 - 可复用的面向对象软件元素） 的书，该书首次提到了软件开发中设计模式的概念。

四位作者合称 GOF。他们所提出的设计模式主要是基于以下的面向对象设计原则:

- 对接口编程而不是对实现编程
- 优先使用对象组合而不是继承

## 设计模式的类型

### 1 创建型模式（Creation Patterns）

创建型模式提供了一种在创建对象的同时隐藏创建逻辑的方式，而不是使用 new 运算符直接实例化对象。这使得程序在判断针对某个给定实例需要创建哪些对象时更加灵活。

- [简单工厂模式（Simple Factory Pattern）](./spring-cloud-design-pattern/creation-simple-factory-pattern '简单工厂模式（Simple Factory Pattern）')
- [工厂方法模式（Factory Pattern）](./spring-cloud-design-pattern/creation-factory-method-pattern '工厂方法模式（Factory Pattern）')
- [抽象工厂模式（Abstract Factory Pattern）](./spring-cloud-design-pattern/creation-abstract-factory-pattern '抽象工厂模式（Abstract Factory Pattern）')
- [单例模式（Singleton Pattern）](./spring-cloud-design-pattern/creation-singleton-pattern '单例模式（Singleton Pattern）')
- [建造者模式（Builder Pattern）](./spring-cloud-design-pattern/creation-builder-pattern '建造者模式（Builder Pattern）')
- [原型模式（Prototype Pattern）](./spring-cloud-design-pattern/creation-prototype-pattern '原型模式（Prototype Pattern）')

### 2 结构型模式（Structure Patterns）

结构型模式关注类和对象的组合。继承的概念被用来组合接口和定义组合对象获得新功能的方式。

- [适配器模式（Adapter Pattern）](./spring-cloud-design-pattern/structure-adapter-pattern '适配器模式（Adapter Pattern）')
- [桥接模式（Bridge Pattern）](./spring-cloud-design-pattern/structure-bridge-pattern '桥接模式（Bridge Pattern）')
- [过滤器模式（Filter/Criteria Pattern）](./spring-cloud-design-pattern/structure-filter-pattern '过滤器模式（Filter/Criteria Pattern）')
- [组合模式（Composite Pattern）](./spring-cloud-design-pattern/structure-composite-pattern '组合模式（Composite Pattern）')
- [装饰器模式（Decorator Pattern）](./spring-cloud-design-pattern/structure-decorator-pattern '装饰器模式（Decorator Pattern）')
- [外观模式（Facade Pattern）](./spring-cloud-design-pattern/structure-facade-pattern '外观模式（Facade Pattern）')
- [享元模式（Flyweight Pattern）](./spring-cloud-design-pattern/structure-flyweight-pattern '享元模式（Flyweight Pattern）')
- [代理模式（Proxy Pattern）](./spring-cloud-design-pattern/structure-proxy-pattern '代理模式（Proxy Pattern）')

### 3 行为型模式（Behavior Patterns）

行为型模式关注对象之间的通信。

- [责任链模式（Chain of Responsibility Pattern）](./spring-cloud-design-pattern/ '责任链模式（Chain of Responsibility Pattern）')
- [命令模式（Command Pattern）](./spring-cloud-design-pattern/ '命令模式（Command Pattern）')
- [解释器模式（Interpreter Pattern）](./spring-cloud-design-pattern/ '解释器模式（Interpreter Pattern）')
- [迭代器模式（Iterator Pattern）](./spring-cloud-design-pattern/ '迭代器模式（Iterator Pattern）')
- [中介者模式（Mediator Pattern）](./spring-cloud-design-pattern/ '中介者模式（Mediator Pattern）')
- [备忘录模式（Memento Pattern）](./spring-cloud-design-pattern/ '备忘录模式（Memento Pattern）')
- [观察者模式（Observer Pattern）](./spring-cloud-design-pattern/behavior-observer-pattern '观察者模式（Observer Pattern）')
- [状态模式（State Pattern）](./spring-cloud-design-pattern/ '状态模式（State Pattern）')
- [策略模式（Strategy Pattern）](./spring-cloud-design-pattern/ '策略模式（Strategy Pattern）')
- [模板模式（Template Pattern）](./spring-cloud-design-pattern/ '模板模式（Template Pattern）')
- [访问者模式（Visitor Pattern）](./spring-cloud-design-pattern/ '访问者模式（Visitor Pattern）')
