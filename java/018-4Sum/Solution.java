class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new LinkedList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length -3 ; i++){
            if(i == 0 || nums[i] != nums[i-1]){
                for(int j = i + 1; j < nums.length - 2; j++){
                    if(j == i + 1 || nums[j] != nums[j-1]){  //这儿 j == i + 1 的判断条件很关键，否则会出错，
                        int start = j + 1, end = nums.length -1, value = target - nums[i] - nums[j];
                        while(start < end){
                            if(nums[start] + nums[end] == value){
                                res.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));
                                while(start < end && nums[start] == nums[start+1]) start++;
                                while(start < end && nums[end] == nums[end-1]) end--;
                                start++; end--;
                            }else if(nums[start] + nums[end] > value){
                                end--;
                            }else start++;
                        }
                   }
                }
            }
        }
        return res;
    }
}
