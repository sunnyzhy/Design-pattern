# 策略模式（Strategy Pattern）

## 定义

策略模式（Strategy Pattern），定义了一系列算法，并将每个算法封装起来，使它们可以相互替换，且算法的变化不会影响使用算法的客户。策略模式属于对象行为模式，它通过对算法进行封装，把使用算法的责任和算法的实现分割开来，并委派给不同的对象对这些算法进行管理。

## 角色

- 抽象策略（Strategy）：定义了一个公共接口，各种不同的算法以不同的方式实现这个接口，环境角色使用这个接口调用不同的算法，一般使用接口或抽象类实现。
- 具体策略（Concrete Strategy）：实现了抽象策略定义的接口，提供具体的算法实现。
- 环境（Context）：持有一个策略类的引用，最终给客户端调用。

## 类图

### 类图

![策略模式（Strategy Pattern）](src/main/resources/static/diagram.png '策略模式（Strategy Pattern）')

### 示例

![策略模式（Strategy Pattern）](src/main/resources/static/diagram-demo.png '策略模式（Strategy Pattern）')
