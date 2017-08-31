Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the 
three integers. You may assume that each input would have exactly one solution.

For example, given array S = {-1 2 1 -4}, and target = 1.

The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

本题和题15类似，区别在于求最接近指定值的集合。话虽如此，但在实际实现时，花费了很长时间，还是没有理清楚判断条件，分析问题的能力很薄弱。
对于这一类问题的核心思想还是没有真正掌握。临界条件需要真正理解。

对于这类问题的一个关键在于变成有序数组！！！

本题的核心在于不断更新目标值！！！

时间复杂度为O(n^2)，空间复杂度为O(1).
