# 抽象工厂模式（Abstract Factory Pattern）

## 定义

抽象工厂模式（Abstract Factory Pattern）是提供了创建一系列服务的对象的接口。为了缩减工厂实现子类的数量，不必给每一个产品分配一个工厂类，可以将产品进行分组，每组中的不同产品由同一个工厂类的不同方法来创建。

## 角色

- 抽象工厂（Abstract Factory）：提供了创建产品的接口，它包含多个创建产品的方法 newProduct()，可以创建多个不同等级的产品。
- 具体工厂（Concrete Factory）：主要是实现抽象工厂中的多个抽象方法，完成具体产品的创建。
- 抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能，抽象工厂模式有多个抽象产品。
- 具体产品（Concrete Product）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它同具体工厂之间是多对一的关系。

## 类图

### 类图

![抽象工厂模式（Abstract Factory Pattern）](src/main/resources/static/diagram.png '抽象工厂模式（Abstract Factory Pattern）')

### 示例

![抽象工厂模式（Abstract Factory Pattern）](src/main/resources/static/diagram-demo.png '抽象工厂模式（Abstract Factory Pattern）')

总结:

- 简单工厂: 唯一工厂类，一个产品抽象类，工厂类的创建方法依据入参判断并创建具体产品对象。
- 工厂方法: 多个工厂类，一个产品抽象类，利用多态创建不同的产品对象，避免了大量的 if-else 判断。
- 抽象工厂: 多个工厂类，多个产品抽象类，产品子类分组，同一个工厂实现类创建同组中的不同产品，减少了工厂子类的数量。
