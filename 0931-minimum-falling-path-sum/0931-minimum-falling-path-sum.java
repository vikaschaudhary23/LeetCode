class Solution {
    public int helper(int[][] a, int i, int j, int[][] dp){
        if(j<0 || j>=a.length) return Integer.MAX_VALUE;
        if(i==a.length-1) return a[i][j];
        if(dp[i][j]!=Integer.MIN_VALUE) return dp[i][j];
        
        int lver = helper(a, i+1, j-1, dp);
        int down = helper(a, i+1, j, dp);
        int rver = helper(a, i+1, j+1, dp);
        
        return dp[i][j] = a[i][j] + Math.min(down, Math.min(lver, rver));
    }
    
    public int minFallingPathSum(int[][] matrix) {
        int [][]dp = new int[matrix.length][matrix.length];
        for(int []a:dp) Arrays.fill(a, Integer.MIN_VALUE);
        
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            ans = Math.min(ans, helper(matrix, 0, i, dp));
        }
        return ans;
    }
}