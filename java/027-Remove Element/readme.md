Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example:
Given input array nums = [3,2,2,3], val = 3

Your function should return length = 2, with the first two elements of nums being 2.

本题在026题的基础上，比较容易做出来，也是考虑两个指针，一个快指针，一个慢指针。

方法1与026题的方案有相似之处，时间复杂度为O(n)，空间复杂度为O(1)，实际遍历为O(2n)。

方法2考虑到了如果数组中只有少部分的元素需要移除，如果当前元素与目标元素相等，则与末尾元素进行交换，通过这样，每次能减少1个元素。

时间复杂度为O(n),空间复杂度为O(1)。
