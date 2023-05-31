# 命备忘录模式（Memento Pattern）

## 定义

命备忘录模式（Memento Pattern），又被称为快照模式，在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，以便以后当需要时能将该对象恢复到原先保存的状态。

备忘录模式能记录一个对象的内部状态，在需要时能***撤销***当前操作，使数据恢复到它原先的状态。

## 角色

- 发起人（Originator）：记录当前时刻的内部状态信息，***提供创建备忘录和恢复备忘录数据的功能***，实现其他业务功能，它可以访问备忘录里的所有信息。
- 备忘录（Memento）：负责存储发起人的内部状态，在需要的时候提供这些内部状态给发起人，相当于发起人的副本。
- 管理者（Caretaker）：对备忘录进行管理，提供保存与获取备忘录的功能，但其不能对备忘录的内容进行访问与修改。

## 类图

### 类图

![命备忘录模式（Memento Pattern）](src/main/resources/static/diagram.png '命备忘录模式（Memento Pattern）')

### 示例

![命备忘录模式（Memento Pattern）](src/main/resources/static/diagram-demo.png '命备忘录模式（Memento Pattern）')
