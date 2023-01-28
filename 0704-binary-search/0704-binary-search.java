class Solution {
    public int search(int[] nums, int target) {
        int beg = 0,end= nums.length-1;
        int flag=-1;
        int mid = (end+beg)/2;
        while(beg<=end){
            if(nums[mid]>target){
                end=mid-1;
            }
            else if(nums[mid]==target){
                // System.out.println(mid);
                flag=mid;
                break;
            }
            else{
                beg=mid+1;
            }
            mid = (beg+end)/2;
        }
      
        return flag;
        
    }
}