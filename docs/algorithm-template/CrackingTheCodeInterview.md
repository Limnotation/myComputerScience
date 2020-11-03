## Section 1

### 01.01  判定字符是否唯一

```java
/**
* 使用set去重或者位运算都可以解决
 */
public boolean isUnique(String astr) {
    Set<Character> set = new HashSet<>();
    for(char c : astr.toCharArray()) {
        if(set.contains(c)) {
            return false;
        }
        set.add(c);
    }
    return true;
}
```

-----

### 01.02 判断是否互为字符重排

```java
public boolean CheckPermutation(String s1, String s2) {
    if(s1 == null || s2 == null || s1.length() != s2.length()) {
        return false;
    }

    int[] need = new int[256];
    for(char c : s1.toCharArray()) {
        need[c]++;
    }
    for(char c : s2.toCharArray()) {
        need[c]--;
        if(need[c] < 0) {
            // need[c] < 0表示有一个s2中有一个字符在s1中不存在
            return false;
        }
    }
    return true;
}
```

----

### 01.03 URL化

```java
public String replaceSpaces(String S, int length) {
    // 统计原字符串中空格的数量
    int spaceNum = 0;
    for(int i = 0; i < length; i++) {
        if(S.charAt(i) == ' ') {
            spaceNum++;
        }
    }

    // 按照规则添加字符后的结果长度为 length + 2 * spaceNum
    char[] charArr = new char[length + 2 * spaceNum];
    System.arraycopy(S.toCharArray(), 0, charArr, 0, length);
    // tailIndex指向即将下一个被填入字符的位置
    int tailIndex = charArr.length - 1;
    // runner从后向前遍历原字符串
    int runner = length - 1;
    while(runner >= 0) {
        if(charArr[runner] != ' ') {
            charArr[tailIndex] = charArr[runner];
            tailIndex--;
        } else {
            charArr[tailIndex--] = '0';
            charArr[tailIndex--] = '2';
            charArr[tailIndex--] = '%';
        }
        runner--;
    }
    return String.valueOf(charArr);
}
```

----

### 01.04 回文排列

```java
/**
* 关键：字符串中所有字符至多只能有一个字符出现奇数次
 */

// v1
public boolean canPermutePalindrome(String s) {
    int[] charArr = new int[256];
    for(char c : s.toCharArray()) {
        charArr[c]++;
    }

    int oddChar = 0;
    for(int i = 0; i < 256; i++) {
        if(charArr[i] % 2 != 0) {
            oddChar++;
        }
    }

    return oddChar <= 1;
}

// v2
public boolean canPermutePalindrome(String s) {
    int[] charArr = new int[256];
    int oddCount = 0;
    for(char c : s.toCharArray()) {
        charArr[c]++;
        if(charArr[c] % 2 == 1) {
            oddCount++;
        } else {
            oddCount--;
        }
    }
    return oddCount <= 1;
}
```

-----

### 01.05 一次编辑

```java
/**
* 从前向后依次匹配字符，在第一次失配时记录(singleMiss = true)
* 并移动较长字符串的指针向后一位(在这里由于for循环的缘故，所以
* 变成把较短字符串的指针回退一位，待for循环自增操作完成后两个指
* 针刚好相差一位)
* 之后继续比较字符，若再次失配则一定无法通过一次编辑完成
 */
public boolean oneEditAway(String first, String second) {
    int len1 = first.length();
    int len2 = second.length();
    int diff = len1 - len2;
    if(diff > 1 || diff < -1) {
        return false;
    }

    boolean singleMiss = false;
    for(int i = 0, j = 0; i < len1 && j < len2; i++, j++) {
        if(first.charAt(i) == second.charAt(j)) {
            continue;
        } else if(singleMiss) {
            return false;
        }

        if(diff == 1) {
            j--;
        } else if(diff == -1) {
            i--;
        }
        singleMiss = true;
    }
    return true;
}
```

----

### 01.06 字符串压缩

```java
public String compressString(String S) {
    if(S == null || S.length() <= 1) {
        return S;
    }

    StringBuffer res = new StringBuffer();
    int index = 0;
    int len = S.length();
    while(index < len) {
        int counter = 1;
        int runner = index + 1;
        char curChar = S.charAt(index);
        while(runner < len && curChar == S.charAt(runner)) {
            counter++;
            runner++;
        }
        res.append(curChar);
        res.append(counter);
        index = runner;
    }

    return res.length() >= S.length()? S : res.toString();
}
```

------



------

### 01.08 零矩阵

