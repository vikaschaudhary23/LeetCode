class Solution {
    public int countVowelStrings(int n) {
        int dp[][] = new int[n+1][6];
        Arrays.fill(dp[0], 1);
        for(int i=1;i<=n;i++){
            for(int j=1;j<6;j++){
                dp[i][j] = dp[i-1][j] + (j>1 ? dp[i][j-1] : 1);
            }
        }
        return dp[n][4];
    }
}