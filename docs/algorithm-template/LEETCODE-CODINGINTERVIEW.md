## 剑指offer

### 面试题03 二维数组中的查找

```java
class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) {
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0;
        int col = n - 1;
        // 
        while(row < m && col >= 0) {
            if(matrix[row][col] < target) {
                row++;
            } else if(matrix[row][col] > target) {
                col--;
            } else {
                return true;
            }
        }
        return false;
    }
}
```

-----

### 面试题05  替换空格

```java
/**
* 遍历原来的字符串，遍历过程中
* 如果非空格则将原来的字符直接拼接到新字符串中
* 如果遇到空格则将%20拼接到新字符串中
*/
class Solution {
    public String replaceSpace(String s) {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
```

-----

### 面试题06 从尾到头打印链表

```java
class Solution {
    public int[] reversePrint(ListNode head) {
        List<Integer> res = new LinkedList<>();
        while(head != null) {
            res.add(0, head.val);
            head = head.next;
        }
        int len = res.size();
        int[] resArr = new int[len];
        for(int i = 0; i < len; i++) {
            resArr[i] = res.get(i);
        }
        return resArr;
    }
}
```



-----

### 面试题09 用两个栈实现队列

```java
class CQueue {
    
    private Deque<Integer> stack1;
    private Deque<Integer> stack2;
    
    public CQueue() {
        this.stack1 = new LinkedList<>();
        this.stack2 = new LinkedList<>();
    }
    
    public void appendTail(int value) {
        stack1.addLast(value);
    }
    
    public int deleteHead() {
        if(!stack2.isEmpty()) {
            return stack2.removeLast();
        } else if(!stack1.isEmpty()) {
            while(!stack1.isEmpty()) {
                stack2.addLast(stack1.removeLast());
            }
            return stack2.removeLast();
        }
        return -1;
    }
}
```

------

### 面试题11 旋转数组的最小数字

参考题解：

https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array-ii/solution/er-fen-fa-fen-zhi-fa-python-dai-ma-by-liweiwei1419/

```java
class Solution {
    public int minArray(int[] numbers) {
        if(numbers == null || numbers.length == 0) {
            return -1;
        }

        int left = 0;
        int right = numbers.length - 1;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(numbers[mid] < numbers[right]) {
                right = mid;
            } else if(numbers[mid] > numbers[right]) {
                left = mid + 1;
            } else {
                right--;
            }
        }
        return numbers[left];
    }
}
```

-----

### 面试题17 打印从1到最大的n位数

```java
class Solution {
    public int[] printNumbers(int n) {
        // 最大的n位数为  Math.pow(10, n) - 1;
        int maxLen = (int)Math.pow(10, n);
        int[] res = new int[maxLen - 1];
        for(int i = 1; i < maxLen; i++) {
            res[i-1] = i; 
        }
        return res;
    }
}
```

-----

### 题目21 调整数组顺序使奇数位于偶数前面

```java
class Solution {
    public int[] exchange(int[] nums) {
        if(nums == null || nums.length == 0) {
            return nums;
        }
		
        /**
        * 循环不变量:
        * [0, mark)内的元素为奇数
         */
        int mark = 0;
        int index = 0;
        int len = nums.length;
        for(int i = 0; i < len; i++) {
            if(nums[i] % 2 == 1) {
                int temp = nums[i];
                nums[i] = nums[mark];
                nums[mark] = temp;
                mark++;
            } 
        }
        return nums;
    }
}
```



-----

### 面试题29 顺时针打印矩阵

**参考题解**：https://leetcode-cn.com/problems/shun-shi-zhen-da-yin-ju-zhen-lcof/solution/mian-shi-ti-29-shun-shi-zhen-da-yin-ju-zhen-she-di/

```java
class Solution {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) {
            return new int[0];
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int[] res = new int[m*n];
        int index = 0;
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = m - 1;
        while(true) {
            // 从左往右
            for(int i = left; i <= right; i++) {
                res[index] = matrix[top][i];
                index++;
            }
            top++;
            if(top > bottom) {
                break;
            }
			
            // 从上往下
            for(int i = top; i <= bottom; i++) {
                res[index] = matrix[i][right];
                index++;
            }
            right--;
            if(right < left) {
                break;
            }
			
            // 从右往左
            for(int i = right; i >= left; i--) {
                res[index] = matrix[bottom][i];
                index++;
            }
            bottom--;
            if(bottom < top) {
                break;
            }
			
            // 从下往上
            for(int i = bottom; i >= top; i--) {
                res[index] = matrix[i][left];
                index++;
            }
            left++;
            if(left > right) {
                break;
            }
        }
        return res;
    }
}
```

-----

### 面试题39 数组中出现次数超过一半的数字

