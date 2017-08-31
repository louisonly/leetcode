class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[nums.length-1];
        Arrays.sort(nums);
        for(int i = 0; i < nums.length -2; i++){
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])){  //判断条件可以是if(i==0 || nums[i]!=nums[i-1])
                int start = i + 1, end = nums.length -1;
                while(start < end){
                    int sum = nums[i] + nums[start] + nums[end];
                    if(sum > target){
                        while(start < end && nums[end] == nums[end-1]) end--;
                        end--;
                    }else if(sum < target){
                        while(start < end && nums[start] == nums[start+1]) start++;
                        start++;
                    }else return sum;
                    if(Math.abs(sum - target) < Math.abs(result - target)){
                        result = sum;
                    }
                }
            }
        }
        return result;
    }
}
