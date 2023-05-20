class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==val) {
                count++;
                nums[i] = 51;
            }
        }
        Arrays.sort(nums);
        // for(int i=n-count;i<n;i++) nums[i] = 
        return n-count;
    }
}