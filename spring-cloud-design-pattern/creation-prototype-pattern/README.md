# 原型模式（Prototype Pattern）

## 定义

原型模式（Prototype Pattern）用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型相同或相似的新对象。

## 角色

- 抽象原型类（Prototype）：声明 ```clone()``` 方法的接口，它可以是抽象类也可以是接口。
- 具体原型类（ConcretePrototype）：实现抽象原型类的 ```clone()``` 方法，并返回一个具体原型类的克隆对象。
- 客户类（Client）：使用具体原型类中的 ```clone()``` 方法来复制新的对象。

## 类图

### 类图

![原型模式（Prototype Pattern）](src/main/resources/static/diagram.png '原型模式（Prototype Pattern）')

### 示例

![原型模式（Prototype Pattern）](src/main/resources/static/diagram-demo.png '原型模式（Prototype Pattern）')

## 分类

代理模式分为:

- [浅克隆](src/main/java/org/springframework/cloud/pattern/shallow '浅克隆')
- [深克隆](src/main/java/org/springframework/cloud/pattern/deep '深克隆')
