Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container and n is at least 2.

读题时没有领会到题目意思，最初以为是求解梯形区域面积。题目已经指明为求解容纳水最多时对应的容器面积，此时，应该为长方形的面积。

方法1采用暴力求解，时间复杂度为O(n^2)，匹配次数为n*(n-1)/2。空间复杂度为O(1)。
