//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s[] = read.readLine().split(" ");
            int N = Integer.parseInt(s[0]);
            int M = Integer.parseInt(s[1]);
            int A[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String S[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) {
                    A[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution ob = new Solution();
            System.out.println(ob.minRow(N, M, A));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int minRow(int N, int M, int A[][]) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<N;i++){
            int count=0;
            for(int j=0;j<M;j++){
                if(A[i][j]==1) count++;
            }
            map.put(i,count);
        }
        int ans=0,min=A[0].length;
        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
            if(entry.getValue()<min) {
                ans = entry.getKey();
                min = entry.getValue();
            }
        }
        // System.out.println(map);
        return ans+1;
        // code here
    }
};