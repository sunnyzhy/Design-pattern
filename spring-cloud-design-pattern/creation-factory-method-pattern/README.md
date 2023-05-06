# 工厂方法模式（Factory Pattern）

## 定义

工厂方法模式（Factory Pattern）定义一个创建对象的接口，让实现这个接口的的类去决定实例化具体的类。工厂方法让类的实例化推迟到实现接口的子类中进行。

## 角色

- 抽象工厂（Abstract Factory）：提供了创建产品的接口，调用者通过它访问具体工厂的工厂方法 newProduct() 来创建产品。
- 具体工厂（ConcreteFactory）：主要是实现抽象工厂中的抽象方法，完成具体产品的创建。
- 抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能。
- 具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它同具体工厂之间一一对应。

## 类图

![工厂方法模式（Factory Pattern）](src/main/resources/static/diagram.png '工厂方法模式（Factory Pattern）')
