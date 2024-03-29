# 观察者模式（Observer Pattern）

## 定义

观察者模式（Observer Pattern），又被称为发布-订阅（Publish/Subscribe）模式，它定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。当这个主题对象的状态发生变化时，会通知所有的观察者对象，使他们能够自动更新自身的状态。

## 角色

- 抽象主题（Subject）：也叫作抽象被观察者，也可以叫作 Observable，抽象主题角色把所有观察者对象保存在一个集合里，每个主题都可以有任意数量的观察者，抽象主题提供一个接口，可以增加和删除观察者对象。
- 具体主题（Concrete Subject）：也叫作具体被观察者，具体主题角色将有关状态存入具体观察者对象，在具体主题的内部状态发生改变时，给所有注册过的观察者发送通知。
- 抽象观察者（Observer）：是观察者的抽象类，它定义了一个更新接口，在订阅到主题的通知时更新自身的状态。
- 具体观察者（Concrete Observer）：实现抽象观察者定义的更新接口，在订阅到主题的通知时更新自身的状态。

## 类图

### 类图

![观察者模式（Observer Pattern）](src/main/resources/static/diagram.png '观察者模式（Observer Pattern）')

### 示例

![观察者模式（Observer Pattern）](src/main/resources/static/diagram-demo.png '观察者模式（Observer Pattern）')
