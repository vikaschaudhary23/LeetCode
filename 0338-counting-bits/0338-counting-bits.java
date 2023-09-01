class Solution {
    public int count(int n){
        int count=0;
        while(n>0){
            int rem=n%2;
            if(rem==1)count++;
            n/=2;
        }
        return count;
    }
    public int[] countBits(int n) {
        int arr[] = new int[n+1];
        for(int i=0;i<n+1;i++){
            arr[i] = count(i);
        }
        return arr;
    }
}