```java
/**
* 使用布尔数组标记存在0的行和列，最后再进行清除即可
 */
public void setZeroes(int[][] matrix) {
    int m = matrix.length;
    int n = matrix[0].length;
    boolean[] rowMark = new boolean[m];
    boolean[] colMark = new boolean[n];
    for(int i = 0; i < m; i++) {
        for(int j = 0; j < n; j++) {
            if(matrix[i][j] == 0) {
                rowMark[i] = true;
                colMark[j] = true;
            }
        }
    }

    for(int i = 0; i < m; i++) {
        if(rowMark[i]) {
            setRowZero(matrix, i);
        }
    }
    for(int i = 0; i < n; i++) {
        if(colMark[i]) {
            setColZero(matrix, i);
        }
    }
}

private void setRowZero(int[][] matrix, int row) {
    for(int i = 0; i < matrix[0].length; i++) {
        matrix[row][i] = 0;
    }
}

private void setColZero(int[][] matrix, int col) {
    for(int i = 0; i < matrix.length; i++) {
        matrix[i][col] = 0;
    }
}
```

-----

### 01.09 字符串轮转

```java
/**
* xyxy.contains(yx) == true
 */
public boolean isFlipedString(String s1, String s2) {
    String newStr = s2 + s2;
    return (s1.length() == s2.length()) && newStr.contains(s1);
}
```

-----

-----

## Section 2 

### 02.01 移除重复节点

```java
/**
* 因为链表不是有序排列，所以对于每个新的元素，都需要遍历其之后的链表部分
* 以便删除所有重复元素
 */
public ListNode removeDuplicateNodes(ListNode head) {
    ListNode curNode = head;
    while(curNode != null) {
        ListNode runner = curNode;
        while(runner.next != null) {
            if(curNode.val == runner.next.val) {
                runner.next = runner.next.next;
            } else {
                runner = runner.next;
            }
        }
        curNode = curNode.next;
    }
    return head;
}
```

----

### 02.02 返回倒数第K个节点

```java
/**
* 注意好数学关系即可
 */
public int kthToLast(ListNode head, int k) {
    ListNode slow = head;
    ListNode fast = head;
    for(int i = 0; i < k; i++) {
        fast = fast.next;
    }

    while(fast != null) {
        slow = slow.next;
        fast = fast.next;
    }
    return slow.val;
}
```

----

### 02.03 删除中间节点

```java
/**
* 将后继节点的值赋给当前节点，并删除后继节点
 */
public void deleteNode(ListNode node) {
    node.val = node.next.val;
    node.next = node.next.next;
}
```

----

### 02.04 分割链表

```java
/**
* 将两种节点分别存储到两条链表上最后再拼接即可
 */
public ListNode partition(ListNode head, int x) {
    ListNode smaller = new ListNode(0);
    ListNode runner1 = smaller;
    ListNode equalOrLaeger = new ListNode(0);
    ListNode runner2 = equalOrLaeger;
    while(head != null) {
        if(head.val < x) {
            runner1.next = head;
            runner1 = runner1.next;
        } else {
            runner2.next = head;
            runner2 = runner2.next;
        }
        head = head.next;
    }
    runner2.next = null;
    runner1.next = equalOrLaeger.next;
    return smaller.next;
}
```

---

### 02.05 链表求和

```java
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int carry = 0;
    ListNode dummyHead = new ListNode(0);
    ListNode runner = dummyHead;
    while(l1 != null || l2 != null || carry > 0) {
        int temp = carry;
        if(l1 != null) {
            temp += l1.val;
            l1 = l1.next;
        }
        if(l2 != null) {
            temp += l2.val;
            l2 = l2.next;
        }

        int val = temp % 10;
        carry = temp / 10;
        runner.next = new ListNode(val);
        runner = runner.next;
    }
    return dummyHead.next;
}
```

----

### 02.06 回文链表

```java
/**
* 将链表拆分成两半，并反转后半部分
* 从前往后依次比较两部分链表的元素直至到达某一条链表的末尾
 */
public boolean isPalindrome(ListNode head) {
    if(head == null || head.next == null) {
        return true;
    }

    ListNode preMid = getPreMid(head);
    ListNode secondHalf = preMid.next;
    secondHalf = reverse(secondHalf);
    preMid.next = null;
    while(head != null && secondHalf != null) {
        if(head.val != secondHalf.val) {
            return false;
        }
        head = head.next;
        secondHalf = secondHalf.next;
    }
    return true;
}

/**
* 反转链表
 */
private ListNode reverse(ListNode head) {
    ListNode pre = null;
    ListNode cur = head;
    while(cur != null) {
        ListNode next = cur.next;
        cur.next = pre;
        pre = cur;
        cur = next;
    }
    return pre;
}

/**
* 获取链表中点元素
 */
private ListNode getPreMid(ListNode head) {
    if(head == null || head.next == null) {
        return head;
    }

    ListNode slow = head;
    ListNode fast = head.next;
    while(fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}
```

