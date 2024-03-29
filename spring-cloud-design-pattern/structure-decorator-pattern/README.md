# 装饰器模式（Decorator Pattern）

## 定义

装饰器模式（Decorator Pattern）允许向一个现有的对象添加新的功能，同时又不改变其结构。这种模式创建了一个装饰类，用来包装原有的类，并在保持类方法签名完整性的前提下，提供了额外的功能。

## 角色

- 抽象构件（Component）：定义一个接口或者抽象类以规范准备接收附加职责的对象。
- 具体构件（ConcreteComponent）：实现抽象构件，通过装饰角色为其添加一些职责。
- 抽象装饰（Decorator）：实现或继承抽象构件，并包含抽象构件的实例，可以通过其子类扩展具体构件的功能。
- 具体装饰（ConcreteDecorator）：实现抽象装饰的相关方法，并给具体的构件对象添加职责。

## 类图

### 类图

![装饰器模式（Decorator Pattern）](src/main/resources/static/diagram.png '装饰器模式（Decorator Pattern）')

### 示例

![装饰器模式（Decorator Pattern）](src/main/resources/static/diagram-demo.png '装饰器模式（Decorator Pattern）')

总结:

1. 装饰器模式使用组合关系来创建一个包装对象（即装饰对象）来包裹真实对象，并在保持真实对象的类结构不变的前提下，为其提供额外的功能。
2. 动态地给一个对象添加一些额外的职责。就新增功能来说，装饰器模式相比创建子类更为灵活。
