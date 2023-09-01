//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.longestPalinSubseq(s));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int longestPalinSubseq(String S)
    {
        int x = S.length();
        int y = x;
        
        String s2 = "";
        for(int i=x-1;i>=0;i--) s2 += S.charAt(i);
        
        int dp[][] = new int[x+1][y+1];
        for(int i=0;i<=x;i++) dp[i][0] = 0;
        for(int i=0;i<=y;i++) dp[0][i] = 0;
        
        for(int i=1;i<=x;i++){
            for(int j=1;j<=y;j++){
                if(S.charAt(i-1) == s2.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
            }
        }
        return dp[x][y];
        //code here
    }
}