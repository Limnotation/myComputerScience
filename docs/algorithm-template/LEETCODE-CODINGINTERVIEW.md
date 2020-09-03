## 剑指offer

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

### 面试题29 顺时针打印矩阵

**参考题解**：https://leetcode-cn.com/problems/shun-shi-zhen-da-yin-ju-zhen-lcof/solution/mian-shi-ti-29-shun-shi-zhen-da-yin-ju-zhen-she-di/

```java
// 注意边界收缩的顺序，以及判断边界是否合法
private int[] spiralOrder(int[][] matrix) {
    if(matrix == null || matrix.length == 0) {
        return new int[0];
    }
    
    int left = 0, right = matrix[0].length - 1;
    int top = 0, bottom = matrix.length - 1;
    int[] res = new int[(right + 1) * (bottom + 1)];
    int index = 0;
    while(true) {
        // 从左往右
        for(int i = left; i <= right; i++) {
            res[index++] = matrix[top][i];
        }
        if(++top > bottom)
            break;
        // 从上往下
        for(int i = top; i <= bottom; i++) {
            res[index++] = matrix[i][right];
        }
        if(--right < left)
            break;
        // 从右往左
        for(int i = right; i >= left; i--) {
            res[index++] = matrix[bottom][i];
        }
        if(--bottom < top)
            break;
        // 从下往上
        for(int i = bottom; i >= top; i--) {
            res[index++] = matrix[i][left];
        }
        if(++left > right)
            break;
    }
    return res;
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

