# 过滤器模式（Filter/Criteria Pattern）

## 定义

过滤器模式（Filter/Criteria Pattern）又称为标准模式（Criteria），允许开发人员使用不同的标准来过滤一组对象，通过逻辑运算以解耦的方式把它们连接起来。这种类型的设计模式属于结构型模式，它结合多个标准来获得单一标准。

## 角色

- 抽象过滤器角色（AbstractFilter）：负责定义过滤器的实现接口，具体的实现还要具体过滤器角色去参与，客户端可以调用抽象过滤器角色中定义好的方法，将客户端的所有请求委派到具体的实现类去，从而让实现类去处理。
- 具体过滤器角色（ConcreteFilter）：该角色负责具体筛选规则的逻辑实现，最后再返回一个过滤后的数据集合，标准的过滤器只对数据做过滤，当然也可以对集合中的数据做某项处理，再将处理后的集合返回。
- 被过滤的主体角色（Subject）：一个软件系统中可以有一个或多个目标角色，在具体过滤器角色中会对指定的目标进行处理，以得到所需的数据集合。

## 类图

### 类图

![过滤器模式（Filter/Criteria Pattern）](src/main/resources/static/diagram.png '过滤器模式（Filter/Criteria Pattern）')

### 示例

![过滤器模式（Filter/Criteria Pattern）](src/main/resources/static/diagram-demo.png '过滤器模式（Filter/Criteria Pattern）')
