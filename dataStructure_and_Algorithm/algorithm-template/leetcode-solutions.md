## `leetcode` 题解笔记

### `leetcode 1 两数之和`

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length < 2) {
            return new int[]{-1, -1};
        }

        Map<Integer, Integer> valToIndex = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(valToIndex.containsKey(target - nums[i])) {
                return new int[]{i, valToIndex.get(target - nums[i])};
            }
            valToIndex.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
```



### `leetcode 3 无重复字符的最长子串`

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }

        int res = 1;
        Map<Character, Integer> window = new HashMap<>();
        int left = 0;
        int right = 0;
        while(right < s.length()) {
            char c1 = s.charAt(right);
            window.put(c1, window.getOrDefault(c1, 0) + 1);
            while(window.get(c1) > 1) {
                char c2 = s.charAt(left);
                window.put(c2, window.get(c2) - 1);
                left++;
            }
            res = Math.max(res, right - left + 1);
            right++;
        }
        return res;
    }
}
```

------

### `leetcode 4 寻找两个正序数组的中位数`

```java
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        int len1 = nums1.length;
        int len2 = nums2.length;
        int half = (len1 + len2 + 1) / 2;
        int left = 0;
        int right = len1;
        while(left < right) {
            int i = left + (right - left) / 2;
            int j = half - i;
            if(nums2[j-1] > nums1[i]) {
                left = i + 1;
            } else {
                right = i;
            }
        }

        int i = left;
        int j = half - i;
        int nums1LeftMax = (i == 0)? Integer.MIN_VALUE : nums1[i-1];
        int nums1RightMin = (i == len1)? Integer.MAX_VALUE : nums1[i];
        int nums2LeftMax = (j == 0)? Integer.MIN_VALUE : nums2[j-1];
        int nums2RightMin = (j == len2)? Integer.MAX_VALUE : nums2[j];

        if((len1 + len2) % 2 != 0) {
            return Math.max(nums1LeftMax, nums2LeftMax);
        } else {
            return (double)(Math.max(nums1LeftMax, nums2LeftMax) + Math.min(nums1RightMin, nums2RightMin)) / 2;
        }
    }
}
```



### `leetcode 8 字符串转换整数`

```java
class Solution {
    public int myAtoi(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        int res = 0;
        int index = 0;
        int len = s.length();

        // 1. 清楚所有前缀空格
        while(index < len && s.charAt(index) == ' ') {
            index++;
        }
        if(index == len) {
            return 0;
        }

        // 2. 判断正负
        char signChar = s.charAt(index);
        boolean positive = true;
        if(!Character.isDigit(signChar)) {
            if(signChar != '+' && signChar != '-') {
                return 0;
            }
            positive = (signChar == '+');
            index++;
        }

        // 3. 计算边界值大小以及清楚所有前缀0
        int limit = positive? (-max) : min;
        while(index < 0 && s.charAt(index) == '0') {
            index++;
        }
        if(index == len) {
            return 0;
        }

        // 4. 解析字符
        while(index < len && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';
            index++;
            if(res < (limit + digit) / 10) {
                return positive? max : min;
            }
            res = res * 10 - digit;
        }
        return positive? (-res) : res;
    }
}
```

-----

### `leetcode 14 最长公共前缀`

```java
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        for(String str : strs) {
            int index = 0;
            while(index < Math.min(prefix.length(), str.length())) {
                if(prefix.charAt(index) != str.charAt(index)) {
                    break;
                }
                index++;
            }
            prefix = prefix.substring(0, index);
            if(prefix.equals("")) {
                return "";
            }
        }
        return prefix;
    }
}
```



### `leetcode 15 三数之和`

```java
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        if(nums == null || nums.length < 3) {
            return res;
        }

        int len = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i < len - 2; i++) {
            if(nums[i] > 0) {
                break;
            } else if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            int left = i + 1;
            int right = len - 1;
            while(left < right) {
                int curVal = nums[i] + nums[left] + nums[right];
                if(curVal == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while(left < right && nums[left] == nums[left+1])       left++;
                    while(left < right && nums[right] == nums[right - 1])   right--;
                    left++;
                    right--;
                } else if(curVal < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return res;
    }
}
```

-----

### `leetcode 18 四数之和`

```java
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new LinkedList<>();
        if(nums == null || nums.length < 4) {
            return res;
        }

        Arrays.sort(nums);
        int len = nums.length;
        for(int i = 0; i < len - 3; i++) {
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            for(int j = i + 1; j < len - 2; j++) {
                if(j > i + 1 && nums[j] == nums[j-1]) {
                    continue;
                }
                int k = j + 1;
                int l = len - 1;
                while(k < l) {
                    int curVal = nums[i] + nums[j] + nums[k] + nums[l];
                    if(curVal == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        while(k < l && nums[k] == nums[k+1]) k++;
                        while(k < l && nums[l] == nums[l-1]) l--;
                        k++;
                        l--;
                    } else if(curVal < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }
        return res;
    }
}
```



### `leetcode 19 删除链表的倒数第N个节点`

```java
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(Integer.MIN_VALUE);
        dummyHead.next = head;
        ListNode slow = dummyHead;
        ListNode fast = dummyHead;
        for(int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummyHead.next;
    }
}
```

----

### `leetcode 20 有效的括号`

```java
class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        for(char c : s.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) {
                    return false;
                } else if(c == ')' && stack.peek() != '(') {
                    return false;
                } else if(c == ']' && stack.peek() != '[') {
                    return false;
                } else if(c == '}' && stack.peek() != '{') {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
```



### `leetcode 24 两两交换链表中的节点`

```java
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode newHead = head.next;
        head.next = swapPairs(newHead.next);
        newHead.next = head;
        return newHead;
    }
}
```

-----

### `leetcode 25 K个一组翻转链表`

```java
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head ==  null || head.next == null) {
            return head;
        }

        ListNode next = head;
        for(int i = 0; i < k; i++) {
            if(next == null) {
                return head;
            }
            next = next.next;
        }

        ListNode newHead = reverseList(head, next);
        head.next = reverseKGroup(next, k);
        return newHead;
    }

    private ListNode reverseList(ListNode a, ListNode b) {
        ListNode cur = a;
        ListNode pre = null;
        while(cur != b) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
```



### `leetcode 31 下一个排列`

```java
class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int i = len - 2;
        int j = len - 1;
        int k = len - 1;

        while(i >= 0 && nums[i] >= nums[j]) {
            i--;
            j--;
        }

        if(i >= 0) {
            while(nums[i] >= nums[k]) {
                k--;
            }
            swap(nums, i, k);
        }
        for(i = j, j = len - 1; i < j; i++, j--) {
            swap(nums, i, j);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
```

-----

### `leetcode 32 最长有效括号`

```java
class Solution {
    public int longestValidParentheses(String s) {
        int res = 0;
        Deque<Integer> stack = new LinkedList<>();
        stack.push(-1);
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if(stack.isEmpty()) {
                    stack.push(i);
                } else {
                    res = Math.max(res, i - stack.peek());
                }
            }
        }
        return res;
    }
}
```



### `leetcode 34 在排序数组中查找元素的第一个和最后一个位置`

```java
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = leftBound(nums, target);
        int right = rightBound(nums, target);
        return new int[]{left, right};
    }

    private int leftBound(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if(left == nums.length || nums[left] != target) {
            return -1;
        }
        return left;
    }

    private int rightBound(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if(left == 0 || nums[left - 1] != target) {
            return -1;
        }
        return left - 1;
    }
}
```

----

### `leetcode 36 有效的数独`

```java
class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[][] row = new int[9][9];
        int[][] col = new int[9][9];
        int[][] map = new int[9][9];
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(board[i][j] == '.') {
                    continue;
                }
                int cur = board[i][j] - '0' - 1;
                if(row[i][cur] == 1) {
                    return false;
                } else if(col[j][cur] == 1) {
                    return false;
                } else if(map[j/3 + (i/3)*3][cur] == 1) {
                    return false;
                }
                row[i][cur] = 1;
                col[j][cur] = 1;
                map[j/3 + (i/3)*3][cur] = 1;
            }
        }
        return true;
    }
}
```



### `leetcode 39 组合总和`

```java
class Solution {
    private List<List<Integer>> res;
    private int[] candidates;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.res = new LinkedList<>();
        if(candidates == null || candidates.length == 0) {
            return res;
        }

        this.candidates = candidates;
        Arrays.sort(candidates);
        backTracking(target, 0, new LinkedList<Integer>());
        return res;
    }

    private void backTracking(int target, int start, LinkedList<Integer> runner) {
        if(target == 0) {
            res.add(new LinkedList(runner));
            return;
        }

        for(int i = start; i < candidates.length; i++) {
            if(target < candidates[i]) {
                break;
            }
            runner.addLast(candidates[i]);
            backTracking(target - candidates[i], i, runner);
            runner.removeLast();
        }
    }
}
```

----

### `leetcode 40 组合总和 II`

```java
class Solution {
    private List<List<Integer>> res;
    private int[] candidates;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        this.res = new LinkedList<>();
        if(candidates == null || candidates.length == 0) {
            return res;
        }

        this.candidates = candidates;
        Arrays.sort(candidates);
        backTracking(target, 0, new LinkedList<Integer>());
        return res;
    }

    private void backTracking(int target, int start, LinkedList<Integer> runner) {
        if(target == 0) {
            res.add(new LinkedList(runner));
            return;
        }

        for(int i = start; i < candidates.length; i++) {
            if(target < candidates[i]) {
                break;
            } else if(i > start && candidates[i] == candidates[i-1]) {
                continue;
            }

            runner.addLast(candidates[i]);
            backTracking(target - candidates[i], i + 1, runner);
            runner.removeLast();
        }
    }
}
```

-----

### `leetcode 41 缺失的第一个正数`

```java
class Solution {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        for(int i = 0; i < len; i++) {
            while(nums[i] > 0 && nums[i] <= len && nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            }
        }

        for(int i = 0; i < len; i++) {
            if(nums[i] != i + 1) {
                return i + 1;
            }
        }
        return len + 1;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
```

------

### `leetcode 42 接雨水`

```java
/**
* 单调栈
 */
class Solution {
    public int trap(int[] height) {
        if(height == null || height.length < 3) {
            return 0;
        }

        int res = 0;
        Deque<Integer> monoStack = new LinkedList<>();
        for(int i = 0; i < height.length; i++) {
            while(!monoStack.isEmpty() && height[i] > height[monoStack.peek()]) {
                int curHeight = height[monoStack.pop()];
                while(!monoStack.isEmpty() && height[monoStack.peek()] == curHeight) {
                    monoStack.pop();
                }
                if(!monoStack.isEmpty()) {
                    res += (Math.min(height[monoStack.peek()], height[i]) - curHeight) * (i - monoStack.peek() - 1);
                }
            }
            monoStack.push(i);
        }
        return res;
    }
}
```