```java
class Solution {
    public int majorityElement(int[] nums) {
        /**
        * 摩尔投票算法
        * 1、count == 0,把x赋给majority并且count=1
        * 2、x == majority,则count++;
        * 3、x != majority,则count--;
        * 最终的majority就是结果
         */
        int count = 0;
        int majority = nums[0];
        for(int i = 0; i < nums.length; i++) {
            if(count == 0) {
                majority = nums[i];
                count = 1;
            } else {
                if(nums[i] == majority) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        return majority;
    }
}
```



-----

### 面试题51 数组中的逆序对

```java
public class Solution {
    // 存储逆序对数量
    private int res = 0;
    // 辅助数组，帮助进行归并排序
    private int[] copy;
    
    public int reversePairs(int[] nums) {
        if(nums == null) {
            return res;
        }
        
        int len = nums.length;
        if(len < 2) {
            return res;
        }
        this.copy = new int[len];
        mergeSort(nums, 0, len - 1);
        return res;
    }
    
    /**
    * 对数组进行归并排序
    * @param nums	要进行排序的数组
    * @param left	左边界(能取到)
    * @param right	右边界(能取到)
     */
    private void mergeSort(int[] nums, int left, int right) {
        if(left == right) {
            return;
        }
        
        int mid = left + (right - left) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        mergeTwoSortedArray(nums, left, mid, right);
    }
    
    /**
    * 对两个有序的子数组进行归并
    * @param nums 
    * @param left
    * @param mid
    * @param right
     */
    private void mergeTwoSortedArray(int[] nums, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;
        while(i <= mid || j <= right) {
            if(i > mid) {
                // 左边的子数组已经遍历完，只从右边的子数组取元素
                copy[k] = nums[j];
                j++;
            } else if(j > right) {
                // 右边的子数组已经遍历完，只从左边的子数组取元素
                copy[k] = nums[i];
                i++;
            } else if(nums[i] <= nums[j]) {
                // 左子数组当前元素小于右子数组当前元素，取其放入归并数组
                copy[k] = nums[i];
                i++;
            } else {
                // 左子数组当前元素大于右子数组当前元素，左子数组当前及其
                // 之后所有元素都与右子数组当前元素构成逆序对
                copy[k] = nums[j];
                j++;
                res += mid - i + 1;
            }
            k++;
        }
        for(k = left; k <= high; k++) {
            nums[k] = copy[k];
        }
    }
}
```

----

### 面试题57  和为s的两个数字

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length < 2) {
            return new int[0];
        }

        int len = nums.length;
        // 双指针
        int left = 0;
        int right = len - 1;
        while(left < right) {
            int curSum = nums[left] + nums[right];
            if(curSum == target) {
                return new int[]{nums[left], nums[right]};
            } else if(curSum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[0];
    }
}
```

----

### 面试题57-II 和为s的连续整数序列

```java
class Solution {
    public int[][] findContinuousSequence(int target) {
        List<int[]> res = new LinkedList<>();
        int left = 1;
        int right = 1;
        int midVal = target / 2;
        int curSum = 0;
        /**
        * 循环不变量:
        * [left, right)内的元素为当前"窗口"内元素
        * 因为序列长度至少为2，所以序列中的最小元素一定不大于target / 2
         */
        while(left <= midVal) {
            if(curSum < target) {
                curSum += right;
                right++;
            } else if(curSum > target) {
                curSum -= left;
                left++;
            } else {
                int[] runner = new int[right - left];
                for(int i = left; i < right; i++) {
                    runner[i - left] = i;
                }
                // 当前的序列满足条件时,一定在保存结果后移动左边界
                res.add(runner);
                curSum -= left;
                left++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
```

-----

### 面试题58-I 翻转单词顺序

```java
class Solution {
    public String reverseWords(String s) {
        // 正则表达式:"\\s+"可以匹配一个或多个空格
        String[] res = s.trim().split("\\s+");
        int len = res.length;
        int i = 0;
        int j = len - 1;
        // 双指针，交换单词顺序
        while(i < j) {
            String temp = res[i];
            res[i] = res[j];
            res[j] = temp;
            i++;
            j--;
        }

        StringBuffer sb = new StringBuffer();
        for(int k = 0; k < len; k++) {
            sb.append(res[k] + " ");
        }
        return sb.toString().trim();
    }
}
```

----

### 面试题58-II　左旋转字符串

```java
class Solution {
    public String reverseLeftWords(String s, int n) {
        int len = s.length();
        int moves = n % len;
        String priorPart = s.substring(moves, len);
        String postPart = s.substring(0, moves);
        return priorPart + postPart;
    }
}
```

-----

### 面试题66 构建乘积数组

```java
class Solution {
    public int[] constructArr(int[] a) {
        int len = a.length;
        int[] res = new int[len];
        int k = 1;
        for(int i = 0; i < len; i++) {
            // res[i]:原数组中下标i所对应元素的左侧的所有元素乘积
            res[i] = k;
            k *= a[i];
        }

        k = 1;
        for(int i = len - 1; i >= 0; i--) {
            // res[i]:原数组中下标i所对应元素两侧的所有元素乘积
            res[i] *= k;
            k *= a[i];
        }
        return res;
    }
}
```

