class Solution {
    public int helper(int a[], int b[], int i, int j, int dp[][]){
        if(i==a.length || j==b.length) return 0;
        
        int ans=0;
        if(dp[i][j]!=-1) return dp[i][j];
        
        if(a[i]==b[j]) ans = 1+ helper(a, b, i+1, j+1, dp);
        else{
            int fs = helper(a, b, i+1, j, dp);
            int ss = helper(a, b, i, j+1, dp);
            ans = Math.max(fs, ss);
        }
        return dp[i][j] = ans;
    }
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int dp[][]= new int[nums1.length][nums2.length];
        for(int a[]:dp) Arrays.fill(a, -1);
        
        return helper(nums1, nums2, 0, 0, dp);
    }
}