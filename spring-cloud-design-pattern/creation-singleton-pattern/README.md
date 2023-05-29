# 单例模式（Singleton Pattern）

## 定义

单例模式（Singleton Pattern）指一个类只有一个实例，且该类能自行创建这个实例的一种模式。

单例模式的特点：

- 单例类只有一个实例对象
- 单例类的实例一定是单例类自身创建，而不是在单例类外部用其它方式（如：new）创建
- 单例类对外提供一个访问该单例的全局访问点

## 角色

- 单例类：包含一个实例且能自行创建这个实例的类。
- 访问类：使用单例的类。

## 类图

![单例模式（Singleton Pattern）](src/main/resources/static/diagram.png '单例模式（Singleton Pattern）')

## 总结

- [饿汉模式（静态常量）](src/main/java/org/springframework/cloud/pattern/hungry/constant '饿汉模式（静态常量）')
- [饿汉模式（静态代码块）](src/main/java/org/springframework/cloud/pattern/hungry/block '饿汉模式（静态代码块）')
- [懒汉模式（线程不安全方式）](src/main/java/org/springframework/cloud/pattern/lazy/notsafe/comm '懒汉模式（线程不安全方式）')
- [懒汉模式（线程安全，同步方法）](src/main/java/org/springframework/cloud/pattern/lazy/safe/method '懒汉模式（线程安全，同步方法）')
- [懒汉模式（线程不安全，同步代码块）](src/main/java/org/springframework/cloud/pattern/lazy/notsafe/block '懒汉模式（线程不安全，同步代码块）')
- [懒汉模式（双重检查锁）【较为推荐 volatile】](src/main/java/org/springframework/cloud/pattern/lazy/safe/dcl '懒汉模式（双重检查锁）')
- [懒汉模式（静态内部类）【推荐】](src/main/java/org/springframework/cloud/pattern/lazy/safe/internal '懒汉模式（静态内部类）')
- [枚举模式【推荐】](src/main/java/org/springframework/cloud/pattern/enumeration '枚举模式')

### 饿汉模式的优缺点
- 优点
   由于使用了static关键字，保证了在引用这个变量时，关于这个变量的所有写入操作都完成，所以保证了 JVM 层面的线程安全。

- 缺点
   不能实现懒加载，在初始化的时就加载了这个类，如果不使用这个类，就会造成内存空间的浪费。

### 懒汉模式的优缺点
- 优点
   实现了懒加载，只有在使用时才会实例化，节约了内存空间。

- 缺点
   - 在不加锁的情况下，线程不安全，可能出现多个实例。
   - 在加锁的情况下，会使程序串行化，影响性能。
