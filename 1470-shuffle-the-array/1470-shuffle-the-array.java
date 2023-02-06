class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[] = new int[2*n];
        int index=0;
        for(int i=0;i<(2*n);i+=2){
            arr[i] = nums[index];
            
            arr[i+1] = nums[n+index];
            index++;
        }
        return arr;
    }
}