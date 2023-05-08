# 简单工厂模式（Simple Factory）

## 定义

简单工厂模式（Simple Factory）通过实例化一个工厂类，来获取对应的产品实例。我们不需要关注产品本身是如何被创建的，只需要通过工厂就可以获得相应的实例。

***简单工厂模式不在 GoF 23 种设计模式之列。***

## 角色

- 简单工厂（SimpleFactory）：是简单工厂模式的核心，负责实现创建所有实例的内部逻辑。工厂类的创建产品类的方法可以被外界直接调用，创建所需的产品对象。
- 抽象产品（Product）：是简单工厂创建的所有对象的父类，负责描述所有实例共有的公共接口。
- 具体产品（ConcreteProduct）：是简单工厂模式的创建目标。

## 类图

![简单工厂模式（Simple Factory）](src/main/resources/static/diagram.png '简单工厂模式（Simple Factory）')
