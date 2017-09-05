class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = firstGreaterEqual(nums, target);
        if(start == nums.length || nums[start] != target) {
            return new int[]{-1, -1};
        }
        return new int[]{start, firstGreaterEqual(nums, target + 1) - 1};
    }
    private int firstGreaterEqual(int[] nums, int target) {
        // end = num.length 非常重要，否则会在数组只有一个元素时出错。
        int start = 0, end = nums.length;
        //start < end 保证了start <= mid < end，确保数组最后一个元素能够被访问
        while(start < end){
            int mid = start + (end - start) / 2;
            if(nums[mid] < target){
                start = mid + 1;
            }else {
                end = mid;
            }
        }
        return start;
    }
}
