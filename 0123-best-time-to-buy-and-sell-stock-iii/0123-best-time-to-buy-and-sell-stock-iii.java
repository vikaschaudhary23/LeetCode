class Solution {
    public int helper(int a[], int i, int buy, int cap, int dp[][][]){
        if(cap==0) return 0;
        if(i==a.length) return 0;
        
        if(dp[i][buy][cap]!=-1) return dp[i][buy][cap];
        
        if(buy==1){
        return dp[i][buy][cap] = Math.max(-1*a[i] + helper(a, i+1, 0, cap, dp), helper(a, i+1, 1,cap, dp));
        }
        return dp[i][buy][cap] = Math.max(a[i] + helper(a, i+1, 1, cap-1, dp), helper(a, i+1, 0,cap, dp));
    }
    
    
    public int maxProfit(int[] prices) {
        int dp[][][] = new int[prices.length][2][3];
        for(int i=0;i<prices.length;i++){
            for(int a[]:dp[i]) Arrays.fill(a, -1);
        }
        return helper(prices, 0 ,1, 2, dp);
    }
}