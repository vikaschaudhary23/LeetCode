class Solution {
    public int ans(int n, int a[]){
        if(n==0 || n==1) return n;
        if(a[n]!=0) return a[n];
        a[n] = ans(n-1,a)+ans(n-2,a);
        return a[n];
    }
    public int fib(int n) {
        int a[] = new int[n+1];
        return ans(n,a);
    }
}