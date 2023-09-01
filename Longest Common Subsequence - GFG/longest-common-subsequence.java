//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {

		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-- > 0){
		    int p=sc.nextInt();             // Take size of both the strings as input
		    int q=sc.nextInt();
		    
		    String s1=sc.next();            // Take both the string as input
	        String s2=sc.next();
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.lcs(p, q, s1, s2));
		}
	}
}
// } Driver Code Ends


class Solution
{
    static int lcs0(int x, int y, String s1, String s2, int dp[][])
    {
        if(x==0 || y==0) return 0;
        if(dp[x][y]!=-1) return dp[x][y];
        if(s1.charAt(x-1) == s2.charAt(y-1)) dp[x][y] = 1 + lcs0(x-1, y-1, s1, s2, dp);
        else dp[x][y] = Math.max(lcs0(x-1, y, s1, s2, dp), lcs0(x, y-1, s1, s2, dp));
        
        return dp[x][y];
        // your code here
    }
    
    static int lcs(int x, int y, String s1, String s2)
    {
        int dp[][] = new int[x+1][y+1];
        for(int a[]:dp) Arrays.fill(a, -1);
        return lcs0(x, y, s1, s2, dp);

        // your code here
    }
    
}