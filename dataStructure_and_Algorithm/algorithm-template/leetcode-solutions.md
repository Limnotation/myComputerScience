## `leetcode` 题解笔记

### `leetcode 1 两数之和`

```go
func twoSum(nums []int, target int) []int {
    valToIndex := map[int]int{}
    for i, num := range nums {
        if val, ok := valToIndex[target - num]; ok {
            return []int{i, val}
        }
        valToIndex[num] = i
    }
    return []int{-1, -1}
}
```

----

### `leetcode 2 两数相加`

```go
func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
    dummyHead := &ListNode{}
    runner := dummyHead
    carry := 0
    for l1 != nil || l2 != nil || carry > 0 {
        temp := carry
        if l1 != nil {
            temp += l1.Val
            l1 = l1.Next
        }
        if l2 != nil {
            temp += l2.Val
            l2 = l2.Next
        }
        runner.Next = &ListNode{Val: temp % 10}
        runner = runner.Next
        carry = temp / 10
    }
    return dummyHead.Next
}
```

------

### `leetcode 3 无重复字符的最长子串`

```go
func lengthOfLongestSubstring(s string) int {
    length := len(s)
    if length < 2 {
        return length
    }

    maxLen := 1
    left := 0
    right := 0
    window := map[byte]int{}
    for right < length {
        c1 := s[right]
        window[c1]++
        for window[c1] > 1 {
            c2 := s[left]
            window[c2]--
            left++
        }
        if right - left + 1 > maxLen {
            maxLen = right - left + 1
        }
        right++
    }
    return maxLen
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

-----

### `leetcode 5 最长回文子串`

```go
func longestPalindrome(s string) string {
    length := len(s)
    dp := make([][]bool, length)
    for i := 0; i < length; i++ {
        dp[i] = make([]bool, length)
    }
    start := 0
    maxLen := 1

    for i := 0; i < length; i++ {
        dp[i][i] = true
    }

    for i := length - 2; i >= 0; i-- {
        for j := i + 1; j < length; j++ {
            if s[i] == s[j] {
                if j - i < 3 || dp[i+1][j-1] {
                    dp[i][j] = true
                } else {
                    dp[i][j] = dp[i+1][j-1]
                }
            } else {
                dp[i][j] = false
            }

            if dp[i][j] && j - i + 1 > maxLen {
                maxLen = j - i + 1
                start = i
            }
        }
    }

    return s[start : start + maxLen]
}
```

------

### `leetcode 6 Z字形变换`

```go
func convert(s string, numRows int) string {
    if numRows < 2 {
        return s 
    }

    res := make([]string, numRows)
    cycle := 2 * numRows - 2
    for i, c := range s {
        x := i % cycle
        res[min(x, cycle - x)] += string(c)
    }
    return strings.Join(res, "")
}

func min(a, b int) int {
    if a < b {
        return a 
    }
    return b 
}
```

[参考答案](https://leetcode-cn.com/problems/zigzag-conversion/submissions/)

------

### `leetcode 7 整数反转`

```go
func reverse(x int) int {
    res := 0
    for x != 0 {
        pop := x % 10
        x /= 10
        res = res * 10 + pop
        if res < math.MinInt32 || res > math.MaxInt32 {
            return 0
        }
    }
    return res
}
```

[参考答案](https://leetcode-cn.com/problems/reverse-integer/solution/7zheng-shu-fan-zhuan-by-laoji182518-2/)

----

### `leetcode 8 字符串转换整数`

```go
func myAtoi(s string) int {
    if len(s) <= 0 {
        return 0
    }

    min := math.MinInt32
    max := math.MaxInt32
    res := 0
    index := 0
    length := len(s)

    // 1、清除前缀空格
    for index < length && s[index] == ' ' {
        index++
    }
    if index == length {
        return 0
    }

    // 2、确定符号
    positive := true
    signChar := s[index]
    if !isNumber(signChar) {
        if signChar != '+' && signChar != '-' {
            return 0
        }
        positive = (signChar == '+')
        index++
    }

    // 3、解析字符
    for ; index < length && isNumber(s[index]); index++ {
        res = res * 10 + int(s[index] - '0')
        if res > max {
            if positive {
                return max 
            } else {
                return min
            }
        }
    }
    if positive {
        return res 
    }
    return -res
}

func isNumber(c byte) bool {
    return c >= '0' && c <= '9'
}
```

-----

### `leetcode 9 回文数`

```go
func isPalindrome(x int) bool {
    if x < 0 || (x % 10 == 0 && x > 0) {
        return false 
    }

    half := 0
    for x > half {
        half = half * 10 + x % 10
        x /= 10
    }
    return x == half || x == half / 10
}
```

---

### `leetcode 11 盛最多水的容器`

```go
func maxArea(height []int) int {
    if len(height) < 2 {
        return 0
    }

    res := 0
    left := 0
    right := len(height) - 1
    for left < right {
        res = max(res, (right - left) * min(height[left], height[right]))
        if height[left] < height[right] {
            left++
        } else {
            right--
        }
    }
    return res
}

func min(a, b int) int {
    if a < b {
        return a 
    }
    return b 
}

func max(a, b int) int {
    if a < b {
        return b
    }
    return a 
}
```

----

### `leetcode 12 整数转罗马数字`

```go
func intToRoman(num int) string {
    roman := []string{"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"}
    nums := []int{1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000}
    res := ""
    for i := len(nums) - 1; i >= 0 && num != 0; i-- {
        if num < nums[i] {
            continue 
        }
        repeat := num / nums[i]
        res += strings.Repeat(roman[i], repeat)
        num -= repeat * nums[i]
    }
    return res
}
```

-----

### `leetcode 13 罗马数字转整数`

```go
func romanToInt(s string) int {
    valMap := map[byte]int {
        'I': 1,
        'V': 5,
        'X': 10,
        'L': 50,
        'C': 100,
        'D': 500,
        'M': 1000,
    }

    preVal := valMap[s[0]]
    sum := 0
    for i := 1; i < len(s); i++ {
        curVal := valMap[s[i]]
        if curVal <= preVal {
            sum += preVal
        } else {
            sum -= preVal
        }
        preVal = curVal
    }
    sum += preVal
    return sum
}
```



### `leetcode 14 最长公共前缀`

```go
func longestCommonPrefix(strs []string) string {
    if len(strs) <= 0 {
        return ""
    }
    
    res := strs[0]
    for _, s := range strs {
        index := 0
        for index < len(s) && index < len(res) && s[index] == res[index] {
            index++
        }
        res = res[:index]
    }
    return res
}
```

------

### `leetcode 15 三数之和`

```go
func threeSum(nums []int) [][]int {
    length := len(nums)
    if length < 3 {
        return make([][]int, 0)
    }

    sort.Ints(nums)
    res := make([][]int, 0)
    for i := 0; i < length - 2; i++ {
        if i > 0 && nums[i] == nums[i-1] {
            continue
        } else if nums[i] > 0 {
            break
        }

        j := i + 1
        k := length - 1
        for j < k {
            curVal := nums[i] + nums[j] + nums[k]
            if curVal == 0 {
                res = append(res, []int{nums[i], nums[j], nums[k]})
                for j < k && nums[j] == nums[j+1] {
                    j++
                }
                for j < k && nums[k] == nums[k-1] {
                    k--
                }
                j++
                k--
            } else if curVal < 0 {
                j++
            } else {
                k--
            }
        }
    }
    return res
}
```

-----

### `leetcode 16 最接近的三数之和`

```go
func threeSumClosest(nums []int, target int) int {
    sort.Ints(nums)
    length := len(nums)
    res := nums[0] + nums[1] + nums[length - 1]
    for i := 0; i < length - 2; i++ {
        j := i + 1
        k := length - 1
        for j < k {
            cur := nums[i] + nums[j] + nums[k]
            if abs(cur - target) < abs(res - target) {
                res = cur
            }
            if cur < target {
                j++
            } else {
                k--
            }
        }
    }
    return res
}

func abs(a int) int {
    if a < 0 {
        return -a
    }
    return a 
}
```

-----

### `leetcode 17 电话号码的字母组合`

```go
func letterCombinations(digits string) []string {
    if len(digits) <= 0 {
        return []string{}
    }
    
    valMap := map[byte]string {
        '2': "abc",
        '3': "def",
        '4': "ghi",
        '5': "jkl",
        '6': "mno",
        '7': "pqrs",
        '8': "tuv",
        '9': "wxyz",
    }

    res := []string{}
    var backTracking func(digits string, start int, path string) 
    backTracking = func(digits string, start int, path string) {
        if start == len(digits) {
            res = append(res, path)
            return 
        }

        for _, c := range valMap[digits[start]] {
            path += string(c)
            backTracking(digits, start + 1, path)
            path = path[:len(path) - 1]
        }
    }
    backTracking(digits, 0, "")
    return res
}
```

-----

### `leetcode 18 四数之和`

```go
func fourSum(nums []int, target int) [][]int {
    res := [][]int{}
    if len(nums) < 4 {
        return res 
    }

    sort.Ints(nums)
    length := len(nums)
    for i := 0; i < length - 3; i++ {
        if i > 0 && nums[i] == nums[i-1] {
            continue 
        }
        for j := i + 1; j < length - 2; j++ {
            if j > i + 1 && nums[j] == nums[j-1] {
                continue
            }
            k := j + 1
            l := length - 1
            for k < l {
                cur := nums[i] + nums[j] + nums[k] + nums[l]
                if cur == target {
                    res = append(res, []int{nums[i], nums[j], nums[k], nums[l]})
                    for k < l && nums[k] == nums[k+1] {k++}
                    for k < l && nums[l] == nums[l-1] {l--}
                    k++
                    l--
                } else if cur < target {
                    k++
                } else {
                    l--
                }
            }
        }
    }
    return res
}
```



### `leetcode 19 删除链表的倒数第N个节点`

```go
func removeNthFromEnd(head *ListNode, n int) *ListNode {
    dummyHead := &ListNode{0, nil}
    dummyHead.Next = head

    slow := dummyHead
    fast := dummyHead
    for i := 0; i < n; i++ {
        fast = fast.Next
    }
    for fast != nil && fast.Next != nil {
        slow = slow.Next
        fast = fast.Next
    }
    slow.Next = slow.Next.Next
    return dummyHead.Next
}
```

----

### `leetcode 20 有效的括号`

```go
func isValid(s string) bool {
    if len(s) < 2 {
        return false
    }

    stack := []byte{}
    for i := 0; i < len(s); i++ {
        c1 := s[i]
        if c1 == '(' || c1 == '[' || c1 == '{' {
            stack = append(stack, c1)
        } else {
            if len(stack) == 0 {
                return false 
            } else {
                c2 := stack[len(stack) - 1]
                stack = stack[:len(stack) - 1]
                if c1 == ')' && c2 != '(' {
                    return false
                } else if c1 == ']' && c2 != '[' {
                    return false
                } else if c1 == '}' && c2 != '{' {
                    return false
                }
            }
        }
    }
    return len(stack) == 0
}
```

-----

### `leetcode 21 合并两个有序链表`

```go
func mergeTwoLists(l1 *ListNode, l2 *ListNode) *ListNode {
    dummy := &ListNode{Val: 0, Next: nil}
    runner := dummy
    for l1 != nil && l2 != nil {
        if(l1.Val < l2.Val) {
            runner.Next = l1
            l1 = l1.Next
        } else {
            runner.Next = l2
            l2 = l2.Next
        }
        runner = runner.Next
    }

    if l1 != nil {
        runner.Next = l1
    } else if l2 != nil {
        runner.Next = l2
    }
    return dummy.Next
}
```

------

### `leetcode 22 括号生成`

```go
func generateParenthesis(n int) []string {
    if n <= 0 {
        return []string{}
    }

    res := []string{}
    var backTracking func(left, right int, runner string) 
    backTracking = func(left, right int, runner string) {
        if left < 0 || right < 0 || left > right {
            return 
        } else if left == 0 && right == 0 {
            res = append(res, runner)
        }

        runner += "("
        backTracking(left - 1, right, runner)
        runner = runner[:len(runner) - 1]

        runner += ")"
        backTracking(left, right - 1, runner)
        runner = runner[:len(runner) - 1]
    }
    backTracking(n, n, "")
    return res
}
```

----

### `leetcode 23 合并K个升序链表`

```go
// 暴力解法，复杂度为O(n^2)
func mergeKLists(lists []*ListNode) *ListNode {
    if len(lists) == 0 {
        return nil 
    }

    res := lists[0]
    for i := 1; i < len(lists); i++ {
        res = mergeSortedLists(res, lists[i])
    }
    return res
}

