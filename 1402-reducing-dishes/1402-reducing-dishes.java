class Solution {
    public int helper(int a[], int i, int j, int dp[][]){
        if(i==a.length) return 0;
        
        if(dp[i][j]!=Integer.MIN_VALUE) return dp[i][j];
        
        int sel = a[i]*j + helper(a, i+1, j+1, dp);
        int dis = helper(a, i+1, j, dp);
        
        return dp[i][j] = Math.max(sel, dis);
    }
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int dp[][] = new int[satisfaction.length][satisfaction.length+1];
        for(int a[]:dp) Arrays.fill(a, Integer.MIN_VALUE);
        
        return helper(satisfaction, 0, 1, dp);
    }
}