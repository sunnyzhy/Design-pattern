# 访问者模式（Visitor Pattern）

## 定义

访问者模式（Visitor Pattern），将作用于某种数据结构中的各元素的操作分离出来封装成独立的类，使其在不改变数据结构的前提下可以添加作用于这些元素的新的操作，为数据结构中的每个元素提供多种访问方式。

它将对数据的操作与数据结构进行分离。在数据结构的类里面有一个方法接受访问者，将自身引用传入访问者。

## 角色

- 抽象访问者（Visitor）：定义一个访问具体元素的接口，为***每个具体元素类对应一个访问操作 ```visit()```*** ，该操作中的参数类型标识了被访问的具体元素。
- 具体访问者（Concrete Visitor）：实现抽象访问者中声明的各个访问操作，确定访问者访问一个元素时该做什么。
- 抽象元素（Element）：声明一个包含 ```accept()``` 方法的接口，抽象访问者对象作为 ```accept()``` 方法的参数。
- 具体元素（Concrete Element）：实现抽象元素提供的 ```accept()``` 方法，其方法体通常都是 ```visitor.visit(this)``` ，另外具体元素中可能还包含本身业务逻辑的相关操作。
- 对象结构（Object Structure）：是一个包含元素的容器，提供让访问者对象遍历容器中所有元素的方法，通常由 ```List、Set、Map``` 等聚合类实现。

## 类图

### 类图

![访问者模式（Visitor Pattern）](src/main/resources/static/diagram.png '访问者模式（Visitor Pattern）')

### 示例

![访问者模式（Visitor Pattern）](src/main/resources/static/diagram-demo.png '访问者模式（Visitor Pattern）')