------

### `leetcode 46 全排列`

```java
class Solution {
    private List<List<Integer>> res;

    public List<List<Integer>> permute(int[] nums) {
        this.res = new LinkedList<>();
        if(nums == null || nums.length == 0) {
            return res;
        }

        backTracking(nums, new boolean[nums.length], new LinkedList<Integer>());
        return res;
    }

    private void backTracking(int[] nums, boolean[] visited, LinkedList<Integer> runner) {
        if(nums.length == runner.size()) {
            res.add(new LinkedList(runner));
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            if(visited[i]) {
                continue;
            }

            runner.addLast(nums[i]);
            visited[i] = true;
            backTracking(nums, visited, runner);
            visited[i] = false;
            runner.removeLast();
        }
    }
}
```

------

### `leetcode 47 全排列 II`

```java
class Solution {
    private List<List<Integer>> res;

    public List<List<Integer>> permuteUnique(int[] nums) {
        this.res = new LinkedList<>();
        if(nums == null || nums.length == 0) {
            return res;
        }

        Arrays.sort(nums);
        backTracking(nums, new boolean[nums.length], new LinkedList<Integer>());
        return res;
    }

    private void backTracking(int[] nums, boolean[] visited, LinkedList<Integer> runner) {
        if(nums.length == runner.size()) {
            res.add(new LinkedList(runner));
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            if(visited[i] || (i > 0 && nums[i] == nums[i-1] && !visited[i-1])) {
                continue;
            }

            runner.addLast(nums[i]);
            visited[i] = true;
            backTracking(nums, visited, runner);
            visited[i] = false;
            runner.removeLast();
        }
    }
}
```

----

### `leetcode 48 旋转图像`

```java
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int top = 0;
        int bottom = n - 1;
        while(top < bottom) {
            rotateEdge(matrix, top, bottom);
            top++;
            bottom--;
        }
    }

    private void rotateEdge(int[][] matrix, int top, int bottom) {
        int times = bottom - top;
        for(int i = 0; i < times; i++) {
            int temp = matrix[top][top+i];
            matrix[top][top+i] = matrix[bottom-i][top];
            matrix[bottom-i][top] = matrix[bottom][bottom-i];
            matrix[bottom][bottom-i] = matrix[top+i][bottom];
            matrix[top+i][bottom] = temp;
        }
    }
}
```



### `leetcode 51 N皇后`

```java
class Solution {
    private List<List<String>> res;

    public List<List<String>> solveNQueens(int n) {
        this.res = new LinkedList<>();
        if(n <= 0) {
            return res;
        }

        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
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
            return;
        }

        int n = board.length;
        for(int i = 0; i < n; i++) {
            if(!isValid(board, row, i)) {
                continue;
            }

            board[row][i] = 'Q';
            backTracking(board, row + 1);
            board[row][i] = '.';
        }
    }

    private boolean isValid(char[][] board, int row, int col) {
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        for(int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        for(int i = row - 1; i >= 0; i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        return true;
    }
}
```

-----

### `leetcode 52 N皇后 II`

```java
class Solution {
    private int res = 0;
    private int len = 0;

    public int totalNQueens(int n) {
        if(n <= 0) {
            return res;
        }

        res = 0;
        len = n;
        char[][] board = new char[len][len];
        for(int i = 0; i < len; i++) {
            Arrays.fill(board[i], '.');
        }

        backTracking(board, 0);
        return res;
    }

    private void backTracking(char[][] board, int row) {
        if(row == board.length) {
            res++;
            return;
        }

        for(int i = 0; i < len; i++) {
            if(!checkPlace(board, row, i)) {
                continue;
            }

            board[row][i] = 'Q';
            backTracking(board, row + 1);
            board[row][i] = '.';
        }
    }

    private boolean checkPlace(char[][] board, int row, int col) {
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        for(int i = row - 1, j = col + 1; i >= 0 && j < len; i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        for(int i = row - 1; i >= 0; i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        return true;
    }
}
```

-----

### `leetcode 53 最大子序和`

```java
class Solution {
    public int maxSubArray(int[] nums) {
        int res = Integer.MIN_VALUE;
        int cur = Integer.MIN_VALUE;
        for(int num : nums) {
            if(cur <= 0) {
                cur = num;
            } else {
                cur += num;
            }
            res = Math.max(res, cur);
        }
        return res;
    }
}
```

-----

### `leetcode 54 螺旋矩阵`

```java
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;
        while(true) {
            for(int i = left; i <= right; i++) res.add(matrix[top][i]);
            top++;
            if(top > bottom) {
                break;
            }

            for(int i = top; i <= bottom; i++) res.add(matrix[i][right]);
            right--;
            if(right < left) {
                break;
            }

            for(int i = right; i >= left; i--) res.add(matrix[bottom][i]);
            bottom--;
            if(bottom < top) {
                break;
            }

            for(int i = bottom; i >= top; i--) res.add(matrix[i][left]);
            left++;
            if(left > right) {
                break;
            }
        }
        return res;
    }
}
```



### `leetcode 56 合并区间`

```java
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2)->(o1[0] - o2[0]));
        int len = intervals.length;
        int[][] res = new int[len][2];
        int index = -1;
        for(int[] interval : intervals) {
            if(index == -1 || interval[0] > res[index][1]) {
                index++;
                res[index] = interval;
            } else {
                res[index][1] = Math.max(res[index][1], interval[1]);
            }
        }
        return Arrays.copyOf(res, index + 1);
    }
}
```

-----

### `leetcode 59 螺旋矩阵 II`

```java
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        int index = 1;
        while(true) {
            for(int i = left; i <= right; i++) {
                res[top][i] = index;
                index++;
            }
            top++;
            if(top > bottom) {
                break;
            }

            for(int i = top; i <= bottom; i++) {
                res[i][right] = index;
                index++;
            }
            right--;
            if(right < left) {
                break;
            }

            for(int i = right; i >= left; i--) {
                res[bottom][i] = index;
                index++;
            }
            bottom--;
            if(bottom < top) {
                break;
            }

            for(int i = bottom; i >= top; i--) {
                res[i][left] = index;
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



### `leetcode 62 不同路径`

```java
class Solution {
    public int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                dp[j] += dp[j-1];
            }
        }
        return dp[n-1];
    }
}
```



### `leetcode 70 爬楼梯`

```java
class Solution {
    public int climbStairs(int n) {
        if(n <= 2) {
            return n;
        }

        int stepsMinusOne = 2;
        int stepsMinusTwo = 1;
        int nSteps = 0;
        for(int i = 3; i <= n; i++) {
            nSteps = stepsMinusOne + stepsMinusTwo;
            stepsMinusTwo = stepsMinusOne;
            stepsMinusOne = nSteps;
        }
        return nSteps;
    }
}
```



### `leetcode 71 简化路径`

```java
class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack = new LinkedList<>();
        for(String item : path.split("/")) {
            if(item.equals("..")) {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            } else if(!item.isEmpty() && !item.equals(".")) {
                stack.push(item);
            }
        }

        String res = "";
        for(String item : stack) {
            res = "/" + item + res;
        }
        return res.isEmpty()? "/" : res;
    }
}
```

-----

### `leetcode 75  颜色分类`

```java
class Solution {
    public void sortColors(int[] nums) {
        int less = 0;
        int i = 0;
        int great = nums.length - 1;
        while(i <= great) {
            if(nums[i] == 0) {
                swap(nums, less, i);
                i++;
                less++;
            } else if(nums[i] == 2) {
                swap(nums, great, i);
                great--;
            }  else {
                i++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
```



### `leetcode 76 最小覆盖子串`

```java
class Solution {
    public String minWindow(String s, String t) {
        if(s == null || s.length() < t.length()) {
            return "";
        }

        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        for(char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }
        int left = 0;
        int right = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;
        int match = 0;

        while(right < s.length()) {
            char c1 = s.charAt(right);
            window.put(c1, window.getOrDefault(c1, 0) + 1);
            if(window.get(c1).equals(need.get(c1))) {
                match++;
            }
            while(match == need.size()) {
                if(right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }
                char c2 = s.charAt(left);
                if(window.get(c2).equals(need.get(c2))) {
                    match--;
                }
                window.put(c2, window.get(c2) - 1);
                left++;
            }
            right++;
        }
        return minLen == Integer.MAX_VALUE? "" : s.substring(start, start + minLen);
    }
}
```

----

### `leetcode 78 子集`

```java
class Solution {
    private List<List<Integer>> res;

    public List<List<Integer>> subsets(int[] nums) {
        this.res = new LinkedList<>();
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
}
```



### `leetcode 79 单词搜索`

```java
class Solution {
    private char[][] board;
    private boolean[][] visited;

    public boolean exist(char[][] board, String word) {
        this.board = board;
        int m = board.length;
        int n = board[0].length;
        this.visited = new boolean[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(word.charAt(0) == board[i][j] && backTracking(word, 0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean backTracking(String word, int pathLen, int row, int col) {
        if(pathLen == word.length()) {
            return true;
        } else if(row < 0 || row >= board.length || col < 0 || col >= board[0].length
            || word.charAt(pathLen) != board[row][col] || visited[row][col]) {
            return false;
        }

        pathLen++;
        visited[row][col] = true;
        boolean hasPath = backTracking(word, pathLen, row - 1, col)
                        || backTracking(word, pathLen, row, col - 1)
                        || backTracking(word, pathLen, row + 1, col)
                        || backTracking(word, pathLen, row, col + 1);
        visited[row][col] = false;
        pathLen--;
        return hasPath;
    }
}
```



### `leetcode 80 删除排序数组中的重复项`

```java
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 3) {
            return nums.length;
        }

        int slow = 1;
        for(int fast = 2; fast < nums.length; fast++) {
            if(nums[fast] != nums[slow-1]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }
}
```

-----

### `leetcode 83 删除排序链表中的重复元素`

```java
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode cur = head;
        while(cur != null && cur.next != null) {
            if(cur.next.val == cur.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }
}
```



### `leetcode 88 合并两个有序数组`

```java
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1;
        int index1 = m - 1;
        int index2 = n - 1;
        while(index1 >= 0 || index2 >= 0) {
            if(index1 < 0) {
                nums1[index] = nums2[index2];
                index2--;
            } else if(index2 < 0) {
                nums1[index] = nums1[index1];
                index1--;
            } else {
                if(nums1[index1] < nums2[index2]) {
                    nums1[index] = nums2[index2];
                    index2--;
                } else {
                    nums1[index] = nums1[index1];
                    index1--;
                }
            }
            index--;
        }
    }
}
```

----

### `leetcode 96 不同的二叉搜索树`

```java
class Solution {
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                dp[i] += dp[j-1] * dp[i-j];
            }
        }
        return dp[n];
    }
}
```



### `leetcode 99 恢复二叉搜索树`

```java
class Solution {
    public void recoverTree(TreeNode root) {
        if(root == null) {
            return;
        }

        TreeNode firstNode = null;
        TreeNode secondNode = null;
        TreeNode pre = new TreeNode(Integer.MIN_VALUE);
        Deque<TreeNode> stack = new LinkedList<>();
        while(!stack.isEmpty() || root != null) {
            while(root != null) {
                stack.push(root);
                root = root.left;
            }

            TreeNode node = stack.pop();
            if(firstNode == null && pre.val > node.val) {
                firstNode = pre;
            }
            if(firstNode != null && pre.val > node.val) {
                secondNode = node;
            }
            pre = node;
            root = node.right;
        }

        int temp = firstNode.val;
        firstNode.val = secondNode.val;
        secondNode.val = temp;
    }
}
```



### `leetcode 103 二叉树的锯齿形层序遍历`

```java
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if(root == null) {
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean toggle = false;
        while(!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> runner = new LinkedList<>();
            while(levelSize > 0) {
                TreeNode node = queue.poll();
                levelSize--;
                if(!toggle) {
                    runner.add(node.val);
                } else {
                    runner.add(0, node.val);
                }

                if(node.left != null) {
                    queue.offer(node.left);
                }
                if(node.right != null) {
                    queue.offer(node.right);
                }
            }
            res.add(runner);
            toggle = !toggle;
        }
        return res;
    }
}
```



### `leetcode 105 从前序与中序遍历序列构造二叉树`

```java
class Solution {
    private int[] preorder;
    private Map<Integer, Integer> valToIndex;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder == null || inorder == null) {
            return null;
        }

        int preLen = preorder.length;
        int inLen = inorder.length;
        if(preLen == 0 || inLen == 0 || inLen != preLen) {
            return null;
        }

        this.preorder = preorder;
        this.valToIndex = new HashMap<>();
        for(int i = 0; i < inLen; i++) {
            valToIndex.put(inorder[i], i);
        }

        return buildTree(0, preLen - 1, 0, inLen - 1);
    }

