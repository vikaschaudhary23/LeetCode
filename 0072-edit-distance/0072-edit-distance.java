class Solution {
    public int helper(String a, String b, int i, int j, int dp[][]){
        if(i==a.length()) return b.length()-j;
        if(j==b.length()) return a.length()-i;
        
        if(dp[i][j]!=-1) return dp[i][j];
        int ans=0;
        if(a.charAt(i)==b.charAt(j)) ans= helper(a, b, i+1, j+1, dp);
        else{
            int delete = helper(a, b, i+1, j, dp);
            int insert = helper(a, b, i, j+1, dp);
            int replace = helper(a, b, i+1, j+1, dp);
            ans = Math.min(delete, Math.min(insert, replace))+1;
        }
        
        return dp[i][j] = ans;
    }
    public int minDistance(String word1, String word2) {
        int dp[][] = new int[word1.length()][word2.length()];
        for(int a[]:dp) Arrays.fill(a, -1);
        
        return helper(word1, word2, 0, 0, dp);
    }
}