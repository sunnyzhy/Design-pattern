# 责任链模式（Chain of Responsibility Pattern）

## 定义

责任链模式（Chain of Responsibility Pattern），也叫职责链模式，为了避免请求发送者与多个请求处理者耦合在一起，将所有请求的处理者通过前一个对象记住其下一个对象的引用而连成一条链；当有请求发生时，可将请求沿着这条链传递，直到有对象处理它为止。

## 角色

- 抽象处理者（Handler）：定义一个处理请求的接口，包含抽象处理方法和一个后继连接。
- 具体处理者（Concrete Handler）：实现抽象处理者的处理方法，判断能否处理本次请求，如果可以处理请求则处理，否则将该请求转给它的后继者。
- 客户类（Client）：创建处理链，并向链头的具体处理者对象提交请求，它不关心处理细节和请求的传递过程。

## 类图

### 类图

![责任链模式（Chain of Responsibility Pattern）](src/main/resources/static/diagram.png '责任链模式（Chain of Responsibility Pattern）')

### 示例

![责任链模式（Chain of Responsibility Pattern）](src/main/resources/static/diagram-demo.png '责任链模式（Chain of Responsibility Pattern）')
