class Solution {
    public int helper(int[][] a, int i, int j, int dp[][]){
        if(i==a.length-1 && j==a[0].length-1) return a[i][j];
        if(i==a.length || j==a[0].length) return Integer.MAX_VALUE;
        if(dp[i][j]!=-1) return dp[i][j];
        
        int down = helper(a, i+1, j, dp);
        int right = helper(a, i, j+1, dp);
        
        return dp[i][j] = a[i][j] + Math.min(down, right);
    }
    public int minPathSum(int[][] grid) {
        int dp[][] = new int[grid.length][grid[0].length];
        for(int a[]:dp) Arrays.fill(a, -1);
        return helper(grid, 0, 0, dp);
    }
}