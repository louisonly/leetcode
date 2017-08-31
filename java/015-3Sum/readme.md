Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note: The solution set must not contain duplicate triplets.
For example, given array S = [-1, 0, 1, 2, -1, -4],
A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]

初看本题，并没有任何思路。想到的暴力求解，时间复杂度为O(n^3)，并且没有理清楚循环终止条件。
查看网上其他作者的答案后，才有所思路。本次习题收获如下：

1. 避免重复结果集，可以先将数组进行排序！！！

2. 反复判断数组中重复数值的情况，体现在nums[i] nums[start] nums[end]前后数值的反复判断，从而避免结果集数值重复。

3. 有必要了解Java Set去重。

时间复杂度为O(n^2)，空间复杂度为O(1)。
