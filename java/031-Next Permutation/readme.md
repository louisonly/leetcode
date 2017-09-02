Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).

The replacement must be in-place, do not allocate extra memory.

Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column. 1,2,3 → 1,3,2 3,2,1 → 1,2,3 1,1,5 → 1,5,1

本题初看题目，没怎么读懂。看过解释后才知道怎么回事。如果采用暴力求解，时间复杂度会达到O(n!)，显然不合理。

参考答案中采用的是从右边起，选取一对满足nums[i+1] > nums[i]的值，并且在i的右边找出nums[j]，刚好满足nums[j]>nums[i]，交换i，j。此时，再将

i右边的数组逆序排列。时间复杂度为O(n)，最坏情况下，扫描两次数组。空间复杂度为O(1)，不需要额外空间存储数组。

思路来源： 一组降序排列的数 5 4 3 2 1，是找不到一组满足nums[i] < nums[i+1]。

注意事项：在比较大小如nums[i+1]<=nums[i]时， <=必须紧凑 < = 则会编译无法通过！！！！
