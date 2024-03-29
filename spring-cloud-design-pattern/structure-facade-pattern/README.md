# 外观模式（Facade Pattern）

## 定义

外观模式（Facade Pattern）又叫作门面模式，为子系统中的一组接口提供一个一致的界面，外观模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。

在日常编码工作中，我们都在有意无意的大量使用外观模式。只要是高层模块需要调度多个子系统（2个以上的类对象），我们都会自觉地创建一个新的类封装这些子系统，提供精简的接口，让高层模块可以更加容易地间接调用这些子系统的功能。

再比如，我们平时经常使用的 slf4j 日志类。slf4j 全称 Simple Logging Facade for Java，是日志框架的门面，也就是说 slf4j 是不能单独使用的，它必须配合具体的日志框架才能使用，比如 log4j、log4j2、logback、Apache Common-Logging 等。

## 角色

- 外观（Facade）角色：为多个子系统对外提供一个共同的接口。
- 子系统（Sub System）角色：实现系统的部分功能，客户可以通过外观角色访问它。
- 客户（Client）角色：通过一个外观角色访问各个子系统的功能。

## 类图

现在有 3 个客户端，调用 3 个子系统，每个子系统的 method 方法各不相同。

不使用外观模式：

![外观模式（Facade Pattern）](src/main/resources/static/normal/diagram.png '外观模式（Facade Pattern）')

使用外观模式：

![外观模式（Facade Pattern）](src/main/resources/static/facade/diagram.png '外观模式（Facade Pattern）')

从上面的类图里可以清晰地看到使用外观模式和不使用外观模式的区别：

- 不使用外观模式的情况下，每个客户端都需要详细地了解各个子系统的结构与方法，无形中提高了客户端的学习成本。
- 使用外观模式的情况下，客户端不需要了解每个子系统的结构与方法，只需要调用外观类的公共方法即要。