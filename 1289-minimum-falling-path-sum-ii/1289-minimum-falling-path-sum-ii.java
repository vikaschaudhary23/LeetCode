class Solution {
    public int helper(int[][] a, int i, int j, int[][] dp){
        if(j<0 || j>=a.length) return Integer.MAX_VALUE;
        if(i==a.length-1) return a[i][j];
        if(dp[i][j]!=Integer.MIN_VALUE) return dp[i][j];
        
        int ans = Integer.MAX_VALUE;
        for(int k=0;k<a.length;k++){
            if(k!=j) ans = Math.min(ans, helper(a, i+1, k, dp));
        }
        return dp[i][j] = a[i][j] + ans;
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