class Solution {
    public void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        // for(int i=0;i<n;i++){
        //     while(nums[i]>0 && nums[i]<=n && nums[i]!=nums[nums[i]-1])
        //         swap(nums[i],nums[nums[i]]-1);
        // }
        
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                swap(nums, i, nums[i] - 1);
            }
        }
        
        for(int j=0;j<n;j++){
            if(j+1 != nums[j]) return j+1;
        }
        return n+1;
    }
}