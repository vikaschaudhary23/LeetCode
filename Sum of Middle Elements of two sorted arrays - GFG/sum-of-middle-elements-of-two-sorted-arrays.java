//{ Driver Code Starts
// Initial Template for Java

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

  public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] ar1 = new int[n], ar2 = new int[n];
            String[] inputLine = br.readLine().split(" ");

            for (int i = 0; i < n; i++) {
                ar1[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                ar2[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().findMidSum(ar1, ar2, n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int findMidSum(int[] ar1, int[] ar2, int n) {
        // int i=0,j=0,index=0;
        // int ans=0,element= 0;
        // if(n==1) return ar1[0]+ar2[0];
        // while(i<n && j<n){
        //     // System.out.print(element+" ");
        //     if(index==n){
        //         ans += element;
        //     }
        //     if(index==n+1){
        //         ans+=element;
        //         break;
        //     }
        //     if(ar1[i]<=ar2[j]){
        //         element = ar1[i];
        //         i++;
        //     }
        //     else{
        //         element=ar2[j];
        //         j++;
        //     }
        //     index++;
        // }
        int a[] = new int[2*n];
        int i;
        for(i=0;i<n;i++) a[i] = ar1[i];
        for(int j=0;j<n;j++) a[j+i] = ar2[j];
        Arrays.sort(a);
        int ans = a[n]+a[n-1];
        return ans;
        // code here
    }
}