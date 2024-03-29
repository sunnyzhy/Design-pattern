# 代理模式（Proxy Pattern）

## 定义

代理模式（Proxy Pattern）提供了对目标对象另外的访问方式；即通过代理对象访问目标对象。这样可以在目标对象实现的基础上，增强额外的功能，即扩展目标对象的功能。

## 角色

- 抽象主题角色（Subject）：定义一个接口或者抽象类，声明了真实主题和代理主题的共同接口。
- 真实主题角色（RealSubject）：实现或继承抽象主题角色，也叫作被委托角色或被代理角色，是业务逻辑的具体执行者。
- 代理主题角色（Proxy）：也叫作委托类或代理类，包含了对真实主题的引用，从而可以在任何时候调用真实主题对象；代理主题角色中提供了一个与真实主题角色相同的接口，以便在任何时候都可以替代真实主题；代理主题角色还可以控制对真实主题的使用，负责在需要的时候创建和删除真实主题对象，并对真实主题对象的使用加以约束。通常，在代理主题角色中客户端在调用所引用的真实主题操作之前或之后还需要执行其他操作，而不仅仅是单纯的调用真实主题对象的操作。

## 分类

代理模式分为:

- [静态代理](src/main/java/org/springframework/cloud/pattern/statics '静态代理')
- [动态代理](src/main/java/org/springframework/cloud/pattern/dynamics '动态代理')
- [Cglib代理](src/main/java/org/springframework/cloud/pattern/cglib 'Cglib代理')
