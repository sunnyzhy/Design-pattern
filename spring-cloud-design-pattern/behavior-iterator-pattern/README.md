# 迭代器模式（Iterator Pattern）

## 定义

迭代器模式（Iterator Pattern），提供一个对象来顺序访问聚合对象中的一系列数据，而不暴露聚合对象的内部表示。

## 角色

- 抽象聚合（Aggregate）：定义存储、添加、删除聚合对象以及创建迭代器对象的接口。
- 具体聚合（Concrete Aggregate）：实现抽象聚合类，返回一个具体迭代器的实例。
- 抽象迭代器（Iterator）：定义访问和遍历聚合元素的接口，通常包含 ```hasNext()```、```first()```、```next()``` 等方法。
- 具体迭代器（Concrete Iterator）：实现抽象迭代器接口中所定义的方法，完成对聚合对象的遍历，记录遍历的当前位置。

## 类图

### 类图

![迭代器模式（Iterator Pattern）](src/main/resources/static/diagram.png '迭代器模式（Iterator Pattern）')

### 示例

![迭代器模式（Iterator Pattern）](src/main/resources/static/diagram-demo.png '迭代器模式（Iterator Pattern）')
