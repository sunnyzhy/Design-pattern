# 中介者模式（Mediator Pattern）

## 定义

中介者模式（Mediator Pattern），又叫调停模式，它定义一个中介对象来封装一系列对象之间的交互，使原有对象之间的耦合松散，且可以独立地改变它们之间的交互。

## 角色

- 抽象中介者（Mediator）：它是中介者的接口，提供了同事对象注册与转发同事对象信息的抽象方法。
- 具体中介者（Concrete Mediator）：实现中介者接口，***定义一个 List 来管理同事对象（它拥有同事对象）***，协调各个同事角色之间的交互关系，因此它依赖于同事角色。
- 抽象同事类（Colleague）：定义同事类的接口，***它拥有中介者对象***，提供同事对象交互的抽象方法，实现所有相互影响的同事类的公共功能。
- 具体同事类（Concrete Colleague）：是抽象同事类的实现者，当需要与其他同事对象交互时，由中介者对象负责后续的交互。

## 类图

### 类图

![中介者模式（Mediator Pattern）](src/main/resources/static/diagram.png '中介者模式（Mediator Pattern）')

### 示例

![中介者模式（Mediator Pattern）](src/main/resources/static/diagram-demo.png '中介者模式（Mediator Pattern）')
