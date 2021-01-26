## 数据结构

### 二叉查找树

#### 概念

> 定义：一棵二叉查找树(BST)是一棵二叉树，其中每个节点都含有一个Comparable的键(以及相关联的值)且每个节点的键都大于其左子树中的任意节点的键而小于右子树的任意节点的键

#### 代码实现

```java
/**
 * @ClassName: BST
 * @Author: Limn Deng
 * @Date: 2020/6/21
 * @Time: 17:04
 * @Description: 二叉搜索树的实现
 */

public class BST<Key extends Comparable<Key>, Value>  {

    /** 二叉搜索树的根节点 */
    private Node root;

    /** 二叉树节点定义 */
    private class Node {
        /** 键 */
        private Key key;
        /** 值 */
        private Value value;
        /** 左子树 */
        private Node left;
        /** 右子树 */
        private Node right;
        /** 以该节点为根节点的BST的节点总数*/
        private int N;

        public Node(Key key, Value value, int N) {
            this.key = key;
            this.value = value;
            this.N = N;
        }
    }

    /**
     * 获取BST的节点数量
     * */
    public int size() {
        return size( root );
    }

    private int size(Node root) {
        if(root == null) {
            return 0;
        } else {
            return root.N;
        }
    }

    /**
     * 在BST中查找节点
     * */
    public Value get(Key key) {
        return get(root, key);
    }

    private Value get(Node root, Key key) {
        if(root == null) {
            return null;
        }
        int cmp = key.compareTo(root.key);
        if(cmp < 0) {
            return get(root.left, key);
        } else if(cmp > 0) {
            return get(root.right, key);
        } else {
            return root.value;
        }
    }

    /**
     * 向BST中插入新值
     * */
    public void put(Key key, Value value) {
        root = put(root, key, value);
    }

    private Node put(Node root, Key key, Value value) {
        if(root == null) {
            return new Node(key, value, 1);
        }

        int cmp = key.compareTo(root.key);
        if(cmp < 0) {
            root.left = put(root.left, key, value);
        } else if(cmp > 0) {
            root.right = put(root.right, key, value);
        } else {
            root.value = value;
        }
        root.N = size(root.left) + size(root.right) + 1;
        return root;
    }

    /**
     * 获取BST中值最小的节点
     * */
    public Key min() {
        return min(root).key;
    }

    private Node min(Node root) {
        if(root.left == null) {
            return root;
        }
        return min(root.left);
    }

    /**
     * 获取BST中小于等于key的最大键的节点
     * 1、如果给定的键key小于二叉查找树根节点的键，那么小于等于key的最大键
     *    floor(key)一定在根节点的左子树中
     * 2、如果给定的键key大于二叉查找树的根节点，那么只有当根节点的右子树中
     *    存在小于等于key的节点时，小于等于key的最大键才会出现在右子树中，
     *    否则根节点就是小于等于key的最大大键
     * */
    public Key floor(Key key) {
        Node x = floor(root, key);
        if(x == null) {
            return null;
        }
        return x.key;
    }

    private Node floor(Node root, Key key) {
        if(root == null) {
            return null;
        }

        int cmp = key.compareTo(root.key);
        if(cmp == 0) {
            return root;
        } else if(cmp < 0) {
            return floor(root.left, key);
        }
        Node node = floor(root.right, key);
        if(node != null) {
            return node;
        } else {
            return root;
        }
    }

    /**
     * 获取BST中排名为k的节点的值，排名从1开始
     * */
    // 这里的代码逻辑与《算法4》中的代码有所区别，注意区分即可
    public Key select(int k) {
        return select(root, k).key;
    }

    private Node select(Node root, int k) {
        if(root == null) {
            return null;
        }

        int leftSize = size(root);
        if(leftSize == k - 1) {
            return root;
        } else if(leftSize < k - 1) {
            return select(root.right, k - leftSize - 1);
        } else {
            return select(root.left, k);
        }
    }

    /**
     * 获取key对应的节点在BST中的排名，排名从1开始
     * */
    // 这里的代码逻辑与《算法4》中的代码有所区别，注意区分即可
    public int rank(Key key) {
        return rank(root, key);
    }

    private int rank(Node root, Key key) {
        if(root == null) {
            return 0;
        }

        int cmp = key.compareTo(root.key);
        if(cmp < 0) {
            return rank(root.left, key);
        } else if(cmp > 0) {
            return 1 + size(root.left) + rank(root.right, key);
        } else {
            return size(root.left) + 1;
        }
    }

    /**
     * 删除BST中的最小键
     * */
    public void deleteMin() {
        root = deleteMin(root);
    }

    private Node deleteMin(Node root) {
        if(root.left == null) {
            return root.right;
        }
        root.left = deleteMin(root.left);
        root.N = size(root.left) + size(root.right) + 1;
        return root;
    }

    /**
     * 二叉搜索树删除节点
     * 完成节点root的删除需要四个步骤：
     * 1、将指向待删除节点的链接保存为node
     * 2、将root指向它的后继节点:min(node)
     * 3、将root的右链接(原本指向一棵所有节点都大于root.key的二叉查找树)
     *    指向deleteMin(node.right),也就是在删除该节点后所有节点仍然大
     *    于root.key的子二叉查找树
     * 4、将root的左链接(本为空)设为node.left,其下所有节点都小于被删除的
     *    节点和它的后继节点
     * */
    public void delete(Key key) {
        root = delete(root, key);
    }

    private Node delete(Node root, Key key) {
        if(root == null) {
            return null;
        }

        int cmp = key.compareTo(root.key);
        if(cmp < 0) {
            root.left = delete(root.left, key);
        } else if(cmp > 0) {
            root.right = delete(root.right, key);
        } else {
            if(root.right == null) {
                return root.left;
            } else if(root.left == null) {
                return root.right;
            }
            Node node = root;
            root = min(node.right);
            root.right = deleteMin(node.right);
            root.left = node.left;
        }
        root.N = size(root.left) + size(root.right) + 1;
        return root;
    }
}

```



