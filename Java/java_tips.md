## 简介

主要是关于java编程中一些常见的小技巧，包括输入输出处理，一些集合类的初始化操作等等

1. 2020.01.17 19：41
    idea中设置虚拟机参数打印GC的信息时，输入命令为：-Xlog:gc* （原来的-XX:+PrintGCDetails已经被抛弃）

2. 2020.02.01 20：26
    java中定义一个数组，其元素为Java集合框架元素时，正确的定义方式为(以数组元素为ArrayList来举例)：

    ```java
    ArrayList<String> name[] = new ArrayList[9];
    ```

3. 2020.10.25 23：31

    使用初始数据初始化`HashMap`的具体操作

    ```java
    /**
    * 如下的示例代码是leetcode 17 电话号码的字母组合的题解代码的一部分
     */
    Map<Character, String> map = new HashMap<>() {
        {
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }
    };
    ```

    