class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i:nums2){
            nums1[m] = i;
            m++;
        }
        // Arrays.sort(nums1);

        int temp;
        for(int i=0;i<nums1.length-1;i++){
            int index=i;
            for(int j=i+1;j<nums1.length;j++){
                if(nums1[j]<nums1[index])
                    index=j;
            }
            temp = nums1[index];
            nums1[index] = nums1[i];
            nums1[i] = temp;
        }
        for(int i:nums1){
            System.out.print(i+" ");
        }
    }
}