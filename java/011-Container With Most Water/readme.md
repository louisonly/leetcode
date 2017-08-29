Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container and n is at least 2.

读题时没有领会到题目意思，最初以为是求解梯形区域。题目已经指明为求解容纳水最多时对应的容器容量，此时，应该为长方形的区域。

方法1采用暴力求解，时间复杂度为O(n^2)，匹配次数为n*(n-1)/2。空间复杂度为O(1)。

方法2采用两个指针往两边移动的方式获取最大值。初始化为数组头与数组末尾，此时宽度最大，移动高度值较小一边的指针，有可能使得容量取得更优值。
case个数为n-1，时间复杂度为O(n)，空间复杂度为O(1)。
