Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

You are given a target value to search. If found in the array return its index, otherwise return -1.

You may assume no duplicate exists in the array.

本题的关键在于发现旋转后，其实为两组有序数组，例如 5 6 7 1 2 3 4，可以分为 5 6 7 和 1 2 3 4 两组有序数组来处理。如果找到 7 和 1 这个区分点，

再利用二分查找进行处理。

时间复杂度为O(log n)，空间复杂度为O(1)。
