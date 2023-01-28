class Solution {
    public int searchInsert(int[] nums, int target) {
       
        int start=0,end=nums.length-1;
        int mid = (start+end)/2;
        int flag=0;
        while(start<=end){
            if(nums[mid]==target){
                flag=1;
                break;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
            mid = (start+end)/2;
        }
        if(flag==0 && target>=nums[0])
            mid++;
        return mid;
    }
}