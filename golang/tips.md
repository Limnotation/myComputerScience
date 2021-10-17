1. 在创建切片或者映射时，如果不需要指定元素数量，则使用字面量形式初始化；否则应首先使用make()函数初始化

    ```go
    // 不指定容量
    collect := []int{}
    mapping := map[int]int{}
    
    // 指定元数数量
    collect := make([]int, n)
    mapping := make(map[int]int, n)
    ```

2. 在解决回溯问题时，经常需要把切片作为参数传递并将中间结果存储到一个全局变量中，此时需要将中间结果复制到一个新的切片上再存到全局变量

    ```go
    // 复制切片方式如下
    runner := []int{}
    ...
    res = append(res, append([]int{}, runner...))
    ```

3. 在解决算法题时，如果出现了同时需要设置全局变量以及使用递归函数的情况，通常需要使用函数变量

    ```go
    var recursion func(parameterList) (resultList) 
    recursion = func(parameterList) (resultList) {
        // function body, will recursively call itself
    }
    res := recursion(parameterList)
    ```

4. 在函数内创建函数变量时，最外层函数的参数对于函数变量而言算是全局变量；特别是在`dfs`和回溯中这个特性很重要

5. `golang`中的参数传递是值传递，并且对切片而言，如果函数内部对切片进行了修改，结果可能是内部会生成一个新切片与传入的实参切片相独立。所以如果需要把切片作为类似Java中的Array List来使用，应该是传入一个切片的指针

    ```go
    runner := []int{}
    func recursion(runner *[]int)
    ...
    recursion(&runner)
    ```

    这样可以保证runner永远指向最新的数据

    参考：[leetcode 366](https://leetcode-cn.com/problems/find-leaves-of-binary-tree/)

6. 在创建某种类型的指针时，应使用如下的语句

    ```go
    var ptr *type
    ```

7. 