-----

### 堆

#### 堆有序

> 定义：当一棵二叉树的每个节点都大于它的两个子节点时，它被称为堆有序 					

#### 二叉堆

> 定义：二叉堆是一组能够用堆有序的完全二叉树排序的元素，并在数组中按照层级存储(不使用数组的第一个位置)

#### 以数组表示的二叉堆

> 在一个堆中，位置k的父节点的位置为(k/2)，而它的两个子节点的位置分别为 2k 和 2k + 1

#### 代码实现

> 参考:《算法 第四版》

```java
/**
 * @ClassName: MaxPQ
 * @Author: Limn Deng
 * @Date: 2020/9/18
 * @Time: 22:01
 * @Description: 基于堆的优先队列
 */

public class MaxPQ<Key extends Comparable<Key>> {
    /** 基于堆的完全二叉树 ,数组的第一个位置不使用*/
    private Key[] heap;
    /** 优先队列的容量*/
    private int size = 0;

    /** 构造函数，由于第一个位置不使用，要多给一个数组位置*/
    public MaxPQ(int initialCapacity) {
        this.heap = (Key[]) new Comparable[initialCapacity + 1];
    }

    /**
     * 判断队列是否为空
     * */
    public boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * 获取队列元素数量
     * */
    public int size() {
        return this.size;
    }

    /**
     * 向队列中添加元素
     * @param value 被加入到堆末尾的元素
     * */
    public void insert(Key value) {
        size++;
        heap[size] = value;
        swin(size);
    }
    
    /**
     * 删除队列的最大元素
     * */
    public Key deleteMax() {
        Key max = heap[1];
        size--;
        exchange(1, size);
        heap[size + 1] = null;
        sink(1);
        return max;
    }

    /**
     * 比较索引i和j处元素的大小
     * @param i
     * @param j
     * @return true if heap[i] is less than heap[j], false otherwise
     * */
    private boolean less(int i, int j) {
        return heap[i].compareTo(heap[j]) < 0;
    }

    /**
     * 交换数组中索引i和j处的元素
     * @param i
     * @param j
     * */
    private void exchange(int i, int j) {
        Key temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    /**
     * 由下至上将数组堆有序化,K代表的元素可能大于其父节点，此时需要将k与
     * 父节点交换位置，直到到达了根节点的位置或者满足了堆有序的条件
     * @param k 数组中使得堆有序不成立的元素的索引，对应元素大于其父节点
     * */
    private void swin(int k) {
        while(k > 1 && less(k/2, k)) {
            exchange(k/2, k);
            k = k / 2;
        }
    }
    
    /**
     * 由上之下的堆有序化,k代表的元素可能小于其子节点，此时需要将k与其子节
     * 点中的最大值进行交换，直到该节点再无子节点或者满足了堆有序的条件
     * @param k 数组中使得堆有序不成立的元素的索引，对应元素小于其子节点
     * */
    private void sink(int k) {
        while(2 * k <= size) {
            int j = 2 * k;
            if(j < size && less(j, j + 1)) {
                j++;
            }
            if(!less(k, j)) {
                break;
            }
            exchange(k, j);
            k = j;
        }
    }
}
```