-----

### 02.07 链表相交

```java
public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode shortL = headA;
    ListNode longL = headB;
    int lenA = 0;
    int lenB = 0;
    while(shortL != null) {
        lenA++;
        shortL = shortL.next;
    }
    while(longL != null) {
        lenB++;
        longL = longL.next;
    }

    // 获得链表的长度及差值
    int diff = lenB - lenA;
    shortL = headA;
    longL = headB;
    if(diff < 0) {
        diff = -diff;
        shortL = headB;
        longL = headA;
    }
	// 较长链表上的指针先移动diff步
    for(int i = 0; i < diff; i++) {
        longL = longL.next;
    }
	// 两条链表上指针同时移动，直至到达终点或者相交
    while(longL != null && shortL != null) {
        if(longL == shortL) {
            return shortL;
        }
        longL = longL.next;
        shortL = shortL.next;
    }
    return null;
}
```

-----

-----

## Section 3 

###  03.01  三合一

```java
// 栈的个数
private int numOfStacks = 3;
// 每个栈的容量
private int stackCapacity;
// 充当栈的数组
private int[] stack;
// 每个栈的当前大小
private int[] sizeOfStack;

public TripleInOne(int stackSize) {
    this.stackCapacity = stackSize;
    this.stack = new int[numOfStacks * stackCapacity];
    this.sizeOfStack = new int[numOfStacks];
}

public void push(int stackNum, int value) {
    if(isFull(stackNum)) {
        return;
    }

    sizeOfStack[stackNum]++;
    stack[indexOfTop(stackNum)] = value;
}

public int pop(int stackNum) {
    if(isEmpty(stackNum)) {
        return -1;
    }

    int topIndex = indexOfTop(stackNum);
    int value = stack[topIndex];
    stack[topIndex] = 0;
    sizeOfStack[stackNum]--;
    return value;
}

public int peek(int stackNum) {
    if(isEmpty(stackNum)) {
        return -1;
    }
    return stack[indexOfTop(stackNum)];
}

public boolean isEmpty(int stackNum) {
    return sizeOfStack[stackNum] == 0;
}

private boolean isFull(int stackNum) {
    return sizeOfStack[stackNum] == stackCapacity;
}

private int indexOfTop(int stackNum) {
    int offSet = stackNum * stackCapacity;
    int size = sizeOfStack[stackNum];
    return offSet + size - 1;
}
```

----

### 03.02 栈的最小值

```java
private Deque<Integer> dataStack;
private Deque<Integer> minStack;

/** initialize your data structure here. */
public MinStack() {
    this.dataStack = new LinkedList<>();
    this.minStack = new LinkedList<>();
}

public void push(int x) {
    dataStack.addLast(x);
    if(minStack.isEmpty()) {
        minStack.addLast(x);
    } else {
        int min = Math.min(x, minStack.peekLast());
        minStack.addLast(min);
    }
}

public void pop() {
    dataStack.removeLast();
    minStack.removeLast();
}

public int top() {
    return dataStack.peekLast();
}

public int getMin() {
    return minStack.peekLast();
}
```

----

### 03.03 堆盘子

```java
// 栈的容量
private int stackSize;
// 多个栈组成的列表
private List<Deque<Integer>> stackList;
// 栈列表的大小(设置这个变量只是为了减少重复的方法调用)
private int stackListSize;

public StackOfPlates(int cap) {
    this.stackSize = cap;
    this.stackList = new ArrayList<>();
    this.stackListSize = 0;
}

public void push(int val) {
    if(stackSize <= 0) {
        return;
    }

    if(stackListSize == 0 || stackList.get(stackListSize - 1).size() == stackSize) {
        Deque<Integer> stack = new LinkedList<>();
        stack.addLast(val);
        stackList.add(stack);
        stackListSize++;
        return;
    }
    stackList.get(stackListSize - 1).add(val);
}

public int pop() {
    return popAt(stackListSize - 1);
}

public int popAt(int index) {
    if(index < 0 
       || index >= stackListSize
       || stackList.isEmpty() 
       || stackList.get(index) == null) {
        return -1;
    } 

    Deque<Integer> stack = stackList.get(index);
    int res = stack.removeLast();
    if(stack.isEmpty()) {
        stackList.remove(stack);
        stackListSize--;
    }
    return res;
}
```

----

### 03.04 化栈为队

