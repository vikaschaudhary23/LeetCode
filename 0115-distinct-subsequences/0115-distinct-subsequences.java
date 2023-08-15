class Solution {
    public int helper(String s, String t, int[][] dp, int i, int j){
        if(j==t.length()) return 1;
        if(i==s.length()) return 0;
        
        int inc=0,exc=0;
        if(dp[j][i]!=-1) return dp[j][i];
        
        if(s.charAt(i)==t.charAt(j)){
            inc = helper(s, t, dp, i+1, j+1);
        }
        exc = helper(s, t, dp, i+1, j);
        
        return dp[j][i] = inc+exc;
    }
    public int numDistinct(String s, String t) {
        int dp[][] = new int[t.length()][s.length()];
        for(int a[]:dp) Arrays.fill(a,-1);
        return helper(s, t, dp, 0, 0);
    }
}