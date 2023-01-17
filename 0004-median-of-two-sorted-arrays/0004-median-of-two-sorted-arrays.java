class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length,length2 = nums2.length,len=length1+length2;
        int nums[] = new int[len];
        for(int i=0;i<length1;i++){
            nums[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            nums[length1+i]=nums2[i];
        }
        Arrays.sort(nums);
        double median=0;
        if(len%2!=0)
            median = (double)(nums[len/2]) ;
        else
            median = (double)(nums[len/2]+nums[len/2 - 1])/2;
        return median;
    }
}