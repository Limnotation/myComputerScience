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
      - [题目2 `leetcode `](#题目2-leetcode-)
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

2. 依赖比`i`小的`O(n)`个子问题

    `dp[i]`与此前更小规模的所有子问题`dp[i-1], dp[i-2], .. dp[0]`都可能有关系

    状态的推导过程为: `dp[i] = f(dp[i-1], dp[i-2], .. d[0])`

    常见的f可能为 max或min

------

#### LIS系列

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
    // 使用一个变量res在每次遍历时记录最大值，避免了结束后再次遍历数组获得最大值
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
        for(int j = 0; j < colLen; j++) {
            lineSum[j] = 0;
        }
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
*		dp[i] = max(dp[i-1], dp[i-2] + nums[i-1]
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
    } else if(nums.length == 1) {
        return nums[0];
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
    
    int[] dp = new int[maxVal + 1];
    dp[0] = 0;
    dp[1] = countPoints[1] * 1;
    for(int i = 2; i <= maxVal; i++) {
        dp[i] = Math.max(dp[i-1], dp[i-2] + countPoints[i] * i);
    }
    return dp[maxVal];
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
* 	这样做的动机是，只有当 A[i] + A[j] == A[k] 时，两结点 (i, j) 和 (j, k) 才是连通的，我们需要这些信息
*   才能知道这一连通。现在我们得到一个类似于 最长上升子序列 的问题。

* 定义状态：dp[i][j]表示以A[i]、A[j]结尾的斐波那契子序列的最大长度
*           其中i < j,即A[i]、A[j]分别是该序列倒数第2、1位置的元素
* 
* 设i之前有k: 0 <= k < i,且A[k] + A[i] = A[j],则满足条件的k、i代表的
* 最大斐波那契子序列的长度加上1就是以A[i]、A[j]结尾的最长子序列长度
* 状态转移方程为：
*  	dp[i][j] = max{dp[k][i] + 1 | 0 <= k < i, i < j, A[k] + A[i] = A[j]}
* 在这个状态转移方程中，因为i < j && A[i] < A[j],理论上任何A[i],A[j]都可以组成
* 斐波那契式序列，故将A[i][j]初始化为2(i < j表示只初始化对角线以上的部分)
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
*   dp[i][k]表示前i个数构成k个子数组时的最大平均值和，那么对于所有0 <= j <= i-1
*   有如下的状态转移方程:
*       dp[i][k] = Math.max(dp[i][k], dp[j][k-1] + (A[j] + ... + A[i-1]) / (i - j))
*/
private double largestSumOfAverages(int[] A, int K) {
    if(A == null || A.length == 0) {
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
