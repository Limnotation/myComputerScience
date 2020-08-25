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

