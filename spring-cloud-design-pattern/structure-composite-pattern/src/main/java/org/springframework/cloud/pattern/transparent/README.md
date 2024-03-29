# 透明方式

## 定义

在透明方式中，由于抽象构件声明了所有子类中的全部方法，所以客户端无须区别树叶对象和树枝对象，对客户端来说是透明的。但其缺点是：树叶构件本来没有 Add()、Remove() 及 GetChild() 方法，却要实现它们（空实现或抛异常），这样会带来一些安全性问题。

## 类图

### 类图

![透明方式](../../../../../../../../src/main/resources/static/transparent/diagram.png '透明方式')

### 示例

![透明方式](../../../../../../../../src/main/resources/static/transparent/diagram-demo.png '透明方式')