    private TreeNode buildTree(int preLeft, int preRight, int inLeft, int inRight) {
        if(preLeft > preRight || inLeft > inRight) {
            return null;
        }

        int rootVal = preorder[preLeft];
        int rootIndex = valToIndex.get(rootVal);
        TreeNode root = new TreeNode(rootVal);
        root.left = buildTree(preLeft + 1, preLeft + rootIndex - inLeft, inLeft, rootIndex - 1);
        root.right = buildTree(preLeft + rootIndex - inLeft + 1, preRight, rootIndex + 1, inRight);
        return root;
    }
}
```

-------

### `leetcode 108 将有序数组转换为二叉搜索树`

```java
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0) {
            return null;
        }

        return buildTree(nums, 0, nums.length - 1);
    }

    private TreeNode buildTree(int[] nums, int left, int right) {
        if(left > right) {
            return null;
        }

        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildTree(nums, left, mid - 1);
        root.right = buildTree(nums, mid + 1, right);
        return root;
    }
}
```



### `leetcode 110 平衡二叉树`

```java
class Solution {
    public boolean isBalanced(TreeNode root) {
        return checkBalance(root) != -1;
    }

    private int checkBalance(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int left = checkBalance(root.left);
        if(left == -1) {
            return -1;
        }

        int right = checkBalance(root.right);
        if(right == -1) {
            return -1;
        }

        return Math.abs(left - right) > 1? -1 : Math.max(left, right) + 1;
    }
}
```

----

### `leetcode 111 二叉树的最小深度`

```java
class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if(left == 0 || right == 0) {
            return left + right + 1;
        }
        return Math.min(left, right) + 1;
    }
}
```

----

### `leetcode 113 路径总和 II`

```java
class Solution {
    private List<List<Integer>> res;

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        this.res = new LinkedList<>();
        if(root == null) {
            return res;
        }

        backTracking(root, targetSum, new LinkedList<Integer>());
        return res;
    }

    private void backTracking(TreeNode root, int targetSum, LinkedList<Integer> runner) {
        if(root == null) {
            return;
        }

        targetSum -= root.val;
        runner.addLast(root.val);
        if(targetSum == 0 && root.left == null && root.right == null) {
            res.add(new LinkedList(runner));
        }
        backTracking(root.left, targetSum, runner);
        backTracking(root.right, targetSum, runner);
        runner.removeLast();
        targetSum += root.val;
    }
}
```

-----

### `leetcode 116 填充每个节点的下一个右侧节点指针`

```java
class Solution {
    public Node connect(Node root) {
        if(root == null) {
            return null;
        }

        Node left = root.left;
        Node right = root.right;
        while(left != null && right != null) {
            left.next = right;
            left = left.right;
            right = right.left;
        }
        connect(root.left);
        connect(root.right);
        return root;
    }
}
```

----

### `leetcode 117 填充每个节点的下一个右侧节点指针 II`

```java
class Solution {
    public Node connect(Node root) {
        if(root == null) {
            return null;
        }

        Node cur = root;
        while(cur != null) {
            Node dummy = new Node(Integer.MIN_VALUE);
            Node pre = dummy;
            while(cur != null) {
                if(cur.left != null) {
                    pre.next = cur.left;
                    pre = pre.next;
                }
                if(cur.right != null) {
                    pre.next = cur.right;
                    pre = pre.next;
                }
                cur = cur.next;
            }
            cur = dummy.next;
        }
        return root;
    }
}
```



### `leetcode 124 二叉树中的最大路径和`

```java
class Solution {
    private int res = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        if(root == null) {
            return 0;
        }

        oneMaxSide(root);
        return res;
    }

    private int oneMaxSide(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int left = Math.max(0, oneMaxSide(root.left));
        int right = Math.max(0, oneMaxSide(root.right));
        res = Math.max(res, left + right + root.val);
        return Math.max(left, right) + root.val;
    }
}
```

----

### `leetcode 125 验证回文串`

```java
class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left < right) {
            while(left < right && !Character.isLetterOrDigit(s.charAt(left)))   left++;
            while(left < right && !Character.isLetterOrDigit(s.charAt(right)))  right--;
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
```



### `leetcode 129 求根到叶子节点数字之和`

```java
class Solution {
    private int res;

    public int sumNumbers(TreeNode root) {
        this.res = 0;
        if(root == null) {
            return res;
        }

        preorderTra(root, 0);
        return res;
    }

    private void preorderTra(TreeNode root, int curVal) {
        if(root == null) {
            return;
        }

        curVal = curVal * 10 + root.val;
        if(root.left == null && root.right == null) {
            res += curVal;
        }
        preorderTra(root.left, curVal);
        preorderTra(root.right, curVal);
    }
}
```



### `leetcode 130 被围绕的区域`

```java
class Solution {
    public void solve(char[][] board) {
        if(board == null || board.length == 0) {
            return;
        }

        int m = board.length;
        int n = board[0].length;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                boolean atEdge = (i == 0 || i == m - 1 || j == 0 || j == n - 1);
                if(atEdge && board[i][j] == 'O') {
                    dfs(board, i, j);
                }
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == '#') {
                    board[i][j] = 'O';
                } else if(board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
    }

    private void dfs(char[][] board, int row, int col) {
        if(row < 0 || row >= board.length || col < 0 || col >= board[0].length
            || board[row][col] == 'X' || board[row][col] == '#') {
            return;
        }

        board[row][col] = '#';
        dfs(board, row - 1, col);
        dfs(board, row, col - 1);
        dfs(board, row + 1, col);
        dfs(board, row, col + 1);
    }
}
```

-----

### `leetcode 134 加油站`

```java
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int len = gas.length;
        int spare = 0;
        int minSpare = Integer.MAX_VALUE;
        int minIndex = 0;
        for(int i = 0; i < len; i++) {
            spare += gas[i] - cost[i];
            if(spare < minSpare) {
                minSpare = spare;
                minIndex = i;
            }
        }
        return spare < 0? -1 : (minIndex + 1) % len;
    }
}
```



### `leetcode 139 单词拆分`

```java
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>();
        for(String word : wordDict) {
            set.add(word);
        }

        int len = s.length();
        boolean[] dp = new boolean[len+1];
        dp[0] = true;
        for(int i = 1; i <= len; i++) {
            for(int j = 0; j < i; j++) {
                dp[i] = dp[j] && set.contains(s.substring(j, i));
                if(dp[i]) {
                    break;
                }
            }
        }
        return dp[len];
    }
}
```

-----

### `leetcode 140 单词拆分 II`

```java
class Solution {
    private List<String> res;
    private Set<String> set;

    public List<String> wordBreak(String s, List<String> wordDict) {
        this.res = new LinkedList<>();
        this.set = new HashSet<>();
        for(String word : wordDict) {
            set.add(word);
        }

        int len = s.length();
        boolean[] dp = new boolean[len+1];
        dp[0] = true;
        for(int i = 1; i <= len; i++) {
            for(int j = 0; j < i; j++) {
                dp[i] = dp[j] && set.contains(s.substring(j, i));
                if(dp[i]) {
                    break;
                }
            }
        }

        backTracking(s, len, dp, new LinkedList<String>());
        return res;
    }

    private void backTracking(String s, int tailIndex, boolean[] dp, LinkedList<String> runner) {
        if(tailIndex == 0) {
            res.add(String.join(" ", runner));
            return;
        }

        for(int i = tailIndex - 1; i >= 0; i--) {
            String suffix = s.substring(i, tailIndex);
            if(dp[i] && set.contains(suffix)) {
                runner.addFirst(suffix);
                backTracking(s, i, dp, runner);
                runner.removeFirst();
            }
        }
    }
}
```

----

### `leetcode 141 环形链表`

```java
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null) {
            if(fast == slow) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
```

-----

### `leetcode 142 环形链表II`

```java
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                slow = head;
                while(slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
```



### `leetcode 144 二叉树的前序遍历`

```java
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if(root == null) {
            return res;
        }

        Deque<TreeNode> stack = new LinkedList<>();
        while(!stack.isEmpty() || root != null) {
            while(root != null) {
                res.add(root.val);
                stack.push(root);
                root = root.left;
            }

            TreeNode node = stack.pop();
            root = node.right;
        }
        return res;
    }
}
```



-----

### `leetcode` 145  二叉树的后序遍历

```java
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if(root == null) {
            return res;
        }

        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode lastVisit = null;
        while(!stack.isEmpty() || root != null) {
            while(root != null) {
                stack.push(root);
                root = root.left;
            }

            TreeNode node = stack.peek();
            if(node.right == null || node.right == lastVisit) {
                stack.pop();
                res.add(node.val);
                lastVisit = node;
            } else {
                root = node.right;
            }
        }
        return res;
    }
}
```

------

### `leetcode 146 LRU缓存机制`

```java
class LRUCache {
    private class LinkedListNode {
        private int key;
        private int value;
        private LinkedListNode prev;
        private LinkedListNode next;

