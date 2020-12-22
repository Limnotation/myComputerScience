- [线性动态规划](#线性动态规划)
  - [单串](#单串)
    - [LIS系列](#lis系列)
      - [题目1 `leetcode 300 最长上升子序列`](#题目1-leetcode-300-最长上升子序列)
      - [题目2 `leetcode 673 最长递增子序列的个数`](#题目2-leetcode-673-最长递增子序列的个数)
      - [题目3 `leetcode 354 俄罗斯套娃信封问题`](#题目3-leetcode-354-俄罗斯套娃信封问题)
    - [最大子数组和系列](#最大子数组和系列)
      - [题目1 `leetcode 53 最大子序和`](#题目1-leetcode-53-最大子序和)
      - [题目2 `leetcode 152 乘积最大子数组`](#题目2-leetcode-152-乘积最大子数组)
      - [题目3 `leetcode 918 环形子数组的最大和`](#题目3-leetcode-918-环形子数组的最大和)
      - [题目4 `面试题17.24 最大子矩阵`](#题目4-面试题1724-最大子矩阵)
      - [题目5 `leetcode 363 矩形区域不超过K的最大数值和`](#题目5-leetcode-363-矩形区域不超过k的最大数值和)
    - [打家劫舍系列](#打家劫舍系列)
      - [题目1 `leetcode 198 打家劫舍`](#题目1-leetcode-198-打家劫舍)
      - [题目2 `leetcode 213 打家劫舍II`](#题目2-leetcode-213-打家劫舍ii)
      - [题目3 `leetcode 740 删除与获得点数`](#题目3-leetcode-740-删除与获得点数)
      - [题目4 `leetcode 1388 3n块披萨`](#题目4-leetcode-1388-3n块披萨)
    - [单串问题变形:需要两个位置的情况](#单串问题变形需要两个位置的情况)
      - [题目1 `leetcode 873 最长的斐波那契子序列的长度`](#题目1-leetcode-873-最长的斐波那契子序列的长度)
      - [题目2 `leetcode 1027 最长等差数列`](#题目2-leetcode-1027-最长等差数列)
    - [单串问题：带维度单串，`dpi`,`i`为位置，`k`为附加维度](#单串问题带维度单串dpii为位置k为附加维度)
      - [题目1 `leetcode 813 最大平均值和的分组`](#题目1-leetcode-813-最大平均值和的分组)
      - [题目2 `leetcode 887 鸡蛋掉落`](#题目2-leetcode-887-鸡蛋掉落)
      - [题目3 `leetcode 256 粉刷房子`](#题目3-leetcode-256-粉刷房子)
      - [题目4 `leetcode 265 粉刷房子II`](#题目4-leetcode-265-粉刷房子ii)
      - [题目5 `leetcode 975 奇偶跳`](#题目5-leetcode-975-奇偶跳)
      - [题目6 `leetcode 403 青蛙过河`](#题目6-leetcode-403-青蛙过河)
      - [题目7 `leetcode 1478 安排邮筒`](#题目7-leetcode-1478-安排邮筒)
      - [题目8 `leetcode 1230 抛掷硬币`](#题目8-leetcode-1230-抛掷硬币)
      - [题目9 `leetcode 410 分割数组的最大值`](#题目9-leetcode-410-分割数组的最大值)
      - [题目10 `leetcode 1473 给房子涂色`](#题目10-leetcode-1473-给房子涂色)
    - [单串问题：股票系列：`dpi,i是时间，k是次数，state是状态`](#单串问题股票系列dpistatei是时间k是次数state是状态)
      - [问题分析](#问题分析)
      - [题目1 `leetcode 121 买卖股票的最佳时机`](#题目1-leetcode-121-买卖股票的最佳时机)
      - [题目2 `leetcode 122 买卖股票的最佳时机II`](#题目2-leetcode-122-买卖股票的最佳时机ii)
      - [题目3 `leetcode 123 买卖股票的最佳时机III`](#题目3-leetcode-123-买卖股票的最佳时机iii)
      - [题目4 `leetcode 188 买卖股票的最佳时机IV`](#题目4-leetcode-188-买卖股票的最佳时机iv)
      - [题目5 `leetcode 309 买卖股票的最佳时机含冷冻期`](#题目5-leetcode-309-买卖股票的最佳时机含冷冻期)
      - [题目6 `leetcode 714 买卖股票的最佳时机含手续费`](#题目6-leetcode-714-买卖股票的最佳时机含手续费)
    - [单串问题：与其它算法配合](#单串问题与其它算法配合)
      - [题目1 `leetcode 1055 形成字符串的最短路径`](#题目1-leetcode-1055-形成字符串的最短路径)
      - [题目2 `leetcode 368 最大整除子集`](#题目2-leetcode-368-最大整除子集)
    - [单串问题：其它单串`dp[i]`问题](#单串问题其它单串dpi问题)
      - [题目1 `leetcode 746 使用最小花费爬楼梯`](#题目1-leetcode-746-使用最小花费爬楼梯)
  - [双串](#双串)
    - [双串问题：最经典双串LCS系列](#双串问题最经典双串lcs系列)
      - [题目1 `leetcode 1143 最长公共子序列`](#题目1-leetcode-1143-最长公共子序列)
      - [题目2  `leetcode 712 两个字符串的最小ASCII删除和`](#题目2--leetcode-712-两个字符串的最小ascii删除和)
      - [题目3 `leetcode 718 最长重复子数组`](#题目3-leetcode-718-最长重复子数组)
    - [双串问题：字符串匹配系列](#双串问题字符串匹配系列)
      - [题目1 `leetcode 72 编辑距离`](#题目1-leetcode-72-编辑距离)
      - [题目2 `leetcode 44 通配符匹配`](#题目2-leetcode-44-通配符匹配)
      - [题目3 `leetcode 10 正则表达式匹配`](#题目3-leetcode-10-正则表达式匹配)
    - [双串问题：带维度双串`dpi`](#双串问题带维度双串dpik)
      - [题目1 `leetcode 87 扰乱字符串`](#题目1-leetcode-87-扰乱字符串)
    - [双串问题：其他双串`dpi`问题](#双串问题其他双串dpi问题)
      - [题目1 `leetcode 97 交错字符串`](#题目1-leetcode-97-交错字符串)
      - [题目2 `leetcode 115 不同的子序列`](#题目2-leetcode-115-不同的子序列)
  - [矩阵](#矩阵)
    - [矩阵问题：矩阵`dpi`](#矩阵问题矩阵dpi)
      - [题目1 `leetcode 120 三角形最小路径和`](#题目1-leetcode-120-三角形最小路径和)
      - [题目2 `leetcode 64 最小路径和`](#题目2-leetcode-64-最小路径和)
      - [题目3 `leetcode 174 地下城游戏`](#题目3-leetcode-174-地下城游戏)
      - [题目4 `leetcode 221 最大正方形`](#题目4-leetcode-221-最大正方形)
      - [题目5 `leetcode 931 下降路径最小和`](#题目5-leetcode-931-下降路径最小和)
    - [矩阵问题：矩阵`dpi`](#矩阵问题矩阵dpik)
      - [题目1 `leetcode 363 矩形区域不超过K的最大数值和`](#题目1-leetcode-363-矩形区域不超过k的最大数值和)
      - [题目2 `leetcode 1444 切披萨的方案数`](#题目2-leetcode-1444-切披萨的方案数)
- [前缀和](#前缀和)
  - [前缀和概念](#前缀和概念)
  - [实现前缀和问题](#实现前缀和问题)
    - [题目1 `leetcode 303 区域和检索-数组不可变`](#题目1-leetcode-303-区域和检索-数组不可变)
    - [题目2 `leetcode 304 二维区域和检索`](#题目2-leetcode-304-二维区域和检索)
  - [数据结构维护前缀和问题：`HashMap`维护(1)](#数据结构维护前缀和问题hashmap维护1)
    - [题目1 `leetcode 325 和等于K的最长子数组长度`](#题目1-leetcode-325-和等于k的最长子数组长度)
    - [题目2 `leetcode 525 连续数组`](#题目2-leetcode-525-连续数组)
    - [题目3 `leetcode 1371 每个元音包含偶数次的最长子字符串`](#题目3-leetcode-1371-每个元音包含偶数次的最长子字符串)
  - [数据结构维护前缀和问题：`HashMap维护(2)`](#数据结构维护前缀和问题hashmap维护2)
    - [题目1 `leetcode 560 和为K的子数组`](#题目1-leetcode-560-和为k的子数组)
    - [题目2 `leetcode 1248 统计优美子数组`](#题目2-leetcode-1248-统计优美子数组)
  - [数据结构维护前缀和问题：`HashMap维护(3)`](#数据结构维护前缀和问题hashmap维护3)
    - [题目1 `leetcode 523 连续的子数组和`](#题目1-leetcode-523-连续的子数组和)
    - [题目2 `leetcode 974 和可被K整除的子数组`](#题目2-leetcode-974-和可被k整除的子数组)
  - [数据结构维护前缀和问题：前缀和(积)与后缀和(积)均需要](#数据结构维护前缀和问题前缀和积与后缀和积均需要)
    - [题目1 `leetcode 238 除自身以外数组的乘积`](#题目1-leetcode-238-除自身以外数组的乘积)
    - [题目2 `leetcode 724 寻找数组的中心索引`](#题目2-leetcode-724-寻找数组的中心索引)
    - [题目3 `leetcode 1477 找两个和为目标值且不重叠的子数组`](#题目3-leetcode-1477-找两个和为目标值且不重叠的子数组)
  - [数据结构维护前缀和问题：二维前缀和](#数据结构维护前缀和问题二维前缀和)
- [区间动态规划](#区间动态规划)
  - [回文相关问题](#回文相关问题)
    - [题目1 `leetcode 5 最长回文子串`](#题目1-leetcode-5-最长回文子串)
    - [题目2 `leetcode 647 回文子串`](#题目2-leetcode-647-回文子串)
    - [题目3 `leetcode 516 最长回文子序列`](#题目3-leetcode-516-最长回文子序列)
## 线性动态规划

> 线性动态规划的主要特点是状态的推导是按照问题规模 `i` 从小到大依次推过去的，较大规模的问题的解依赖较小规模的问题的解。
>
> 这里问题规模为 `i` 的含义是考虑前 `i` 个元素 `[0..i]` 时问题的解
>

### 单串

单串是线性动态规划最简单的一类问题，输入是一个串(字符串或者数组)，状态一般定义为`dp[i] := 考虑[0..i]`上，原问题的解，其中`i`位置的处理，根据不同的问题，有以下两种方式：

- 第一种是`i`位置必须取，此时状态可以进一步描述为`dp[i] := 考虑[0..i]`,且取`i`，原问题的解
- 第二种是`i`位置可取可不取

线性动态规划中单串问题，状态的推导方向及推导公式如下

![状态推导方向1](../../../../mdPics/2-2-1.png)

1. 依赖比 `i`小的O(1)个子问题

    `dp[i]`只与常数个小规模子问题有关

    状态的推导过程为: `dp[i] = f(dp[i-1], dp[i-2],...)`。

    时间复杂度O(n),空间复杂度`O(n)`并可以进一步优化为`O(1)`

    通常`dp[n]`即为所求的结果

2. 依赖比`i`小的`O(n)`个子问题

    `dp[i]`与此前更小规模的所有子问题`dp[i-1], dp[i-2], .. dp[0]`都可能有关系

    状态的推导过程为: `dp[i] = f(dp[i-1], dp[i-2], .. d[0])`

    常见的f可能为 max或min
    
    所求的结果为`dp[0],...dp[n]`中的最值

------

#### LIS系列

> 这一类题目需要依赖比`i`更小的`O(n)`个子问题,结果是dp数组中的最大值

##### 题目1 `leetcode 300 最长上升子序列`

```java
/**
* 定义状态: dp[i]表示以nums[i]结尾的LIS的长度，初始值都为1，因为每个数字可以单独构成长度为1的LIS
* 这个状态定义中的nums[i]一定被选取，并且是对应的子序列的最后一个元素
* 
* 考虑状态转移方程：
* 	1、在遍历到nums[i]时，需要把下标i之前的所有元素都检查一遍 
* 	2、只要nums[i]严格大于在它位置之前的某个数，那么nums[i]可以接在这个数后面形成一个更长的LIS
*	3、因此，dp[i]等于下标i之前严格小于nums[i]的状态值最大者 + 1
* 	公式描述为：
* 		dp[i] = max(dp[j] + 1, dp[i]) (0 <= j && j < i && nums[j] < nums[i])
*/
private int lengthOfLIS(int[] nums) {
    if(nums == null || nums.length == 0) {
        return 0;
    }

    int len = nums.length;
    int[] dp = new int[len];
    // 对于最外层for循环而言，每一轮结束后，对应位置i处表示的LIS长度就确定了
    // 所以在离开最外层循环前就可以比较当前结果与i位置表示的LIS长度的较大值
    int res = 1;
    Arrays.fill(dp, 1);
    for(int i = 1; i < len; i++) {
        for(int j = 0; j < i; j++) {
            if(nums[i] > nums[j]) {
                dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }
        res = Math.max(res, dp[i]);
    }
    return res;
}
```

-----

##### 题目2 `leetcode 673 最长递增子序列的个数`

```java
/**
* 这道题还是有点弄不清楚，需要有时间再梳理一遍
* 
* 定义状态: 
* 1、dp[i]表示以nums[i]结尾的LIS的长度，初始值都为1，因为每个数字可以单独构成长度为1的LIS
* 	这个状态定义中的nums[i]一定被选取，并且是对应的子序列的最后一个元素
* 2、count[i]表示以nums[i]结尾的LIS的个数
* 
* 状态转移：
* dp[i] = max(dp[j] + 1, dp[i]) (0 <= j && j < i && nums[j] < nums[i])
* count[i]:
* 	1、当dp[i] < dp[j+1]时，表示第一次获得长度为dp[j] + 1的LIS，故count[i] = count[j]
*	2、当dp[i] == dp[j] + 1时，表示dp[i]就是当前的LIS长度,并且以nums[j]为结尾的LIS可以
*	  与nums[i]合成长度为dp[i]的LIS。故count[i] += count[j];
*/
private int findNumberOfLIS(int[] nums) {
    if(nums == null || nums.length == 0) {
        return 0;
    }

    int len = nums.length;
    int[] dp = new int[len];
    int[] count = new int[len];
    int maxLen = 1;
    Arrays.fill(dp, 1);
    Arrays.fill(count, 1);
    for(int i = 1; i < len; i++) {
        for(int j = 0; j < i; j++) {
            if(nums[i] > nums[j]) {
                if(dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    count[i] = count[j];
                } else if(dp[j] + 1 == dp[i]){
                    count[i] += count[j];
                }
            }
        }
        maxLen = Math.max(maxLen, dp[i]);
    }

    int res = 0;
    for(int i = 0; i < len; i++) {
        if(dp[i] == maxLen) {
            res += count[i];
        }
    }
    return res;
}
```

-----

##### 题目3 `leetcode 354 俄罗斯套娃信封问题`

```java
/**
* LIS问题的二维拓展，思路与 leetcode 300相同
* 
* 这道题需要对二维数组进行排序：
* 1、将envelopes[i]按照w递增排序
* 2、当w相同时，按照h递减排序
* 这样排序的好处在于：只需要求h这个维度上的LIS即可，因为相同w下按照h倒序排序
* 保证了h递增的序列不会有w非递增的情况出现
 */
private int maxEnvelopes(int[][] envelopes) {
    if(envelopes == null || envelopes.length == 0) {
        return 0;
    }

    Arrays.sort(envelopes, new Comparator<int[]>() {
        @Override
        public int compare(int[] a, int[] b) {
            if(a[0] == b[0]) {
                return b[1] - a[1];
            }
            return a[0] - b[0];
        }
    });
    int len = envelopes.length;
    int[] dp = new int[len];
    Arrays.fill(dp, 1);
    int res = 1;
    for(int i = 1; i < len; i++) {
        for(int j = 0; j < i; j++) {
            if(envelopes[i][1] > envelopes[j][1]) {
                dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }
        res = Math.max(res, dp[i]);
    }
    return res;
}
```

--------

------

#### 最大子数组和系列

##### 题目1 `leetcode 53 最大子序和`

```java
/**
* 定义状态:dp[i]表示以nums[i]结尾的子数组的最大和
* 
* 当dp[i-1] <= 0时，nums[i] + dp[i-1] <= nums[i],故应从nums[i]划分新的子数组
* 当dp[i-1] > 0时，nums[i] + dp[i-1] > nums[i]
* 故状态转移方程为：
* dp[i] = (dp[i-1] <= 0)? nums[i] : dp[i-1] + nums[i]
*/

/**
* 解法1
 */
private int maxSubArray(int[] nums) {    
    if(nums == null || nums.length == 0) {
        return 0;
    }

    int len = nums.length;
    int[] dp = new int[len];
    dp[0] = nums[0];
    int res = dp[0];
    for(int i = 1; i < len; i++) {
        if(dp[i-1] <= 0) {
            dp[i] = nums[i];
        } else {
            dp[i] = dp[i-1] + nums[i];
        }
        res = Math.max(res, dp[i]);
    }
    return res;
}

/**
* 根据解法1可知，当前状态(dp[i])只与前一个状态(dp[i-1])有关，可以压缩空间
 */
private int maxSubArray(int[] nums) {    
    if(nums == null || nums.length == 0) {
        return 0;
    }

    int len = nums.length;
    int res = Integer.MIN_VALUE;
    int curSum = Integer.MIN_VALUE;
    // 压缩空间的解法:对于某一轮的循环而言，上一轮循环获得的curSum值就是dp[i-1]
    // 该轮循环更新的curSum值就是dp[i]
    for(int i = 0; i < len; i++) {
        if(curSum <= 0) {
            curSum = nums[i];
        } else {
            curSum += nums[i];
        }
        res = Math.max(res, curSum);
    }
    return res;
}
```

------

##### 题目2 `leetcode 152 乘积最大子数组`

```java
/**
* 因为存在负数，需要记录以当前数字(nums[i])结尾的乘积最大值和最小值，分别设为curMax，curMin
* 如果遍历到的数字为负数，易推知该数字与curMax和curMin的乘积会使得最大值变成当前最小值，最小值
* 变成当成最大值
* 
* 算法流程如下：
* 1、遍历数组时计算当前最大值，不断更新
* 2、令imax为当前最大值，则当前最大值为 imax = max(imax * nums[i], nums[i])
* 3、由于存在负数，那么会导致最大的变最小的，最小的变最大的。因此还需要维护当前最小值imin，
*    imin = min(imin nums[i], nums[i])
* 4、当负数出现时则imax与imin进行交换再进行下一步计算
*
* 采用压缩空间的解法，因为在这个问题中dp[i]只与dp[i-1]有关
 */
private int maxProduct(int[] nums) {
    if(nums == null || nums.length == 0) {
        return 0;
    }

    int res = Integer.MIN_VALUE;
    int curMin = 1;
    int curMax = 1;
    for(int i = 0; i < nums.length; i++) {
        if(nums[i] < 0) {
            // 在遍历值为负数时，先交换当前最大和最小值，再与当前值相乘
            // 易证明交换后并相乘的结果仍保证curMax和curMin的最值性质不变
            int temp = curMax;
            curMax = curMin;
            curMin = temp;
        }

        curMin = Math.min(nums[i], curMin * nums[i]);
        curMax = Math.max(nums[i], curMax * nums[i]);
        res = Math.max(res, curMax);
    }
    return res;
}
```

----

##### 题目3 `leetcode 918 环形子数组的最大和`

```java
/**
* 弄了一个O(n^2)的算法，超时了
* to-do
 */
```

------

##### 题目4 `面试题17.24 最大子矩阵`

```java
/**
* 这道题目是 题目1 "最大子序和"问题的变种，通过将二维压缩到一维来解决
* 压缩方式:
* 		1、第一层循环每次遍历矩阵的一行，以当前遍历行为上边界(设索引为i)
* 		2、第二层循环从当前遍历行开始，往下遍历其余行(设索引为j),则由[i, j]围成的子矩阵可以被按行压缩到一维数组
*		   lineSum[]中，在这个一维数组上求最大子序和就是求[i, j]围成的子矩阵中的最大子矩阵
* */
private int[] getMaxMatrix(int[][] matrix) {
    if(matrix == null || matrix.length == 0) {
        return new int[0];
    }

    // 求出矩阵的行宽和列宽
    int rowLen = matrix.length;
    int colLen = matrix[0].length;
    // 将存储最大子矩阵和的变量初始化为MIN_VALUE
    int curMax = Integer.MIN_VALUE;
    // lineSum存储[i, j]划分的子矩阵的列值之和
    int[] lineSum = new int[colLen];
    // 结果数组
    int[] res = new int[4];
    // 当前求出的具有最大子矩阵和的子矩阵的左上角行、列坐标，初始化为0
    int bestr1 = 0;
    int bestc1 = 0;

    for(int i = 0; i < rowLen; i++) {
        // 改变上界时需要重置lineSum
        Arrays.fill(lineSum, 0);
        // 不断变化下界
        for(int j = i; j < rowLen; j++) {
            // 这个循环内的步骤与求最大子序和的思路一致
            int curSum = Integer.MIN_VALUE;
            for(int k = 0; k < colLen; k++) {
                lineSum[k] += matrix[j][k];
                if(curSum <= 0) {
                    curSum = lineSum[k];
                    bestr1 = i;
                    bestc1 = k;
                } else {
                    curSum += lineSum[k];
                }

                if(curSum > curMax) {
                    curMax = curSum;
                    res[0] = bestr1;
                    res[1] = bestc1;
                    res[2] = j;
                    res[3] = k;
                }
            }
        }
    }
    return res;
}
```

-----

##### 题目5 `leetcode 363 矩形区域不超过K的最大数值和`

```java
/**
* to-do
 */
```

-----

-----

#### 打家劫舍系列

> 主要是不相邻子序列的最大和问题及其变形

##### 题目1 `leetcode 198 打家劫舍`

```java
/**
* 定义状态: dp[i] = 偷前i间房子可以获得的最大金额
* 状态转移：对于当前搜索到的第i间房子有两种选择：偷或者不偷
*		1、如果选择偷当前房子，则第i-1间房子不能偷，此时偷前i间房子的金额为偷前i-2间房子的金额加上第
*		  i间房子的金额
*		2、如果选择不偷当前房子，则此时偷前i间房子的金额为偷前i-1间房子获得的金额
*	在上述两种选择中选取获利最大的
*		dp[i] = max(dp[i-1], dp[i-2] + nums[i-1])
* 	base: dp[0] = 0; dp[1] = nums[0];
* 	最终返回结果为dp[n](共有n间房子)
 */

/**
* 解法一，常规解法
 */
private int rob(int[] nums) {
    if(nums == null || nums.length == 0) {
        return 0;
    }

    int len = nums.length;
    int[] dp = new int[len+1];
    dp[0] = 0;
    dp[1] = nums[0];
    for(int i = 2; i <= len; i++) {
        dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i-1]);
    }
    return dp[len];
}

/**
* 解法二
* 由解法一可知dp[i]只依赖于dp[i-1]和dp[i-2]
 */
private int rob(int[] nums) {
    if(nums == null || nums.length == 0) {
        return 0;
    }
    
    int len = nums.length;
    int curMinusOne = 0;
    int curMinusTwo = 0;
    int res = 0;
    for(int i = 0; i < len; i++) {
        res = Math.max(curMinusOne, curMinusTwo + nums[i]);
        curMinusTwo = curMinusOne;
        curMinusOne = res;
    }
    return res;
}
```

-----

##### 题目2 `leetcode 213 打家劫舍II`

```java
/**
* 由于首尾相连，所以第一个房间和最后一个房间不存在同时被选取的情况
* 除此之外思路与题目1相同
 */
public int rob(int[] nums) {
    if(nums == null || nums.length == 0) {
        return 0;
    } else if(nums.length == 1) {
        return nums[0];
    }

    int len = nums.length;
    // 分别考虑不选择第一个房间和最后一个房间的情况，比较最大值
    int robFirstHouse = rob(nums, 0, len - 2);
    int robLastHouse = rob(nums, 1, len - 1);
    return Math.max(robFirstHouse, robLastHouse);
}

private int rob(int[] nums, int left, int right) {
    int robMinusOne = 0;
    int robMinusTwo = 0;
    int res = 0;
    for(int i = left; i <= right; i++) {
        res = Math.max(robMinusOne, robMinusTwo + nums[i]);
        robMinusTwo = robMinusOne;
        robMinusOne = res;
    }
    return res;
}
```

----

##### 题目3 `leetcode 740 删除与获得点数`

```java
/**
* 问题的转化：
* 	由题目可知，若某一个点数被选取，则其相邻的点数就不可能再被选取
* 	由此可以得到如下的解决方案：
* 		1、求出数组中值最大的元素maxVal
*		2、定义数组countPoints，长度为maxVal + 1,其意义是存储点数为i的元素个数。i表示数组下标
*		  countPoints[i]表示个数(countPoints[i] = k表示点数i一共出现了k次)
*		3、对于codePoints数组而言，选取下标为i的元素就等价于选择了nums中的一个元素，此时与该
*		  元素相邻的其他元素都必须删除，即选取下标i后相邻的元素都不可以再选取，但是下标i的所有
*		  元素都可以被选取(因为相邻的元素已经被全部删除)
*	如上提出的解决方案最后一个步骤的实现思路与题目1 打家劫舍 一致
*/
private int deleteAndEarn(int[] nums) {
    if(nums == null || nums.length == 0) {
        return 0;
    }

    int len = nums.length;
    int maxVal = Integer.MIN_VALUE;
    for(int i = 0; i < len; i++) {
        maxVal = Math.max(maxVal, nums[i]);
    }

    int[] countPoints = new int[maxVal + 1];
    for(int i = 0; i < len; i++) {
        countPoints[nums[i]]++;
    }
    
    int res = 0;
    int resMinusTwo = 0;
    int resMinusOne = 0;
    for(int i = 0; i <= maxVal; i++) {
        res = Math.max(resMinusOne, resMinusTwo + countPoints[i] * i);
        resMinusTwo = resMinusOne;
        resMinusOne = res;
    }
    return res;
}
```

----

##### 题目4 `leetcode 1388 3n块披萨`

```java
/**
* to-do
 */
```

-----

-----

#### 单串问题变形:需要两个位置的情况

> `dp[i][j]`表示某个以`i,j`对应元素作为结尾的序列`(i < j)`的某种值的表示

##### 题目1 `leetcode 873 最长的斐波那契子序列的长度`

```java
/**
* 参考官方题解的表述:
* 	将斐波那契式的子序列中的两个连续项 A[i], A[j] 视为单个结点 (i, j)，整个子序列是这些连续结点之间的路径。
* 	例如，对于斐波那契式的子序列 (A[1] = 2, A[2] = 3, A[4] = 5, A[7] = 8, A[10] = 13)，结点之间的路径
* 	为 (1, 2) <-> (2, 4) <-> (4, 7) <-> (7, 10)。
* 	这样做的动机是，只有当 A[i] + A[k] == A[j] 时，两结点 (i, k) 和 (k, j) 才是连通的，我们需要这些信息
*   才能知道这一连通。现在我们得到一个类似于 最长上升子序列 的问题。

* 定义状态：dp[i][j]表示以A[i]、A[j]结尾的斐波那契子序列的最大长度
*           其中i < j,即A[i]、A[j]分别是该序列倒数第2、1位置的元素
* 
* 设i之前有k: 0 <= k < i,且A[k] + A[i] = A[j],则满足条件的k、i代表的
* 最大斐波那契子序列的长度加上1就是以A[i]、A[j]结尾的最长子序列长度
* 状态转移方程为：
*  	dp[i][j] = max{dp[k][i] + 1 | 0 <= k < i, i < j, A[k] + A[i] = A[j]}
* 在这个状态转移方程中，因为i < j && A[i] < A[j],理论上任何A[i],A[j]都可以组成
* 斐波那契式序列的最初两个元素，故将A[i][j]初始化为2(i < j表示只初始化对角线以上的部分)
 */

/**
* 需要注意：题目需要求的是满足f(n) = f(n - 1) + f(n - 2)这样一个斐波那契式递增关系的序列
* 		并不是求斐波那契序列的一部分！
 */
private int lenLongestFibSubseq(int[] A) {
    if(A == null || A.length == 0) {
        return 0;
    }

    int len = A.length;
    // 建立一个数组值到下标的映射，方便根据值找寻对应下标
    Map<Integer, Integer> valToIndexMap = new HashMap<>();
    for(int i = 0; i < len; i++) {
        valToIndexMap.put(A[i], i);
    }
	// dp数组的意义在上面已经说明，其实这里只需关注上三角部分
    int[][] dp = new int[len][len];
    for(int i = 0; i < len; i++) {
        for(int j = i + 1; j < len; j++) {
            dp[i][j] = 2;
        }
    }
    
    int res = 0;
    for(int i = 0; i < len; i++) {
        for(int j = i + 1; j < len; j++) {
            // diff的值就是期望寻找的A[k]的值
            int diff = A[j] - A[i];
            if(valToIndexMap.containsKey(diff)) {
                int k = valToIndexMap.get(diff);
                dp[i][j] = Math.max(dp[i][j], dp[k][i] + 1);
            }
            res = Math.max(res, dp[i][j]);
        }
    }
    return res > 2? res : 0;
}
```

----

##### 题目2 `leetcode 1027 最长等差数列`

```java
/**
* 思路与题目1 相同
* 定义状态: dp[i][j]表示以A[i]、A[j]结尾的最长等差子序列的长度
* 
* 设i之前有k：满足 0 <= k < i, A[i] - A[k] = A[j] - A[i] -> A[k] = 2 * A[i] - A[j]
* 则满足条件的k、i代表的最长等差子序列长度加上1就是以A[i],A[j]结尾的最长等差子序列长度
* 状态转移方程为：
*	dp[i][j] = max{dp[k][i] + 1 | 0 <= k < i, i < j, A[k] = 2 * A[i] + A[j]}
 */
private int longestArithSeqLength(int[] A) {
    if(A == null || A.length == 0) {
        return 0;
    }

    int len = A.length;
    int[][] dp = new int[len][len];
    for(int i = 0; i < len; i++) {
        for(int j = i + 1; j < len; j++) {
            dp[i][j] = 2;
        }
    }

    Map<Integer, Integer> valToIndexMap = new HashMap<>();
    int res = 0;
    for(int i = 0; i < len; i++) {
        for(int j = i + 1; j < len; j++) {
            int target = 2 * A[i] - A[j];
            if(valToIndexMap.containsKey(target)) {
                int k = valToIndexMap.get(target);
                dp[i][j] = Math.max(dp[i][j], dp[k][i] + 1);
            }
            res = Math.max(res, dp[i][j]);
        }
        // 在这一步才更新数组值到下标的映射原因是:
        // 数组是无序的状态，可能存在多个重复元素；
        // 通过一个哈希表记录每个在i之前的数出现的最后一个下标，就可以在O(1)的时间内找到target所在的下标。
        valToIndexMap.put(A[i], i);
    }
    return res;
}
```

-----

----

#### 单串问题：带维度单串，`dp[i][k]`,`i`为位置，`k`为附加维度



##### 题目1 `leetcode 813 最大平均值和的分组`

```java
/**
* 定义状态:
*   dp[i][k]表示前i个数构成k个子数组时的最大平均值和，那么对于所有0 <= j < i-1
*   有如下的状态转移方程:
*       dp[i][k] = Math.max(dp[i][k], dp[j][k-1] + (A[j] + ... + A[i-1]) / (i - j))
*/
private double largestSumOfAverages(int[] A, int K) {
    if(A == null || A.length == 0 || K <= 0) {
        return 0;
    }

    int len = A.length;
    // dp数组
    double[][] dp = new double[len + 1][K + 1];
    // 前缀和数组,preSum[i]等于数组前i个数字的和 ==> preSum[i] = A[0] + .. + A[i-1]
    // preSum[i] - preSum[j] = A[j] + .. + A[i-1]
    double[] preSum = new double[len + 1];
    preSum[0] = 0;
    for(int i = 1; i <= len; i++) {
        preSum[i] = preSum[i-1] + A[i-1];
        dp[i][1] = preSum[i] / i;
    }

    for(int i = 1; i <= len; i++) {
        for(int j = 0; j < i; j++) {
            for(int k = 2; k <= K; k++) {
                dp[i][k] = Math.max(dp[i][k], dp[j][k-1] + (preSum[i] - preSum[j]) / (i - j));
            }
        }
    }
    return dp[len][K];
}
```

-------

##### 题目2 `leetcode 887 鸡蛋掉落`

```java
/**
* to-do
 */
```

-----

##### 题目3 `leetcode 256 粉刷房子`

```java
/**
* 定义状态：
*   dp[i][k]表示使用第k种颜色粉刷第i个房子时，粉刷从第0到第i间房子所需的最小花费
* 状态转移：
*	设K为颜色种类
*   dp[i][k] = cost[i][k] + Math.min(dp[i-1][(k+1) % K], dp[i-1][(k+2) % K])
*/
private int minCost(int[][] costs) {
    if(costs == null || costs.length == 0) {
        return 0;
    }

    int row = costs.length;
    int col = costs[0].length;
    int[][] dp = new int[row][col];
    dp[0] = costs[0];
    for(int i = 1; i < row; i++) {
        for(int k = 0; k < col; k++) {
            dp[i][k] = costs[i][k] + Math.min(dp[i-1][(k+1) % col], dp[i-1][(k+2) % col]);
        }
    }

    int res = Integer.MAX_VALUE;
    for(int i = 0; i < col; i++) {
        res = Math.min(res, dp[row-1][i]);
    }
    return res;
}
```

-----

##### 题目4 `leetcode 265 粉刷房子II`

```java
/**
* 基本思路与leetcode 256一致
* 区别在于由于颜色的种类可能比较多，所以需要加一层循环，每选择一种颜色涂当前房子(序号为i)时，需要求出上一个房子(i-1)
* 使用不相同颜色时粉刷[0..i-1]的房子花费的最小值
 */

/**
* 方法一
* 时间复杂度：O(nk^2)
 */
private int minCostII(int[][] costs) {
    if(costs == null || costs.length == 0) {
        return 0;
    }

    int row = costs.length;
    int col = costs[0].length;
    int[][] dp = new int[row][col];
    dp[0] = costs[0];
    for(int i = 1; i < row; i++) {
        for(int j = 0; j < col; j++) {
            int minCost = Integer.MAX_VALUE;
            for(int k = 0; k < col; k++) {
                // 求出上一个房子使用不相同颜色时花费最小值
                if(j != k) {
                    minCost = Math.min(minCost, dp[i-1][k]);
                }
            }
            dp[i][j] = costs[i][j] + minCost;
        }
    }

    int res = Integer.MAX_VALUE;
    for(int i = 0; i < col; i++) {
        res = Math.min(res, dp[row-1][i]);
    }
    return res;
}

/**
* 优化: to-do
 */
```

-----

##### 题目5 `leetcode 975 奇偶跳`

```java
/**
* 假设dp[i][0/1]表示从A[i]开始，先进行 奇跳跃/偶跳跃 ，能否到达终点，则状态转移方程为：
* 	dp[i][0] = dp[A[i]通过奇跳跃到达的下一个索引j(j>i)][1]
* 	dp[i][1] = dp[A[i]通过偶跳跃到达的下一个索引j(j>i)][0]
* 则最后要求的答案为：dp[i][0]= true的起始点i的个数
* 
* 因此，现在要解决的问题就是：如何求A[i]通过 偶跳跃/奇跳跃 后到达的下一个索引j
* 观察发现，从后往前遍历A[i]，A[i]下一步会跳到的地方只与已经遍历过的A[i+1,...]的值以及当前是奇跳跃还是偶跳跃有关：
* 	奇跳跃：跳到大于A[i]的(大于A[i]的数里最小的)、索引最小的值,即ceiling(A[i])
* 	偶跳跃：跳到小于A[i]的(小于A[i]的数里最大的)、索引最小的值,即floor(A[i])
 */

private int oddEvenJumps(int[] A) {
    if(A == null || A.length == 0) {
        return 0;
    }

    int len = A.length;
    boolean[][] dp = new boolean[len][2];
    Arrays.fill(dp[len - 1], true);
    int res = 1;
    TreeMap<Integer, Integer> tMap = new TreeMap<>();
    for(int i = len - 1; i >= 0; i--) {
        // 从当前位置奇数跳移动到下一个大于等于A[i]的最小元素(ceiling(A[i]))
        // 当前位置能否到达终点与ceiling直接相关，若从ceiling处可以进行偶数跳
        // 移动到终点，则当前位置的索引是“好”的，结果加一
        Map.Entry<Integer, Integer> ceiling = tMap.ceilingEntry(A[i]);
        if(ceiling != null && dp[ceiling.getValue()][1]) {
            dp[i][0] = true;
            res++;
        }

        // 从当前位置偶数跳到下一个小于等于A[i]的最大元素(floor(A[i]))
        // 当前位置能否到达终点与floor直接相关，若从floor处可以进行奇数
        // 跳移动到终点，则从当前位置偶数跳移动到终点的可能性为true
        Map.Entry<Integer, Integer> floor = tMap.floorEntry(A[i]);
        if(floor != null && dp[floor.getValue()][0]) {
            dp[i][1] = true;
        }
        // 总是更新值到下标的映射，在存在重复元素时，总是会跳跃到索引值
        // 最小的位置
        tMap.put(A[i], i);
    }
    return res;
}
```

----

##### 题目6 `leetcode 403 青蛙过河`

```java
/**
* 定义dp数组：dp[i][k]表示是否能从(0 <= j <= i - 1)中某个节点跳跃k个单位
*           到达i节点
* 那么对于节点j而言，从其前一个节点到达j可能的跳跃方式为 k-1 || k || k + 1
* 由此可以得到如下的递推方程：
*       dp[i][k] = dp[j][k-1] || dp[j][k] || dp[j][k+1]
 */
public boolean canCross(int[] stones) {
    if(stones[1] != 1) {
        return false;
    }

    int len = stones.length;
    boolean[][] dp = new boolean[len][len + 1];
    dp[0][0] = true;
    for(int i = 1; i < len; i++) {
        for(int j = 0; j < i; j++) {
            int gap = stones[i] - stones[j];
            /**
            * 为什么有这么个判断？
            * 	因为其他石头跳到第 i 个石头跳的步数 k 必定满足 k <= i
            * 这又是为什么？
            * 	1、比如 nums = [0,1,3,5,6,8,12,17]
            * 	  那么第 0 个石头跳到第 1 个石头，步数肯定为 1，然后由于后续最大的步数是 k + 1，因此第 1 个石头最大只能跳 2 个单位
            *     因此如果逐个往上加，那么第 2 3 4 5 ... 个石头最多依次跳跃的步数是 3 4 5 6...
            * 	2、 第 i 个石头能跳的最大的步数是 i + 1，那么就意味着其他石头 j 跳到第 i 个石头的最大步数只能是 i 或者 j + 1
            *     而 这个 k 表示从j跳到 i 上所需要的步数，因此 k 必须 <= i （或者是 k <= j + 1）
             */
            if(gap <= i) {
                dp[i][gap] = dp[j][gap - 1] || dp[j][gap] || dp[j][gap + 1];
                if(i == len - 1 && dp[i][gap]) {
                    return true;
                }
            }
        }
    }
    return false;
}
```

------

##### 题目7 `leetcode 1478 安排邮筒`

```java
/**
* 前提:由绝对值不等式可知，给定一个数组，如果只安排一个邮局，那么把邮箱放到数组的
*     中位数位置上，此时房屋到邮筒的距离之和最小
*
* 当有K个邮局时，使用动态规划求解
* 考虑最后一个邮箱的覆盖范围，设dp[i][j]表示在前i个房间放置j个邮筒时的最小距离之和
* 
* 最后一个邮箱的覆盖范围：
*	当前j-1个邮箱分别负责一个房屋时，第j个邮箱需要负责(j ~ i)所有房子
*	当前j-1个邮箱负责(1~i-1)的所有房子时，第j个邮箱只需要负责第i间房子
* 设rec[i][j]表示第i间房子到第j间房子只放置一个邮箱时的最小距离之和
* 则本题的递推方程如下：
* 	dp[i][j] = Math.min(dp[k][j-1] + rec[k][i], dp[i][j]) 其中k >= j && k <= i-1
*
 */

private int minDistance(int[] houses, int k) {
	if(houses == null || houses.length == 0) {
        return Integer.MIN_VALUE;
    }
    
    int len = houses.length;
    
}
```

----

##### 题目8 `leetcode 1230 抛掷硬币`

```java
/**
* to-do
 */
```

----

##### 题目9 `leetcode 410 分割数组的最大值`

```java
/**
* to-do
 */
```

----

##### 题目10 `leetcode 1473 给房子涂色`

```java
/**
* to-do
 */
```

------

#### 单串问题：股票系列：`dp[i][k][state],i是时间，k是次数，state是状态`

##### 问题分析

```java
/**
* 状态：天数、允许交易的最大次数、股票的持有状态
* 选择：买入股票、卖出股票、无操作
* 
* 构建如下的dp数组
* 0 <= i <= n - 1, 1 <= k <= K
* n为天数,K为最大可交易次数
* 题目最多有n X K X 2种状态，可以全部穷举
* 0和1表示持有状态，0表示不持有股票，1表示持有股票
 */
dp[i][k][0 or 1];
for(int i = 0; i < n; i++) {
    for(int k = 1; k <= K; k++) {
        for(int s :{0, 1}) {
            dp[i][k][s] = Math.max(buy, sell, rest);
        }
    }
}
// 最终需要求解得到的答案是:dp[n-1][K][0]
// 答案的意义为在第n天结束时，最多可进行K次交易的情况下，可以获得的最大利润

// 根据分析得到如下的状态转移方程
/**
* 解释：今天不持有股票(s = 0)有两种原因：
* 1.昨天就未持有股票，今天选择rest(不参与购买股票),今天仍然未持有股票
* 2.昨天就持有股票，今天选择售出
*/
dp[i][k][0] = Math.max(dp[i-1][k][0], dp[i-1][k][1] + prices[i]);
		   = Math.max(选择rest, 选择sell);

/**
* 解释：今天持有股票(s = 1)有两种原因：
* 1.昨天就持有股票，今天选择rest(不参与售出股票),今天仍然持有股票
* 2.昨天未持有股票，今天选择buy(购入股票)
* 这个状态转移方程中出现了k-1的原因是：把一次购入股票和售出股票的操作作为一次完整的交易，
* 以购入股票为标志代表使用了一次交易机会，可用交易次数减一
*/
dp[i][k][1] = Math.max(dp[i-1][k][1], dp[i-1][k-1][0] - prices[i]);
= Math.max(选择rest, 选择buy);

/**
* 定义base case 
*/
dp[-1][k][0] = 0;					// i从0开始，故i < 0意味着从未进行任何交易，利润为0
dp[-1][k][1] = Integer.MIN_VALUE;	 // 未进行交易时不可能持有任何股票，用负无穷表示
dp[i][0][0] = 0;    				// k从1开始，k < 1代表不允许进行任何交易，利润为0
dp[i][0][1] = Integer.MIN_VALUE;	 // 不允许进行任何交易的情况下不可能持有股票，用负无穷表示


/**
* 状态转移方程总结
*/
// base case
dp[-1][k][0] = dp[i][0][0] = 0;
dp[-1][k][1] = dp[i][0][1] = Integer.MIN_VALUE;
// 状态转移
dp[i][k][0] = Math.max(dp[i-1][k][0], dp[i-1][k][1] + prices[i]);
dp[i][k][1] = Math.max(dp[i-1][k][1], dp[i-1][k-1][0] - prices[i]);
```

------

##### 题目1 `leetcode 121 买卖股票的最佳时机`

**分析**：K =  1，可以不考虑其影响

```java
/**
* dp[i][1][0] = max(dp[i-1][1][0], dp[i-1][1][1] + prices[i])
* dp[i][1][1] = max(dp[i-1][1][1], dp[i-1][0][0] - prices[i]) 
              = max(dp[i-1][1][1], -prices[i])
* 解释：k = 0 的 base case，所以 dp[i-1][0][0] = 0。
* 
* 现在发现 k 都是 1，不会改变，即 k 对状态转移已经没有影响了。
* 可以进行进一步化简去掉所有 k：
* 	dp[i][0] = max(dp[i-1][0], dp[i-1][1] + prices[i])
* 	dp[i][1] = max(dp[i-1][1], -prices[i])
 */

/**
* 常规dp解法
 */
private int maxProfit(int[] prices) {
    if(prices == null || prices.length == 0) {
        return 0;
    }
    
    int len = prices.length;
    int[][] dp = new int[len][2];
    dp[0][0] = 0;
    dp[0][1] = -prices[0];
    for(int i = 1; i < len; i++) {
        dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i]);
        dp[i][1] = Math.max(dp[i-1][1], -prices[i]);
    }
    return dp[len - 1][0];
}

/**
* 压缩空间解法
 */
private int maxProfit(int[] prices) {
    if(prices == null || prices.length == 0) {
        return 0;
    }
    
    int len = prices.length;
    int dpI0 = 0;
    int dpI1 = -prices[0];
    for(int i = 1; i < len; i++) {
        dpI0 = Math.max(dpI0, dpI1 + prices[i]);
        dpI1 = Math.max(dpI1, -prices[i]);
    }
    return dpI0;
}
```

-----

##### 题目2 `leetcode 122 买卖股票的最佳时机II`

**分析**：K = infinity,可以不考虑其影响

```java
/**
* k = infinity时k与k-1并无区别
* dp[i][k][0] = max(dp[i-1][k][0], dp[i-1][k][1] + prices[i])
* dp[i][k][1] = max(dp[i-1][k][1], dp[i-1][k-1][0] - prices[i])
*             = max(dp[i-1][k][1], dp[i-1][k][0] - prices[i])
* 
* 我们发现数组中的 k 已经不会改变了，也就是说不需要记录 k 这个状态了：
* 	dp[i][0] = max(dp[i-1][0], dp[i-1][1] + prices[i])
* 	dp[i][1] = max(dp[i-1][1], dp[i-1][0] - prices[i])
 */

/**
* 常规dp解法
 */
private int maxProfit(int[] prices) {
    if(prices == null || prices.length == 0) {
        return 0;
    }
    
    int len = prices.length;
    int[][] dp = new int[len][2];
    dp[0][0] = 0;
    dp[0][1] = -prices[0];
    for(int i = 1; i < len; i++) {
        dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i]);
        dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] - prices[i]);
    }
    return dp[len - 1][0];
}

/**
* 压缩空间解法
 */
private int maxProfit(int[] prices) {
    if(prices == null || prices.length == 0) {
        return 0;
    }
    
    int len = prices.length;
    int dpI0 = 0;
    int dpI1 = -prices[0];
    for(int i = 1; i < len; i++) {
        int newDpI0 = Math.max(dpI0, dpI1 + prices[i]);
        int newDpI1 = Math.max(dpI1, dpI0 - prices[i]);
        dpI0 = newDpI0;
        dpI1 = newDpI1;
    }
    return dpI0;
}
```

-----

##### 题目3 `leetcode 123 买卖股票的最佳时机III`

**分析**：Ｋ　＝　２，遍历所有的K值

```java
/**
* 注意：交易次数K是指允许的最大交易次数，并不是要求一定要交易K次
* 	所以要遍历所有K值找到可以获取最大理论的交易次数
 */

/**
* 常规dp解法
 */
private int maxProfit(int[] prices) {
    if(prices == null || prices.length == 0) {
        return 0;
    }

    int len = prices.length;
    int[][][] dp = new int[len][3][2];
    dp[0][1][0] = 0;
    dp[0][1][1] = -prices[0];
    dp[0][2][0] = 0;
    dp[0][2][1] = -prices[0];
    for(int i = 1; i < len; i++) {
        for(int k = 1; k <= 2; k++) {
            dp[i][k][0] = Math.max(dp[i-1][k][0], dp[i-1][k][1] + prices[i]);
            dp[i][k][1] = Math.max(dp[i-1][k][1], dp[i-1][k-1][0] - prices[i]);
        }
    }
    return dp[len-1][2][0];
}
```

------

##### 题目4 `leetcode 188 买卖股票的最佳时机IV`

**分析**：K = infinity,一次完整的交易至少需要两天时间，所以n天之内最多可以完成n / 2次交易，如果K > = n / 2,解决方案与 K = infinity时一致

```java
public int maxProfit(int k, int[] prices) {
    if(prices == null || prices.length == 0) {
        return 0;
    }

    int len = prices.length;
    if(len / 2 <= k) {
        return maxProfitWithInfiniteK(prices);
    } else {
        return maxProfitWithK(prices, k);
    }
}

/**
* 参照leetcode 122 
 */
private int maxProfitWithInfiniteK(int[] prices) {
    int len = prices.length;
    int dpI0 = 0;
    int dpI1 = -prices[0];
    for(int i = 1; i < len; i++) {
        int newDpI0 = Math.max(dpI0, dpI1 + prices[i]);
        int newDpI1 = Math.max(dpI1, dpI0 - prices[i]);
        dpI0 = newDpI0;
        dpI1 = newDpI1;
    }
    return dpI0;
}

/**
* 参照leetcode 123
* 关键在于所有可能的交易次数都要遍历一遍，因为并不是把交易次数
* 用完利润最大
 */
private int maxProfitWithK(int[] prices, int K) {
    int len = prices.length;
    int[][][] dp = new int[len][K+1][2];
    for(int i = 1; i <= K; i++) {
        dp[0][i][0] = 0;
        dp[0][i][1] = -prices[0];
    }

    for(int i = 1; i < len; i++) {
        for(int k = 1; k <= K; k++) {
            dp[i][k][0] = Math.max(dp[i-1][k][0], dp[i-1][k][1] + prices[i]);
            dp[i][k][1] = Math.max(dp[i-1][k][1], dp[i-1][k-1][0] - prices[i]);
        }
    }
    return dp[len-1][K][0];
}
```

------

##### 题目5 `leetcode 309 买卖股票的最佳时机含冷冻期`

**分析**：每次sell操作完成之后要隔一天才能进行下一次交易

```java
/**
* 常规dp解法
 */
private int maxProfit(int[] prices) {
    if(prices == null || prices.length == 0) {
        return 0;
    }

    int len = prices.length;
    int[][] dp = new int[len][2];
    dp[0][0] = 0;
    dp[0][1] = -prices[0];
    for(int i = 1; i < len; i++) {
        dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i]);
        dp[i][1] = Math.max(dp[i-1][1], ((i-2) >= 0? dp[i-2][0] : 0) - prices[i]);
    }
    return dp[len-1][0];
}
```

------

##### 题目6 `leetcode 714 买卖股票的最佳时机含手续费`

```java
/**
* 常规dp解法，将fee加入到股票的购买成本中
 */
private int maxProfit(int[] prices, int fee) {
    if(prices == null || prices.length == 0) {
        return 0;
    }

    int len = prices.length;
    int dpI0 = 0;
    int dpI1 = -prices[0] - fee;
    for(int i = 1; i < len; i++) {
        int newDpI0 = Math.max(dpI0, dpI1 + prices[i]);
        int newDpI1 = Math.max(dpI1, dpI0 - prices[i]- fee);
        dpI0 = newDpI0;
        dpI1 = newDpI1;
    }
    return dpI0;
}
```

------

#### 单串问题：与其它算法配合

##### 题目1 `leetcode 1055 形成字符串的最短路径`

```java
/**
* to-do
 */
```

-----

##### 题目2 `leetcode 368 最大整除子集`

```java
/**
* to-do
 */
```

-----

#### 单串问题：其它单串`dp[i]`问题

##### 题目1 `leetcode 746 使用最小花费爬楼梯`

```java
/**
* dp[i]表示到达i的顶部所需要的最小花费
* base case:
*   dp[0] = cost[0]; 
*   dp[1] = cost[1];
* 状态转移方程：
*   dp[i] = Math.min(dp[i-1], dp[i-2]) + cost[i]
 */
private int minCostClimbingStairs(int[] cost) {
    if(cost == null || cost.length == 0) {
        return 0;
    }

    int len = cost.length;
    int[] dp = new int[len];
    dp[0] = cost[0];
    dp[1] = cost[1];
    for(int i = 2; i < len; i++) {
        dp[i] = Math.min(dp[i-1], dp[i-2]) + cost[i];
    }

    return Math.min(dp[len-1], dp[len-2]);
}
```



----

-------

### 双串

#### 双串问题：最经典双串LCS系列

##### 题目1 `leetcode 1143 最长公共子序列`

```java
/**
* 定义dp数组：dp[i][j]表示text1的前i个字符与text2的前j个字符组成的LCS的长度
* 状态转移方程为：
*	1、dp[i][j] = dp[i-1][j-1] + 1     			  if(text1.charAt(i-1) == text2.charAt(j-1))
*	2、dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j])  else
*
* 结果为dp[len1][len2];
 */
private int longestCommonSubsequence(String text1, String text2) {
    int len1 = text1.length();
    int len2 = text2.length();
    int[][] dp = new int[len1 + 1][len2 + 1];
    for(int i = 1; i <= len1; i++) {
        for(int j = 1; j <= len2; j++) {
            if(text1.charAt(i-1) == text2.charAt(j-1)) {
                dp[i][j] = dp[i-1][j-1] + 1;
            } else {
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
    }
    return dp[len1][len2];
}
```

-----

##### 题目2  `leetcode 712 两个字符串的最小ASCII删除和`

```java
/**
* 两个字符串的ascii码之和是定值，分别设为asciiSum1, asciiSum2
* 删除字符使得两个字符串相等，可以理解为得到两个字符串的LCS,设LCS的ascii码值为asciiLCS
* 则待删除字符的ascii码值可以表示为：asciiSum1 + asciiSum2 - 2 * asciiLCS
* 由公式可知，只要获取ascii值最大的LCS，就可以得到最小删除和
* 
* 定义dp数组：dp[i][j]表示s1的前i个字符与s2的前j个字符的LCS的ascii码值之和
* 状态转移方程为：
*	1、dp[i][j] = dp[i-1][j-1] + s1.charAt(i-1)     if(s1.charAt(i-1) == s2.charAt(j-1))
*	2、dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j])  else
* */
private int minimumDeleteSum(String s1, String s2) {
    int len1 = s1.length();
    int len2 = s2.length();
    int[][] dp = new int[len1 + 1][len2 + 1];
    for(int i = 1; i <= len1; i++) {
        for(int j = 1; j <= len2; j++) {
            if(s1.charAt(i-1) == s2.charAt(j-1)) {
                dp[i][j] = dp[i-1][j-1] + s1.charAt(i-1);
            } else {
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
    }

    int asciiSum1 = 0;
    int asciiSum2 = 0;
    for(char c : s1.toCharArray()) {
        asciiSum1 += c;
    }
    for(char c : s2.toCharArray()) {
        asciiSum2 += c;
    }
    // 显然
    return asciiSum1 + asciiSum2 - 2 * dp[len1][len2];
}
```

----

##### 题目3 `leetcode 718 最长重复子数组`

```java
/**
* 注意：子数组是连续序列
* dp[i][j] ：长度为 i，末尾项为A[i−1] 的子数组，与长度为j，末尾项为B[j−1]的子数组，二者
* 的最大公共后缀子数组长度。
* 状态转移方程：
* 	如果 A[i-1] != B[j-1]， 有 dp[i][j] = 0
* 	如果 A[i-1] == B[j-1]， 有 dp[i][j] = dp[i-1][j-1] + 1
* base case：如果i==0||j==0，其中一个子数组长度为 0，没有公共部分，dp[i][j] = 0
* 最长公共子数组以哪一项为末尾项都有可能，即每个 dp[i][j] 都可能是最大值。需要保存结果全局变量
 */
private int findLength(int[] A, int[] B) {
    int len1 = A.length;
    int len2 = B.length;
    int[][] dp = new int[len1+1][len2+1];
    int res = 0;
    for(int i = 1; i <= len1; i++) {
        for(int j = 1; j <= len2; j++) {
            if(A[i-1] == B[j-1]) {
                dp[i][j] = dp[i-1][j-1] + 1;
            }
            res = Math.max(res, dp[i][j]);
        }
    }
    return res;
}
```

-----

#### 双串问题：字符串匹配系列

##### 题目1 `leetcode 72 编辑距离`

```java
/**
* 定义dp数组：dp[i][j]表示将word1前i个字符编辑成word2的前j个字符需要的最小
* 			编辑次数
* 状态推导参考liweiwei的题解，图解较为详细
 */
private int minDistance(String word1, String word2) {
    int len1 = word1.length();
    int len2 = word2.length();
    int[][] dp = new int[len1 + 1][len2 + 1];
    for(int i = 0; i <= len1; i++) {
        dp[i][0] = i;
    }
    for(int i = 0; i <= len2; i++) {
        dp[0][i] = i;
    }

    for(int i = 1; i <= len1; i++) {
        for(int j = 1; j <= len2; j++) {
            if(word1.charAt(i-1) == word2.charAt(j-1)) {
                dp[i][j] = dp[i-1][j-1];
            } else {
                dp[i][j] = Math.min(dp[i-1][j], Math.min(dp[i-1][j-1], dp[i][j-1])) + 1;
            }
        }
    }
    return dp[len1][len2];
}
```

-----

##### 题目2 `leetcode 44 通配符匹配`

```java
/**
* 定义dp数组：dp[i][j]表示p的前i个字符与s的前j个字符的匹配结果
* 状态转移：
*	1、如果p[i-1] == s[j-1]或者p[i-1] == '?',表示当前的字符串匹配，dp[i][j]
*	  由dp[i-1][j-1]转移而来
*	2、如果p[i-1] == '*',那么dp[i][j]可以由dp[i-1][j]转移而来，表示此时'*'不匹配
*	  任何字符；或者由dp[i][j-1]转移而来，表示'*'匹配了当前字符
* 状态转移方程可以表示为：
* 	dp[i][j] = dp[i-1][j-1]              if(p[i-1] == s[j-1] || p[i-1] == '?')
*		    = dp[i-1][j] || dp[i][j-1]   else if(dp[i-1] == '*')
*/
private boolean isMatch(String s, String p) {
    int len1 = p.length();
    int len2 = s.length();
    boolean[][] dp = new boolean[len1 + 1][len2 + 1];
    dp[0][0] = true;
    int loseMatch = 1;
    // 这个循环作用是：
    // 当p的前缀是由至少一个'*'组成时，这个前缀可以和任意长度
    // 的字符串匹配，所以此时dp[i][j] = true
    for(int i = 1; i <= len1; i++) {
        if(p.charAt(i-1) != '*') {
            break;
        }
        Arrays.fill(dp[i], true);
        loseMatch++;
    }

    for(int i = loseMatch; i <= len1; i++) {
        for(int j = 1; j <= len2; j++) {
            if(p.charAt(i-1) == s.charAt(j-1) || p.charAt(i-1) == '?') {
                dp[i][j] = dp[i-1][j-1];
            } else if(p.charAt(i-1) == '*') {
                dp[i][j] = dp[i-1][j] || dp[i][j-1];
            }
        }
    }
    return dp[len1][len2];
}
```

-----

##### 题目3 `leetcode 10 正则表达式匹配`

```java
/**
* to-do
 */
```

------

#### 双串问题：带维度双串`dp[i][j][k]`

##### 题目1 `leetcode 87 扰乱字符串`

```java
/**
* to-do
 */
```

-----

#### 双串问题：其他双串`dp[i][j]`问题

##### 题目1 `leetcode 97 交错字符串`

```java
/**
* to-do
 */
```

-----

##### 题目2 `leetcode 115 不同的子序列`

```java
/**
* to-do
 */
```

-----

----

### 矩阵

#### 矩阵问题：矩阵`dp[i][j]`

##### 题目1 `leetcode 120 三角形最小路径和`

```java
/**
* 定义dp数组：dp[i][j]表示点(i, j)到底边的最小路径和
* 根据题目条件，状态转移方程为：
* 	dp[i][j] = Math.min(dp[i+1][j], dp[i+1][j+1]) + triangle.get(i).get(j)
 */

/**
* 常规dp解法
 */
private int minimumTotal(List<List<Integer>> triangle) {
    int len = triangle.size();
    int[][] dp = new int[len + 1][len + 1];
    for(int i = len - 1; i >= 0; i--) {
        for(int j = 0; j <= i;j++) {
            dp[i][j] = Math.min(dp[i+1][j], dp[i+1][j+1]) + triangle.get(i).get(j);
        }
    }
    return dp[0][0];
}

/**
* 压缩空间的解法
 */
private int minimumTotal(List<List<Integer>> triangle) {
    int len = triangle.size();
    int[] dp = new int[len + 1];
    for(int i= len - 1; i >= 0; i--) {
        for(int j = 0; j <= i; j++) {
            dp[j] = Math.min(dp[j], dp[j+1]) + triangle.get(i).get(j);
        }
    }
    return dp[0];
}
```

----

##### 题目2 `leetcode 64 最小路径和`

```java
/**
* dp[i][j] 表示从起点(0, 0)走到（i,j）的最短路径长度
* 状态转移方程：
* 	dp[i][j] = min(dp[i-1][j], dp[i][j-1]) + grid[i][j]
* 	return dp[rowLen-1][colLen-1]
* 注意处理边界条件即可
 */

/**
* 常规dp解法
 */
private int minPathSum(int[][] grid) {
    int m = grid.length;
    int n = grid[0].length;
    int[][] dp = new int[m][n];
    for(int i = 0; i < m; i++) {
        for(int j = 0; j < n; j++) {
            if(i == 0 && j == 0) {
                dp[i][j] = grid[i][j];
                continue;
            } else if(i == 0) {
                dp[i][j] = dp[i][j-1];
            } else if(j == 0) {
                dp[i][j] = dp[i-1][j];
            } else {
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]);
            }
            dp[i][j] += grid[i][j];
        }
    }
    return dp[m-1][n-1];
}

/**
* 采用空间压缩的解法
 */
private int minPathSum(int[][] grid) {
    if(grid == null || grid.length == 0) {
        return 0;
    }

    int m = grid.length;
    int n = grid[0].length;
    int[] dp = new int[n];
    for(int i = 0; i < m; i++) {
        for(int j = 0; j < n; j++) {
            if(j == 0) {
                // 当前在第一列。只能从上方位置到达
                dp[j] = dp[j];
            } else if(i == 0) {
                // 当前在第一行。只能从左侧位置到达
                dp[j] = dp[j-1];
            } else {
                // 当前在边界之外的位置。可以从左侧或者上方位置到达
                dp[j] = Math.min(dp[j-1], dp[j]);
            }
            // 加上当前位置的路径代价
            dp[j] += grid[i][j];
        }
    }
    return dp[n-1];
}
```

----

##### 题目3 `leetcode 174 地下城游戏`

```java
/**
* to-do
 */
```

-----

##### 题目4 `leetcode 221 最大正方形`

```java
/**
* 定义dp数组：dp[i][j]表示以matrix[i-1][j-1]为右下角的正方形的最大边长
* 具体的思路参考题解：
* 	https://leetcode-cn.com/problems/maximal-square/solution/li-jie-san-zhe-qu-zui-xiao-1-by-lzhlyle/
 */
private int maximalSquare(char[][] matrix) {
    if(matrix == null || matrix.length == 0) {
        return 0;
    }

    int maxSide = 0;
    int row = matrix.length;
    int col = matrix[0].length;
    int[][] dp = new int[row + 1][col + 1];
    for(int i = 1; i <= row; i++) {
        for(int j = 1; j <= col; j++) {
            if(matrix[i-1][j-1] == '1') {
                dp[i][j] = Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1])) + 1;
                maxSide = Math.max(dp[i][j], maxSide);
            }
        }
    }
    return maxSide * maxSide;
}
```

-----

##### 题目5 `leetcode 931 下降路径最小和`

```java
/**
* 定义dp数组：dp[i][j]表示从(i, j)开始到达底部的最小和
* 根据题目要求,(i, j)可以到达的位置有：(i+1, j-1), (i+1，j), (i+1, j+1)
* 状态转移方程为：
* 	dp[i][j] = A[i][j] + min(dp[i+1][j-1], dp[i+1][j], dp[i+1][j+1])
*	// 注意判断边界条件即可，第一列和最后一列的位置并不能有三个选项
* 根据分析可知，对A的遍历应该从倒数第二行往上遍历
* */
private int minFallingPathSum(int[][] A) {
    int row = A.length;
    int col = A[0].length;
    for(int i = row - 2; i >= 0; i--) {
        for(int j = 0; j < col; j++) {
            int suffixCost = A[i+1][j];
            if(j > 0) {
                suffixCost = Math.min(suffixCost, A[i+1][j-1]);
            }
            if(j + 1 < col) {
                suffixCost = Math.min(suffixCost, A[i+1][j+1]);
            }
            A[i][j] += suffixCost;
        }
    }

    int res = Integer.MAX_VALUE;
    for(int i : A[0]) {
        res = Math.min(i, res);
    }
    return res;
}
```

------

#### 矩阵问题：矩阵`dp[i][j][k]`

##### 题目1 `leetcode 363 矩形区域不超过K的最大数值和`

```java
/**
* to-do
 */
```

-----

##### 题目2 `leetcode 1444 切披萨的方案数`

```java
/**
* to-do 
 */
```

-----

-----

## 前缀和

### 前缀和概念

```java
int n = nums.length;
int[] preSum = new int[n+1];
preSum[0] = 0;
for(int i = 0; i < n; i++) {
    preSum[i+1] = preSum[i] + nums[i];
}
// preSum[0]表示数组没有数字被选中,值为0
// preSum[i]表示nums[0..i-1]的和
// nums[i..j]的和可以表示为preSum[j+1] - preSum[i]
// 前缀和主要的实现方式是使用hashMap,元素基数较小时且范围较小时也可使用数组
```

-----

### 实现前缀和问题

#### 题目1 `leetcode 303 区域和检索-数组不可变`

```java
/**
* 前缀和定义的直接使用
 */
private int[] preSum;
public NumArray(int[] nums) {
    int len = nums.length;
    this.preSum = new int[len + 1];
    this.preSum[0] = 0;
    for(int i = 0; i < len; i++) {
        preSum[i+1] = preSum[i] + nums[i];
    }
}

public int sumRange(int i, int j) { 
    return preSum[j+1] - preSum[i];
}
```

-----

#### 题目2 `leetcode 304 二维区域和检索`

```java
/**
* 对二维矩阵先求其各行的前缀和，再求各列的前缀和，得到前缀和矩阵preSumMatrix
* 两步计算之后,preSumMatrix[i][j]表示(0, 0)和(i-1, j-1)表示的矩阵的和
*/
private int[][] preSumMatrix;
public NumMatrix(int[][] matrix) {
    if(matrix == null || matrix.length == 0) {
        return;
    }
    int row = matrix.length;    
    int col = matrix[0].length;
    this.preSumMatrix = new int[row+1][col+1];
    // 求矩阵的行前缀和
    for(int i = 1; i <= row; i++) {
        for(int j = 1; j <= col; j++) {
            preSumMatrix[i][j] = preSumMatrix[i][j-1] + matrix[i-1][j-1];
        }
    }
	// 求矩阵的列前缀和
    for(int j = 1; j <= col; j++) {
        for(int i = 1; i <= row; i++) {
            preSumMatrix[i][j] += preSumMatrix[i-1][j];
        }
    }
}

public int sumRegion(int row1, int col1, int row2, int col2) {
    if(preSumMatrix == null || preSumMatrix.length == 0) {
        return 0;
    }
    return preSumMatrix[row2+1][col2+1] - preSumMatrix[row1][col2+1] - preSumMatrix[row2+1][col1]
        + preSumMatrix[row1][col1];
}
```

-----

### 数据结构维护前缀和问题：`HashMap`维护(1)

> 以下若干组题目都是利用数据结构维护前缀和，实现统计数组中的某个指标的目的。
> `HashMap` 维护，键是前缀和（状态）的值，值为第一次出现时的索引

#### 题目1 `leetcode 325 和等于K的最长子数组长度`

```java
/**
* curSum表示到当前元素为止的数组前缀和
* preSumMap：
*	key的值表示一个数组的前缀值
* 	value的值则表示相应的前缀和第一次出现时该前缀的最后一个元素的数组下标
* 		value的值之所以被这样设置是因为要求最长长度时，重复出现的前缀值并不会
* 		使得结果更大，只需要关注相同前缀和第一次出现的情况即可
 */
private int maxSubArrayLen(int[] nums, int k) {
    if(nums == null || nums.length == 0) {
        return 0;
    }

    int res = 0;
    int curSum = 0;
    Map<Integer, Integer> preSumMap = new HashMap<>();
    preSumMap.put(0, -1);
    for(int i = 0; i < nums.length; i++) {
        curSum += nums[i];
        if(!preSumMap.containsKey(curSum)) {
            preSumMap.put(curSum, i);
        }
        if(preSumMap.containsKey(curSum - k)) {
            res = Math.max(res, i - preSumMap.get(curSum - k));
        }
    }
    return res;
}
```

----

#### 题目2 `leetcode 525 连续数组`

```java
/** 
* 把1记作 +1, 把0记作 -1，此时curSum表示前缀数组的和
* curSum == 0则表示该前缀中1和0的数量相等
* preSumMap：
*	key的值表示一个数组的前缀值
* 	value的值则表示相应的前缀和第一次出现时该前缀的最后一个元素的数组下标
* 		value的值之所以被这样设置是因为要求最长长度时，重复出现的前缀值并不会
* 		使得结果更大，只需要关注相同前缀和第一次出现的情况即可
*/
private int findMaxLength(int[] nums) {
    if(nums == null || nums.length <= 1) {
        return 0;
    }

    int res = 0;
    int curSum = 0;
    Map<Integer, Integer> preSumMap = new HashMap<>();
    preSumMap.put(0, -1);
    for(int i = 0; i < nums.length; i++) {
        if(nums[i] == 1) {
            curSum += 1;
        } else {
            curSum -= 1;
        }

        if(!preSumMap.containsKey(curSum)) {
            preSumMap.put(curSum, i);
        } else {
            res = Math.max(res, i - preSumMap.get(curSum));
        }
    }
    return res;
}
```

----

#### 题目3 `leetcode 1371 每个元音包含偶数次的最长子字符串`

```java
/**
* 1、使用int的最低5位分别表示a, e, i, o, u的出现次数，bit = 1表示字符
* 	出现了奇数次，bit = 0表示字符出现了偶数次
* 2、curSum表示前缀的“异或前缀和”，其中仅使用了最低的5位：当该位为0表示
*	字符出现偶数次，否则字符出现奇数次。通过每次字符出现时将对应位与1进
*	行异或可以反应前缀中对应字符的出现情况
* 3、如果同样的异或前缀和的值出现了两次，那么可以肯定这个区间之内一定有
*	元音字符出现了偶数次(只有这样该位的异或结果为0)
*
* preSumMap：
*	key的值表示一个字符串前缀的异或前缀和
* 	value的值则表示相应的前缀和第一次出现时该前缀的最后一个元素的数组下标
* 		value的值之所以被这样设置是因为要求最长长度时，重复出现的前缀值并不会
* 		使得结果更大，只需要关注相同前缀和第一次出现的情况即可
 */
private int findTheLongestSubstring(String s) {
    if(s == null || s.length() == 0) {
        return 0;
    }

    int res = 0;
    int curSum = 0;
    Map<Integer, Integer> preSumMap = new HashMap<>();
    preSumMap.put(0, -1);
    for(int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        switch(c) {
            case 'a': curSum ^= 1; break;
            case 'e': curSum ^= 2; break;
            case 'i': curSum ^= 4; break;
            case 'o': curSum ^= 8; break;
            case 'u': curSum ^= 16; break;
        }

        if(!preSumMap.containsKey(curSum)) {
            preSumMap.put(curSum, i);
        } else {
            res = Math.max(res, i - preSumMap.get(curSum));
        }
    }
    return res;
}
```

-----

### 数据结构维护前缀和问题：`HashMap维护(2)`

> `HashMap` 维护，键是前缀和（前缀状态）的值，值为出现次数

#### 题目1 `leetcode 560 和为K的子数组`

```java
/**
* presumMap的key表示前缀和的值，value表示对应前缀和出现的次数
 */
private int subarraySum(int[] nums, int k) {
    if(nums == null || nums.length == 0) {
        return 0;
    }

    int res = 0;
    int curSum = 0;
    Map<Integer, Integer> preSumMap = new HashMap<>();
    preSumMap.put(0, 1);
    for(int num : nums) {
        curSum += num;
        res += preSumMap.containsKey(curSum - k)? preSumMap.get(curSum - k) : 0;
        preSumMap.put(curSum, preSumMap.getOrDefault(curSum, 0) + 1);
    }
    return res;
}
```

---

#### 题目2 `leetcode 1248 统计优美子数组`

```java
/**
* presumMap的下标表示前缀和的值，值表示对应前缀和出现的次数
 */
private int numberOfSubarrays(int[] nums, int k) {
    if(nums == null || nums.length < k) {
        return 0;
    }

    int len = nums.length;
    int[] preSumMap = new int[len+1];
    preSumMap[0] = 1;
    int curSum = 0;
    int res = 0;
    for(int i = 0; i < len; i++) {
        curSum += nums[i] & 1;
        preSumMap[curSum]++;
        if(curSum >= k) {
            res += preSumMap[curSum - k];
        }
    }
    return res;
}
```

----

### 数据结构维护前缀和问题：`HashMap维护(3)`

> `HashMap` 维护，键是前缀和模 K 的余数（可以理解为前缀状态，状态为前缀和模 K）

#### 题目1 `leetcode 523 连续的子数组和`

```java
/**
* 关键公式：
* 	(preSum[i+1] - preSum[j]) % k == 0 <==> preSum[i+1] % k == preSum[j] % k
* 由上述公式可知，如果存在两个不同的前缀和针对同一个数求余结果相等，那么两个前缀和相减
* 所表示的子数组的和就可以被k整除，即：这个子数组的和为k的倍数
* 
* 1、为了方便计算，curSum保存当前位置的前缀和；
* 2、preSumMap中，key为前缀和对k的求余结果，value存储对应的求余结果第一次出现的位置
* 3、每次对sum取余，判断在位置i之前是否存在位置使得前缀和取余后也等于preSum%k如存在，且
*	位置之差>1（至少有两个数）则返回true
* 4、如果一直遍历完，说明不符合条件，返回false
 */
private boolean checkSubarraySum(int[] nums, int k) {
    if(nums == null || nums.length < 2) {
        return false;
    }

    int len = nums.length;
    int curSum = 0;
    Map<Integer, Integer> preSumMap = new HashMap<>();
    preSumMap.put(0, -1);
    for(int i = 0; i < len; i++) {
        curSum += nums[i];
        if(k != 0) {
            curSum %= k;
        }
        if(preSumMap.containsKey(curSum)) {
            if(i - preSumMap.get(curSum) > 1) {
                return true;
            }
        } else {
            preSumMap.put(curSum, i);
        }
    }
    return false;
}
```

----

#### 题目2 `leetcode 974 和可被K整除的子数组`

```java
/**
* 1、为了方便计算，curSum保存当前位置的前缀和；
* 2、preSumMap中，下标为前缀和对k的求余结果，值存储对应的求余结果出现的次数
* 3、每次对curSum取余，判断在位置i之前是否存在位置使得前缀和取余后也等于preSum%k
 */
private int subarraysDivByK(int[] A, int K) {
    if(A == null || A.length == 0) {
        return 0;
    }

    int len = A.length;
    int res = 0;
    int curSum = 0;
    int[] preSumMap = new int[K + 1];
    preSumMap[0] = 1;
    for(int i = 0; i < len; i++) {
        curSum = (curSum + A[i]) % K;
        if(curSum < 0) {
            curSum += K;
        }
        if(preSumMap[curSum] > 0) {
            res += preSumMap[curSum];
            preSumMap[curSum]++;
        } else {
            preSumMap[curSum] = 1;
        }
    }
    return res;
}
```

-----

### 数据结构维护前缀和问题：前缀和(积)与后缀和(积)均需要

#### 题目1 `leetcode 238 除自身以外数组的乘积`

```java
private int[] productExceptSelf(int[] nums) {
    if(nums == null || nums.length == 0) {
        return nums;
    }

    int len = nums.length;
    int[] res = new int[len];
    // preProduct表示当前元素左侧的前缀子数组的
    // 元素乘积，初始值为1
    int preProduct = 1;
    for(int i = 0; i < len; i++) {
        res[i] = preProduct;
        preProduct *= nums[i];
    }
    // sufProduct表示当前元素右侧的后缀子数组的
    // 元素乘积，初始值为1
    int sufProduct = 1;
    for(int i = len - 1; i >= 0; i--) {
        res[i] *= sufProduct;
        sufProduct *= nums[i];
    }
    return res;
}
```

----

#### 题目2 `leetcode 724 寻找数组的中心索引`

```java
private int pivotIndex(int[] nums) {
    if(nums == null || nums.length == 0) {
        return -1;
    }

    int res = 0;
    int len = nums.length;
    // sumOfPrefix表示当前元素左侧的前缀子数组的
    // 元素之和，初始值为0
    int[] sumOfPrefix = new int[len];
    int preSum = 0;
    for(int i = 0; i < len; i++) {
        sumOfPrefix[i] = preSum;
        preSum += nums[i];
    }

    // sumOfSuffix表示当前元素右侧的后缀子数组的
    // 元素之和，初始值为0
    int[] sumOfSuffix = new int[len];
    int sufSum = 0;
    for(int i = len - 1; i >= 0; i--) {
        sumOfSuffix[i] += sufSum;
        sufSum += nums[i];
    }

    for(int i = 0; i < len; i++) {
        if(sumOfPrefix[i] == sumOfSuffix[i]) {
            return i;
        }
    }
    return -1;
}
```

-----

#### 题目3 `leetcode 1477 找两个和为目标值且不重叠的子数组`

```java
/**
* to-do
 */
```

-----

### 数据结构维护前缀和问题：二维前缀和

----

----

## 区间动态规划

### 回文相关问题

#### 题目1 `leetcode 5 最长回文子串`

```java
/**
* dp[i][j]表示s(i, j)是否是一个回文子串
* 由回文串定义可知：dp[i][j] = (s.charAt(i) == s.charAt(j)) && d[i+1][j-1]
* 状态转移：
* 	1、如果s.charAt(i) != s.charAt(j),则s(i, j)不是回文串，dp[i][j] = false;
*	2、如果s.charAt(i) == s.charAt(j)
*		(1) 如果j - i < 3,则此时s(i, j)一定是一个回文串，不需要依靠其他dp状态的推断
*		(2) 否则dp[i][j]的状态要依靠dp[i+1][j-1]的状态来推断
 */
private String longestPalindrome(String s) {
    if(s == null || s.length() == 0) {
        return "";
    }

    int len = s.length();
    int start = 0;
    int maxLen = 1;
    boolean[][] dp = new boolean[len][len];
    for(int i = 0; i < len; i++) {
        dp[i][i] = true;
    }
    for(int i = len - 2; i >= 0; i--) {
        for(int j = i + 1; j < len; j++) {
            if(s.charAt(i) != s.charAt(j)) {
                dp[i][j] = false;
            } else {
                if(j - i < 3) {
                    dp[i][j] = true;
                } else {
                    dp[i][j] = dp[i+1][j-1];
                }
            }
            // 及时更新最长回文串的起点和长度值
            if(dp[i][j] && j - i + 1 > maxLen) {
                maxLen = j - i + 1;
                start = i;
            }
        }
    }
    return s.substring(start, start + maxLen);
}
```

----

#### 题目2 `leetcode 647 回文子串`

```java
/**
* dp[i][j]表示s(i, j)是否是一个回文子串
* 由回文串定义可知：dp[i][j] = (s.charAt(i) == s.charAt(j)) && d[i+1][j-1]
* 状态转移：
* 	1、如果s.charAt(i) != s.charAt(j),则s(i, j)不是回文串，dp[i][j] = false;
*	2、如果s.charAt(i) == s.charAt(j)
*		(1) 如果j - i < 3,则此时s(i, j)一定是一个回文串，不需要依靠其他dp状态的推断
*		(2) 否则dp[i][j]的状态要依靠dp[i+1][j-1]的状态来推断
*/
private int countSubstrings(String s) {
    if(s == null || s.length() == 0) {
        return 0;
    }

    int len = s.length();
    // 每个字符都是一个回文串
    int res = len;
    boolean[][] dp = new boolean[len][len];
    for(int i = 0; i < len; i++) {
        dp[i][i] = true;
    } 

    for(int i = len - 2; i >= 0; i--) {
        for(int j = i + 1; j < len; j++) {
            if(s.charAt(i) != s.charAt(j)) {
                dp[i][j] = false;
            } else {
                if(j - i < 3) {
                    dp[i][j] = true;
                } else {
                    dp[i][j] = dp[i+1][j-1];
                }
            }
            
            if(dp[i][j]) {
                res++;
            }
        }
    }
    return res;
}
```

------

#### 题目3 `leetcode 516 最长回文子序列`

```java
/**
* dp[i][j]表示s(i, j)内最长回文子序列的长度
* 状态转移方程：
*   if(s.charAt(i) == s.charAt(j))
*       dp[i][j] = dp[i+1][j-1] + 2
*   else 
*       dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1])
 */
private int longestPalindromeSubseq(String s) {
    if(s == null || s.length() == 0) {
        return 0;
    }

    int len = s.length();
    int[][] dp = new int[len][len];
    int res = 1;
    for(int i = 0; i < len; i++) {
        dp[i][i] = 1;
    }

    for(int i = len - 2; i >= 0; i--) {
        for(int j = i + 1; j < len; j++) {
            if(s.charAt(i) == s.charAt(j)) {
                dp[i][j] = dp[i+1][j-1] + 2;
            } else {
                dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
            }
        }
    }
    return dp[0][len-1];
}
```

