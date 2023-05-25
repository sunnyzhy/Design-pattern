# Cglib代理

## 定义

Cglib代理，也叫作子类代理。目标对象和代理对象都不需要实现共同的接口，但是代理对象需要实现 ```MethodInterceptor``` 接口，在内存中构建一个子类对象从而实现对目标对象功能扩展。

Cglib是一个高性能的代码生成包，它可以在运行期扩展 java 类与实现 java 接口。被许多 AOP 的框架使用（如 Spring AOP）。Cglib 包的底层是通过使用字节码处理框架 ASM 来转换字节码并生成新的类。

注意：代理的类不能为 ```final```，否则抛出异常 ```java.lang.IllegalArgumentException```，如果目标对象的方法如果为 ```final``` 或 ```static```，那么就不会被拦截（即不会执行目标对象额外的业务方法）。

## 类图

![Cglib代理](src/main/resources/static/cglib/diagram.png 'Cglib代理')
