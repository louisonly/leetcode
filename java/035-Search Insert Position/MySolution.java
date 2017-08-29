class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = nums.length;
        if(target < nums[0]){
            return 0;
        }
        if(target > nums[l-1]){
            return l;
        }
        for(int i = 0; i < l; i++){
            if(nums[i] == target){
                return i;
            }
            if((nums[i] < target) && (nums[i+1] > target)){
                return i+1;
            }
        }
        return -1;
    }
}
