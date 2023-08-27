//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static void helper(int[][] a, int n, int i, int j, int[][] vis, ArrayList<String> l, String s){
        if(i==n-1 && j==n-1){
            l.add(s);
            return;
        }//down
        if(i+1<n && a[i+1][j]==1 && vis[i][j]==0){
            vis[i][j] = 1;
            helper(a, n, i+1, j, vis, l, s+"D");
            vis[i][j] = 0;
        }//left
        if(j-1>=0 && a[i][j-1]==1 && vis[i][j]==0){
            vis[i][j] = 1;
            helper(a, n, i, j-1, vis, l, s+"L");
            vis[i][j] = 0;
        }//right
        if(j+1<n && a[i][j+1]==1 && vis[i][j]==0){
            vis[i][j] = 1;
            helper(a, n, i, j+1, vis, l, s+"R");
            vis[i][j] = 0;
        }//up
        if(i-1>=0 && a[i-1][j]==1 && vis[i][j]==0){
            vis[i][j] = 1;
            helper(a, n, i-1, j, vis, l, s+"U");
            vis[i][j] = 0;
        }
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        int[][] vis = new int[n][n];
        for(int a[]:vis) Arrays.fill(a, 0);
        
        ArrayList<String> l = new ArrayList<>();
        if(m[0][0]==0){
            l.add("-1");
            return l;
        }
        helper(m, n, 0, 0, vis, l, "");
        return l;
        // Your code here
    }
}