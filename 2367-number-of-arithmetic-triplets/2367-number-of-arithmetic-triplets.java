class Solution {

    public int arithmeticTriplets(int[] nums, int diff) {
        int n = nums.length;
        int i=0,j=1,k=2;
        
        int ans=0;
        while(i<n-2 && j<n-1 && k<n){
            int d1 = (nums[j]-nums[i]), d2 = (nums[k]-nums[j]);
            if(d1==d2 && d1==diff) ans++;
            k++;
            if(k==n){
                j++;
                k=j+1;
            }
            if(k==n && j==n-1){
                i++;
                j=i+1;
                k=j+1;
            }
        }
        return ans;
    }
}