```java
private Deque<Integer> stack1;
private Deque<Integer> stack2;

/** Initialize your data structure here. */
public MyQueue() {
    this.stack1 = new LinkedList<>();
    this.stack2 = new LinkedList<>();
}

/** Push element x to the back of queue. */
public void push(int x) {
    stack1.addLast(x);
}

/** Removes the element from in front of queue and returns that element. */
public int pop() {
    if(!stack2.isEmpty()) {
        return stack2.removeLast();
    } else if(!stack1.isEmpty()) {
        while(!stack1.isEmpty()) {
            int val = stack1.removeLast();
            stack2.addLast(val);
        }
        return stack2.removeLast();
    }
    return -1;
}

/** Get the front element. */
public int peek() {
    if(!stack2.isEmpty()) {
        return stack2.peekLast();
    } else if(!stack1.isEmpty()) {
        while(!stack1.isEmpty()) {
            int val = stack1.removeLast();
            stack2.addLast(val);
        }
        return stack2.peekLast();
    }
    return -1;
}

/** Returns whether the queue is empty. */
public boolean empty() {
    return stack1.isEmpty() && stack2.isEmpty();
}
```

----

### 03.05 栈排序

```java
private Deque<Integer> sortedStack;
private Deque<Integer> helper;

public SortedStack() {
    this.sortedStack = new LinkedList<>();
    this.helper = new LinkedList<>();
}

public void push(int val) {
    if(sortedStack.isEmpty()) {
        sortedStack.addLast(val);
        return;
    }
    // 在压入新元素前，将栈中小于新元素的所有元素压到辅助栈
    // 压入新元素后将辅助栈中元素压回原栈
    while(!sortedStack.isEmpty() && val > sortedStack.peekLast()) {
        int temp = sortedStack.removeLast();
        helper.addLast(temp);
    }
    sortedStack.addLast(val);
    while(!helper.isEmpty()) {
        int temp = helper.removeLast();
        sortedStack.addLast(temp);
    }
}

public void pop() {
    if(sortedStack.isEmpty()) {
        return;
    }
    sortedStack.removeLast();
}

public int peek() {
    if(sortedStack.isEmpty()) {
        return -1;
    }
    return sortedStack.peekLast();
}

public boolean isEmpty() {
    return sortedStack.isEmpty();
}
```

----

### 03.06 动物收容所

```java
/**
* 队列的简单应用
 */
private Queue<int[]> catQueue;
private Queue<int[]> dogQueue;

public AnimalShelf() {
    this.catQueue = new LinkedList<>();
    this.dogQueue = new LinkedList<>();
}

public void enqueue(int[] animal) {
    if(animal[1] == 0) {
        catQueue.offer(animal);
    } else {
        dogQueue.offer(animal);
    }
}

public int[] dequeueAny() {
    if(catQueue.isEmpty() && dogQueue.isEmpty()) {
        return new int[]{-1, -1};
    } else if(catQueue.isEmpty() && !dogQueue.isEmpty()) {
        return dogQueue.poll();
    } else if(!catQueue.isEmpty() && dogQueue.isEmpty()) {
        return catQueue.poll();
    }

    int[] dog = dogQueue.peek();
    int[] cat = catQueue.peek();
    if(dog[0] < cat[0]) {
        dogQueue.poll();
        return dog;
    } else {
        catQueue.poll();
        return cat;
    }
}

public int[] dequeueDog() {
    if(dogQueue.isEmpty()) {
        return new int[]{-1, -1};
    }
    return dogQueue.poll();
}

public int[] dequeueCat() {
    if(catQueue.isEmpty()) {
        return new int[]{-1, -1};
    }
    return catQueue.poll();
}
```

-----

------

## Section 4 

### 04.01 节点间通路

```java
/**
* 关键：邻接表、广度优先搜索
* 算是模板题
 */
public boolean findWhetherExistsPath(int n, int[][] graph, int start, int target) {
    List<Integer>[] adj = new ArrayList[n];
    for(int[] edge : graph) {
        int from = edge[0];
        int to = edge[1];
        if(adj[from] == null) {
            adj[from] = new ArrayList<>();
        }
        adj[from].add(to);
    }

    boolean[] visited = new boolean[n];
    Deque<Integer> queue = new LinkedList<>();
    queue.offer(start);
    visited[start] = true;
    while(!queue.isEmpty()) {
        int node = queue.poll();
        if(adj[node] == null) {
            continue;
        } 
        for(int des : adj[node]) {
            if(des == target) {
                return true;
            } else if(!visited[des]) {
                visited[des] = true;
                queue.offer(des);
            }
        }
    }
    return false;
}
```

----

### 04.02 最小高度树

```java
public TreeNode sortedArrayToBST(int[] nums) {
    return sortedArrayToBST(nums, 0, nums.length - 1);
}

private TreeNode sortedArrayToBST(int[] nums, int left, int right) {
    if(left > right) {
        return null;
    }

    int mid = left + (right - left) / 2;
    TreeNode root = new TreeNode(nums[mid]);
    root.left = sortedArrayToBST(nums, left, mid - 1);
    root.right = sortedArrayToBST(nums, mid + 1, right);
    return root;
}
```

