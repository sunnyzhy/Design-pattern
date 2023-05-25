# 动态代理

## 定义

动态代理，也叫 JDK 代理、接口代理。目标对象需要实现接口，而代理对象不需要实现接口。代理对象的生成是利用 JDK 的 API 动态地在内存中构建代理对象。

使用 JDK 包 ```java.lang.reflect.Proxy``` 中的 ```newProxyInstance``` 方法来动态的创建目标对象（被代理对象），该方法需要如下接收三个参数：

- ```ClassLoader loader```: 指定当前目标对象使用的类加载器
- ```Class<?>[] interfaces```: 目标对象实现的接口类型，使用泛型方法确认类型
- ```InvocationHandler h```: 事情处理，执行目标对象的方法时，会触发事情处理器方法，把当前执行的目标对象方法作为参数传入


## 类图

![动态代理](src/main/resources/static/dynamics/diagram.png '动态代理')
