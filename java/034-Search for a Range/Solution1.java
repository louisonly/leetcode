class Solution {
    public int[] searchRange(int[] nums, int target) {
        int array[] = new int[2];
        array[0]=-1;
        array[1]=-1;
        if(nums.length==0||nums==null){
            return array;
        }

        int start = -1;
        int end = nums.length;
        int mid;
        while(start+1<end){
            mid = start+(end-start)/2;
            if(nums[mid]==target){
                int left= mid;
                int right = mid;
                while(right<nums.length&&nums[right]==target){
                    right++;
                }
                while(left>=0&&nums[left]==target){
                    left--;
                }
                array[0]=left+1;
                array[1]=right-1;
                return array;
            }else{
                if(nums[mid]<target){
                    start = mid;
                }else{
                    end = mid;
                }
            }
        }

        return array;
    }
}