----

### 04.03 特定深度节点链表

```java
/**
* 只需要对树的层序遍历进行一些调整即可
 */
public ListNode[] listOfDepth(TreeNode tree) {
    List<ListNode> res = new LinkedList<>();
    if(tree == null) {
        return res.toArray(new ListNode[0]);
    }

    Deque<TreeNode> queue = new LinkedList<>();
    queue.offer(tree);
    while(!queue.isEmpty()) {
        ListNode head = new ListNode(0);
        ListNode runner = head;
        int levelSize = queue.size();
        while(levelSize > 0) {
            TreeNode node = queue.poll();
            levelSize--;
            runner.next = new ListNode(node.val);
            runner = runner.next;
            if(node.left != null) {
                queue.offer(node.left);
            }
            if(node.right != null) {
                queue.offer(node.right);
            }
        }
        res.add(head.next);
    }
    return res.toArray(new ListNode[res.size()]);
}
```

----

### 04.04 检查平衡性

```java
public boolean isBalanced(TreeNode root) {
    if(root == null) {
        return true;
    }
    int left = height(root.left);
    int right = height(root.right);
    if(Math.abs(left - right) > 1) {
        return false;
    }

    return isBalanced(root.left) && isBalanced(root.right);
}

private int height(TreeNode root) {
    if(root == null) {
        return 0;
    }

    int left = height(root.left);
    int right = height(root.right);
    return 1 + Math.max(left, right);
}
```

----

### 04.05 合法二叉搜索树

```java
public boolean isValidBST(TreeNode root) {
    return isValidBST(root, null, null);
}

private boolean isValidBST(TreeNode root, TreeNode min, TreeNode max) {
    if(root == null) {
        return true;
    } else if(min != null && root.val <= min.val
              || max != null && root.val >= max.val) {
        return false;
    }

    return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
}
```

------

### 04.06 后继者

```java
/**
* 所谓 p 的后继节点，就是这串升序数字中，比 p 大的下一个。
*
* 如果 p 大于当前节点的值，说明后继节点一定在 RightTree
* 如果 p 等于当前节点的值，说明后继节点一定在 RightTree
* 如果 p 小于当前节点的值，说明后继节点一定在 LeftTree 或自己就是
* 递归调用 LeftTree，如果是空的，说明当前节点就是答案
* 如果不是空的，则说明在 LeftTree 已经找到合适的答案，直接返回即可
 */
public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
    if(root == null) {
        return null;
    }

    if(p.val >= root.val) {
        return inorderSuccessor(root.right, p);
    } else {
        TreeNode node = inorderSuccessor(root.left, p);
        if(node == null) {
            return root;
        } else {
            return node;
        }
    }
}
```

----

### 04.08 首个共同祖先

```java
public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if(root == null || root == p || root == q) {
        return root;
    }

    TreeNode left = lowestCommonAncestor(root.left, p, q);
    TreeNode right = lowestCommonAncestor(root.right, p, q);
    return left == null? right : right == null? left : root;
}
```

----

### 04.10  检查子树

```java
public boolean checkSubTree(TreeNode t1, TreeNode t2) {
    if(t1 == null) {
        return false;
    }
    return isSubTree(t1, t2) || checkSubTree(t1.left, t2) || checkSubTree(t1.right, t2);
}

private boolean isSubTree(TreeNode t1, TreeNode t2) {
    if(t1 == null && t2 == null) {
        return true;
    } else if(t1 == null || t2 == null || t1.val != t2.val) {
        return false;
    }

    return isSubTree(t1.left, t2.left) && isSubTree(t1.right, t2.right);
}
```

------

-------



## Section 8

### 08.01 三步问题

```java
/**
* 斐波那契问题的简单变形
 */
public int waysToStep(int n) {
    int threeStepsBefore = 1;
    int twoStepsBefore = 2;
    int oneStepsBefore = 4;
    if(n < 3) {
        return n;
    } else if(n == 3) {
        return 4;
    }

    int steps = 0;
    for(int i = 4; i <= n; i++) {
        steps = (threeStepsBefore + (twoStepsBefore + oneStepsBefore) % 1000000007) % 1000000007;
        threeStepsBefore = twoStepsBefore;
        twoStepsBefore = oneStepsBefore;
        oneStepsBefore = steps;
    }
    return steps;
}
```

----

### 08.02 迷路的机器人

