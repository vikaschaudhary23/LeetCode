class Solution {
    public void reverse(int arr[], int a, int b){
        int start=a,end=b-1;
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    public void rotate(int[] nums, int k) {
        k %= nums.length;
            reverse(nums, 0, nums.length);
            reverse(nums, 0,k);
            reverse(nums,k,nums.length);
    }
}