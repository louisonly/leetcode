Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

For example,
Given [5, 7, 7, 8, 8, 10] and target value 8,
return [3, 4].

本题时间复杂度为O(log n)，空间复杂度为O(1)。

本题目关键在于寻找上下限，可以分为两次二分查找来实现。

关键点：

1. end 的长度

2. 确保 start <= mid < end

目前对本题理解不够深入，后期需要好好研究。

说明：
本题方法1和方法3来自
作者：crazydane
链接：http://www.jianshu.com/p/7fb01346ef73
來源：简书
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

C++中STL查找，提供了求数组上下确界的函数，可以参考。
