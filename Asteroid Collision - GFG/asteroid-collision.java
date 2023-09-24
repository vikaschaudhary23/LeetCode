//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int N;
            N = sc.nextInt();

            int[] asteroids = new int[N];
            for (int i = 0; i < N; i++) asteroids[i] = sc.nextInt();

            Solution obj = new Solution();
            int[] res = obj.asteroidCollision(N, asteroids);

            for (int e : res) System.out.print(e + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int[] asteroidCollision(int N, int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        for(int i:asteroids){
            while(!s.isEmpty() && s.peek()>0 && i<0){
                int sum = s.peek() + i;
                if(sum<0) s.pop();
                else if(sum>0) i=0;
                else {
                    s.pop();
                    i=0;
                }
            }
            if(i!=0) s.push(i);
        }
        // System.out.println(s);
        int arr[] = new int[s.size()];
        int i=arr.length-1;
        while(!s.isEmpty()){
            arr[i] = s.peek();
            s.pop();
            i--;
        }
        return arr;
    }
}
