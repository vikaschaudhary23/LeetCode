class Solution {
    public int helper(int a[], int dp[], int amount){
        if(amount==0) return 0;
        if(amount<0) return Integer.MAX_VALUE;
        if(dp[amount]!=-1) return dp[amount];
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i<a.length;i++){
            int ans = helper(a, dp, amount-a[i]);
            
            if(ans!=Integer.MAX_VALUE) min = Math.min(min, ans+1);
        }
        dp[amount] = min;
        return min;
    }
    public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount+1];
        Arrays.fill(dp,-1);
        
        int ans = helper(coins, dp, amount);
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
    }
}