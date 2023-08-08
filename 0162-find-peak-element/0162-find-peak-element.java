class Solution {
    public int findPeakElement(int[] nums) {
        int index=0;
        // if(nums.)
        // if(nums.length==2){
        //     return nums[0]>nums[1] ?0:1;
        // }
        for(int i=1;i<=nums.length-1;i++){
            if(nums[i]>nums[i-1]) index=i;
        }
        return index;
    }
}