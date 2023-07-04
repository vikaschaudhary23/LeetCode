class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans=0;
        if(k<=1) return ans;
        int left=0,right=0;
        long product=1;
        int n = nums.length;
        while(right<n){
            product *= nums[right];
            while(left<n && product>=k){
                product /= nums[left];
                left++;
            }
            ans += (right-left+1);
            right++;
        }
        return ans;
    }
}