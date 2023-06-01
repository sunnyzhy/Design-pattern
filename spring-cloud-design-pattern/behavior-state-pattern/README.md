# 状态模式（State Pattern）

## 定义

状态模式（State Pattern），对有状态的对象，把复杂的“判断逻辑”提取到不同的状态对象中，允许状态对象在其内部状态发生改变时改变其行为。

## 角色

- 环境（Context）：也称为上下文，***维护一个状态对象***，并将与状态相关的操作***委托给当前状态对象来处理***。
- 抽象状态（State）：定义一个接口，用以封装环境对象中的特定状态所对应的行为。
- 具体状态（Concrete State）：实现抽象状态所对应的行为。即每一个类封装***一个状态***对应的***多种行为***。

## 类图

### 类图

![状态模式（State Pattern）](src/main/resources/static/diagram.png '状态模式（State Pattern）')

### 示例

![状态转换流程图示例](src/main/resources/static/thread/demo.png '状态转换流程图示例')

![状态模式（State Pattern）](src/main/resources/static/diagram-demo.png '状态模式（State Pattern）')

#### Java 线程的状态转换

##### 线程状态转换流程图

![状态转换流程图](src/main/resources/static/thread/state.png '状态转换流程图')

##### 线程状态

- ```New```: 新建状态，创建了线程但是未启动
- ```Runnable```: 就绪状态，分为 ```Ready``` 和 ```Running``` 两个子状态。由于单个 CPU 同一时间只可以执行单个线程，多线程的分配是通过 CPU 时间片来分配的，因此有一部分线程会在等待队列，也就是 ```Ready``` 状态。CPU 的 ```Thread scheduling```（线程调度）决定着线程什么时候可以实际运行。处于 ```Runnable``` 状态的线程在 JVM 层面上来看是执行中的状态，但是在操作系统层面上，或许线程在等待一些资源。
- ```Timed waiting```: 计时等待状态，在该状态时会等待超时，之后由系统唤醒，或者也可以提前被通知唤醒，如 ```notify()```，进入计时等待状态有以下几种情况：
   - ```Thread.sleep(long millis)```
   - ```Object.wait(long timeout)```
   - ```Thread.join(long millis)```
   - ```LockSupport.parkNanos(long nanos)```
   - ```LockSupport.parkUntil(long deadline)```
- ```Waiting```: 等待状态，进入等待状态有以下几种情况：
   - ```Object.wait()```
   - ```Thread.join()```
   - ```LockSupport.park()```
- ```Blocked```: 阻塞状态，线程未能获取 ```synchronized``` 锁就会进入阻塞状态
- ```Terminated```: 终止状态，进入终止状态有以下几种情况：
   - ```run()``` 方法执行完毕，线程正常退出
   - 出现一个没有捕获的异常，终止了 ```run()``` 方法，最终导致意外终止

##### 线程状态转换

###### ```Blocked``` 进入 ```Runnable```

线程获取 ```synchronized``` 锁。

###### ```Waiting``` 进入 ```Runnable```

- 只有当执行了 ```LockSupport.unpark()``` 或者 ```join``` 的线程运行结束，或者被中断时才可以进入 ```Runnable``` 状态。
- 如果通过其他线程调用 ```notify()/notifyAll()``` 来唤醒它，则它会直接进入 ```Blocked``` 状态。
- 如果处于 ```Waiting``` 状态的线程被唤醒时拿不到 ```synchronized``` 锁，就会进入 ```Blocked``` 状态，直到执行了 ```notify()/notifyAll()``` 的唤醒它的线程执行完毕并释放锁，才可能轮到它去抢夺这把锁，如果它能抢到，就会从 ```Blocked``` 状态回到 ```Runnable``` 状态。

###### ```Timed waiting``` 进入 ```Runnable```

在 ```Timed waiting``` 中执行 ```notify()/notifyAll()``` ，线程会先进入 ```Blocked``` 状态，直到抢到锁之后，再回到 ```Runnable``` 状态。

```Timed waiting``` 存在超时机制，也就是说如果超时时间到了就会自动地直接拿到锁，或者当 ```join``` 的线程执行结束，又或者调用了 ```LockSupport.unpark()``` 等情况都会直接进入 ```Runnable``` 状态。

##### 总结

- 线程不可以从 ```New``` 状态直接进入 ```Blocked``` 状态，它需要先经过 ```Runnable``` 状态。
- 线程的生命周期不可逆，一旦进入 ```Runnable``` 状态就不能回到 ```New``` 状态；一旦被终止就不可能再有任何状态的变化。
- 一个线程只能有一次 ```New``` 和 ```Terminated``` 状态，只有处于中间状态才可以相互转换。
