class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]+nums[i+1] > nums[i+2]) ans= (nums[i]+nums[i+1]+nums[i+2]);
        }
        return ans;
    }
}