        public LinkedListNode(int key, int value) {
            this.key = key;
            this.value = value;
            this.prev = null;
            this.next = null;
        }
    }

    private int capacity;
    private LinkedListNode listHead;
    private LinkedListNode listTail;
    private Map<Integer, LinkedListNode> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.listHead = new LinkedListNode(-1, -1);
        this.listTail = new LinkedListNode(-1, -1);
        this.map = new HashMap<>();
        
        listHead.next = listTail;
        listTail.prev = listHead;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) {
            return -1;
        }

        LinkedListNode node = map.get(key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
        moveToTail(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if(get(key) != -1) {
            map.get(key).value = value;
            return;
        }

        LinkedListNode node = new LinkedListNode(key, value);
        map.put(key, node);
        moveToTail(node);
        if(map.size() > capacity) {
            map.remove(listHead.next.key);
            listHead.next = listHead.next.next;
            listHead.next.prev = listHead;
        }
    }

    private void moveToTail(LinkedListNode node) {
        node.prev = listTail.prev;
        listTail.prev = node;
        node.prev.next = node;
        node.next = listTail;
    }
}
```



### `leetcode 152 乘积最大子数组`

```java
class Solution {
    public int maxProduct(int[] nums) {
        int min = 1;
        int max = 1;
        int res = Integer.MIN_VALUE;
        for(int num : nums) {
            if(num < 0) {
                int temp = min;
                min = max;
                max = temp;
            }

            min = Math.min(num, num * min);
            max = Math.max(num, num * max);
            res = Math.max(res, max);
        }
        return res;
    }
}
```

------

### `leetcode 153 寻找旋转排序数组中的最小值`

```java
class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] <= nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return nums[left];
    }
}
```

----

### `leetcode 154 寻找旋转排序数组中的最小值 II` 

```java
class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == nums[right]) {
                right--;
            } else if(nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return nums[left];
    }
}
```

----

### `leetcode 155 最小栈`

```java
class MinStack {
    private Deque<Integer> dataStack;
    private Deque<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
        this.dataStack = new LinkedList<>();
        this.minStack = new LinkedList<>();
    }
    
    public void push(int x) {
        dataStack.push(x);
        if(minStack.isEmpty()) {
            minStack.push(x);
        } else {
            int min = Math.min(minStack.peek(), x);
            minStack.push(min);
        }
    }
    
    public void pop() {
        dataStack.pop();
        minStack.pop();
    }
    
    public int top() {
        return dataStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
```



### `leetcode 160 相交链表`

```java
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode shortL = headA;
        ListNode longL = headB;
        int lenS = 0;
        int lenL = 0;
        while(shortL != null) {
            lenS++;
            shortL = shortL.next;
        }
        while(longL != null) {
            lenL++;
            longL = longL.next;
        }

        int diff = lenL - lenS;
        shortL = headA;
        longL = headB;
        if(diff < 0) {
            shortL = headB;
            longL = headA;
            diff = Math.abs(diff);
        }

        for(int i = 0; i < diff; i++) {
            longL = longL.next;
        }
        while(shortL != null && longL != null) {
            if(shortL == longL) {
                return shortL;
            }
            shortL = shortL.next;
            longL = longL.next;
        }
        return null;
    }
}
```

-----

### `leetcode 165 比较版本号`

```java
class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int len1 = v1.length;
        int len2 = v2.length;
        int i = 0;
        int j = 0;
        while(i < len1 || j < len2) {
            int a = (i < len1)? Integer.parseInt(v1[i]) : 0;
            int b = (j < len2)? Integer.parseInt(v2[j]) : 0;
            i++;
            j++;
            if(a != b) {
                return (a > b)? 1 : -1;
            }
        }
        return 0;
    }
}
```



### `leetcode 169 多数元素`

```java
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int majority = Integer.MIN_VALUE;
        for(int num : nums) {
            if(count <= 0) {
                count = 1;
                majority = num;
            } else {
                if(num == majority) {
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

----

### `leetcode 171 Excel表列序号`

```java
class Solution {
    public int titleToNumber(String s) {
        int res = 0;
        for(char c : s.toCharArray()) {
            res = res * 26 + (c - 'A' + 1);
        }
        return res;
    }
}
```

-----

### `leetcode 179 最大数`

```java
class Solution {
    public String largestNumber(int[] nums) {
        int len = nums.length;
        String[] numInStr = new String[len];
        for(int i = 0; i < len; i++) {
            numInStr[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(numInStr, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String s1 = a + b;
                String s2 = b + a;
                return s2.compareTo(s1);
            }
        });
        
        if(numInStr[0].equals("0")) {
            return "0";
        }
        StringBuffer res = new StringBuffer();
        for(String s : numInStr) {
            res.append(s);
        }
        return res.toString();
    }
}
```

----

### `leetcode 198 打家劫舍`

```java
class Solution {
    public int rob(int[] nums) {
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
}
```



### `leetcode 199 二叉树的右视图`

```java
class Solution {
    private List<Integer> res;

    public List<Integer> rightSideView(TreeNode root) {
        this.res = new LinkedList<>();
        if(root == null) {
            return res;
        }

        reverseTra(root, 0);
        return res;
    }

    private void reverseTra(TreeNode root, int height) {
        if(root == null) {
            return;
        }

        if(height == res.size()) {
            res.add(root.val);
        }
        height++;
        reverseTra(root.right, height);
        reverseTra(root.left, height);
    }
}
```

-----

### `leetcode 205 同构字符串`

```java
/**
* 1、
 */
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> s2t = new HashMap<>();
        Map<Character, Character> t2s = new HashMap<>();
        int len = s.length();
        for(int i = 0; i < len; i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if((s2t.containsKey(c1) && s2t.get(c1) != c2) 
                || (t2s.containsKey(c2) && t2s.get(c2) != c1)) {
                return false;
            }
            s2t.put(c1, c2);
            t2s.put(c2, c1);
        }
        return true;
    }
}

/**
* 2、
 */
class Solution {
    public boolean isIsomorphic(String a, String b) {
        int[] aTob = new int[128];
        int[] bToa = new int[128];
        char[] charArrA = a.toCharArray();
        char[] charArrB = b.toCharArray();
        for(int i = 0; i < charArrA.length; i++) {
            if(aTob[charArrA[i]] != bToa[charArrB[i]]) {
                return false;
            }
            aTob[charArrA[i]] = i + 1;
            bToa[charArrB[i]] = i + 1;
        }
        return true;
    }
}
```



### `leetcode 206 反转链表`

```java
/**
* 迭代
 */
class Solution {
    public ListNode reverseList(ListNode head) {
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
}
```

------

### `leetcode 208 实现Trie (前缀树)`

```java
class Trie {
    private class TrieNode {
        private TrieNode[] child;
        private boolean isLeaf;

        public TrieNode() {
            this.child = new TrieNode[26];
            this.isLeaf = false;
        }
    }

    private TrieNode root;

    /** Initialize your data structure here. */
    public Trie() {
        this.root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node = root;
        for(char c : word.toCharArray()) {
            int index = c - 'a';
            if(node.child[index] == null) {
                node.child[index] = new TrieNode();
            }
            node = node.child[index];
        }
        node.isLeaf = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = root;
        for(char c : word.toCharArray()) {
            int index = c - 'a';
            if(node.child[index] == null) {
                return false;
            }
            node = node.child[index];
        }
        return node.isLeaf;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for(char c : prefix.toCharArray()) {
            int index = c - 'a';
            if(node.child[index] == null) {
                return false;
            }
            node = node.child[index];
        }
        return true;
    }
}
```

-----

### `leetcode 209 长度最小的子数组`

```java
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int res = Integer.MAX_VALUE;
        int window = 0;
        int left = 0;
        int right = 0;
        while(right < nums.length) {
            window += nums[right];
            while(window >= target) {
                res = Math.min(res, right - left + 1);
                window -= nums[left];
                left++;
            }
            right++;
        }
        return res == Integer.MAX_VALUE? 0 : res;
    }
}
```

----

### `leetcode 225 用队列实现栈`

```java
class MyStack {
    private Queue<Integer> queue;

    /** Initialize your data structure here. */
    public MyStack() {
        this.queue = new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        queue.offer(x);
        int size = queue.size();
        for(int i = 0; i < size - 1; i++) {
            queue.offer(queue.poll());
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.poll();
    }
    
    /** Get the top element. */
    public int top() {
        return queue.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}
```



### `leetcode 226 翻转二叉树`

```java
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return null;
        }

        TreeNode left = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(left);
        return root;
    }
}
```

------

### `leetcode 230 二叉搜素树中第k小的元素`

```java
class Solution {
    private int res = 0;
    private int count = 0;

    public int kthSmallest(TreeNode root, int k) {
        if(root == null) {
            return Integer.MIN_VALUE;
        }

        inorderTra(root, k);
        return res;
    }

    private void inorderTra(TreeNode root, int k) {
        if(root == null) {
            return;
        }

        inorderTra(root.left, k);
        count++;
        if(count == k) {
            res = root.val;
            return;
        }
        inorderTra(root.right, k);
    }
}
```



### `leetcode 232 用栈实现队列`

```java
class MyQueue {
    private Deque<Integer> stack1;
    private Deque<Integer> stack2;

    /** Initialize your data structure here. */
    public MyQueue() {
        this.stack1 = new LinkedList<>();
        this.stack2 = new LinkedList<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(!stack2.isEmpty()) {
            return stack2.pop();
        }
        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        if(!stack2.isEmpty()) {
            return stack2.peek();
        }
        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
```

----

### `leetcode 238 除自身以外数组的乘积`

```java
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];

        int left = 1;
        for(int i = 0; i < len; i++) {
            res[i] = left;
            left *= nums[i];
        }

        int right = 1;
        for(int i = len - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }
}
```



### `leetcode 255 验证前序遍历序列二叉搜索树`

```java
class Solution {
    public boolean verifyPreorder(int[] preorder) {
        return recursion(preorder, 0, preorder.length - 1);
    }

    private boolean recursion(int[] preorder, int left, int right) {
        if(left >= right) {
            return true;
        }

        int rootVal = preorder[left];
        int cur = left + 1;
        while(cur <= right && preorder[cur] < rootVal) {
            cur++;
        }
        for(int i = cur; i <= right; i++) {
            if(preorder[i] <= rootVal) {
                return false;
            }
        }

        return recursion(preorder, left + 1, cur - 1) && recursion(preorder, cur, right);
    }
}
```

----

### `leetcode 257 二叉树的所有路径`

```java
/**
* 回溯
 */
class Solution {
    private List<String> res;

    public List<String> binaryTreePaths(TreeNode root) {
        this.res = new LinkedList<>();
        if(root == null) {
            return res;
        }

        backTracking(root, "");
        return res;
    }

    private void backTracking(TreeNode root, String path) {
        if(root == null) {
            return;
        }

        path += root.val;
        if(root.left == null && root.right == null) {
            res.add(path);
            return;
        }

        path += "->";
        backTracking(root.left, path);
        backTracking(root.right, path);
    }
}
```

-----

### `leetcode 268 丢失的数字`

```java
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            while(nums[i] < n && i != nums[i]) {
                swap(nums, i, nums[i]);
            }
        }

        int index = 0;
        for(index = 0; index < n; index++) {
            if(nums[index] != index) {
                return index;
            }
        }
        return index;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
```

-----

### `leetcode 283 移动零`

```java
class Solution {
    public void moveZeroes(int[] nums) {
        int mark = -1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                mark++;
                swap(nums, i, mark);
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
```

----

### `leetcode 287 寻找重复数`

```java
class Solution {
    public int findDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length;
        while(left < right) {
            int mid = left + (right - left) / 2;

            int count = 0;
            for(int num : nums) {
                if(num <= mid) {
                    count++;
                }
            }
            if(count > mid) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
```



### `leetcode 295 数据流的中位数`

```java
class MedianFinder {
    private PriorityQueue<Integer> firstHalf;
    private PriorityQueue<Integer> secondHalf;
    private int size;

    /** initialize your data structure here. */
    public MedianFinder() {
        this.firstHalf = new PriorityQueue<>((o1, o2)->(o2 - o1));
        this.secondHalf = new PriorityQueue<>();
        this.size = 0;
    }
    
    public void addNum(int num) {
        if(size % 2 == 0) {
            secondHalf.offer(num);
            firstHalf.offer(secondHalf.poll());
        } else {
            firstHalf.offer(num);
            secondHalf.offer(firstHalf.poll());
        }
        size++;
    }
    
    public double findMedian() {
        if(size == 0) {
            return Integer.MIN_VALUE;
        }

        if(size % 2 == 0) {
            return (double) (firstHalf.peek() + secondHalf.peek()) / 2;
        } else {
            return firstHalf.peek();
        }
    }
}
```

-----

### `leetcode 300 最长递增子序列`

```java
class Solution {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        Arrays.fill(dp, 1);
        int res = 1;
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
}
```

-----

### `leetcode 322 零钱兑换`

```java
class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for(int coin : coins) {
            for(int i = coin; i <= amount; i++) {
                dp[i] = Math.min(dp[i], dp[i-coin] + 1);
            }
        }
        return dp[amount] == amount + 1? -1 : dp[amount];
    }
}
```



### `leetcode 316 去除重复字母`

```java
/**
* 单调栈
 */
class Solution {
    public String removeDuplicateLetters(String s) {
        if(s == null || s.length() < 2) {
            return s;
        }

        boolean[] charSet = new boolean[26];
        int[] lastAppearIndex = new int[26];
        int len = s.length();
        for(int i = 0; i < len; i++) {
            lastAppearIndex[s.charAt(i) - 'a'] = i;
        }

        Deque<Character> monoStack = new LinkedList<>();
        for(int i = 0; i < len; i++) {
            char curChar = s.charAt(i);
            if(charSet[curChar - 'a']) {
                continue;
            }

            while(!monoStack.isEmpty() && monoStack.peek() > curChar
                && lastAppearIndex[monoStack.peek() - 'a'] > i) {
                charSet[monoStack.pop() - 'a'] = false;
            }
            monoStack.push(curChar);
            charSet[curChar - 'a'] = true;
        }

        StringBuffer res = new StringBuffer();
        for(char c : monoStack) {
            res.insert(0, c);
        }
        return res.toString();
    }
}
```

---

### `leetcode 329 矩阵中的最长递增路径`

```java
class Solution {
    private int rows;
    private int columns;
    private int[][] matrix;
    private int[][] visited;
    private int[][] dirs = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};

    public int longestIncreasingPath(int[][] matrix) {
        if(matrix == null || matrix.length == 0) {
            return 0;
        }

        this.rows = matrix.length;
        this.columns = matrix[0].length;
        this.matrix = matrix;
        this.visited = new int[rows][columns];
        
        int res = 0;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                res = Math.max(res, dfs(i, j));
            }
        }
        return res;
    }

    private int dfs(int row, int col) {
        if(!checkBound(row, col)) {
            return 0;
        }

        if(visited[row][col] != 0) {
            return visited[row][col];
        }

        for(int[] dir : dirs) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            if(checkBound(newRow, newCol) && matrix[row][col] > matrix[newRow][newCol]) {
                visited[row][col] = Math.max(visited[row][col], dfs(newRow, newCol));
            }
        }
        visited[row][col]++;
        return visited[row][col];
    }

    private boolean checkBound(int row, int col) {
        return (row >= 0 && row < rows && col >= 0 && col < columns);
    }
}
```



### `leetcode 349 两个数组的交集`

```java
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] res = new int[Math.min(len1, len2)];
        int index = 0;

        Set<Integer> set = new HashSet<>();
        for(int num : nums1) {
            set.add(num);
        }
        for(int num : nums2) {
            if(set.contains(num)) {
                res[index] = num;
                index++;
                set.remove(num);
            }
        }

        return Arrays.copyOf(res, index);
    }
}
```

----

### `leetcode 350 两个数组的交集 II`

```java
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[] res = new int[Math.min(len1, len2)];
        int index = 0;
        int i = 0;
        int j = 0;
        while(i < len1 && j < len2) {
            if(nums1[i] == nums2[j]) {
                res[index] = nums1[i];
                i++;
                j++;
                index++;
            } else if(nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return Arrays.copyOf(res, index);
    }
}
```

----

### `leetcode 354 俄罗斯套娃信封问题`

```java
class Solution {
    public int maxEnvelopes(int[][] envelopes) {
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
}
```



### `leetcode 369  给单链表加一`

```java
class Solution {
    public ListNode plusOne(ListNode head) {
        ListNode sentinal = new ListNode(0);
        sentinal.next = head;
        ListNode notNine = sentinal;
        // 1、定位到最远的值不为9的节点
        while(head != null) {
            if(head.val != 9) {
                notNine = head;
            }
            head = head.next;
        }
        // 2、将节点值加一
        notNine.val++;
        notNine = notNine.next;
        // 3、将节点之后的所有节点值设为0
        while(notNine != null) {
            notNine.val = 0;
            notNine = notNine.next;
        }
        return sentinal.val == 0? sentinal.next : sentinal;
    }
}
```

-----

### `leetcode 402 移掉K位数字`

```java
class Solution {
    public String removeKdigits(String num, int k) {
        if(num == null || num.length() <= k) {
            return "0";
        }

        Deque<Character> monoStack = new LinkedList<>();
        for(char c : num.toCharArray()) {
            while(!monoStack.isEmpty() && k > 0 && c < monoStack.peek()) {
                k--;
                monoStack.pop();
            }
            if(c != '0' || !monoStack.isEmpty()) {
                monoStack.push(c);
            }
        }

        while(k > 0 && !monoStack.isEmpty()) {
            monoStack.pop();
            k--;
        }
        StringBuffer res = new StringBuffer();
        for(char c : monoStack) {
            res.insert(0, c);
        }
        return res.length() == 0? "0" : res.toString();
    }
}
```



### `leetcode 415 字符串相加`

```java
class Solution {
    public String addStrings(String num1, String num2) {
        int index1 = num1.length() - 1;
        int index2 = num2.length() - 1;
        StringBuffer res = new StringBuffer();
        int carry = 0;
        while(index1 >= 0 || index2 >= 0 || carry > 0) {
            int temp = carry;
            if(index1 >= 0) {
                temp += num1.charAt(index1) - '0';
                index1--;
            }
            if(index2 >= 0) {
                temp += num2.charAt(index2) - '0';
                index2--;
            }

            int val = temp % 10;
            carry = temp / 10;
            res.insert(0, val);
        }
        return res.toString();
    }
}
```

----

### `leetcode 416 分割等和子集`

```java
class Solution {
    public boolean canPartition(int[] nums) {
        if(nums == null || nums.length == 0) {
            return false;
        }

        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        if((sum & 1) != 0) {
            return false;
        }

        sum /= 2;
        int len = nums.length;
        boolean[][] dp = new boolean[len+1][sum+1];
        for(int i = 0; i <= len; i++) {
            dp[i][0] = true;
        }
        for(int i = 1; i <= len; i++) {
            for(int j = nums[i-1]; j <= sum; j++) {
                dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i-1]];
            }
        }
        return dp[len][sum];
    }
}
```

-----

### `leetcode 426 将二叉搜索树转化为排序的双向链表`

```java
class Solution {
    private Node dummy = new Node(-1, null, null);
    private Node runner = dummy;

    public Node treeToDoublyList(Node root) {
        if(root == null) {
            return null;
        }
        
        inorderTra(root);
        runner.right = dummy.right;
        dummy.right.left = runner;
        return dummy.right;
    }

    private void inorderTra(Node root) {
        if(root == null) {
            return;
        }

        inorderTra(root.left);
        runner.right = root;
        root.left = runner;
        runner = runner.right;
        inorderTra(root.right);
    }
}
```

------

### `leetcode 435 无重叠区间`

```java
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals == null || intervals.length < 2) {
            return 0;
        }

        Arrays.sort(intervals, (o1, o2)->(o1[0] - o2[0]));
        int curEnd = Integer.MIN_VALUE;
        int res = 0;
        for(int[] interval : intervals) {
            if(interval[0] < curEnd) {
                res++;
                curEnd = Math.min(curEnd, interval[1]);
            } else {
                curEnd = interval[1];
            }
        }
        return res;
    }
}
```



### `leetcode 442 数组中重复的数字`

```java
/**
* 原地哈希
 */
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new LinkedList<>();
        if(nums == null || nums.length == 0) {
            return res;
        }

        for(int i = 0; i < nums.length; i++) {
            while(nums[nums[i] - 1] != nums[i]) {
                swap(nums, i, nums[i] - 1);
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != i + 1) {
                res.add(nums[i]);
            }
        }
        return res;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
```

-----

### `leetcode 448 找到所有数组中消失的数字`

```java
/**
* 原地哈希
 */
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new LinkedList<>();
        if(nums == null || nums.length == 0) {
            return res;
        }

        for(int i = 0; i < nums.length; i++) {
            while(nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != i + 1) {
                res.add(i+1);
            }
        }
        return res;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
```

-----

### `leetcode 450 删除二叉搜索树中的节点`

```java
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) {
            return null;
        }

        if(key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if(key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            if(root.left == null) {
                return root.right;
            } else if(root.right == null) {
                return root.left;
            } else {
                TreeNode node = root;
                root = min(node.right);
                root.right = deleteMin(node.right);
                root.left = node.left;
                return root;
            }
        }
        return root;
    }

    private TreeNode min(TreeNode root) {
        if(root == null) {
            return null;
        }

        while(root.left != null) {
            root = root.left;
        }
        return root;
    }

    private TreeNode deleteMin(TreeNode root) {
        if(root == null) {
            return null;
        }

        if(root.left == null) {
            return root.right;
        }
        root.left = deleteMin(root.left);
        return root;
    }
}
```

----

### `leetcode 470 用Rand7()实现Rand10()`

```java
class Solution extends SolBase {
    public int rand10() {
         /**
         * (rand_X() - 1) × Y + rand_Y() ==> 可以等概率的生成[1, X * Y]范围的随机数
          */
         while(true) {
             int a = rand7();
             int b = rand7();
             int num = (a - 1) * 7 + b;
             if(num <= 40) {
                 return num % 10 + 1;
             }

             a = num - 40;
             b = rand7();
             num = (a - 1) * 7 + b;
             if(num <= 60) {
                 return num % 10 + 1;
             }

             a = num - 60;
             b = rand7();
             num = (num - 1) * 7 + b;
             if(num <= 20) {
                 return num % 10 + 1;
             }
         }
    }
}
```



### `leetcode 515 在每个树行中找最大值`

```java
/**
* BFS 
 */
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if(root == null) {
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int levelSize = queue.size();
            int max = Integer.MIN_VALUE;
            while(levelSize > 0) {
                TreeNode node = queue.poll();
                levelSize--;
                max = Math.max(node.val, max);

                if(node.left != null) {
                    queue.offer(node.left);
                }
                if(node.right != null) {
                    queue.offer(node.right);
                }
            }
            res.add(max);
        }
        return res;
    }
}
```

-----

### `leetcode 518 零钱兑换II`

```java
class Solution {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount+1];
        dp[0] = 1;
        for(int coin : coins) {
            for(int i = coin; i <= amount; i++) {
                dp[i] += dp[i-coin];
            }
        }
        return dp[amount];
    }
}
```



### `leetcode 530 二叉搜索树的最小绝对差`

```java
class Solution {
    private int res = Integer.MAX_VALUE;
    private TreeNode pre = null;

    public int getMinimumDifference(TreeNode root) {
        inorderTra(root);
        return res;
    }

    private void inorderTra(TreeNode root) {
        if(root == null) {
            return;
        }

        inorderTra(root.left);
        if(pre != null) {
            res = Math.min(res, root.val - pre.val);
        }
        pre = root;
        inorderTra(root.right);
    }
}
```

----

### `leetcode 538 把二叉搜索树转换为累加树`

```java
class Solution {
    private int pre = 0;

    public TreeNode convertBST(TreeNode root) {
        reverseTra(root);
        return root;
    }

    private void reverseTra(TreeNode root) {
        if(root == null) {
            return;
        }

        reverseTra(root.right);
        pre += root.val;
        root.val = pre;
        reverseTra(root.left);
    }
}
```



### `leetcode 547 省份数量`

```java
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        UnionFind uf = new UnionFind(n);
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(isConnected[i][j] == 1) {
                    uf.union(i, j);
                }
            }
        }
        return uf.count();
    }

    /**
    * 并查集
     */
    private class UnionFind {
        private int count;
        private int[] parent;
        private int[] rank;

        public UnionFind(int n) {
            this.count = n;
            this.parent = new int[n];
            this.rank = new int[n];

            for(int i = 0; i < n; i++) {
                parent[i] = i;
                rank[i] = 1;
            }
        }

        public int count() {
            return count;
        }

        public int find(int a) {
            while(a != parent[a]) {
                parent[a] = parent[parent[a]];
                a = parent[a];
            }
            return a;
        }

        public boolean connected(int a, int b) {
            return find(a) == find(b);
        }

        public void union(int a, int b) {
            int rootA = find(a);
            int rootB = find(b);
            if(rootA == rootB) {
                return;
            }

            if(rank[rootA] < rank[rootB]) {
                parent[rootA] = rootB;
            } else if(rank[rootA] > rank[rootB]) {
                parent[rootB] = rootA;
            } else {
                parent[rootA] = rootB;
                rank[rootB]++;
            }
            this.count--;
            return;
        }
    }
}
```

----

### `leetcode 557 反转字符串中的单词`

```java
class Solution {
    public String reverseWords(String s) {
        List<String> runner = new LinkedList<>();
        int len = s.length();
        int left = 0;
        int right = 0;
        while(right < len) {
            while(right < len && s.charAt(right) != ' ') {
                right++;
            }
            int next = right + 1;
            String word = s.substring(left, right);
            runner.add(reverseChar(word));
            left = next;
            right = next;
        }
        return String.join(" ", runner);
    }

    private String reverseChar(String str) {
        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while(left < right) {
            char temp = arr[left];
            arr[left] =arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return String.valueOf(arr);
    }
}
```

-----

### `leetcode 560 和为k的子数组`

```java
class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> preSumMap = new HashMap<>();
        preSumMap.put(0, 1);
        int curSum = 0;
        int res = 0;
        for(int num : nums) {
            curSum += num;
            if(preSumMap.containsKey(curSum - k)) {
                res += preSumMap.get(curSum - k);
            }
            preSumMap.put(curSum, preSumMap.getOrDefault(curSum, 0) + 1);
        }
        return res;
    }
}
```



### `leetcode 572 另一个树的子树`

```java
class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null) {
            return false;
        }
        return checkMatch(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    private boolean checkMatch(TreeNode a, TreeNode b) {
        if(a == null && b == null) {
            return true;
        } else if(a == null || b == null || a.val != b.val) {
            return false;
        }

        return checkMatch(a.left, b.left) && checkMatch(a.right, b.right);
    }
}
```

-----

### `leetcode 622 设计循环队列`

```java
class MyCircularQueue {
    private int capacity;
    private int[] queue;
    private int front;
    private int rear;

    public MyCircularQueue(int k) {
        this.capacity = k + 1;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = 0;
    }
    
    public boolean enQueue(int value) {
        if(isFull()) {
            return false;
        }
        queue[rear] = value;
        rear = (rear + 1) % capacity;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) {
            return false;
        }

        front = (front + 1) % capacity;
        return true;
    }
    
    public int Front() {
        if(isEmpty()) {
            return -1;
        }
        return queue[front];
    }
    
    public int Rear() {
        if(isEmpty()) {
            return -1;
        }
        return queue[(rear - 1 + capacity) % capacity];
    }
    
    public boolean isEmpty() {
        return front == rear;
    }
    
    public boolean isFull() {
        return (rear + 1) % capacity == front;
    }
}
```

----

### `leetcode 647 回文子串`

```java
class Solution {
    public int countSubstrings(String s) {
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        for(int i = 0; i < len; i++) {
            dp[i][i] = true;
        }

        int res = len;
        for(int i = len - 2; i >= 0; i--) {
            for(int j = i + 1; j < len; j++) {
                if(s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i+1][j-1])) {
                    dp[i][j] = true;
                    res++;
                }
            }
        }
        return res;
    }
}
```



### `leetcode 648 单词替换`

```java
class Solution {
    class TrieNode {
        private TrieNode[] child;
        private String word;

        public TrieNode() {
            this.child = new TrieNode[26];
            this.word = null;
        }
    }

    public String replaceWords(List<String> dictionary, String sentence) {
        TrieNode root = new TrieNode();
        for(String word : dictionary) {
            TrieNode cur = root;
            for(char c : word.toCharArray()) {
                int index = c - 'a';
                if(cur.child[index] == null) {
                    cur.child[index] = new TrieNode();
                }
                cur = cur.child[index];
            }
            cur.word = word;
        }

        StringBuffer res = new StringBuffer();
        for(String word : sentence.split(" ")) {
            if(res.length() > 0) {
                res.append(" ");
            }
            TrieNode cur = root;
            for(char c : word.toCharArray()) {
                int index = c - 'a';
                if(cur.child[index] == null || cur.word != null) {
                    break;
                }
                cur = cur.child[index];
            }

            if(cur.word == null) {
                res.append(word);
            } else {
                res.append(cur.word);
            }
        }
        return res.toString();
    }
}
```



### `leetcode 680 验证回文字符串 II `

```java
class Solution {
    public boolean validPalindrome(String s) {
        int len = s.length();
        for(int i = 0, j = len - 1; i < j; i++, j--) {
            if(s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
            }
        }
        return true;
    }

    private boolean isPalindrome(String s, int i, int j) {
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
```



### `leetcode 700 二叉搜索树中的搜索`

```java
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) {
            return null;
        }

        if(root.val == val) {
            return root; 
        } else if(root.val < val) {
            return searchBST(root.right, val);
        } else {
            return searchBST(root.left, val);
        }
    }
}
```

-----

### `leetcode 704 二分查找`

```java
class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
```

-----

### `leetcode 739 每日温度`

```java
class Solution {
    public int[] dailyTemperatures(int[] T) {
        int len = T.length;
        int[] res = new int[len];
        int index = len - 1;
        Deque<Integer> monoStack = new LinkedList<>();
        for(int i = len - 1; i >= 0; i--) {
            while(!monoStack.isEmpty() && T[monoStack.peek()] <= T[i]) {
                monoStack.pop();
            }
            res[index] = monoStack.isEmpty()? 0 : monoStack.peek() - i;
            index--;
            monoStack.push(i);
        }
        return res;
    }
}
```



### `leetcode 867 转置矩阵`

```java
class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] res = new int[n][m];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                res[j][i] = matrix[i][j];
            }
        }
        return res;
    }
}
```

-----

### `leetcode 887 鸡蛋掉落`

```java
class Solution {
    public int superEggDrop(int K, int N) {
        int[][] dp = new int[K+1][N+1];
        int m = 0;
        while(dp[K][m] < N) {
            m++;
            for(int i = 1; i <= K; i++) {
                dp[i][m] = dp[i][m-1] + dp[i-1][m-1] + 1;
            }
        }
        return m;
    }
}
```

-----

### `leetcode 890 查找和替换模式`

```java
class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new LinkedList<>();
        for(String word : words) {
            if(match(word, pattern)) {
                res.add(word);
            }
        }
        return res;
    }

    private boolean match(String a, String b) {
        int[] aTob = new int[128];
        int[] bToa = new int[128];
        char[] charArrA = a.toCharArray();
        char[] charArrB = b.toCharArray();
        for(int i = 0; i < charArrA.length; i++) {
            if(aTob[charArrA[i]] != bToa[charArrB[i]]) {
                return false;
            }
            aTob[charArrA[i]] = i + 1;
            bToa[charArrB[i]] = i + 1;
        }
        return true;
    }
}
```



### `leetcode 896 单调数列`

```java
class Solution {
    public boolean isMonotonic(int[] A) {
        if(A == null || A.length <= 1) {
            return true;
        }

        boolean desc = false;
        boolean ased = false;
        for(int i = 0; i < A.length - 1; i++) {
            if(A[i] < A[i+1]) {
                ased = true;
            }
            if(A[i] > A[i+1]) {
                desc = true;
            }
        }

        if(desc && ased) {
            return false;
        }
        return true;
    }
}
```

-----

### `leetcode 922 按奇偶排序数组`

```java
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        if(nums == null || nums.length < 2) {
            return nums;
        }

        int even = 0;
        int odd = 1;
        int len = nums.length;
        while(odd < len && even < len) {
            while(odd < len && nums[odd] % 2 != 0)      odd += 2;
            while(even < len && nums[even] % 2 == 0)    even += 2;
            if(odd < len && even < len) {
                swap(nums, odd, even);
            }
        }
        return nums;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
```



### `leetcode 945 使数组唯一的最小增量`

```java
class Solution {
    public int minIncrementForUnique(int[] A) {
        UnionFind uf = new UnionFind();
        int res = 0;
        for(int a : A) {
            if(uf.contains(a)) {
                int root = uf.find(a);
                int add = root + 1;
                res += (add - a);
                uf.add(add);
            } else {
                uf.add(a);
            }
        }
        return res;
    }

    private class UnionFind {
        private int[] parent;

        public UnionFind() {
            this.parent = new int[80000];
            Arrays.fill(parent, -1);
        }

        public void add(int a) {
            parent[a] = a;
            if(a > 0 && parent[a-1] != -1) {
                union(a, a - 1);
            }
            if(parent[a+1] != -1) {
                union(a, a + 1);
            }
        }

        public boolean contains(int a) {
            return parent[a] != -1;
        }

        public int find(int a) {
            while(a != parent[a]) {
                parent[a] = parent[parent[a]];
                a = parent[a];
            }
            return a;
        }

        public void union(int a, int b) {
            int rootA = find(a);
            int rootB = find(b);

            if(rootA < rootB) {
                parent[rootA] = rootB;
            } else if(rootA > rootB) {
                parent[rootB] = rootA;
            }
        }
    }
}
```



### `leetcode 973 最接近原点的k个点`

```java
/**
* 使用JDK排序解决
*/
class Solution {
    public int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return (a[0] * a[0] + a[1] * a[1]) - (b[0] * b[0] + b[1] * b[1]);
            }
        });

        int[][] res = new int[K][2];
        int index = 0;
        for(int i = 0; i < K; i++) {
            res[i] = points[i];
        }
        return res;
    }
}
```

----

### `leetcode 974 和可被K整除的子数组`

```java
class Solution {
    public int subarraysDivByK(int[] A, int K) {
        int len = A.length;
        int curSum = 0;
        int res = 0;
        int[] preSum = new int[K];
        preSum[0] = 1;
        for(int a : A) {
            curSum += a;
            int key = (curSum % K + K) % K;
            res += preSum[key];
            preSum[key]++;
        }
        return res;
    }
}
```



### `leetcode 977 有序数组的平方`

```java
class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        int left = 0;
        int right = len - 1;
        int index = len - 1;
        while(left <= right) {
            if(nums[left] + nums[right] < 0) {
                res[index] = nums[left] * nums[left];
                left++;
            } else {
                res[index] = nums[right] * nums[right];
                right--;
            }
            index--;
        }
        return res;
    }
}
```



### `leetcode 986 区间列表的交集`

```java
class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int len1 = firstList.length;
        int len2 = secondList.length;
        int[][] res = new int[len1 + len2][2];
        int index = -1;
        int i = 0;
        int j = 0;
        while(i < len1 && j < len2) {
            int start = Math.max(firstList[i][0], secondList[j][0]);
            int end = Math.min(firstList[i][1], secondList[j][1]);
            if(start <= end) {
                index++;
                res[index] = new int[]{start, end};
            } 

            if(firstList[i][1] < secondList[j][1]) {
                i++;
            } else {
                j++;
            }
        }
        return Arrays.copyOf(res, index + 1);
    }
}
```

-----

### `leetcode 1008 前序遍历构造二叉搜索树`

```java
class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        return buildTree(preorder, 0, preorder.length - 1);
    }

    private TreeNode buildTree(int[] preorder, int left, int right) {
        if(left > right) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[left]);
        int index = left + 1;
        while(index <= right && preorder[index] < preorder[left]) {
            index++;
        }
        root.left = buildTree(preorder, left + 1, index - 1);
        root.right = buildTree(preorder, index, right);
        return root;
    }
}
```



### `leetcode 1013 将数组分成和相等的三个部分`

```java
/**
* 双指针
 */
class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        if(arr == null || arr.length < 3) {
            return false;
        }

        int sum = 0;
        for(int item : arr) {
            sum += item;
        }
        if(sum % 3 != 0) {
            return false;
        }

        int len = arr.length;
        int leftPart = arr[0];
        int left = 0;
        int rightPart = arr[len - 1];
        int right = len - 1;
        int share = sum / 3;
        while(left + 1 < right) {
            if(leftPart == share && rightPart == share) {
                return true;
            }

            if(leftPart != share) {
                left++;
                leftPart += arr[left];
            }
            if(rightPart != share) {
                right--;
                rightPart += arr[right];
            }
        }
        return false;
    }
}
```

----

### `leetcode 1038 把二叉搜索树转换为累加树`

```java
class Solution {
    private int pre = 0;

    public TreeNode bstToGst(TreeNode root) {
        reverseTra(root);
        return root;
    }

    private void reverseTra(TreeNode root) {
        if(root == null) {
            return;
        }

        reverseTra(root.right);
        pre += root.val;
        root.val = pre;
        reverseTra(root.left);
    }
}
```



### `leetcode 1081 不同字符的最小子序列`

```java
class Solution {
    public String smallestSubsequence(String s) {
        if(s == null || s.length() < 2) {
            return s;
        }

        boolean[] charSet = new boolean[26];
        int[] lastAppearIndex = new int[26];
        int len = s.length();
        for(int i = 0; i < len; i++) {
            lastAppearIndex[s.charAt(i) - 'a'] = i;
        }

        Deque<Character> monoStack = new LinkedList<>();
        for(int i = 0; i < len; i++) {
            char curChar = s.charAt(i);
            if(charSet[curChar - 'a']) {
                continue;
            }

            while(!monoStack.isEmpty() && monoStack.peek() > curChar
                && lastAppearIndex[monoStack.peek() - 'a'] > i) {
                charSet[monoStack.pop() - 'a'] = false;
            }
            monoStack.push(curChar);
            charSet[curChar - 'a'] = true;
        }

        StringBuffer res = new StringBuffer();
        for(char c : monoStack) {
            res.insert(0, c);
        }
        return res.toString();
    }
}
```

-----

### `leetcode 1143 最长公共子序列`

```java
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int len1 = text1.length();
        int len2 = text2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];
        for(int i = 1; i <= len1; i++) {
            for(int j = 1; j <= len2; j++) {
                if(text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        return dp[len1][len2];
    }
}
```



### `leetcode 1254 统计封闭岛屿的数目`

```java
class Solution {
    public int closedIsland(int[][] grid) {
        if(grid == null || grid.length == 0) {
            return 0;
        }

        int res = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 0 && !dfs(grid, i, j)) {
                    res++;
                }
            }
        }
        return res;
    }
	
    /**
    * @return true	搜索到边界位置
    */
    private boolean dfs(int[][] grid, int row, int col) {
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length) {
            return true;
        } else if(grid[row][col] != 0) {
            return false;
        }

        grid[row][col] = 2;
        boolean up = dfs(grid, row - 1, col);
        boolean left = dfs(grid, row, col - 1);
        boolean down = dfs(grid, row + 1, col);
        boolean right = dfs(grid, row, col + 1);
        return up || left || down || right;
    }
}
```



### `leetcode 1299 将每个元素替换为右侧最大元素`

```java
class Solution {
    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        int curMax = arr[len - 1];
        arr[len - 1] = -1;
        for(int i = len - 2; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = curMax;
            curMax = Math.max(curMax, temp);
        }
        return arr;
    }
}
```

------

### `leetcode 1325 删除给定值的叶子节点`

```java
class Solution {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if(root == null) {
            return null;
        }

        root.left = removeLeafNodes(root.left, target);
        root.right = removeLeafNodes(root.right, target);
        if(root.left == null && root.right == null && root.val == target) {
            return null;
        }
        return root;
    }
}
```



## 剑指offer

### `04 二维数组中的查找`

```java
class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) {
            return false;
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0;
        int right = n - 1;
        while(top < m && right >= 0) {
            if(matrix[top][right] == target) {
                return true;
            } else if(matrix[top][right] < target) {
                top++;
            } else {
                right--;
            }
        }
        return false;
    }
}
```



### `09 用两个栈实现队列`

```java
class CQueue {
    private Deque<Integer> stack1;
    private Deque<Integer> stack2;

    public CQueue() {
        this.stack1 = new LinkedList<>();
        this.stack2 = new LinkedList<>();
    }
    
    public void appendTail(int value) {
        stack1.push(value);
    }
    
    public int deleteHead() {
        if(!stack2.isEmpty()) {
            return stack2.pop();
        } else if(!stack1.isEmpty()) {
            while(!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
        return -1;
    }
}
```

----

### `l0-II 青蛙跳台阶问题`

```java
class Solution {
    public int numWays(int n) {
        if(n == 0) {
            return 1;
        } else if(n <= 2) {
            return n;
        }

        int stepsMinusOne = 2;
        int stepsMinusTwo = 1;
        int nSteps = 0;
        for(int i = 3; i <= n; i++) {
            nSteps = (stepsMinusOne + stepsMinusTwo) % 1000000007;
            stepsMinusTwo = stepsMinusOne;
            stepsMinusOne = nSteps;
        }
        return nSteps;
    }
}
```



### `12 矩阵中的路径`

```java
/**
* 回溯
 */
class Solution {
    private boolean[][] visited;
    private char[][] board;
    private String word;

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        this.visited = new boolean[m][n];
        this.board = board;
        this.word = word;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == word.charAt(0) && backTracking(i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }   

    private boolean backTracking(int row, int col, int pathLen) {
        if(pathLen == word.length()) {
            return true;
        } else if(row < 0 || row >= board.length || col < 0 || col >= board[0].length
                || board[row][col] != word.charAt(pathLen) || visited[row][col]) {
            return false;
        }

        visited[row][col] = true;
        pathLen++;
        boolean hasPath = backTracking(row - 1, col, pathLen)
                        || backTracking(row, col - 1, pathLen)
                        || backTracking(row + 1, col, pathLen)
                        || backTracking(row, col + 1, pathLen);
        pathLen--;
        visited[row][col] = false;
        return hasPath;
    }
}
```

-----

### `21 调整数组顺序使奇数位于偶数前面`

```java
class Solution {
    public int[] exchange(int[] nums) {
        int mark = -1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 != 0) {
                mark++;
                swap(nums, mark, i);
            }
        }
        return nums;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
```



### `24 反转链表`

```java
class Solution {
    public ListNode reverseList(ListNode head) {
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
}
```

### `25 合并两个排序的链表`

```java
/**
* 双指针
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(Integer.MIN_VALUE);
        ListNode runner = dummyHead;
        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                runner.next = l1;
                l1 = l1.next;
            } else {
                runner.next = l2;
                l2 = l2.next;
            }
            runner = runner.next;
        }
        if(l1 != null) {
            runner.next = l1;
        } else if(l2 != null) {
            runner.next = l2;
        }
        return dummyHead.next;
    }
}
```



### `26 树的子结构`

```java
class Solution {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return (A != null && B != null)
            && (checkForMatch(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B));
    }

    private boolean checkForMatch(TreeNode A, TreeNode B) {
        if(B == null) {
            return true;
        } else if(A == null || A.val != B.val) {
            return false;
        }

        return checkForMatch(A.left, B.left) && checkForMatch(A.right, B.right);
    }
}
```

-----

### `29 顺时针打印矩阵`

```java
class Solution {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) {
            return new int[0];
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = m - 1;
        int[] res = new int[m*n];
        int index = 0;

        while(true) {
            // left to right
            for(int i = left; i <= right; i++) {
                res[index] = matrix[top][i];
                index++;
            }
            top++;
            if(top > bottom) {
                break;
            }

            // top to bottom
            for(int i = top; i <= bottom; i++) {
                res[index] = matrix[i][right];
                index++;
            }
            right--;
            if(right < left) {
                break;
            }

            // right to left
            for(int i = right; i >= left; i--) {
                res[index] = matrix[bottom][i];
                index++;
            }
            bottom--;
            if(bottom < top) {
                break;
            }

            // bottom to top
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

### `32 - I 从上到下打印二叉树`

```java
/**
* BFS
 */
class Solution {
    public int[] levelOrder(TreeNode root) {
        if(root == null) {
            return new int[0];
        }

        int[] res = new int[10000];
        int index = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            res[index] = node.val;
            index++;

            if(node.left != null) {
                queue.offer(node.left);
            }
            if(node.right != null) {
                queue.offer(node.right);
            }
        }
        return Arrays.copyOf(res, index);
    }
}
```

------

### `32 - III 从上到下打印二叉树 III`

```java
/**
* BFS
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if(root == null) {
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean toggle = false;
        while(!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> runner = new LinkedList<>();
            while(levelSize > 0) {
                TreeNode node = queue.poll();
                levelSize--;
                if(!toggle) {
                    runner.add(node.val);
                } else {
                    runner.add(0, node.val);
                }

                if(node.left != null) {
                    queue.offer(node.left);
                }
                if(node.right != null) {
                    queue.offer(node.right);
                }
            }
            toggle = !toggle;
            res.add(runner);
        }
        return res;
    }
}
```



### `33 二叉搜索树的后序遍历序列`

```java
class Solution {
    public boolean verifyPostorder(int[] postorder) {
        return recursion(postorder, 0, postorder.length - 1);
    }
    
    private boolean recursion(int[] postorder, int left, int right) {
        if(left >= right) {
            return true;
        }

        int rootVal = postorder[right];
        int cur = left;
        while(cur < right && postorder[cur] < rootVal) {
            cur++;
        }
        for(int i = cur; i < right; i++) {
            if(postorder[i] < rootVal) {
                return false;
            }
        }

        return recursion(postorder, left, cur - 1) && recursion(postorder, cur, right - 1);
    }
}
```

----

### `38 字符串的排列`

```java
class Solution {
    private List<String> res;

    public String[] permutation(String s) {
        if(s == null || s.length() == 0) {
            return new String[0];
        }

        this.res = new LinkedList<>();
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        backTracking(charArr, new boolean[charArr.length], new StringBuffer());
        return res.toArray(new String[res.size()]);
    }

    private void backTracking(char[] charArr, boolean[] visited, StringBuffer runner) {
        if(runner.length() == charArr.length) {
            res.add(runner.toString());
            return;
        }

        for(int i = 0; i < charArr.length; i++) {
            if(visited[i] || (i > 0 && charArr[i] == charArr[i-1] && !visited[i-1])) {
                continue;
            }

            runner.append(charArr[i]);
            visited[i] = true;
            backTracking(charArr, visited, runner);
            visited[i] = false;
            runner.deleteCharAt(runner.length() - 1);
        }
    }
}
```

-----

### `42 连续子数组的最大和`

```java
class Solution {
    public int maxSubArray(int[] nums) {
        int res = Integer.MIN_VALUE;
        int cur = Integer.MIN_VALUE;
        for(int num : nums) {
            if(cur <= 0) {
                cur = num;
            } else {
                cur += num;
            }
            res = Math.max(res, cur);
        }
        return res;
    }
}
```

-----

### `45 把数组排成最小的数`

```java
class Solution {
    public String minNumber(int[] nums) {
        int len = nums.length;
        String[] numInStr = new String[len];
        for(int i = 0; i < len; i++) {
            numInStr[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(numInStr, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String s1 = a + b;
                String s2 = b + a;
                return s1.compareTo(s2);
            }
        });
        StringBuffer res = new StringBuffer();
        for(String str : numInStr) {
            res.append(str);
        }
        return res.toString();
    }
}
```



### `46 把数字翻译成字符串`

```java
class Solution {
    public int translateNum(int num) {
        String numInStr = String.valueOf(num);
        int len = numInStr.length();
        int[] dp = new int[len + 1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= len; i++) {
            String runner = numInStr.substring(i-2, i);
            if(runner.compareTo("10") >= 0 && runner.compareTo("25") <= 0) {
                dp[i] = dp[i-1] + dp[i-2];
            } else {
                dp[i] = dp[i-1];
            }
        }
        return dp[len];
    }
}
```

----

### `48 最长不含重复字符的子字符串`

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        
        Map<Character, Integer> window = new HashMap<>();
        int left = 0;
        int right = 0;
        int maxLen = Integer.MIN_VALUE;
        while(right < s.length()) {
            char c1 = s.charAt(right);
            window.put(c1, window.getOrDefault(c1, 0) + 1);
            while(window.get(c1) > 1) {
                char c2 = s.charAt(left);
                window.put(c2, window.get(c2) - 1);
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }
}
```



### `51 数组中的逆序对`

```java
class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        int left = 0;
        int right = len - 1;
        int index = len - 1;
        while(left <= right) {
            if(nums[left] + nums[right] < 0) {
                res[index] = nums[left] * nums[left];
                left++;
            } else {
                res[index] = nums[right] * nums[right];
                right--;
            }
            index--;
        }
        return res;
    }
}
```

----

### `52 两个链表的第一个公共节点`

```java
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode shortL = headA;
        ListNode longL = headB;
        int lenS = 0;
        int lenL = 0;
        while(shortL != null) {
            lenS++;
            shortL = shortL.next;
        }
        while(longL != null) {
            lenL++;
            longL = longL.next;
        }

        int diff = lenL - lenS;
        shortL = headA;
        longL = headB;
        if(diff < 0) {
            shortL = headB;
            longL = headA;
            diff = Math.abs(diff);
        }

        for(int i = 0; i < diff; i++) {
            longL = longL.next;
        }
        while(shortL != null && longL != null) {
            if(shortL == longL) {
                return shortL;
            }
            shortL = shortL.next;
            longL = longL.next;
        }
        return null;
    }
}
```



### `53-II 0 ~ n - 1中缺失的数字`

```java
class Solution {
    public int missingNumber(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
```

----

### `64 求1 + 2 + ... + n`

```java
class Solution {
    public int sumNums(int n) {
        boolean x = (n > 1) && (n += sumNums(n - 1)) > 0;
        return n;
    }
}
```



### `67 把字符串转换成整数`

```java
class Solution {
    public int strToInt(String str) {
        if(str == null || str.length() == 0) {
            return 0;
        }

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        int res = 0;
        int index = 0;
        int len = str.length();

        // 
        while(index < len && str.charAt(index) == ' ') {
            index++;
        }
        if(index == len) {
            return 0;
        }

        // 
        char signChar = str.charAt(index);
        boolean positive = true;
        if(!Character.isDigit(signChar)) {
            if(signChar != '+' && signChar != '-') {
                return 0;
            }
            positive = (signChar == '+');
            index++;
        }

        // 
        int limit = positive? (-max) : min;
        while(index < len && str.charAt(index) == '0') {
            index++;
        }
        if(index == len) {
            return 0;
        }

        // 
        while(index < len && Character.isDigit(str.charAt(index))) {
            int digit = str.charAt(index) - '0';
            index++;
            if(res < (limit + digit) / 10) {
                return positive? max : min;
            }
            res = res * 10 - digit;
        }
        return positive? (-res) : res; 
    }
}
```



## 程序员面试金典

### `面试题 08.12 八皇后`

```java
class Solution {
    private List<List<String>> res;

    public List<List<String>> solveNQueens(int n) {
        this.res = new LinkedList<>();
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
            return;
        }

        for(int i = 0; i < board.length; i++) {
            if(!isValid(board, row, i)) {
                continue;
            }

            board[row][i] = 'Q';
            backTracking(board, row + 1);
            board[row][i] = '.';
        }
    }

    private boolean isValid(char[][] board, int row, int col) {
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        for(int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        for(int i = row - 1; i >= 0; i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }
        return true;
    }
}
```

----

### `面试题 10.01 合并排序的数组`

```java
class Solution {
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
}
```

