Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0

本题相对简单，按照一般思路，很容易写出时间复杂度为O(n)的查找算法。在查看其他网友的方法后，才意识到采用二分查找，时间复杂度将变为O(log n)。

二分查找算法复杂度的计算，可以参考博客 http://blog.csdn.net/frances_han/article/details/6458067