```java
private int rowLen;
private int colLen;
private int[][] grid;
private List<List<Integer>> res = new LinkedList<>();

public List<List<Integer>> pathWithObstacles(int[][] obstacleGrid) {
    if(obstacleGrid == null || obstacleGrid.length == 0) {
        return res;
    }

    this.grid = obstacleGrid;
    this.rowLen = grid.length;
    this.colLen = grid[0].length;

    backTracking(0, 0, new boolean[rowLen][colLen]);
    return res;
}

/**
* 回溯法
 */
private boolean backTracking(int curRow, int curCol, boolean[][] visited) {
    // 访问到的节点不合法，直接返回
    if(curRow >= rowLen || curCol >= colLen || grid[curRow][curCol] == 1 || visited[curRow][curCol]) {
        return false;
    }

    // 选择(将当前节点加入到路径中)
    res.add(Arrays.asList(curRow, curCol));
    visited[curRow][curCol] = true;
	// 若已到达终点，则直接返回，否则进入下一层决策树
    if(curRow == rowLen - 1 && curCol == colLen - 1) {
        return true;
    } else if(backTracking(curRow + 1, curCol, visited) || backTracking(curRow, curCol + 1, visited)) {
        return true;
    }
	// 到达这里时表示由(curRow, curCol)的节点无法到达终点，于是撤销选择
    // 这里未重置 visited[curRow][curCol]的原因是：由这个节点无法到达终
    // 点，并且机器人只能往下或者往右走，则这个点一定不可能出现在结果路径
    // 所以不会重置其访问状态
    res.remove(res.size() - 1);
    return false;
}
```

-------



------

### 08.04 幂集

```java
/**
* 回溯法典型题目
 */
List<List<Integer>> res = new LinkedList<>();
public List<List<Integer>> subsets(int[] nums) {
    if(nums == null || nums.length == 0) {
        return res;
    }

    backTracking(nums, 0, new LinkedList<Integer>());
    return res;
}

private void backTracking(int[] nums, int start, LinkedList<Integer> runner) {
    res.add(new LinkedList(runner));

    for(int i = start; i < nums.length; i++) {
        runner.addLast(nums[i]);
        backTracking(nums, i + 1, runner);
        runner.removeLast();
    }
}
```

----

### 08.05 递归乘法

```java
/**
* 参考教材思路
 */
public int multiply(int A, int B) {
    int smallerNum = A < B? A : B;
    int largerNum = A < B? B : A;
    return minProduct(smallerNum, largerNum);
}

/**
* 递归求解两个数的乘积
 */
private int minProduct(int smallerNum, int largerNum) {
    // 基线条件
    if(smallerNum == 0) {
        return 0;
    } else if(smallerNum == 1) {
        return largerNum;
    }

    int s = smallerNum >> 1;
    int halfPro = minProduct(s, largerNum);
    if(smallerNum % 2 == 0) {
        return 2 * halfPro;
    } else {
        return halfPro * 2 + largerNum;
    }
}
```

----

### 08.06 汉诺塔问题

```java
/**
* 递归
 */
public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
    movePlates(A.size(), A, B, C);
}

private void movePlates(int plateNum, List<Integer> storage, List<Integer> auxiliary, List<Integer> target) {
    if(plateNum == 1) {
        int plate = storage.remove(storage.size() - 1);
        target.add(plate);
        return;
    }

    // 使用target作为缓冲区，将storage上部的plateNum - 1个盘子移到auxiliary
    movePlates(plateNum - 1, storage, target, auxiliary);
    // 将storage剩余的最后一个盘子移动到target
    int plate = storage.remove(storage.size() - 1);
    target.add(plate);
    // 使用storage作为缓冲区，将auxiliary上部剩余的plateNum - 1个盘子移到target
    movePlates(plateNum - 1, auxiliary, storage, target);
}
```

----

### 08.07 无重复字符串的排列组合

```java
/**
* 经典回溯问题
 */
private List<String> res = new LinkedList<>();

public String[] permutation(String S) {
    if(S == null || S.length() == 0) {
        return new String[0];
    }

    char[] charArr = S.toCharArray();
    int len = charArr.length;
    backTracking(charArr, new boolean[len], new char[len], 0);
    return res.toArray(new String[res.size()]);
}

private void backTracking(char[] charArr, boolean[] visited, char[] runner, int index) {
    if(index == charArr.length) {
        res.add(String.valueOf(runner));
        return;
    }

    for(int i = 0; i < charArr.length; i++) {
        if(visited[i]) {
            continue;
        }

        runner[index] = charArr[i];
        visited[i] = true;
        backTracking(charArr, visited, runner, index + 1);
        visited[i] = false;
        // 这里不需要再“还原”runner[index]的内容，因为后续可以直接覆盖这个位置
    }
}
```

----

### 08.08 有重复字符串的排列组合

