# 命令模式（Command Pattern）

## 定义

命令模式（Command Pattern），将一个请求封装为一个对象，使发出请求的责任和执行请求的责任分割开。也就是将请求的调用者和请求的接收者进行解耦，发送者与接收者之间不直接进行交互，而是通过命令对象进行沟通，这样方便将命令对象进行储存、传递、调用、增加与管理。

## 角色

- 抽象命令类（Command）：声明执行命令的接口，拥有执行命令的抽象方法 ```execute()```。
- 具体命令角色（Concrete Command）：是抽象命令类的具体实现类，***它拥有接收者对象***，并通过调用接收者的功能来完成命令要执行的操作。
- 实现者/接收者（Receiver）：执行命令功能的相关操作，是具体命令对象业务的真正实现者。
- 调用者/请求者（Invoker）：是请求的发送者，***它通常拥有很多的命令对象***，并通过访问命令对象来执行相关请求，它不直接访问接收者。

## 类图

### 类图

![命令模式（Command Pattern）](src/main/resources/static/diagram.png '命令模式（Command Pattern）')

### 示例

![命令模式（Command Pattern）](src/main/resources/static/diagram-demo.png '命令模式（Command Pattern）')
