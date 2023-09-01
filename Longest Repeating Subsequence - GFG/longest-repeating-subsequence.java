//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.LongestRepeatingSubsequence(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int LongestRepeatingSubsequence(String str)
    {
        int x = str.length();
        int y = x;
        
        String s2 = "";
        for(int i=0;i<y;i++) s2 += str.charAt(i);
        
        int dp[][] = new int[x+1][y+1];
        for(int i=0;i<=x;i++) dp[i][0] = 0;
        for(int i=0;i<=y;i++) dp[0][i] = 0;
        
        for(int i=1;i<=x;i++){
            for(int j=1;j<=y;j++){
                if(str.charAt(i-1) == s2.charAt(j-1) && i!=j) dp[i][j] = 1 + dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
            }
        }
        return dp[x][y];
        // code here
    }
}