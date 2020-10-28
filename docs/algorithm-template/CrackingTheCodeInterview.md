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