func mergeSortedLists(l1, l2 *ListNode) *ListNode {
    dummy := &ListNode{0, nil}
    runner := dummy
    for l1 != nil && l2 != nil {
        if l1.Val < l2.Val {
            runner.Next = l1
            l1 = l1.Next
        } else {
            runner.Next = l2
            l2 = l2.Next
        }
        runner = runner.Next
    }
    if l1 != nil {
        runner.Next = l1
    } else if l2 != nil {
        runner.Next = l2
    }
    return dummy.Next
}
```

-----

### `leetcode 24 两两交换链表中的节点`

```java
func swapPairs(head *ListNode) *ListNode {
    if head == nil || head.Next == nil {
        return head 
    }

    newHead := head.Next
    head.Next = swapPairs(newHead.Next)
    newHead.Next = head
    return newHead
}
```

-----

### `leetcode 25 K个一组翻转链表`

```go
func reverseKGroup(head *ListNode, k int) *ListNode {
    next := head
    for i := 0; i < k; i++ {
        if next == nil {
            return head
        }
        next = next.Next
    }

    newHead := reverseList(head, next)
    head.Next = reverseKGroup(next, k)
    return newHead
} 

func reverseList(head *ListNode, edge *ListNode) *ListNode {
    var pre *ListNode
    cur := head
    for cur != edge {
        next := cur.Next
        cur.Next = pre
        pre = cur
        cur = next
    }
    return pre
}
```

-----

### `leetcode 26 删除有序数组中的重复项`

```go
func removeDuplicates(nums []int) int {
    mark := 0
    for i := 1; i < len(nums); i++ {
        if nums[i] != nums[mark] {
            mark++
            nums[mark] = nums[i]
        }
    }
    return mark + 1
}
```

----

### `leetcode 27 移除元素`

```go
func removeElement(nums []int, val int) int {
    mark := -1
    for _, num := range nums {
        if num != val {
            mark++
            nums[mark] = num 
        }
    }
    return mark + 1
}
```

------



### `leetcode 31 下一个排列`

```go
func nextPermutation(nums []int)  {
    length := len(nums)
    i := length - 2
    j := length - 1
    k := length - 1

    for i >= 0 && nums[i] >= nums[j] {
        i--
        j--
    }
    if i >= 0 {
        for nums[i] >= nums[k] {
            k--
        }
        swap(nums, i, k)
    }

    for i, j = j, length - 1; i < j; i, j = i + 1, j - 1 {
        swap(nums, i, j)
    }
}

func swap(nums []int, i, j int) {
    nums[i], nums[j] = nums[j], nums[i] 
}
```

-----

### `leetcode 32 最长有效括号`

```go
func longestValidParentheses(s string) int {
    if len(s) < 2 {
        return 0
    }

    res := 0
    stack := []int{-1}
    for i := 0; i < len(s); i++ {
        if s[i] == '(' {
            stack = append(stack, i)
        } else {
            stack = stack[:len(stack) - 1]
            if len(stack) == 0 {
                stack = append(stack, i)
            } else {
                res = max(res, i - stack[len(stack) - 1])
            }
        }
    }
    return res
}

