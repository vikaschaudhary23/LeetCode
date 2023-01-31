class Solution {
    public int fun(int n){
        int sum=0;
        while(n>0){
            sum += n%10;
            n/=10;
        }
        return sum;
    }
    public int differenceOfSum(int[] nums) {
        int ans=0;
        for(int i:nums){
            if(i>9){
                ans += Math.abs(i-fun(i));
            }
        }
        return ans;
    }
}