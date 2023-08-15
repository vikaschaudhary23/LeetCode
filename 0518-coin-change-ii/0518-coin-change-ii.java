class Solution {
    public int helper(int coins[], int[][] dp, int amount, int i){
        if(amount==0) return 1;
        if(i>=coins.length) return 0;
        
        int sel=0,nsel=0;
        if(dp[amount][i]!=-1) return dp[amount][i];
        
        if(amount>=coins[i]){
            sel = helper(coins, dp, amount-coins[i], i);
        }
        nsel = helper(coins, dp, amount, i+1);
        
        return dp[amount][i] = sel+nsel;
    }
    public int change(int amount, int[] coins) {
        int dp[][] = new int[amount+1][coins.length+1];
        for(int a[]:dp) Arrays.fill(a,-1);
        return helper(coins, dp, amount, 0);
    }
}