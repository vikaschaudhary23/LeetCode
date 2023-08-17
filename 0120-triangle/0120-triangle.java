class Solution {
    public int helper(List<List<Integer>> a, int i, int  j, int dp[][]){
        if(i==a.size()) return 0;
        
        if(dp[i][j]!=-1) return dp[i][j];
        
        int fir = a.get(i).get(j) + helper(a, i+1, j, dp);
        int sec = a.get(i).get(j+1) + helper(a, i+1, j+1, dp);
        
        return dp[i][j] = Math.min(fir, sec);
        
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int max_size = triangle.get(triangle.size()-1).size();
        int dp[][] = new int[triangle.size()][max_size];
        for(int a[]:dp) Arrays.fill(a, -1);
        return triangle.get(0).get(0) + helper(triangle, 1, 0, dp);
    }
}