-----

## 排序

-----

### 选择排序

```java
public int[] selectionSort(int[] nums) {
    int len = nums.length;
    for(int i = 0; i < len - 1; i++) {
        /**
        * 循环不变量:[0, i)内的元素已经有序
         */
        int minIndex = i;
        // 选择区间[i, len - 1]内最小的元素
        for(int j = i + 1; j < len; j++) {
            if(nums[j] < nums[minIndex]) {
                minIndex = j;
            }
        }
        swap(nums, i, minIndex);
    }
    return nums;
}

private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}
```

------

### 插入排序

```java
public int[] insertionSort(int[] nums) {
    int len = nums.length;
    for(int i = 1; i < len; i++) {
        /**
        * 循环不变量:将nums[i]插入到区间[0, i)使该部分有序
         */
        int temp = nums[i];
        int j = i;
        while(j > 0 && nums[j-1] > temp) {
            nums[j] = nums[j-1];
            j--;
        }
        nums[j] = temp;
    }
    return nums;
}
```

----

### 快速排序

#### partition

##### 双边循环法：

```java
/**
* 分治法（双边循环法求pivot）
* @param	arr			待排序数组
* @param	startIndex	 起始下标
* @param	endIndex	 结束下标
* @return	pivot的下标
*/
private static int partition(int[] arr, int startIndex, int endIndex){
    int pivot = arr[startIndex];
    int left = startIndex;
    int right = endIndex;
    while(left != right) {
        // 移动右指针
        while(left < right && arr[right] > pivot) {
            right--;
        } 
        // 移动左指针
        while(left < right && arr[left] <= pivot) {
            left++;
        }
        
        // 交换左右指针元素
        if(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
    }
    
    // pivot和指针重合点交换
    arr[startIndex] = arr[left];
    arr[left] = pivot;
    return left;
}
```

##### 单边循环法：

```java
/**
* 分治法（单边循环法求pivot）
* @param	arr			待排序数组
* @param	startIndex	 起始下标
* @param	endIndex	 结束下标
* 
* 循环不变量:
* 1、[startIndex + 1, mark]内所有元素小于pivot
* 2、(mark, i]内所有元素大于等于pivot
 */
private int partition(int[] arr, int startIndex, int endIndex) {
    int pivot = arr[startIndex];
    int mark = startIndex;
    for(int i = startIndex + 1; i <= endIndex; i++) {
        if(arr[i] < pivot) {
            mark++;
            int temp = arr[mark];
            arr[mark] = arr[i];
            arr[i] = temp;
        }
    }
    // pivot与划分点位置元素交换
    // 在交换完成之后，有:[left, mark - 1] < pivot, nums[mark] == pivot, [mark + 1, right] >= pivot
    arr[startIndex] = arr[mark];
    arr[mark] = pivot;
    return mark;
}
```

-----

#### 快速排序的递归实现

```java
public static void quickSort(int[] arr, int startIndex, int endIndex) {
    if(startIndex >= endIndex) {
        return;
    }
    
    int pivot = partition(arr, startIndex, endIndex);
    quickSort(arr, startIndex, pivot - 1);
    quickSort(arr, pivot + 1, endIndex);
}
```

-----

#### 快速排序的非递归实现

```java
public static void quickSort(int[] arr, int startIndex, int endIndex) {
    Deque<Integer> stack = new LinkedList<>();
    stack.addLast(startIndex);
    stack.addLast(endIndex);
    
    while(!stack.isEmpty()) {
        int high = stack.removeLast();
        int low = stack.removeLast();
        // 计算分界点
        int pivot = partition(arr, low, high);
        // 判断子区间是否还需要分割
        if(pivot > low) {
            stack.addLast(low);
            stack.addLast(pivot - 1);
        }
        if(pivot < high && pivot >= 0) {
            stack.addLast(pivot + 1);
            stack.addLast(high);
        }
    }
}
```
-------

#### 三向切分快速排序

##### 概念说明

- 在数组中存在大量重复元素时，普通的快速排序算法会在partition过程重复操作这些元素；为了改进算法的这个缺陷，提出这样一个思想：在切分时将数组分为三个部分：分别对应小于、等于和大于切分元素的数组元素

##### 算法说明