```java
/**
* 典型回溯问题，注意去重即可
 */
private List<String> res = new LinkedList<>();

public String[] permutation(String S) {
    if(S == null || S.length() == 0) {
        return new String[0];
    }

    char[] charArr = S.toCharArray();
    Arrays.sort(charArr);
    int len = charArr.length;
    backTracking(charArr, new boolean[len], new char[len], 0);
    return res.toArray(new String[res.size()]);
}   

private void backTracking(char[] charArr, boolean[] visited, char[] runner, int index) {
    if(index == charArr.length) {
        res.add(String.valueOf(runner));
        return;
    }

    for(int i = 0; i < charArr.length; i++) {
        if(visited[i] || (i > 0 && charArr[i] == charArr[i-1] && !visited[i-1])) {
            continue;
        }

        runner[index] = charArr[i];
        visited[i] = true;
        backTracking(charArr, visited, runner, index + 1);
        visited[i] = false;
    }
}
```

----

### 08.09 括号

```java
/**
* 典型回溯问题
 */
List<String> res = new LinkedList<>();
public List<String> generateParenthesis(int n) {
    if(n <= 0) {
        return res;
    }

    backTracking(n, n, new StringBuffer());
    return res;
}

private void backTracking(int left, int right, StringBuffer runner) {
    if(left > right || left < 0 || right < 0) {
        return;
    } else if(left == 0 && right == 0) {
        res.add(runner.toString());
        return;
    }

    runner.append('(');
    backTracking(left - 1, right, runner);
    runner.deleteCharAt(runner.length() - 1);

    runner.append(')');
    backTracking(left, right - 1, runner);
    runner.deleteCharAt(runner.length() - 1);
}
```

----

### 08.10 颜色填充

```java
/**
* 典型深度优先搜索问题
 */
public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
    int oldColor = image[sr][sc];
    if(newColor == oldColor) {
        return image;
    }

    dfs(image, sr, sc, oldColor, newColor);
    return image;
}

private void dfs(int[][] image, int sr, int sc, int oldColor, int newColor) {
    if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length
       || image[sr][sc] != oldColor) {
        return;
    }

    image[sr][sc] = newColor;
    dfs(image, sr - 1, sc, oldColor, newColor);
    dfs(image, sr, sc - 1, oldColor, newColor);
    dfs(image, sr + 1, sc, oldColor, newColor);
    dfs(image, sr, sc + 1, oldColor, newColor);
}
```

----

### 08.11 硬币

```java
/**
* 完全背包问题
 */
public int waysToChange(int n) {
    int[] dp = new int[n+1];
    int[] coins = new int[]{1, 5, 10, 25};
    dp[0] = 1;
    for(int coin : coins) {
        for(int j = coin; j <= n; j++) {
            dp[j] = (dp[j] + dp[j - coin]) % 1000000007;
        }
    }
    return dp[n];
}
```

----

### 08.12 八皇后

```java
/**
* 回溯
 */
List<List<String>> res = new LinkedList<>();
public List<List<String>> solveNQueens(int n) {
    if(n <= 0) {
        return res;
    }

    char[][] board = new char[n][n];
    for(char[] line : board) {
        Arrays.fill(line, '.');
    }
    backTracking(board, 0);
    return res;
}

private void backTracking(char[][] board, int row) {
    if(row == board.length) {
        List<String> runner = new LinkedList<>();
        for(char[] line : board) {
            runner.add(String.valueOf(line));
        }
        res.add(runner);
    }

    for(int i = 0; i < board[0].length; i++) {
        if(!isValid(board, row, i)) {
            continue;
        }

        board[row][i] = 'Q';
        backTracking(board, row + 1);
        board[row][i] = '.';
    }
}

private boolean isValid(char[][] board, int row, int col) {
    int m = board.length;
    int n = board[0].length;
    for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
        if(board[i][j] == 'Q') {
            return false;
        }
    }
    for(int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
        if(board[i][j] == 'Q') {
            return false;
        }
    }
    for(int i = row - 1, j = col; i >= 0; i--) {
        if(board[i][j] == 'Q') {
            return false;
        }
    }
    return true;
}
```

----

### 08.13 堆箱子

**设dp[i]表示以第i个箱子为结尾的上升子序列的最大总高度**

![堆箱子.png](../../../mdPics/1e8cdd8cda12d2c02b6a0a470e3fe84d3ebf30b967f871e12c519657b233abc8-%E5%A0%86%E7%AE%B1%E5%AD%90.png)

