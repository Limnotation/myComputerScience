# Created by DJ

这本笔记的目的是记录一些算法的思想和题目解答

## 剑指offer题解

### 面试题11： 旋转数组的最小数字

#### 思路：

#### 代码

```java
class Solution 
{
    public int minArray(int[] numbers) 
    {
        int left = 0, right = numbers.length - 1;
        while( left < right )
        {
            int mid = ( left + right ) / 2;
            if( numbers[mid] > numbers[right] )
                left = mid + 1;
            else if( numbers[mid] < numbers[right] )
                right = mid;
            else
                right--;
        }
        return numbers[left];
    }
}
```



### 面试题14-I：剪绳子

#### 思路：

#### 代码

```java
class Solution 
{
    public int cuttingRope(int n) 
    {
        if( n <= 3 )
            return n - 1;
        
        int a = n / 3, b = n % 3;
        if( b == 0 )
            return (int)Math.pow( 3, a );
        else if( b == 1 )
            return (int)Math.pow( 3, a - 1 ) * 4;
        else
            return (int)Math.pow( 3, a ) * 2;
    }
}
```



### 面试题33：二叉搜索树的后序遍历序列

#### 解题思路：

**关键：在二叉搜索树的后序遍历序列中，遍历序列的最后一个数字是树的根节点的值**。序列中的其他数字可以分为两个部分：小于根节点的部分和大于根节点的部分，即为根节点的左子树和右子树的遍历序列。对两个部分分别按上述思路区分，递归操作就可以得到原始的二叉搜索树。

#### 代码：

```java
class Solution 
{
    public boolean verifyPostorder(int[] postorder) 
    {
        return verify( postorder, 0, postorder.length - 1 );
    }

    private boolean verify( int[] postorder, int start, int end )
    {
        if( end - start <= 1 )
            return true;
        int rootVal = postorder[ end ];
        int cur = start;
        // 切割出左右子树的遍历序列,其实也相当于检查了左子树
        while( cur < end && postorder[cur] <= rootVal )
            cur++;
        // 检查右子树遍历序列的合法性
        for( int i = cur; i < end; i++ )
            if( rootVal > postorder[i] )
                return false;
        return verify( postorder, start, cur - 1 ) && verify( postorder, cur, end - 1 );
    }
}
```



### 面试题43：1~n整数中1出现的次数

#### 解题思路：

f(n)函数的意思是1~n这n个整数的十进制表示中1出现的次数，将n拆分为两部分，最高一位的数字设为high,其余位数字设为last.分别判断两个部分并相加。

例子如n = 1234,此时high = 1, last = 234, pow = 1000.
		可以将数字分为1~999 和1000~1234两个部分

- 1~999范围内1的个数为f(pow - 1)	
- 1000~1234这个范围内1的个数需要分为两个部分：
    - 千分位是1的个数：千分位为1的个数刚刚好就是234 + 1( last + 1) // 注意这里只看千分位
    -  其他位是1的个数：即使234中出现1的次数，为f(last).

全部相加得到的结果就是f(pow-1) + last + 1 + f(last)

例子如n = 3234,此时high = 3, last = 234, pow = 234
		可以将数字范围分成四个部分：1~999， 1000~1999， 2000~2999和 3000~3234

- 1~999这个范围1的个数是f(pow - 1)

- 1000~1234这个范围内1的个数需要分为两个部分：

    - 千分位是1的个数：千分位为1的个数刚刚好就是234 + 1*( last + 1) // 注意这里只看千分位

    -  其他位是1的个数：即使999中出现1的次数，为f(pow - 1).
       

       

- 2000~2999这个范围1的个数是f(pow - 1)
- 3000~3234这个范围1的个数是f(last)

全部相加得到的结果就是pow + high*f( pow - 1 ) + f( last )

#### 代码：

```java
class Solution
{
    public int countDigitOne( int n )
    {
        return f(n);
    }
    
    private int f( int n )
    {
        if( n <= 0 )
            return 0;
       	String s = String.valueOf( n );
        int high = s.charAt( 0 ) - '0';
        int pow = ( int )Math.pow( 10. s.length() - 1 );
        int last = n - high*pow;
        if( high == 1 )
            return f( pow - 1 ) + last + 1 + f( last );
        else
            return pow + high*f( pow - 1 ) + f( last );
	}
}
```





## 程序员面试金典题解

### Section 4

#### 面试题04.12  求和路径

注意这道题目与剑指offer的第34题有区别

##### 题解

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution 
{
    public int pathSum(TreeNode root, int sum) 
    {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        hashmap.put( 0, 1 );
        return findPath( root, hashmap, sum, 0 );
    }

    private int findPath( TreeNode root, HashMap<Integer, Integer> hashmap, int sum, int curSum )
    {
        if( root == null )
            return 0;
        
        // 本层的结果
        int res = 0;

        // 计算当前路径和
        curSum += root.val;

        res += hashmap.getOrDefault( curSum - sum, 0 );
        hashmap.put( curSum, hashmap.getOrDefault( curSum, 0 ) + 1 );

        // 进入下一层
        res += findPath( root.left, hashmap, sum, curSum );
        res += findPath( root.right, hashmap, sum, curSum );

        // 撤销本层选择
        hashmap.put( curSum, hashmap.get( curSum ) - 1 );
        return res;
    }
}
```

### Section 8

#### **面试题08.08：有重复字符串的排列组合**

```java
class Solution 
{
    LinkedList<String> res = new LinkedList<>();
    public String[] permutation(String S) 
    {
        char[] charArr = new char[ S.length() ];
        for( int i = 0; i < S.length(); i++ )
            charArr[i] = S.charAt( i );
        Arrays.sort( charArr );

        StringBuffer s = new StringBuffer();
        boolean[] used = new boolean[ charArr.length ];
        backTracking( charArr, used, s );

        String[] resultArr = new String[ res.size() ];
        for( int i = 0; i < res.size(); i++ )
            resultArr[i] = res.get( i );
        return resultArr;
    }

    private void backTracking( char[] charArr, boolean[] used, StringBuffer s )
    {
        if( charArr.length == s.length() )
        {
            res.add( s.toString() );
            return;
        }

        for( int i = 0; i < charArr.length; i++ )
        {
            if( used[i] )
                continue;
            if( i > 0 && charArr[i] == charArr[i-1] && !used[i-1] )
                continue;
            
            // 做选择
            s.append( charArr[i] );
            used[i] = true; 
            // 进入下一层决策树
            backTracking( charArr, used, s );
            // 撤销选择
            used[i] = false;
            s.deleteCharAt( s.length() - 1 );
        }
    }
}
```



### Section 10

#### 10.03 搜索旋转数组

-----

------

### Section 16 中等难题

------



------

#### 面试题16.25 LRU缓存



------

-----

### Section 17

-----

#### 面试题 17.11 单词距离

```java
class Solution 
{
    public int findClosest(String[] words, String word1, String word2) 
    {
        int wor1 = -1, wor2 = -1;
        int minLen = words.length;

        for( int i = 0; i < words.length; i++ )
        {
            if( words[i].equals( word1 ) )
                wor1 = i;
            else if( words[i].equals( word2 ) )
                wor2 = i;
            
            if( wor1 != -1 && wor2 != -1 )
                minLen = Math.min( minLen, Math.abs( wor1 - wor2 ) );
            if( minLen == 1 )
                break;
        }
        return minLen;
    }
}
```