数组`arr`的边界为`[low, high]`，`pivot`元素的值为`v`

算法遍历数组一次，一共维护三个指针 `less、i、great`,指针间的关系如下

- 维护指针`less`使得`arr[low..less - 1]`中的元素都小于 `v`
- 维护指针`great`使得 `arr[great + 1..high]`中的元素都大于`v`
- 维护指针 `i`使得 `arr[less..i-1]`中的元素都等于 `v`
- `arr[i..great]`中的元素都还未确定

算法流程如下：

- 初始状态：`less == low、i == low、great == high`
- `arr[i]`小于`v`,将`arr[less]`和`arr[i]`交换，将`less`和`i`加一
- `arr[i]`大于`v`,将`arr[great]`和`arr[i]`交换，将`great`减一
- `arr[i]`等于 `v`,将`i`加一
- 迭代前三步直到`i > great`

##### 算法实现代码

```java
/*
    * Partitioning degenerates to the traditional 3-way
    * (or "Dutch National Flag") schema:
    *
    *   left part    center part              right part
    * +-------------------------------------------------+
    * |  < pivot  |   == pivot   |     ?    |  > pivot  |
    * +-------------------------------------------------+
    *              ^              ^        ^
    *              |              |        |
    *             less            k      great
    *
    * Invariants:
    *
    *   all in (left, less)   < pivot
    *   all in [less, k)     == pivot
    *   all in (great, right) > pivot
    *
    * Pointer k is the first index of ?-part.
    */
private void quickSortThreeWay(int[] arr, int left, int right) {
    // 递归终止条件
    if(high <= left) {
        return;
    }

    int less = left;
    int i = left;
    int great = right;
    int pivotVal = arr[left];
    while(i <= great) {
        if(arr[i] < pivotVal) {
            swap(arr, less, i);
            less++;
            i++;
        } else if(arr[i] > pivotVal) {
            swap(arr, i, great);
            great--;
        } else {
            i++;
        }
    }
    quickSortThreeWay(arr, left, less - 1);
    quickSortThreeWay(arr, great + 1, right);
}

private void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
```

-------

### 归并排序



```java
// 辅助数组，帮助进行归并排序
private int[] copy;

/**
* 对数组进行归并排序
* @param nums	要进行排序的数组
* @param left	左边界
* @param right	右边界
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
        }
        k++;
    }
    for(k = left; k <= high; k++) {
        nums[k] = copy[k];
    }
}
```

-----

### 堆排序

```java
/**
* 在 数据结构->堆 章节中，声明堆时不使用数组的第一个元素，在实现堆排序时为了方便会使用数组的第一个位置
* 在使用数组的第一个位置时，索引关系如下：
* 	1、设当前节点位置为k
*	2、当前节点的父节点为(k - 1) / 2;
*	3、当前节点的两个子节点分别为(2*k + 1)和(2*k + 2)
*
* 在堆排序中另一个重要的性质为：
*	数组长度为len,则表示堆的完全二叉树中第一个非叶节点的下标为(len / 2) - 1
*/
public class heapSort {
    /**
    * 对元素进行下沉操作
    * @param	heap     存储堆的数组
    * @param	index	 将被下沉的节点在数组中的索引
    * @param	length	 在堆排序中，这个数值表示未排序部分的长度
     */
    private void sink(int[] heap, int index, int length) {
        int temp = heap[index];
        int childIndex = 2 * index + 1;
        while(childIndex < length) {
            // 当前节点与其两个子节点中的最大值做交换
            if(childIndex + 1 < len && heap[childIndex] < heap[childIndex + 1]) {
                childIndex++;
            }
            // 如果当前节点与子节点满足堆有序则停止下沉操作
            if(temp > heap[childIndex]) {
                break;
            }
            heap[index] = heap[childIndex];
            index = childIndex;
            childIndex = 2 * index + 1;
        } 
        heap[index] = temp;
    }
    
    /**
    * 堆排序
    * @param	heap	待排序的数组
     */
    public void heapSort(int[] heap) {
        int len = heap.length;
        // 将数组构建成二叉堆
        for(int i = len / 2 - 1; i >= 0; i--) {
            sink(heap, i, len);
        }
        // 循环不变量:[0, i]堆有序，其余部分全局有序
        for(int i = len - 1; i > 0; i--) {
            int temp = heap[i];
            heap[i] = heap[0];
            heap[0] = temp;
            // "下沉"调整剩余堆有序的数组元素
            sink(heap, 0, i);
        }
    }
}
```