func max(a, b int) int {
    if a < b {
        return b
    }
    return a 
}
```

----

### `leetcode 33 搜索旋转排序数组`

```go
func search(nums []int, target int) int {
    left := 0
    right := len(nums) - 1
    for left <= right {
        mid := left + (right - left) / 2
        if nums[mid] == target {
            return mid 
        } else if nums[left] <= nums[mid] {
            if nums[left] <= target && target < nums[mid] {
                right = mid - 1
            } else {
                left = mid + 1
            }
        } else {
            if nums[mid] < target && target <= nums[right] {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }
    }
    return -1
}
```

------

### `leetcode 34 在排序数组中查找元素的第一个和最后一个位置`

```go
func searchRange(nums []int, target int) []int {
    left := leftBound(nums, target)
    right := rightBound(nums, target)
    return []int{left, right}
}

func leftBound(nums []int, target int) int {
    left := 0
    right := len(nums)
    for left < right {
        mid := left + (right - left) / 2
        if nums[mid] < target {
            left = mid + 1
        } else {
            right = mid 
        }
    }

    if left == len(nums) || nums[left] != target {
        return -1
    }
    return left
}

func rightBound(nums []int, target int) int {
    left := 0
    right := len(nums)
    for left < right {
        mid := left + (right - left) / 2
        if nums[mid] <= target {
            left = mid + 1
        } else {
            right = mid 
        }
    }

    if left == 0 || nums[left - 1] != target {
        return -1
    }
    return left - 1
}
```

----

### `leetcode 35 搜索插入位置`

```go
func searchInsert(nums []int, target int) int {
    left := 0
    right := len(nums)
    for left < right {
        mid := left + (right - left) / 2
        if nums[mid] < target {
            left = mid + 1
        } else {
            right = mid 
        }
    }
    return left
}
```

-----



### `leetcode 39 组合总和`

```go
func combinationSum(candidates []int, target int) [][]int {
    res := [][]int{}
    sort.Ints(candidates)

    var backTracking func(target int, start int, runner []int) 
    backTracking = func(target int, start int, runner []int) {
        if target == 0 {
            temp := make([]int, len(runner))
            copy(temp, runner)
            res = append(res, temp)
            return 
        }

        for i := start; i < len(candidates); i++ {
            if target < candidates[i] {
                break 
            }
            runner = append(runner, candidates[i])
            backTracking(target - candidates[i], i, runner)
            runner = runner[:len(runner) - 1]
        }
    }

    backTracking(target, 0, []int{})
    return res
}
```

----

### `leetcode 40 组合总和 II`

```go
func combinationSum2(candidates []int, target int) [][]int {
    res := [][]int{}
    sort.Ints(candidates)

    var backTracking func(target int, start int, runner []int) 
    backTracking = func(target int, start int, runner []int) {
        if target == 0 {
            temp := make([]int, len(runner))
            copy(temp, runner)
            res = append(res, temp)
            return 
        }

        for i := start; i < len(candidates); i++ {
            if target < candidates[i] {
                break 
            } else if  (i > start && candidates[i] == candidates[i-1]) {
                continue 
            }

            runner = append(runner, candidates[i])
            backTracking(target - candidates[i], i + 1, runner)
            runner = runner[:len(runner) - 1]
        }
    }
    backTracking(target, 0, []int{})

    return res
}
```

-----

### `leetcode 41 缺失的第一个正数`

```go
func firstMissingPositive(nums []int) int {
    for i := 0; i < len(nums); i++ {
        for nums[i] > 0 && nums[i] <= len(nums) && nums[i] != nums[nums[i]-1] {
            nums[i], nums[nums[i]-1] = nums[nums[i]-1], nums[i]
        }
    }

    for i := 0; i < len(nums); i++ {
        if nums[i] != i + 1 {
            return i + 1
        }
    }
    return len(nums) + 1
}
```

------

### `leetcode 42 接雨水`

```go
func trap(height []int) int {
    stack := []int{}
    res := 0
    for i, h := range height {
        for len(stack) > 0 && h > height[stack[len(stack)-1]] {
            curHeight := height[stack[len(stack)-1]]
            stack = stack[:len(stack)-1]
            for len(stack) > 0 && curHeight == height[stack[len(stack)-1]] {
                stack = stack[:len(stack)-1]
            }
            if len(stack) > 0 {
                temp := len(stack) - 1
                res += (min(h, height[stack[temp]]) - curHeight) * (i - stack[temp] - 1)
            }
        }
        stack = append(stack, i)
    }
    return res 
}

func min(a, b int) int {
    if a < b {
        return a
    }
    return b
}
```

------

### `leetcode 46 全排列`

```go
func permute(nums []int) [][]int {
    visited := make([]bool, len(nums))
    res := [][]int{}

    var backTracking func(path []int)
    backTracking = func(path []int) {
        if len(path) == len(nums) {
            temp := make([]int, len(path))
            copy(temp, path)
            res = append(res, temp)
            return
        }

        for i, num := range nums {
            if visited[i] {
                continue 
            }

            path = append(path, num)
            visited[i] = true
            backTracking(path)
            visited[i] = false
            path = path[:len(path) - 1]
        }
    }

    backTracking([]int{})
    return res
}
```

------

### `leetcode 47 全排列 II`

```go
func permuteUnique(nums []int) [][]int {
    res := [][]int{}
    sort.Ints(nums)
    
    var backTracking func(nums []int, visited []bool, runner []int) 
    backTracking = func(nums []int, visited []bool, runner []int) {
        if len(nums) == len(runner) {
            temp := make([]int, len(runner))
            copy(temp, runner)
            res = append(res, temp)
            return 
        }

        for i := 0; i < len(nums); i++ {
            if visited[i] || (i > 0 && nums[i] == nums[i-1] && !visited[i-1]){
                continue 
            }

            runner = append(runner, nums[i])
            visited[i] = true 
            backTracking(nums, visited, runner)
            visited[i] = false
            runner = runner[:len(runner) - 1]
        }
    }
    backTracking(nums, make([]bool, len(nums)), []int{})
    return res
}
```

----

### `leetcode 48 旋转图像`

```go
func rotate(matrix [][]int)  {
    n := len(matrix)
    top := 0
    bottom := n - 1
    for top < bottom {
        rotateEdge(matrix, top, bottom)
        top++
        bottom--
    }
}

func rotateEdge(matrix [][] int, top, bottom int) {
    time := bottom - top
    for i := 0; i < time; i++ {
        temp := matrix[top][top+i]
        matrix[top][top+i] = matrix[bottom-i][top]
        matrix[bottom-i][top] = matrix[bottom][bottom-i]
        matrix[bottom][bottom-i] = matrix[top+i][bottom]
        matrix[top+i][bottom] = temp
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

```go
func maxSubArray(nums []int) int {
    res := nums[0]
    cur := nums[0]
    for i := 1; i < len(nums); i++ {
        if cur <= 0 {
            cur = nums[i]
        } else {
            cur += nums[i]
        }

        if cur > res {
            res = cur
        }
    }
    return res
}
```

-----

### `leetcode 54 螺旋矩阵`

```go
func spiralOrder(matrix [][]int) []int {
    res := []int{}
    m := len(matrix)
    n := len(matrix[0])
    top := 0
    right := n - 1
    bottom := m - 1
    left := 0

    for {
        for i := left; i <= right; i++ {
            res = append(res, matrix[top][i])
        }
        top++
        if top > bottom {
            break
        }

        for i := top; i <= bottom; i++ {
            res = append(res, matrix[i][right])
        }
        right--
        if right < left {
            break
        }

        for i := right; i >= left; i-- {
            res = append(res, matrix[bottom][i])
        }
        bottom--
        if bottom < top {
            break
        }

        for i := bottom; i >= top; i-- {
            res = append(res, matrix[i][left])
        }
        left++
        if left > right {
            break
        }
    }
    return res
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

```go
func climbStairs(n int) int {
    if n <= 2 {
        return n
    }

    stepsMinusOne := 2
    stepsMinusTwo := 1
    nSteps := 0
    for i := 3; i <= n; i++ {
        nSteps = stepsMinusOne + stepsMinusTwo
        stepsMinusTwo = stepsMinusOne
        stepsMinusOne = nSteps
    }
    return nSteps
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

### `leetcode 74 搜索二维矩阵`

```go
func searchMatrix(matrix [][]int, target int) bool {
    m := len(matrix)
    n := len(matrix[0])
    left := 0
    right := m * n - 1
    for left <= right {
        mid := left + (right - left) / 2
        cur := matrix[mid/n][mid%n]
        if cur == target {
            return true
        } else if cur < target {
            left = mid + 1
        } else {
            right = mid - 1
        }
    }
    return false
}
```



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

```go
func minWindow(s string, t string) string {
    need := make(map[byte]int)
    for i := 0; i < len(t); i++ {
        need[t[i]]++
    }

    window := make(map[byte]int)
    left := 0
    right := 0
    start := 0
    minLen := math.MaxInt32
    match := 0
    for right < len(s) {
        c1 := s[right]
        window[c1]++
        if window[c1] == need[c1] {match++}
        for match == len(need) {
            if right - left + 1 < minLen {
                minLen = right - left + 1
                start = left
            }
            c2 := s[left]
            if window[c2] == need[c2] {match--}
            window[c2]--
            left++
        }
        right++
    }
    if minLen == math.MaxInt32 {
        return ""
    }
    return s[start:start + minLen]
}

func min(a, b int) int {
    if a < b {
        return a 
    }
    return b 
}
```

----

### `leetcode 78 子集`

```go
func subsets(nums []int) [][]int {
    res := [][]int{}

    var backTracking func(nums []int, start int, path []int) 
    backTracking = func(nums []int, start int, path []int) {
        temp := make([]int, len(path))
        copy(temp, path)
        res = append(res, temp)

        for i := start; i < len(nums); i++ {
            path = append(path, nums[i])
            backTracking(nums, i + 1, path)
            path = path[:len(path) - 1]
        }
    }

    backTracking(nums, 0, []int{})
    return res
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

### `leetcode 82 删除排序链表中的重复元素II`

```go
func deleteDuplicates(head *ListNode) *ListNode {
    if head == nil || head.Next == nil {
        return head 
    }

    dummy := &ListNode{}
    runner := dummy
    duplicate := false
    for head != nil && head.Next != nil {
        if head.Val == head.Next.Val {
            duplicate = true
        } else {
            if duplicate {
                duplicate = false
            } else {
                runner.Next = &ListNode{Val: head.Val}
                runner = runner.Next
            }
        }
        head = head.Next
    }
    if !duplicate {
        runner.Next = &ListNode{Val: head.Val}
    }
    return dummy.Next
}
```

-----

### `leetcode 83 删除排序链表中的重复元素`

```go
func deleteDuplicates(head *ListNode) *ListNode {
    runner := head
    for runner != nil && runner.Next != nil {
        if runner.Val == runner.Next.Val {
            runner.Next = runner.Next.Next
        } else  {
            runner = runner.Next
        }
    }
    return head
}
```

----

### `leetcode 86 分隔链表`

```go
func partition(head *ListNode, x int) *ListNode {
    less := &ListNode{}
    greOrEqu := &ListNode{}
    runner1 := less
    runner2 := greOrEqu
    for head != nil {
        if head.Val < x {
            runner1.Next = head
            runner1 = runner1.Next
        } else {
            runner2.Next = head 
            runner2 = runner2.Next
        }
        head = head.Next
    }

    runner1.Next = greOrEqu.Next
    runner2.Next = nil
    return less.Next
}
```



### `leetcode 88 合并两个有序数组`

```go
func merge(nums1 []int, m int, nums2 []int, n int)  {
    i := m - 1
    j := n - 1
    for index := m + n - 1; index >= 0; index-- {
        if i < 0 {
            nums1[index] = nums2[j]
            j--
        } else if j < 0 {
            break
        } else {
            if nums1[i] < nums2[j] {
                nums1[index] = nums2[j]
                j--
            } else {
                nums1[index] = nums1[i]
                i--
            }
        }
    }
}
```

----

### `leetcode 91 解码方法`

```go
func numDecodings(s string) int {
    if len(s) == 0 || s[0] == '0' {
        return 0
    }

    pre := 1
    cur := 1
    for i := 1; i < len(s); i++ {
        temp := cur
        if s[i] == '0' {
            if s[i-1] == '1' || s[i-1] == '2' {
                cur = pre 
            } else {
                return 0
            }
        } else if s[i-1] == '1' || (s[i-1] == '2' && s[i] <= '6') {
            cur += pre 
        }
        pre = temp
    }
    return cur
}
```

[参考答案](https://leetcode-cn.com/problems/decode-ways/solution/c-wo-ren-wei-hen-jian-dan-zhi-guan-de-jie-fa-by-pr/)

------



### `leetcode 94 二叉树的中序遍历`

```go
// 递归
func inorderTraversal(root *TreeNode) []int {
    res := []int{}
    var recursion func(root *TreeNode) 
    
    recursion = func(root *TreeNode) {
        if root == nil {
            return 
        }

        recursion(root.Left)
        res = append(res, root.Val)
        recursion(root.Right)
    }

    recursion(root)
    return res
}

// 迭代
func inorderTraversal(root *TreeNode) []int {
    res := []int{}
    stack := []*TreeNode{}
    for len(stack) > 0 || root != nil {
        for root != nil {
            stack = append(stack, root)
            root = root.Left
        }

        node := stack[len(stack) - 1]
        stack = stack[:len(stack) - 1]
        res = append(res, node.Val)
        root = node.Right
    }
    return res
}
```

----

### `leetcode 95 不同的二叉搜索树 II` 

```go
func generateTrees(n int) []*TreeNode {
    if n <= 0 {
        return nil
    }
    return buildTrees(1, n)
}

func buildTrees(start, end int) []*TreeNode {
    if start > end {
        return []*TreeNode{nil} 
    }

    res := []*TreeNode{}
    for i := start; i <= end; i++ {
        lefts := buildTrees(start, i - 1)
        rights := buildTrees(i + 1, end)
        for _, left := range lefts {
            for _, right := range rights {
                root := &TreeNode{Val: i}
                root.Left = left
                root.Right = right
                res = append(res, root)
            }
        }
    }
    return res
}
```

-----

### `leetcode 96 不同的二叉搜索树`

```go
func numTrees(n int) int {
    dp := make([]int, n + 1)
    dp[0] = 1
    dp[1] = 1
    for i := 2; i <= n; i++ {
        for j := 0; j <= i - 1; j++ {
            dp[i] += dp[j] * dp[i-j-1]
        }
    }
    return dp[n]
}
```

----

### `leetcode 98 验证二叉搜索树`

```go
func isValidBST(root *TreeNode) bool {
    return checkForValidity(root, nil, nil)
}

func checkForValidity(root, min, max *TreeNode) bool {
    if root == nil {
        return true 
    } else if min != nil && root.Val <= min.Val {
        return false 
    } else if max != nil && root.Val >= max.Val {
        return false 
    }

    return checkForValidity(root.Left, min, root) && checkForValidity(root.Right, root, max)
}
```

-----

### `leetcode 99 恢复二叉搜索树`

```go
func recoverTree(root *TreeNode)  {
    if root == nil {
        return 
    }

    pre := &TreeNode{Val: math.MinInt32}
    var firstNode *TreeNode
    var secondNode *TreeNode
    stack := []*TreeNode{}
    for len(stack) > 0 || root != nil {
        for root != nil {
            stack = append(stack, root)
            root = root.Left
        }

        node := stack[len(stack) - 1]
        stack = stack[:len(stack) - 1]
        if firstNode == nil && pre.Val > node.Val {
            firstNode = pre
        }
        if firstNode != nil && pre.Val > node.Val {
            secondNode = node 
        }
        pre = node
        root = node.Right
    }
    firstNode.Val, secondNode.Val = secondNode.Val, firstNode.Val
}
```

----

### `leetcode 100 相同的树`

```go
func isSameTree(p *TreeNode, q *TreeNode) bool {
    if p == nil && q == nil {
        return true
    } else if p == nil || q == nil || p.Val != q.Val {
        return false
    }

    return isSameTree(p.Left, q.Left) && isSameTree(p.Right, q.Right)
}
```

-----

### `leetcode 101 对称二叉树`

```go
func isSymmetric(root *TreeNode) bool {
    return checkSymmetry(root, root)
}

func checkSymmetry(t1, t2 *TreeNode) bool {
    if t1 == nil && t2 == nil {
        return true 
    } else if t1 == nil || t2 == nil || t1.Val != t2.Val {
        return false 
    }

    return checkSymmetry(t1.Left, t2.Right) && checkSymmetry(t1.Right, t2.Left)
}
```

-----

### `leetcode 102 二叉树的层序遍历`

```go
func levelOrder(root *TreeNode) [][]int {
    res := [][]int{}
    if root == nil {
        return res
    }
    
    queue := []*TreeNode{root}
    for len(queue) > 0 {
        levelSize := len(queue)
        nextLevel := []*TreeNode{}
        line := []int{}
        for i := 0; i < levelSize; i++ {
            node := queue[i]
            line = append(line, node.Val)
            if node.Left != nil {
                nextLevel = append(nextLevel, node.Left)
            }
            if node.Right != nil {
                nextLevel = append(nextLevel, node.Right)
            }
        }
        res = append(res, line)
        queue = nextLevel
    }
    return res
}
```

-----

### `leetcode 103 二叉树的锯齿形层序遍历`

```go 
func zigzagLevelOrder(root *TreeNode) [][]int {
    res := [][]int{}
    if root == nil {
        return res 
    }

    queue := []*TreeNode{root}
    toggle := false 
    for len(queue) > 0 {
        levelSize := len(queue)
        line := []int{}
        nextLevel := []*TreeNode{}
        for i := 0; i < levelSize; i++ {
            node := queue[i]
            line = append(line, node.Val)
            if node.Left != nil {
                nextLevel = append(nextLevel, node.Left)
            }
            if node.Right != nil {
                nextLevel = append(nextLevel, node.Right)
            }
        }

        if toggle {
            reverse(line)
        }
        toggle = !toggle
        res = append(res, line)
        queue = nextLevel
    }
    return res
}

func reverse(nums []int) {
    for i, j := 0, len(nums) - 1; i < j; i, j = i+1, j-1 {
        nums[i], nums[j] = nums[j], nums[i]
    }
}
```

----

### `leetcode 104 二叉树的最大深度`

```go
func maxDepth(root *TreeNode) int {
    if root == nil {
        return 0
    }

    return 1 + max(maxDepth(root.Left), maxDepth(root.Right))
}

func max(a, b int) int {
    if a < b {
        return b
    }
    return a 
}
```

------

### `leetcode 105 从前序与中序遍历序列构造二叉树`

```go
func buildTree(preorder []int, inorder []int) *TreeNode {
    preLen := len(preorder)
    inLen := len(inorder)
    if preLen <= 0 || inLen <= 0 || inLen != preLen {
        return nil 
    }

    valToIndex := map[int]int{}
    for i := 0; i < inLen; i++ {
        valToIndex[inorder[i]] = i 
    }

    var reconstruct func(preLeft, preRight, inLeft, inRight int) *TreeNode 
    reconstruct = func(preLeft, preRight, inLeft, inRight int) *TreeNode {
        if preLeft > preRight || inLeft > inRight {
            return nil 
        }

        rootVal := preorder[preLeft]
        rootIndex := valToIndex[rootVal]
        root := &TreeNode{Val: rootVal}
        root.Left = reconstruct(preLeft + 1, preLeft + rootIndex - inLeft, inLeft, rootIndex - 1)
        root.Right = reconstruct(preLeft + rootIndex - inLeft + 1, preRight, rootIndex + 1, inRight)
        return root 
    }
    
    return reconstruct(0, preLen - 1, 0, inLen - 1)
}
```

-------

### `leetcode 106 从中序与后序遍历序列构造二叉树`

```go
func buildTree(inorder []int, postorder []int) *TreeNode {
    inLen := len(inorder)
    postLen := len(postorder)
    if inLen <= 0 || postLen <= 0 || inLen != postLen {
        return nil
    }

    valToIndex := map[int]int{}
    for i := 0; i < inLen; i++ {
        valToIndex[inorder[i]] = i
    }

    var reconstruct func(inLeft, inRight, postLeft, postRight int) *TreeNode 
    reconstruct = func(inLeft, inRight, postLeft, postRight int) *TreeNode {
        if inLeft > inRight || postLeft > postRight {
            return nil 
        }

        rootVal := postorder[postRight]
        rootIndex := valToIndex[rootVal]
        root := &TreeNode{Val: rootVal}
        root.Left = reconstruct(inLeft, rootIndex - 1, postLeft, postLeft + rootIndex - inLeft - 1)
        root.Right = reconstruct(rootIndex + 1, inRight, postLeft + rootIndex - inLeft, postRight - 1)
        return root 
    }
    
    return reconstruct(0, inLen - 1, 0, postLen - 1)
}
```

-----

### `leetcode 107 二叉树的层序遍历 II` 

```go
func levelOrderBottom(root *TreeNode) [][]int {
    res := [][]int{}
    if root == nil {
        return res 
    }

    queue := []*TreeNode{root}
    for len(queue) > 0 {
        levelSize := len(queue)
        line := []int{}
        nextLevel := []*TreeNode{}
        for i := 0; i < levelSize; i++ {
            node := queue[i]
            line = append(line, node.Val)
            if node.Left != nil {
                nextLevel = append(nextLevel, node.Left)
            }
            if node.Right != nil {
                nextLevel = append(nextLevel, node.Right)
            }
        }
        res = append(res, line)
        queue = nextLevel
    }
    reverseLines(res)
    return res
}

func reverseLines(nums [][]int) {
    for i, j := 0, len(nums) - 1; i < j; i, j = i+1, j-1 {
        nums[i], nums[j] = nums[j], nums[i]
    }
}
```

------

### `leetcode 108 将有序数组转换为二叉搜索树`

```go
func sortedArrayToBST(nums []int) *TreeNode {
    length := len(nums)
    if length <= 0 {
        return nil 
    }

    var buildBST func(start, end int) *TreeNode 
    buildBST = func(start, end int) *TreeNode {
        if start > end {
            return nil 
        }

        mid := start + (end - start) / 2
        root := &TreeNode{Val: nums[mid]}
        root.Left = buildBST(start, mid - 1)
        root.Right = buildBST(mid + 1, end)
        return root 
    }
    return buildBST(0, length - 1)
}
```

-----

### `leetcode 110 平衡二叉树`

```go
func isBalanced(root *TreeNode) bool {
    return checkBalance(root) != -1
}

func checkBalance(root *TreeNode) int {
    if root == nil {
        return 0
    }

    left := checkBalance(root.Left)
    if left == -1 {
        return -1
    }
    right := checkBalance(root.Right)
    if right == -1 {
        return -1
    }

    if abs(left - right) > 1 {
        return -1
    }
    return max(left, right) + 1
}

func abs(a int) int {
    if a < 0 {
        return -a 
    }
    return a 
}

func max(a, b int) int {
    if a < b {
        return b
    }
    return a 
}
```

----

### `leetcode 111 二叉树的最小深度`

```go
func minDepth(root *TreeNode) int {
    if root == nil {
        return 0
    }

    left := minDepth(root.Left)
    right := minDepth(root.Right)
    if left == 0 || right == 0 {
        return left + right + 1
    }
    return min(left, right) + 1
}

func min(a, b int) int {
    if a < b {
        return a 
    }
    return b 
}
```

----

### `leetcode 112 路径总和`

```go
func hasPathSum(root *TreeNode, targetSum int) bool {
    if root == nil {
        return false 
    }

    targetSum -= root.Val
    if targetSum == 0 && root.Left == nil && root.Right == nil {
        return true 
    }
    return hasPathSum(root.Left, targetSum) || hasPathSum(root.Right, targetSum)
}
```

-----

### `leetcode 113 路径总和 II`

```go
func pathSum(root *TreeNode, targetSum int) [][]int {
    res := [][]int{}
    if root == nil {
        return res 
    }

    var backTracking func(root *TreeNode, targetSum int, runner []int) 
    backTracking = func(root *TreeNode,  targetSum int, runner []int) {
        if root == nil {
            return 
        }

        targetSum -= root.Val
        runner = append(runner, root.Val)
        if targetSum == 0 && root.Left == nil && root.Right == nil {
            res = append(res, append([]int{}, runner...))
        }
        backTracking(root.Left, targetSum, runner)
        backTracking(root.Right, targetSum, runner)
    }
    
    backTracking(root, targetSum, []int{})
    return res
}
```

-----

### `leetcode 114 二叉树展开为链表`

```go
func flatten(root *TreeNode)  {
    if root == nil {
        return 
    }

    left := root.Left
    root.Left = nil 
    flatten(left)

    right := root.Right
    root.Right = left
    flatten(right)
    
    runner := root
    for runner.Right != nil {
        runner = runner.Right
    }
    runner.Right = right 
}
```

-----



### `leetcode 116 填充每个节点的下一个右侧节点指针`

```go
func connect(root *Node) *Node {
    if root == nil {
        return root
    }

    left := root.Left
    right := root.Right
    for left != nil && right != nil {
        left.Next = right
        left = left.Right
        right = right.Left
    }
    connect(root.Left)
    connect(root.Right)
    return root
}
```

----

### `leetcode 117 填充每个节点的下一个右侧节点指针 II`

```go
func connect(root *Node) *Node {
    if root == nil {
        return nil 
    }

    cur := root
    for cur != nil {
        dummy := &Node{}
        pre := dummy
        for cur != nil {
            if cur.Left != nil {
                pre.Next = cur.Left
                pre = pre.Next
            }
            if cur.Right != nil {
                pre.Next = cur.Right
                pre = pre.Next
            }
            cur = cur.Next
        }
        cur = dummy.Next
    }
    return root
}
```



### `leetcode 124 二叉树中的最大路径和`

```go
func maxPathSum(root *TreeNode) int {
    res := math.MinInt32

    var oneMaxSide func(root *TreeNode) int
    oneMaxSide = func(root *TreeNode) int {
        if root == nil {
            return 0
        }

        left := max(0, oneMaxSide(root.Left))
        right := max(0, oneMaxSide(root.Right))
        res = max(res, left + right + root.Val)
        return max(left, right) + root.Val
    }
    oneMaxSide(root)
    return res
}

func max(a, b int) int {
    if a < b {
        return b 
    }
    return a 
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

-----

### `leetcode 128  最长连续序列`

```go
func longestConsecutive(nums []int) int {
    if len(nums) <= 0 {
        return 0
    }
    
    uf := initUF(nums)
    res := 1
    for _, num := range nums {
        if uf.contains(num - 1) {
            res = max(res, uf.union(num, num - 1))
        }
        if uf.contains(num + 1) {
            res = max(res, uf.union(num, num + 1))
        }
    }
    return res
}

func max(a, b int) int {
    if a < b {
        return b 
    }
    return a
}

type UnionFind struct {
    parent  map[int]int
    size    map[int]int 
}

func initUF(nums []int) *UnionFind {
    parent := map[int]int{}
    size := map[int]int{}
    for _, num := range nums {
        parent[num] = num
        size[num] = 1
    }

    return &UnionFind{
        parent: parent,
        size: size,
    }
}

func (uf *UnionFind) contains(x int) bool {
    if _, ok := uf.parent[x]; ok {
        return true 
    }
    return false
}

func (uf *UnionFind) find(x int) int {
    for uf.parent[x] != x {
        uf.parent[x] = uf.parent[uf.parent[x]]
        x = uf.parent[x]
    }
    return x 
}

func (uf *UnionFind) union(x, y int) int {
    xRoot := uf.find(x)
    yRoot := uf.find(y)
    if xRoot == yRoot {
        return 0
    }

    xSize := uf.size[xRoot]
    ySize := uf.size[yRoot]
    sum := xSize + ySize
    if xSize < ySize {
        uf.parent[xRoot] = yRoot
        uf.size[yRoot] = sum
    } else {
        uf.parent[yRoot] = xRoot
        uf.size[xRoot] = sum 
    }
    return sum 
}
```



### `leetcode 129 求根到叶子节点数字之和`

```go
func sumNumbers(root *TreeNode) int {
    res := 0

    var recursion func(root *TreeNode, sum int) 
    recursion = func(root *TreeNode, sum int) {
        if root == nil {
            return
        }

        sum = sum * 10 + root.Val
        if root.Left == nil && root.Right == nil {
            res += sum 
        }
        recursion(root.Left, sum)
        recursion(root.Right, sum)
    }
    
    recursion(root, 0)
    return res
}
```

----

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

-----

### `leetcode 136  只出现一次的数字`

```go
func singleNumber(nums []int) int {
    res := 0
    for _, num := range nums {
        res ^= num 
    }
    return res
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

```go
func hasCycle(head *ListNode) bool {
    if head == nil || head.Next == nil {
        return false
    }

    slow := head
    fast := head.Next
    for fast != nil && fast.Next != nil {
        slow = slow.Next
        fast = fast.Next.Next
        if slow == fast {
            return true
        }
    }
    return false
}
```

-----

### `leetcode 142 环形链表II`

```go
func detectCycle(head *ListNode) *ListNode {
    if head == nil || head.Next == nil {
        return nil
    }

    slow := head
    fast := head
    for fast != nil && fast.Next != nil {
        slow = slow.Next
        fast = fast.Next.Next
        if slow == fast {
            slow = head
            for slow != fast {
                slow = slow.Next
                fast = fast.Next
            }
            return slow
        }
    }
    return nil
}
```

---

### `leetcode 143 重排链表`

```go
func reorderList(head *ListNode)  {
    if head == nil || head.Next == nil {
        return
    }

    mid := getMid(head)
    half := mid.Next
    mid.Next = nil 
    half = reverseList(half)
    dummy := &ListNode{0, nil}
    runner := dummy
    for head != nil || half != nil {
        if head != nil {
            runner.Next = head
            head = head.Next
            runner = runner.Next
        }
        if half != nil {
            runner.Next = half
            half = half.Next
            runner = runner.Next
        }
    }
    head = dummy.Next
}

func getMid(head *ListNode) *ListNode {
    if head == nil || head.Next == nil {
        return head 
    }

    slow := head
    fast := head.Next
    for fast != nil && fast.Next != nil {
        slow = slow.Next
        fast = fast.Next.Next
    }
    return slow 
}

func reverseList(head *ListNode) *ListNode {
    var pre *ListNode
    cur := head
    for cur != nil {
        next := cur.Next
        cur.Next = pre
        pre = cur
        cur = next 
    }
    return pre 
}
```



### `leetcode 144 二叉树的前序遍历`

```go
// 递归
func preorderTraversal(root *TreeNode) []int {
    res := []int{}

    var preOrderTra func(root *TreeNode) 
    preOrderTra = func(root *TreeNode) {
        if root == nil {
            return 
        }

        res = append(res, root.Val)
        preOrderTra(root.Left)
        preOrderTra(root.Right)
    }

    preOrderTra(root)
    return res
}

// 迭代
func preorderTraversal(root *TreeNode) []int {
    stack := []*TreeNode{}
    res := []int{}
    for len(stack) > 0 || root != nil {
        for root != nil {
            res = append(res, root.Val)
            stack = append(stack, root)
            root = root.Left
        }
        node := stack[len(stack) - 1]
        stack = stack[:len(stack) - 1]
        root = node.Right
    }
    return res
}
```

-----

### `leetcode 145  二叉树的后序遍历`

```go
// 递归
func postorderTraversal(root *TreeNode) []int {
    res := []int{}
    
    var postorderTra func(root *TreeNode) 
    postorderTra = func(root *TreeNode) {
        if root == nil {
            return 
        }

        postorderTra(root.Left)
        postorderTra(root.Right)
        res = append(res, root.Val)
    }
    
    postorderTra(root)
    return res
}

// 迭代
func postorderTraversal(root *TreeNode) []int {
    res := []int{}
    if root == nil {
        return res 
    }

    stack := []*TreeNode{}
    var lastVisit *TreeNode
    for len(stack) > 0 || root != nil {
        for root != nil {
            stack = append(stack, root)
            root = root.Left
        }

        node := stack[len(stack) - 1]
        if node.Right == nil || node.Right == lastVisit {
            res = append(res, node.Val)
            lastVisit = node
            stack = stack[:len(stack)-1]
        } else {
            root = node.Right
        }
    }
    return res
}
```

------

### `leetcode 146 LRU缓存机制`

```go
type entry struct {
    key     int
    value   int
}

type LRUCache struct {
    cap     int
    cache   map[int]*list.Element
    lst     *list.List 
}


func Constructor(capacity int) LRUCache {
    return LRUCache{capacity, map[int]*list.Element{}, list.New()}
}


func (this *LRUCache) Get(key int) int {
    e := this.cache[key]
    if e == nil {
        return -1
    }    
    this.lst.MoveToFront(e)
    return e.Value.(entry).value 
}


func (this *LRUCache) Put(key int, value int)  {
    if e := this.cache[key]; e != nil {
        e.Value = entry{key, value}
        this.lst.MoveToFront(e)
        return 
    }

    this.cache[key] = this.lst.PushFront(entry{key, value})
    if len(this.cache) > this.cap {
        delete(this.cache, this.lst.Remove(this.lst.Back()).(entry).key)
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

```go
func findMin(nums []int) int {
    left := 0
    right := len(nums) - 1
    for left < right {
        mid := left + (right - left) / 2
        if nums[mid] == nums[right] {
            right--
        } else if nums[mid] < nums[right] {
            right = mid 
        } else {
            left = mid + 1
        }
    }
    return nums[left]
}
```

----

### `leetcode 155 最小栈`

```go
type MinStack struct {
    dataStack   []int
    minStack    []int 
}


/** initialize your data structure here. */
func Constructor() MinStack {
    return MinStack{[]int{}, []int{}}
}


func (this *MinStack) Push(val int)  {
    this.dataStack = append(this.dataStack, val)
    if len(this.minStack) == 0 {
        this.minStack = append(this.minStack, val)
    } else {
        top := this.minStack[len(this.minStack) - 1]
        this.minStack = append(this.minStack, min(val, top))
    }
}


func (this *MinStack) Pop()  {
    this.dataStack = this.dataStack[:len(this.dataStack) - 1]
    this.minStack = this.minStack[:len(this.minStack) - 1]
}


func (this *MinStack) Top() int {
    return this.dataStack[len(this.dataStack) - 1]
}


func (this *MinStack) GetMin() int {
    return this.minStack[len(this.minStack) - 1]
}

func min(a, b int) int {
    if a < b {
        return a
    }
    return b 
}
```

----

### `leetcode 156 上下翻转二叉树`

```go
func upsideDownBinaryTree(root *TreeNode) *TreeNode {
    var parent *TreeNode
    var rightSib *TreeNode
    cur := root
    for cur != nil {
        left := cur.Left
        right := cur.Right 
        cur.Left = rightSib
        cur.Right = parent
        parent = cur
        rightSib = right 
        cur = left 
    }
    return parent
}
```



### `leetcode 160 相交链表`

```go
/**执行耗时有点长，不知道为何*/
func getIntersectionNode(headA, headB *ListNode) *ListNode {
    shortLen := 0
    longLen := 0
    shortL := headA
    longL := headB

    for shortL != nil {
        shortLen++
        shortL = shortL.Next
    }
    for longL != nil {
        longLen++
        longL = longL.Next
    }

    diff := longLen - shortLen
    shortL = headA
    longL = headB
    if diff < 0 {
        diff = -diff
        shortL = headB
        longL = headA
    }

    for i := 0; i < diff; i++ {
        longL = longL.Next
    }
    for shortL != longL {
        shortL = shortL.Next
        longL = longL.Next
    }
    return shortL
}
```

-----

### `leetcode 165 比较版本号`

```go
func compareVersion(version1 string, version2 string) int {
    v1 := strings.Split(version1, ".")
    v2 := strings.Split(version2, ".")
    len1 := len(v1)
    len2 := len(v2)
    for i := 0; i < max(len1, len2); i++ {
        a := 0
        b := 0
        if i < len1 {
            a,_ = strconv.Atoi(v1[i])
        }
        if i < len2 {
            b,_ = strconv.Atoi(v2[i])
        }
        if a != b {
            if a < b {
                return -1
            }
            return 1
        }
    }
    return 0
}

func max(a, b int) int {
    if a < b {
        return b  
    }
    return a 
}
```



### `leetcode 169 多数元素`

```go
func majorityElement(nums []int) int {
    majority := nums[0]
    count := 1
    for i := 1; i < len(nums); i++ {
        if count == 0 {
            majority = nums[i]
            count = 1
        } else {
            if majority == nums[i] {
                count++
            } else {
                count--
            }
        }
    }
    return majority
}
```

----

### `leetcode 170 两数之和 III`

```go
type TwoSum struct {
    data        map[int]int
    lowerBound  int
    upperBound  int 
}


/** Initialize your data structure here. */
func Constructor() TwoSum {
    return TwoSum {
        data: map[int]int{},
        lowerBound: math.MaxInt32,
        upperBound: math.MinInt32,
    }
}


/** Add the number to an internal data structure.. */
func (this *TwoSum) Add(number int)  {
    this.data[number]++
    this.lowerBound = min(this.lowerBound, number)
    this.upperBound = max(this.upperBound, number)
}


/** Find if there exists any pair of numbers which sum is equal to the value. */
func (this *TwoSum) Find(value int) bool {
    if value < 2 * this.lowerBound || value > 2 * this.upperBound {
        return false 
    }

    for k, v := range this.data {
        if value - k == k {
            if v > 1 {
                return true 
            }
        } else {
            if this.data[value - k] > 0 {
                return true 
            }
        }
    }
    return false
}

func min(a, b int) int {
    if a < b {
        return a
    }
    return b 
}

func max(a, b int) int {
    if a < b {
        return b 
    }
    return a 
}
```

[参考答案](https://leetcode-cn.com/problems/two-sum-iii-data-structure-design/solution/shuang-100jian-dan-chang-gui-si-lu-kan-liao-yi-qua/)

------

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

### `leetcode 173 二叉搜索树迭代器`

```go
type BSTIterator struct {
    stack   []*TreeNode
    curNode *TreeNode
}


func Constructor(root *TreeNode) BSTIterator {
    stack := []*TreeNode{}
    curNode := root
    return BSTIterator{stack, curNode}
}


func (this *BSTIterator) Next() int {
    for node := this.curNode; node != nil; node = node.Left {
        this.stack = append(this.stack, node)
    }
    this.curNode = this.stack[len(this.stack)-1]
    val := this.curNode.Val
    this.stack = this.stack[:len(this.stack)-1]
    this.curNode = this.curNode.Right
    return val
}   


func (this *BSTIterator) HasNext() bool {
    return this.curNode != nil || len(this.stack) > 0
}
```



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

```go
func rob(nums []int) int {
    if len(nums) < 1 {
        return 0
    }

    length := len(nums)
    dp := make([]int, length+1)
    dp[0] = 0
    dp[1] = nums[0]
    for i := 2; i <= length; i++ {
        dp[i] = max(dp[i-1], dp[i-2] + nums[i-1])
    }
    return dp[length]
}

func max(a, b int) int {
    if a < b {
        return b 
    }
    return a
}
```



### `leetcode 199 二叉树的右视图`

```go
func rightSideView(root *TreeNode) []int {
    res := []int{}

    var reverseInorderTra func(root *TreeNode, depth int)
    reverseInorderTra = func(root *TreeNode, depth int) {
        if root == nil {
            return 
        }

        if len(res) == depth {
            res = append(res, root.Val)
        }
        depth++
        reverseInorderTra(root.Right, depth)
        reverseInorderTra(root.Left, depth)
    }
    
    reverseInorderTra(root, 0)
    return res
}
```

-----

### `leetcode 200 岛屿数量`

```java
func numIslands(grid [][]byte) int {
    var dfs func(grid[][] byte, i, j int)
    dfs = func(grid [][]byte, i, j int) {
        if i < 0 || i >= len(grid) || j < 0 || j >= len(grid[0]) || grid[i][j] != '1' {
            return
        }

        grid[i][j] = '0'
        dfs(grid, i - 1, j)
        dfs(grid, i, j - 1)
        dfs(grid, i + 1, j)
        dfs(grid, i, j + 1)
    }

    m := len(grid)
    n := len(grid[0])
    res := 0
    for i := 0; i < m; i++ {
        for j := 0; j < n; j++ {
            if grid[i][j] == '1' {
                dfs(grid, i, j)
                res++
            }
        }
    }
    return res
}
```

-----

### `leetcode 203 移除链表元素`

```go
func removeElements(head *ListNode, val int) *ListNode {
    dummy := &ListNode{}
    dummy.Next = head
    runner := dummy
    for runner.Next != nil {
        if runner.Next.Val == val {
            runner.Next = runner.Next.Next
        } else {
            runner = runner.Next
        }
    }
    return dummy.Next
}
```



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

```go
/**
* 迭代
 */
func reverseList(head *ListNode) *ListNode {
    var pre *ListNode
    cur := head
    for cur != nil {
        next := cur.Next
        cur.Next = pre
        pre = cur
        cur = next
    }
    return pre
}
```

------

### `leetcode 208 实现Trie (前缀树)`

```go
type Trie struct {
    child   [26]*Trie
    isLeaf  bool
}

/** Initialize your data structure here. */
func Constructor() Trie {
    return Trie{}
}


/** Inserts a word into the trie. */
func (this *Trie) Insert(word string)  {
    if this == nil {
        return 
    }

    cur := this
    for _, c := range word {
        index := c - 'a'
        if cur.child[index] == nil {
            cur.child[index] = &Trie{}
        }
        cur = cur.child[index]
    }
    cur.isLeaf = true
}


/** Returns if the word is in the trie. */
func (this *Trie) Search(word string) bool {
    if this == nil {
        return false
    }

    cur := this
    for _, c := range word {
        index := c - 'a'
        if cur.child[index] == nil {
            return false
        }
        cur = cur.child[index]
    }

    if cur.isLeaf {
        return true
    }
    return false
}


/** Returns if there is any word in the trie that starts with the given prefix. */
func (this *Trie) StartsWith(prefix string) bool {
    if this == nil {
        return false
    }

    cur := this
    for _, c := range prefix {
        index := c - 'a'
        if cur.child[index] == nil {
            return false
        }
        cur = cur.child[index]
    }
    return true
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

### `leetcode 213 打家劫舍 II`

```go
func rob(nums []int) int {
    length := len(nums)
    if length == 1 {
        return nums[0]
    }
    
    return max(robInRange(nums, 0, length - 2), robInRange(nums, 1, length - 1))
}

func robInRange(nums []int, start, end int) int {
    robMinusOne := 0
    robMinusTwo := 0
    robN := 0
    for i := start; i <= end; i++ {
        robN = max(robMinusOne, robMinusTwo + nums[i])
        robMinusTwo = robMinusOne
        robMinusOne = robN
    }
    return robN
}

func max(a, b int) int {
    if a < b {
        return b 
    }
    return a 
}
```



### `leetcode 215 数组中的第k个最大元素`

```go
func findKthLargest(nums []int, k int) int {
    length := len(nums)
    k = length - k
    left := 0
    right := length - 1
    for {
        index := partition(nums, left, right)
        if index == k {
            return nums[index]
        } else if index < k {
            left = index + 1
        } else {
            right = index - 1
        }
    }
}

func partition(nums []int, left int, right int) int {
    mark := left
    pivot := nums[left]
    for i := left + 1; i <= right; i++ {
        if nums[i] < pivot {
            mark++
            nums[mark], nums[i] = nums[i], nums[mark]
        }
    }
    nums[left] = nums[mark]
    nums[mark] = pivot
    return mark
}
```

----

### `leetcode 221 最大正方形`

```go
func maximalSquare(matrix [][]byte) int {
    m := len(matrix)
    n := len(matrix[0])
    res := 0
    dp := make([][]int, m + 1)
    for i := 0; i <= m; i++ {
        dp[i] = make([]int, n + 1)
    }

    for i := 1; i <= m; i++ {
        for j := 1; j <= n; j++ {
            if matrix[i-1][j-1] == '1' {
                dp[i][j] = min(dp[i-1][j], min(dp[i-1][j-1], dp[i][j-1])) + 1
            }
            res = max(res, dp[i][j])
        }
    }
    return res * res
}

func max(a, b int) int {
    if a < b {
        return b 
    }
    return a 
}

func min(a, b int) int {
    if a < b {
        return a 
    }
    return b 
}
```



### `leetcode 222 完全二叉树的节点个数`

```go
func countNodes(root *TreeNode) int {
    if root == nil {
        return 0
    }

    left := height(root.Left)
    right := height(root.Right)
    if left == right {
        return (1 << left) + countNodes(root.Right)
    } else {
        return (1 << right) + countNodes(root.Left)
    }
}

func height(root *TreeNode) int {
    res := 0
    for root != nil {
        res++
        root = root.Left
    }
    return res
}
```



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

```go
func invertTree(root *TreeNode) *TreeNode {
    if root == nil {
        return nil
    }
    left := root.Left
    root.Left = invertTree(root.Right)
    root.Right = invertTree(left)
    return root
}
```

------

### `leetcode 230 二叉搜素树中第k小的元素`

```go
// 中序遍历并进行计数
func kthSmallest(root *TreeNode, k int) int {
    res := 0
    count := 0

    var inorderTra func(root *TreeNode) 
    inorderTra = func(root *TreeNode) {
        if root == nil {
            return 
        }

        inorderTra(root.Left)
        count++ 
        if count == k { res = root.Val }
        inorderTra(root.Right)
    }

    inorderTra(root)
    return res
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

### `leetcode 234 回文链表`

```go
func isPalindrome(head *ListNode) bool {
    if head == nil || head.Next == nil {
        return true 
    }

    mid := getMid(head)
    half := mid.Next
    mid.Next = nil
    half = reverseList(half)
    return checkForMatch(head, half)
}

func checkForMatch(l1 *ListNode, l2 *ListNode) bool {
    for l1 != nil && l2 != nil {
        if l1.Val != l2.Val {
            return false
        }
        l1 = l1.Next
        l2 = l2.Next
    }
    return true 
}

func getMid(head *ListNode) *ListNode {
    if head == nil || head.Next == nil {
        return head 
    }

    slow := head
    fast := head.Next
    for fast != nil && fast.Next != nil {
        slow = slow.Next
        fast = fast.Next.Next
    }
    return slow
}

func reverseList(head *ListNode) *ListNode {
    var pre *ListNode
    cur := head
    for cur != nil {
        next := cur.Next
        cur.Next = pre
        pre = cur
        cur = next
    }
    return pre
}
```

----

### `leetcode 235 二叉搜索树的最近公共祖先`

```go
func lowestCommonAncestor(root, p, q *TreeNode) *TreeNode {
	if p.Val < root.Val && q.Val < root.Val {
        return lowestCommonAncestor(root.Left, p, q)
    } else if p.Val > root.Val && q.Val > root.Val {
        return lowestCommonAncestor(root.Right, p, q)
    } 
    return root
}
```

---

### `leetcode 236 二叉树的最近公共祖先`

```go
func lowestCommonAncestor(root, p, q *TreeNode) *TreeNode {
    if root == nil || root == p || root == q {
        return root
    }
    left := lowestCommonAncestor(root.Left, p, q)
    right := lowestCommonAncestor(root.Right, p, q)
    if left == nil {
        return right 
    } else if right == nil {
        return left 
    }
    return root
}
```



### `leetcode 237 删除链表中的节点`

```go
func deleteNode(node *ListNode) {
    node.Val = node.Next.Val
    node.Next = node.Next.Next
}
```



### `leetcode 238 除自身以外数组的乘积`

```go
func productExceptSelf(nums []int) []int {
    length := len(nums)
    res := make([]int, length)

    left := 1
    for i := 0; i < length; i++ {
        res[i] = left 
        left *= nums[i]
    }

    right := 1
    for i := length - 1; i >= 0; i-- {
        res[i] *= right 
        right *= nums[i]
    }

    return res
}
```

----

### `leetcode 239 滑动窗口最大值`

```go
func maxSlidingWindow(nums []int, k int) []int {
    res := []int{}
    window := []int{}
    for i, num := range nums {
        for len(window) > 0 && num >= nums[window[len(window) - 1]] {
            window = window[:len(window) - 1]
        }
        window = append(window, i)
        if i - window[0] >= k {
            window = window[1:]
        }
        if i >= k - 1 {
            res = append(res, nums[window[0]])
        }
    }
    return res
}
```

----

### `leetcode 240 搜索二维矩阵II`

```go
func searchMatrix(matrix [][]int, target int) bool {
    m := len(matrix)
    n := len(matrix[0])
    top := 0
    right := n - 1
    for top < m && right >= 0 {
        cur := matrix[top][right]
        if cur == target {
            return true
        } else if cur < target {
            top++
        } else {
            right--
        }
    }
    return false
}
```



### `leetcode 255 验证前序遍历序列二叉搜索树`

```go
func verifyPreorder(preorder []int) bool {
    if len(preorder) < 2 {
        return true
    }

    var recursion func(start, end int) bool 
    recursion = func(start, end int) bool {
        if start >= end {
            return true
        }

        rootVal := preorder[start]
        split := start + 1
        for split <= end && preorder[split] < rootVal {
            split++
        }
        for i := split; i <= end; i++ {
            if preorder[i] <= rootVal {
                return false 
            }
        }

        return recursion(start + 1, split - 1) && recursion(split, end)
    }

    return recursion(0, len(preorder) - 1)
}
```

----

### `leetcode 257 二叉树的所有路径`

```go
func binaryTreePaths(root *TreeNode) []string {
    res := []string{}
    if root == nil {
        return res 
    }

    var backTracking func(root *TreeNode, runner string) 
    backTracking = func(root *TreeNode, runner string) {
        if root == nil {
            return 
        }

        runner += strconv.Itoa(root.Val)
        if root.Left == nil && root.Right == nil {
            res = append(res, runner)
            return 
        }
        runner += "->"
        backTracking(root.Left, runner)
        backTracking(root.Right, runner)
    }

    backTracking(root, "")
    return res
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

### `leetcode 270 最接近的二叉搜索树值`

```go
func closestValue(root *TreeNode, target float64) int {
    res := root.Val
    dif := diff(float64(root.Val), target)
    cur := 0.0
    for root != nil {
        cur = diff(float64(root.Val), target)
        if cur < dif {
            dif = cur 
            res = root.Val
        }
        if target > float64(root.Val) {
            root = root.Right
        } else {
            root = root.Left
        }
    } 
    return res
}

func diff(a, b float64) float64 {
    if a < b {
        return b - a
    }
    return a - b 
} 
```



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

### `leetcode 285 二叉搜索树中的中序后继`

```go
func inorderSuccessor(root *TreeNode, p *TreeNode) *TreeNode {
    var res *TreeNode
    for root != nil {
        if p.Val < root.Val {
            res = root 
            root = root.Left
        } else {
            root = root.Right
        }
    }
    return res
}
```



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

### `leetcode 297 二叉树的序列化与反序列化`

```go
type Codec struct {
    
}

func Constructor() Codec {
    return Codec{}
}

// Serializes a tree to a single string.
func (this *Codec) serialize(root *TreeNode) string {
    if root == nil {
        return ""
    }

    queue := []*TreeNode{root}
    vals := []string{}
    for len(queue) > 0 {
        node := queue[0]
        queue = queue[1:]
        if node != nil {
            vals = append(vals, strconv.Itoa(node.Val))
            queue = append(queue, node.Left, node.Right)
        } else {
            vals = append(vals, "null")
        }
    }
    return strings.Join(vals, ",")
}

// Deserializes your encoded data to tree.
func (this *Codec) deserialize(data string) *TreeNode {    
    if len(data) == 0 {
        return nil
    }

    vals := strings.Split(data, ",")
    rootVal,_ := strconv.Atoi(vals[0])
    root := &TreeNode{Val: rootVal}
    queue := []*TreeNode{root}
    index := 1
    length := len(vals)

    for index < length {
        node := queue[0]
        queue = queue[1:]
        if index < length && vals[index] != "null" {
            val, _ := strconv.Atoi(vals[index])
            left := &TreeNode{Val: val}
            node.Left = left 
            queue = append(queue, left)
        }
        index++
        
        if index < length && vals[index] != "null" {
            val2, _ := strconv.Atoi(vals[index])
            right := &TreeNode{Val: val2}
            node.Right = right
            queue = append(queue, right)
        }
        index++
    }
    return root
}
```

----

### `leetcode 298 二叉树最长连续序列`

```go
func longestConsecutive(root *TreeNode) int {
    if root == nil {
        return 0
    }
    res := 1

    var dfs func(root, parent *TreeNode, curLen int)
    dfs = func(root, parent *TreeNode, curLen int) {
        if root == nil {
            return 
        }

        if parent != nil && root.Val == parent.Val + 1 {
            curLen++
            res = max(res, curLen)
        } else {
            curLen = 1
        }
        dfs(root.Left, root, curLen)
        dfs(root.Right, root, curLen)
    }

    dfs(root, nil, 1)
    return res
}

func max(a, b int) int {
    if a < b {
        return b 
    }
    return a 
}
```



### `leetcode 300 最长递增子序列`

```go
func lengthOfLIS(nums []int) int {
    length := len(nums)
    dp := make([]int, length)
    for i := 0; i < length; i++ {
        dp[i] = 1
    }

    res := 1
    for i := 1; i < length; i++ {
        for j := 0; j < i; j++ {
            if nums[i] > nums[j] {
                dp[i] = max(dp[i], dp[j] + 1)
            }
        }
        res = max(res, dp[i])
    }
    return res
}

func max(a, b int) int {
    if a > b {
        return a
    }
    return b
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

----

### `leetcode 323 无向图中连通分量的数目`

```go
func countComponents(n int, edges [][]int) int {
    uf := initUF(n)
    for _, edge := range edges {
        uf.union(edge[0], edge[1])
    }
    return uf.getCount()
}

type UnionFind struct {
    count   int
    parent  []int 
    rank    []int 
}

func initUF(n int) *UnionFind {
    count := n
    parent := make([]int, n)
    rank := make([]int, n)
    for i := 0; i < n; i++ {
        parent[i] = i
        rank[i] = 1
    }
    return &UnionFind{
        count: count,
        parent: parent,
        rank: rank,
    }
}

func (uf *UnionFind) getCount() int {
    return uf.count
}

func (uf *UnionFind) find(x int) int {
    for x != uf.parent[x] {
        uf.parent[x] = uf.parent[uf.parent[x]]
        x = uf.parent[x]
    }
    return x
}

func (uf *UnionFind) union(x, y int) bool {
    xRoot := uf.find(x)
    yRoot := uf.find(y)
    if xRoot == yRoot {
        return false 
    }

    if uf.rank[xRoot] < uf.rank[yRoot] {
        uf.parent[xRoot] = yRoot
    } else if uf.rank[xRoot] > uf.rank[yRoot] {
        uf.parent[yRoot] = xRoot
    } else {
        uf.parent[xRoot] = yRoot
        uf.rank[yRoot]++
    }
    uf.count--
    return true 
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

----

### `leetcode 333 最大BST子树`

```go
func largestBSTSubtree(root *TreeNode) int {
    res := 0
    var dfs func(root *TreeNode)
    dfs = func(root *TreeNode) {
        if root == nil {
            return 
        }

        if isValidBST(root, nil, nil) {
            res = max(res, size(root))
        }
        dfs(root.Left)
        dfs(root.Right)
    }

    dfs(root)
    return res
}

func max(a, b int) int {
    if a < b {
        return b
    }
    return a
}

func isValidBST(root, min, max *TreeNode) bool {
    if root == nil {
        return true
    } else if min != nil && root.Val <= min.Val {
        return false
    } else if max != nil && root.Val >= max.Val {
        return false 
    }

    return isValidBST(root.Left, min, root) && isValidBST(root.Right, root, max)
} 

func size(root *TreeNode) int {
    if root == nil {
        return 0
    }

    return 1 + size(root.Left) + size(root.Right)
}
```

---

### `leetcode 337 打家劫舍 III`

```go
func rob(root *TreeNode) int {
    resSli := robInTree(root)
    return max(resSli[0], resSli[1])
}

func robInTree(root *TreeNode) []int {
    if root == nil {
        return []int{0, 0}
    }

    left := robInTree(root.Left)
    right := robInTree(root.Right)
    notRob := max(left[0], left[1]) + max(right[0], right[1])
    rob := left[0] + right[0] + root.Val
    return []int{notRob, rob} 
}

func max(a, b int) int {
    if a < b {
        return b 
    }
    return a 
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

```go
func maxEnvelopes(envelopes [][]int) int {
    sort.Slice(envelopes, func(i, j int) bool {
        if envelopes[i][0] == envelopes[j][0] {
            return envelopes[i][1] > envelopes[j][1]
        }
        return envelopes[i][0] < envelopes[j][0]
    })

    length := len(envelopes)
    dp := make([]int, length)
    res := 1
    for i := 0; i < length; i++ { dp[i] = 1}
    for i := 1; i < length; i++ {
        for j := 0; j < i; j++ {
            if envelopes[i][1] > envelopes[j][1] {
                dp[i] = max(dp[i], dp[j] + 1)
            }
        }
        res = max(res, dp[i])
    }
    return res
}

func max(a, b int) int {
    if a < b {
        return b 
    }
    return a 
}
```

---

### `leetcode 366 寻找二叉树的叶子节点`

```go
func findLeaves(root *TreeNode) [][]int {
    res := [][]int{}
    if root == nil {
        return res 
    }

    for root != nil {
        runner := []int{}
        root = recursion(root, &runner)
        res = append(res, runner)
    }
    return res
}

func recursion (root *TreeNode, runner *[]int) *TreeNode {
    if root == nil {
        return nil
    } else if root.Left == nil && root.Right == nil {
        *runner = append(*runner, root.Val)
        return nil
    }

    root.Left = recursion(root.Left, runner)
    root.Right = recursion(root.Right, runner)
    return root 
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

### `leetcode 377 组合总和 IV`

```go
func combinationSum4(nums []int, target int) int {
    dp := make([]int, target + 1)
    dp[0] = 1
    for i := 1; i <= target; i++ {
        for _, num := range nums {
            if i >= num {
                dp[i] += dp[i-num]
            }
        }
    }
    return dp[target]
}
```

----



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

---

### `leetcode 404 左叶子之和`

```go
func sumOfLeftLeaves(root *TreeNode) int {
    if root == nil {
        return 0
    }

    if root.Left != nil && isLeaf(root.Left) {
        return root.Left.Val + sumOfLeftLeaves(root.Right)
    }
    return sumOfLeftLeaves(root.Left) + sumOfLeftLeaves(root.Right)
}

func isLeaf(root *TreeNode) bool {
    if root == nil {
        return false
    }

    return root.Left == nil && root.Right == nil
}
```



### `leetcode 415 字符串相加`

```go
func addStrings(num1 string, num2 string) string {
    carry := 0
    res := ""
    len1 := len(num1)
    len2 := len(num2)
    for i, j := len1 - 1, len2 - 1; i >= 0 || j >= 0 || carry > 0; i,j = i - 1, j - 1 {
        temp := carry
        if i >= 0 {
            temp += int(num1[i] - '0')
        } 
        if j >= 0 {
            temp += int(num2[j] - '0')
        }
        res = strconv.Itoa(temp % 10) + res
        carry = temp / 10
    }
    return res
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

### `leetcode 429 N叉树的层序遍历`

```go
func levelOrder(root *Node) [][]int {
    res := [][]int{}
    if root == nil {
        return res 
    }

    queue := []*Node{root}
    for len(queue) > 0 {
        line := []int{}
        levelSize := len(queue)
        for i := 0; i < levelSize; i++ {
            node := queue[0]
            queue = queue[1:]
            line = append(line, node.Val)
            for _, child := range node.Children {
                if child != nil {
                    queue = append(queue, child)
                }
            }
        }
        res = append(res, line)
    }
    return res
}
```



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

---

### `leetcode 437 路径总和 III `

```go
func pathSum(root *TreeNode, target int) int {
    if root == nil {
        return 0
    }
    return pathFromRoot(root, target) + pathSum(root.Left, target) + pathSum(root.Right, target)
}

func pathFromRoot(root *TreeNode, target int) int {
    if root == nil {
        return 0
    }

    res := 0
    target -= root.Val
    if target == 0 { res = 1}
    res += pathFromRoot(root.Left, target) + pathFromRoot(root.Right, target)
    return res 
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

### `leetcode 449 序列化和反序列化二叉搜索树`

```go
// 以一般二叉树的方式进行处理
type Codec struct {
    
}

func Constructor() Codec {
    return Codec{}
}

// Serializes a tree to a single string.
func (this *Codec) serialize(root *TreeNode) string {
    if root == nil {
        return ""
    }

    queue := []*TreeNode{root}
    vals := []string{}
    for len(queue) > 0 {
        node := queue[0]
        queue = queue[1:]
        if node != nil {
            vals = append(vals, strconv.Itoa(node.Val))
            queue = append(queue, node.Left, node.Right)
        } else {
            vals = append(vals, "null")
        }
    }
    return strings.Join(vals, ",")
}

// Deserializes your encoded data to tree.
func (this *Codec) deserialize(data string) *TreeNode {    
    if len(data) == 0 {
        return nil
    }

    vals := strings.Split(data, ",")
    rootVal,_ := strconv.Atoi(vals[0])
    root := &TreeNode{Val: rootVal}
    queue := []*TreeNode{root}
    index := 1
    length := len(vals)

    for index < length {
        node := queue[0]
        queue = queue[1:]
        if index < length && vals[index] != "null" {
            val, _ := strconv.Atoi(vals[index])
            left := &TreeNode{Val: val}
            node.Left = left 
            queue = append(queue, left)
        }
        index++
        
        if index < length && vals[index] != "null" {
            val2, _ := strconv.Atoi(vals[index])
            right := &TreeNode{Val: val2}
            node.Right = right
            queue = append(queue, right)
        }
        index++
    }
    return root
}

// 
```

----

### `leetcode 450 删除二叉搜索树中的节点`

```Go
func deleteNode(root *TreeNode, key int) *TreeNode {
    if root == nil {
        return nil
    }

    if root.Val < key {
        root.Right = deleteNode(root.Right, key)
    } else if root.Val > key {
        root.Left = deleteNode(root.Left, key)
    } else {
        if root.Left == nil {
            return root.Right
        } else if root.Right == nil {
            return root.Left
        } else {
            node := root
            root = min(node.Right)
            root.Right = deleteMin(node.Right)
            root.Left = node.Left
            return root
        }
    }
    return root
}   

func min(root *TreeNode) *TreeNode {
    if root == nil {
        return nil
    }

    for root.Left != nil {
        root = root.Left
    }
    return root
}

func deleteMin(root *TreeNode) *TreeNode {
    if root == nil {
        return nil
    } else if root.Left == nil {
        return root.Right
    }
    
    root.Left = deleteMin(root.Left)
    return root
}
```

----

### `leetcode 470 用Rand7()实现Rand10()`

```go
// (rand_X() - 1) × Y + rand_Y() ==> 可以等概率的生成[1, X * Y]范围的随机数
func rand10() int {
    for {
        a := rand7()
        b := rand7()
        num := (a - 1) * 7 + b 
        if num <= 40 {
            return num % 10 + 1
        }

        a = num - 40
        b = rand7()
        num = (a - 1) * 7 + b
        if num <= 60 {
            return num % 10 + 1
        }

        a = num - 60
        b = rand7()
        num = (a - 1) * 7 + b
        if num <= 20 {
            return num % 10 + 1
        }
    }
}
```

----

### `leetcode 503 下一个更大元素 II`

```go
func nextGreaterElements(nums []int) []int {
    length := len(nums)
    res := make([]int, length)
    monoStack := []int{}
    for i := 2 * length - 1; i >= 0; i-- {
        for len(monoStack) > 0 && nums[i%length] >= monoStack[len(monoStack)-1] {
            monoStack = monoStack[:len(monoStack) - 1]
        }
        if len(monoStack) > 0 {
            res[i%length] = monoStack[len(monoStack)-1]
        } else {
            res[i%length] = -1
        }
        monoStack = append(monoStack, nums[i%length])
    }
    return res
}
```

----

### `leetcode 510 二叉搜索树中的中序后继 II`

```go
func inorderSuccessor(node *Node) *Node {
    if node == nil {
        return nil
    }

    if node.Right != nil {
        node = node.Right
        for node.Left != nil {
            node = node.Left
        }
        return node
    } else {
        for node.Parent != nil && node != node.Parent.Left {
            node = node.Parent
        }
        return node.Parent
    }
}
```

----

### `leetcode 513 找树左下角的值`

```go
// 层序遍历，每一层从右至左遍历
func findBottomLeftValue(root *TreeNode) int {
    queue := []*TreeNode{root}
    for len(queue) > 0 {
        root = queue[0]
        queue = queue[1:]
        if root.Right != nil {
            queue = append(queue, root.Right)
        }
        if root.Left != nil {
            queue = append(queue, root.Left)
        }
    }
    return root.Val
}
```



### `leetcode 515 在每个树行中找最大值`

```go
func largestValues(root *TreeNode) []int {
    res := []int{}
    if root == nil {
        return res 
    }

    queue := []*TreeNode{root}
    for len(queue) > 0 {
        levelSize := len(queue)
        curMax := math.MinInt32
        nextLevel := []*TreeNode{}
        for i := 0; i < levelSize; i++ {
            node := queue[i]
            curMax = max(curMax, node.Val)
            if node.Left != nil {
                nextLevel = append(nextLevel, node.Left)
            } 
            if node.Right != nil {
                nextLevel = append(nextLevel, node.Right)
            }
        }
        res = append(res, curMax)
        queue = nextLevel
    }
    return res
}

func max(a, b int) int {
    if a < b {
        return b 
    }
    return a 
}
```

-----

### `leetcode 518 零钱兑换II`

```go
func change(amount int, coins []int) int {
    dp := make([]int, amount + 1)
    dp[0] = 1
    for _, coin := range coins {
        for i := coin; i <= amount; i++ {
            dp[i] += dp[i-coin]
        }
    }
    return dp[amount]
}
```



### `leetcode 530 二叉搜索树的最小绝对差`

```go
func getMinimumDifference(root *TreeNode) int {
    res := math.MaxInt32
    var pre *TreeNode

    var inorderTra func(root *TreeNode) 
    inorderTra = func(root *TreeNode) {
        if root == nil {
            return 
        }

        inorderTra(root.Left)
        if pre != nil {
            res = min(res, root.Val - pre.Val)
        }
        pre = root 
        inorderTra(root.Right)
    }

    inorderTra(root)
    return res
}

func min(a, b int) int {
    if a < b {
        return a 
    }
    return b 
}
```

----

### `leetcode 538 把二叉搜索树转换为累加树`

```go
func convertBST(root *TreeNode) *TreeNode {
    pre := 0

    var reverseTra func(root *TreeNode) 
    reverseTra = func(root *TreeNode) {
        if root == nil {
            return 
        }

        reverseTra(root.Right)
        pre += root.Val
        root.Val = pre 
        reverseTra(root.Left)
    }

    reverseTra(root)
    return root 
}
```



### `leetcode 547 省份数量`

```go
func findCircleNum(isConnected [][]int) int {
    n := len(isConnected)
    uf := initUF(n)
    for i := 0; i < n; i++ {
        for j := i + 1; j < n; j++ {
            if isConnected[i][j] == 1 {
                uf.union(i, j)
            }
        }
    }
    return uf.getCount()
}

type UnionFind struct {
    count   int
    parent  []int 
    rank    []int 
}

func initUF(n int) *UnionFind {
    count := n
    parent := make([]int, n)
    rank := make([]int, n)
    for i := 0; i < n; i++ {
        parent[i] = i
        rank[i] = 1
    }
    return &UnionFind{
        count: count,
        parent: parent,
        rank: rank,
    }
}

func (uf *UnionFind) getCount() int {
    return uf.count
}

func (uf *UnionFind) find(x int) int {
    for x != uf.parent[x] {
        uf.parent[x] = uf.parent[uf.parent[x]]
        x = uf.parent[x]
    }
    return x 
}

func (uf *UnionFind) union(x, y int) bool {
    xRoot := uf.find(x)
    yRoot := uf.find(y)
    if xRoot == yRoot {
        return false
    }

    if uf.rank[xRoot] < uf.rank[yRoot] {
        uf.parent[xRoot] = yRoot
    } else if uf.rank[xRoot] > uf.rank[yRoot] {
        uf.parent[yRoot] = xRoot
    } else {
        uf.parent[xRoot] = yRoot
        uf.rank[yRoot]++
    }
    uf.count--
    return true
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

```go
func isSubtree(s *TreeNode, t *TreeNode) bool {
    if s == nil {
        return false
    }

    return checkMatch(s, t) || isSubtree(s.Left, t) || isSubtree(s.Right, t)
}

func checkMatch(s *TreeNode, t *TreeNode) bool {
    if s == nil && t == nil {
        return true
    } else if s == nil || t == nil || s.Val != t.Val {
        return false 
    }

    return checkMatch(s.Left, t.Left) && checkMatch(s.Right, t.Right)
}
```

-----

### `leetcode 622 设计循环队列`

```go
type MyCircularQueue struct {
    capacity    int
    queue       []int
    front       int 
    rear        int  
}   


func Constructor(k int) MyCircularQueue {
    capacity := k + 1
    queue := make([]int, k + 1)
    return MyCircularQueue{capacity, queue, 0, 0}
}


func (this *MyCircularQueue) EnQueue(value int) bool {
    if this.IsFull() {
        return false
    }

    this.queue[this.rear] = value
    this.rear = (this.rear + 1) % this.capacity
    return true
}


func (this *MyCircularQueue) DeQueue() bool {
    if this.IsEmpty() {
        return false 
    }

    this.front = (this.front + 1) % this.capacity
    return true
}


func (this *MyCircularQueue) Front() int {
    if this.IsEmpty() {
        return -1
    }
    return this.queue[this.front]
}


func (this *MyCircularQueue) Rear() int {
    if this.IsEmpty() {
        return -1
    }
    return this.queue[(this.rear - 1 + this.capacity) % this.capacity]
}


func (this *MyCircularQueue) IsEmpty() bool {
    return this.rear == this.front
}


func (this *MyCircularQueue) IsFull() bool {
    return (this.rear + 1) % this.capacity == this.front
}
```

----

### `leetcode 633 平方数之和`

```go
func judgeSquareSum(c int) bool {
    low := 0 
    high := int(math.Sqrt(float64(c)))
    for low <= high {
        cur := low * low + high * high 
        if cur == c {
            return true
        } else if cur < c {
            low++
        } else {
            high--
        }
    }
    return false
}
```



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

```go
func searchBST(root *TreeNode, val int) *TreeNode {
    if root == nil {
        return nil
    }

    if root.Val == val {
        return root
    } else if root.Val < val {
        return searchBST(root.Right, val)
    } else {
        return searchBST(root.Left, val)
    }
}
```

-----

### `leetcode 704 二分查找`

```go
func search(nums []int, target int) int {
    left := 0
    right := len(nums) - 1
    for left <= right {
        mid := left + (right - left) / 2
        if nums[mid] == target {
            return mid
        } else if nums[mid] < target {
            left = mid + 1
        } else {
            right = mid - 1
        }
    }
    return -1
}
```

-----

### `leetcode 739 每日温度`

```go
func dailyTemperatures(T []int) []int {
    monoStack := []int{}
    res := make([]int, len(T))
    for i := len(T) - 1; i >= 0; i-- {
        for len(monoStack) > 0 && T[i] >= T[monoStack[len(monoStack) - 1]] {
            monoStack = monoStack[:len(monoStack) - 1]
        }
        if len(monoStack) == 0 {
            res[i] = 0
        } else {
            res[i] = monoStack[len(monoStack) - 1] - i 
        }
        monoStack = append(monoStack, i)
    }
    return res
}
```



### `leetcode 867 转置矩阵`

```go
func transpose(matrix [][]int) [][]int {
    m := len(matrix)
    n := len(matrix[0])
    res := make([][]int, n)
    for i := 0; i < n; i++ {
        res[i] = make([]int, m)
    }
    for i := 0; i < m; i++ {
        for j := 0; j < n; j++ {
            res[j][i] = matrix[i][j]
        }
    }
    return res
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

### `leetcode 897 递增顺序搜索树`

```go
// 递归
func increasingBST(root *TreeNode) *TreeNode {
    if root == nil {
        return nil 
    }

    dummy := &TreeNode{}
    runner := dummy 
    var inorderTra func(root *TreeNode) 
    inorderTra = func(root *TreeNode) {
        if root == nil {
            return 
        }

        inorderTra(root.Left)
        runner.Right = root 
        root.Left = nil 
        runner = runner.Right
        inorderTra(root.Right)
    }

    inorderTra(root)
    return dummy.Right
}

// 迭代
func increasingBST(root *TreeNode) *TreeNode {
    if root == nil {
        return nil 
    }

    dummy := &TreeNode{}
    runner := dummy
    stack := []*TreeNode{}
    for len(stack) > 0 || root != nil {
        for root != nil {
            stack = append(stack, root)
            root = root.Left
        }
        node := stack[len(stack) - 1]
        stack = stack[:len(stack) - 1]
        runner.Right = node 
        runner = runner.Right
        node.Left = nil
        root = node.Right
    }
    return dummy.Right
}
```



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

-----

### `leetcode 938 二叉搜索树的范围和`

```go
func rangeSumBST(root *TreeNode, low int, high int) int {
    res := 0

    var inorderTra func(root *TreeNode)
    inorderTra = func(root *TreeNode) {
        if root == nil {
            return 
        }

        inorderTra(root.Left)
        if low <= root.Val && root.Val <= high {
            res += root.Val
        }
        inorderTra(root.Right)
    }

    inorderTra(root)
    return res
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

----

### `leetcode 958 二叉树的完全性检验`

```go
func isCompleteTree(root *TreeNode) bool {
    if root == nil {
        return true 
    }

    queue := []*TreeNode{root}
    hasPrevNull := false
    for len(queue) > 0 {
        levelSize := len(queue) 
        for i := 0; i < levelSize; i++ {
            node := queue[0]
            queue = queue[1:]
            if node == nil {
                hasPrevNull = true
            } else {
                if hasPrevNull {
                    return false
                } else {
                    queue = append(queue, node.Left)
                    queue = append(queue, node.Right)
                }
            }
        }
    }
    return true
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

----

### `leetcode 1011 在D天内送达包裹的能力`

```go
func shipWithinDays(weights []int, D int) int {
    left := 0
    right := math.MaxInt32
    for left < right {
        mid := left + (right - left) / 2
        if usedShips(weights, D, mid) {
            right = mid 
        } else {
            left = mid + 1
        }
    }
    return left
}

func usedShips(weights []int, D, capacity int) bool {
    curRemain := capacity
    for _, weight := range weights {
        if weight > capacity {
            return false
        } else if curRemain < weight {
            curRemain = capacity
            D--
        }
        curRemain -= weight
    }
    return D > 0
}
```

[参考答案](https://leetcode-cn.com/problems/capacity-to-ship-packages-within-d-days/solution/zai-dtian-nei-song-da-bao-guo-de-neng-li-by-lenn12/)

------



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

```go
func longestCommonSubsequence(text1 string, text2 string) int {
    len1 := len(text1)
    len2 := len(text2)
    dp := make([][]int, len1+1)
    for i := 0; i <= len1; i++ {dp[i] = make([]int, len2+1)} 
    for i := 1; i <= len1; i++ {
        for j := 1; j <= len2; j++ {
            if text1[i-1] == text2[j-1] {
                dp[i][j] = dp[i-1][j-1] + 1
            } else {
                dp[i][j] = max(dp[i-1][j], dp[i][j-1])
            }
        }
    }
    return dp[len1][len2]
}

func max(a, b int) int {
    if a < b {
        return b 
    }
    return a 
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

-----

### `11 旋转数组的最小数字`

```go
func minArray(numbers []int) int {
    left := 0
    right := len(numbers) - 1
    for left < right {
        mid := left + (right - left) / 2
        if numbers[mid] == numbers[right] {
            right--
        } else if numbers[mid] > numbers[right] {
            left = mid + 1
        } else {
            right = mid
        }
    }
    return numbers[left]
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

```go
func exchange(nums []int) []int {
    mark := -1
    for i := 0; i < len(nums); i++ {
        if nums[i] % 2 != 0 {
            mark++
            nums[mark], nums[i] = nums[i], nums[mark]
        }
    }
    return nums
}
```

----

### `22 链表中倒数第k个节点`

```go
func getKthFromEnd(head *ListNode, k int) *ListNode {
    slow := head
    fast := head
    for i := 0; i < k; i++ {
        fast = fast.Next
    }

    for fast != nil {
        slow = slow.Next
        fast = fast.Next
    }
    return slow
}
```



### `24 反转链表`

```go
func reverseList(head *ListNode) *ListNode {
    var pre *ListNode
    cur := head
    for cur != nil {
        next := cur.Next
        cur.Next = pre
        pre = cur
        cur = next 
    }
    return pre
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

```go
func isSubStructure(A *TreeNode, B *TreeNode) bool {
    return  (A != nil && B != nil) && (checkForMatch(A, B) || isSubStructure(A.Left, B) || isSubStructure(A.Right, B))
}

func checkForMatch(A *TreeNode, B *TreeNode) bool {
    if  B == nil {
        return true
    } else if A == nil || A.Val != B.Val {
        return false 
    }

    return checkForMatch(A.Left, B.Left) && checkForMatch(A.Right, B.Right)
}
```

-----

### `27 二叉树的镜像`

```go
func mirrorTree(root *TreeNode) *TreeNode {
    if root == nil {
        return root 
    }

    left := root.Left
    root.Left = mirrorTree(root.Right)
    root.Right = mirrorTree(left)
    return root 
}
```



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

```go
func verifyPostorder(postorder []int) bool {
    if len(postorder) < 2 {
        return true 
    }

    var recursion func(start, end int) bool 
    recursion = func(start, end int) bool{
        if start >= end {
            return true
        }

        rootVal := postorder[end]
        split := end - 1
        for split >= 0 && postorder[split] > rootVal {
            split--
        }
        for i := split; i >= 0; i-- {
            if postorder[i] >= rootVal {
                return false
            }
        }

        return recursion(start, split) && recursion(split + 1, end - 1)
    }

    return recursion(0, len(postorder) - 1)
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

### `40 最小的k个数`

```go
func getLeastNumbers(arr []int, k int) []int {
    if k <= 0 {
        return []int{}
    } else if len(arr) <= k {
        return arr
    }

    left := 0
    right := len(arr) - 1
    for {
        index := partition(arr, left, right)
        if index == k - 1 {
            break 
        } else if index < k - 1 {
            left = index + 1
        } else {
            right = index - 1
        }
    }
    return arr[:k]
}

func partition(arr []int, left int, right int) int {
    pivot := arr[left]
    mark := left
    for i := left + 1; i <= right; i++ {
        if arr[i] < pivot {
            mark++
            arr[mark], arr[i] = arr[i], arr[mark]
        }
    }
    arr[left] = arr[mark]
    arr[mark] = pivot
    return mark
}
```



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

```go
func lengthOfLongestSubstring(s string) int {
    if len(s) < 2 {
        return len(s)
    }
    
    window := make(map[byte]int)
    left := 0
    right := 0
    maxLen := 1

    for right < len(s) {
        c1 := s[right]
        window[c1]++
        for window[c1] > 1 {
            c2 := s[left]
            window[c2]--
            left++
        }
        if right - left + 1 > maxLen {
            maxLen = right - left + 1
        }
        right++
    }
    return maxLen
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

### `55-II 平衡二叉树`

```go
func isBalanced(root *TreeNode) bool {
    return checkBalance(root) != -1
}

func checkBalance(root *TreeNode) int {
    if root == nil {
        return 0
    }

    left := checkBalance(root.Left)
    if left == -1 {
        return -1
    }
    right := checkBalance(root.Right)
    if right == -1 {
        return -1
    }

    if abs(left - right) > 1 {
        return -1
    }
    return max(left, right) + 1
}

func abs(a int) int {
    if a < 0 {
        return -a 
    }
    return a 
}

func max(a, b int) int {
    if a < b {
        return b
    }
    return a 
}
```



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

----

### `68 - II 二叉树的最近公共祖先`

```go
func lowestCommonAncestor(root, p, q *TreeNode) *TreeNode {
    if root == nil || root == p || root == q {
        return root 
    }
    left := lowestCommonAncestor(root.Left, p, q)
    right := lowestCommonAncestor(root.Right, p, q)
    if left == nil {
        return right 
    } else if right == nil {
        return left 
    }
    return root
}
```



## 程序员面试金典

### `面试题 02.05 链表求和`

```go
func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
    dummy := &ListNode{}
    runner := dummy
    carry := 0
    for l1 != nil || l2 != nil || carry > 0 {
        temp := carry
        if l1 != nil {
            temp += l1.Val
            l1 = l1.Next
        }
        if l2 != nil {
            temp += l2.Val
            l2 = l2.Next
        }
        runner.Next = &ListNode{Val: temp % 10}
        runner = runner.Next
        carry = temp / 10
    }
    return dummy.Next
}
```

----

### `面试题 04.12`

```go
func pathSum(root *TreeNode, sum int) int {
    if root == nil {
        return 0
    }

    return pathSumFromRoot(root, sum) + pathSum(root.Left, sum) + pathSum(root.Right, sum)
}

func pathSumFromRoot(root *TreeNode, sum int) int {
    if root == nil {
        return 0
    }

    sum -= root.Val
    res := 0
    if sum == 0 { 
        res = 1
    }
    res += pathSumFromRoot(root.Left, sum) + pathSumFromRoot(root.Right, sum)
    return res
}
```



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

----

### `面试题 17.12 BiNode`

```go
func convertBiNode(root *TreeNode) *TreeNode {
    dummy := &TreeNode{}
    runner := dummy

    var inorderTra func(root *TreeNode) 
    inorderTra = func(root *TreeNode) {
        if root == nil {
            return 
        }

        inorderTra(root.Left)
        runner.Right = root
        runner = runner.Right
        runner.Left = nil
        inorderTra(root.Right)
    }

    inorderTra(root)
    return dummy.Right
}
```

​	
