# 解释器模式（Interpreter Pattern）

## 定义

解释器模式（Interpreter Pattern），给分析对象定义一个语言，并定义该语言的文法表示，再设计一个解析器来解释语言中的句子。也就是说，用编译语言的方式来分析应用中的实例。这种模式实现了文法表达式处理的接口，该接口解释一个特定的上下文。

## 角色

- 抽象表达式（Abstract Expression）：定义解释器的接口，约定解释器的解释操作，主要包含解释方法 ```interpret()```。
- 终结符表达式（Terminal Expression）：是抽象表达式的子类，用来实现文法中与终结符相关的操作，文法中的每一个终结符都有一个具体终结表达式与之相对应。终结符表达式对象的 ```interpret()``` 方法返回具体结果。
- 非终结符表达式（Nonterminal Expression）：也是抽象表达式的子类，用来实现文法中与非终结符相关的操作，文法中的每条规则都对应于一个非终结符表达式。非终结符表达式对象的 ```interpret()``` 方法会递归调用非终结符表达式对象的 ```interpret()``` 方法，直到调用终结符表达式对象的 ```interpret()``` 方法返回具体结果。
- 环境（Context）：通常包含各个解释器需要的数据或是公共的功能，一般用来传递被所有解释器共享的数据，后面的解释器可以从这里获取这些值。

## 类图

### 类图

![解释器模式（Interpreter Pattern）](src/main/resources/static/diagram.png '解释器模式（Interpreter Pattern）')

### 示例

![解释器模式（Interpreter Pattern）](src/main/resources/static/diagram-demo.png '解释器模式（Interpreter Pattern）')