```java
/**
* 动态规划，最长上升子序列的变种问题
 */
public int pileBox(int[][] box) {
    // 将每个箱子按照高度非递减排列(其实按照任意维度排列都允许)
    Arrays.sort(box, (o1, o2) -> (o1[2] - o2[2]));
    int len = box.length;
    int[] dp = new int[len];
    dp[0] = box[0][2];
    int res = dp[0];

    for(int i = 1; i < len; i++) {
        int preMax = 0;
        for(int j = 0; j < i; j++) {
            if(largerBox(box[j], box[i])) {
                preMax = Math.max(preMax, dp[j]);
            }
        }
        dp[i] = preMax + box[i][2];
        res = Math.max(res, dp[i]);
    }
    return res;
}

private boolean largerBox(int[] a, int[] b) {
    return a[0] < b[0] && a[1] < b[1] && a[2] < b[2];
}
```

----

### 08.14 布尔运算

> https://leetcode-cn.com/problems/boolean-evaluation-lcci/solution/java-ji-yi-hua-sou-suo-by-npe_tle/

```java
/**
* 区间动态规划
* dp[start][end][result] = 索引start到end值为result的方案总数
 */
private char[] charArr;
private int[][][] dp;

public int countEval(String s, int result) {
    if(s == null || s.length() == 0) {
        return 0;
    }

    this.charArr = s.toCharArray();
    int len = charArr.length;
    this.dp = new int[len][len][2];
    for(int i = 0; i < len; i++) {
        for(int j = 0; j < len; j++) {
            Arrays.fill(dp[i][j], -1);
        }
    }

    return checkForRes(0, len - 1, result);
}

/**
* 计算区间start到end内值为result的方案数
 */
private int checkForRes(int start, int end, int result) {
    // 基线条件
    if(start == end) {
        return charArr[start] - '0' == result? 1 : 0;
    } else if(dp[start][end][result] != -1) {
        return dp[start][end][result];
    }

    int res = 0;
    for(int i = start; i < end; i += 2) {
        char operator = charArr[i + 1];
        for(int j = 0; j <= 1; j++) {
            for(int k = 0; k <= 1; k++) {
                if(getRightBoolRes(j, k, operator) == result) {
                    res += checkForRes(start, i, j) * checkForRes(i + 2, end, k);
                }
            }
        }
    }
    dp[start][end][result] = res;
    return res;
}

/**
* 计算逻辑表达式结果
 */
private int getRightBoolRes(int valA, int valB, char operator) {
    switch (operator) {
        case '&':
            return valA & valB;
        case '|':
            return valA | valB;
        case '^':
            return valA ^ valB;
    }
    return valA & valB;
}
```

-----

-----

## Section 10

### 10.01 合并排序的数组

```java
/**
* 教材的思路很棒
 */
public void merge(int[] A, int m, int[] B, int n) {
    int tailA = m - 1;
    int tailB = n - 1;
    int lastIndex = m + n - 1;
    while(tailB >= 0) {
        if(tailA >= 0 && A[tailA] > B[tailB]) {
            A[lastIndex] = A[tailA];
            tailA--;
        } else {
            A[lastIndex] = B[tailB];
            tailB--;
        }
        lastIndex--;
    }
}
```

-----

### 10.02 变位词组

```java
/**
* 哈希表问题，需要多熟悉一些API的使用
 */
public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();
    for(String str : strs) {
        char[] temp = str.toCharArray();
        Arrays.sort(temp);
        map.computeIfAbsent(String.valueOf(temp), unused -> new LinkedList<>()).add(str);
    }
    return new LinkedList(map.values());
}
```

----

### 10.03 搜索旋转数组

> https://leetcode-cn.com/problems/search-rotate-array-lcci/solution/

```java
public int search(int[] arr, int target) {
    int len = arr.length;
    int left = 0;
    int right = len - 1;
    while(left < right) {
        int mid = left + (right - left) / 2;
        if(arr[left] < arr[mid]) {
            if(arr[left] <= target && target <= arr[mid]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        } else if(arr[left] > arr[mid]){
            if(arr[left] <= target || target <= arr[mid]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        } else if(arr[left] == arr[mid]){
            if(arr[left] != target) {
                left++;
            } else {
                right = left;
            }
        }
    }
    return (arr[left] == target)? left : -1;
}
```

---

### 10.05 稀疏矩阵搜索

```java
/**
* 直接暴力法解决
 */
public int findString(String[] words, String s) {
    for(int i = 0; i < words.length; i++) {
        if(words[i].equals(s)) {
            return i;
        }
    }
    return -1;
}
```

---

### 10.09 排序矩阵查找

```java
/**
* 跟教材解法1思路一致
 */
public boolean searchMatrix(int[][] matrix, int target) {
    if(matrix == null || matrix.length == 0) {
        return false;
    }
    int rowLen = matrix.length;
    int colLen = matrix[0].length;
    int row = 0;
    int col = colLen - 1;
    while(row < rowLen && col >= 0) {
        if(matrix[row][col] == target) {
            return true;
        } else if(matrix[row][col] < target) {
            row++;
        } else {
            col--;
        }
    }
    return false;
}
```

