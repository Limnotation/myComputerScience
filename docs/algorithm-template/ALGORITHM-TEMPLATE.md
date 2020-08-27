## 排序

-----

### 快速排序

#### partition

##### 双边循环法：

```java
/**
* 分治法（双边循环法求pivot）
* @param	arr			待排序数组
* @param	startIndex	 起始下标
* @param	endIndex	 结束下标
*/

private static int partition(int[] arr, int startIndex, int endIndex) {
    int pivot = arr[startIndex];
    int left = startIndex, right = endIndex;
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
*/
private static int partition(int[] arr, int startIndex, int endIndex) {
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
    Stack<Integer> stack = new LinkedList<>();
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

算法遍历数组一次，维护一个指针`less`使得`arr[low..less - 1]`中的元素都小于 `v`,一个指针`great`使得 `arr[great + 1..high]`中的元素都大于`v`,一个指针 `i`使得 `arr[less..i-1]`中的元素都等于 `v`,`arr[i..great]`中的元素都还未确定

一开始`i`和`low`相等，算法流程如下：

- `arr[i]`小于`v`,将`arr[less]`和`arr[i]`交换，将`less`和`i`加一
- `arr[i]`大于`v`,将`arr[great]`和`arr[i]`交换，将`great`减一
- `arr[i]`等于 `v`,将`i`加一

##### 算法实现代码

```java
// 
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
public static quickSortThreeWay(int[] arr, int low, int high) {
    if(high <= low) {
        return;
    }

    int less = low, i = low, great = high;
    int pivotVal = arr[low];
    while(i <= great) {
        if(arr[i] < pivotVal) {
            swap(arr, less++, i++);
        } else if(arr[i] > pivotVal) {
            swap(arr, i, great--);
        } else {
            i++;
        }
    }
    quickSortThreeWay(arr, low, less - 1);
    quickSortThreeWay(arr, great + 1, high);
}

private void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
```

