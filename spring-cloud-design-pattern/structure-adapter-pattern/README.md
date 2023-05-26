# 适配器模式（Adapter）

## 定义

适配器模式（Adapter）将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类能一起工作。适配器模式分为类适配器模式和对象适配器模式。

- 类适配器模式：通过继承实现，即 Adapter 类会继承 Adaptee类： ```Adapter extends Adaptee implements Target``` ，因为其不满足迪米特法则，Adapter 对象除了可以访问到 Target 对象的方法，还可以访问到 Adaptee 对象的方法，所以一般不推荐。
- 对象适配器模式：通过关联实现，即 Adapter 类会关联 Adaptee 类， 这样一来，Adapter 对象只能访问到 Target 对象的方法，推荐。

## 角色

- 目标（Target）接口：当前系统业务所期待的接口，它可以是抽象类或接口（目标）。
- 适配者（Adaptee）类：它是被访问和适配的现存组件库中的组件接口（源）。
- 适配器（Adapter）类：它是一个转换器，通过继承或引用适配者的对象，把适配者接口转换成目标接口，让客户按目标接口的格式访问适配者。

## 类图

### 类图

![适配器模式（Adapter）](src/main/resources/static/diagram.png '适配器模式（Adapter）')

### 示例

![适配器模式（Adapter）](src/main/resources/static/diagram-demo.png '适配器模式（Adapter）')

总结:

- 外观模式: 兼容性与易用性，更强调易用性。比如 slf4j 与 log4j/log4j2/logback/Apache Common-Logging：
      - 用了 slf4j，只需要调用 slf4j 统一的读写日志的方法就行了，也就不需要了解 log4j/log4j2/logback/Apache Common-Logging 各自的日志读写方法。
      - 不用 slf4j 也可以，但是在使用的时候需要调用 log4j/log4j2/logback/Apache Common-Logging 各自的日志读写方法。
      - ***外观模式，离开了中间层（Facade），客户端（Client）可以直接调用子系统。***
- 适配器模式: 兼容性。比如一个 wav 的音频文件是不能直接在 mp3 播放器里播放的，需要把 wav 转成 mp3 格式才可以。再比如一台笔记本电脑所需要的电压是 20V，而家用电压是 220V，是不能直接用在笔记本电脑上，需要经过电压适配器转换之后才能用。
      - ***适配器模式，离开了中间层（Adapter），源（Adaptee）是不能直接作用于目标（Target）的。***
