class Solution {
    public int maxArea(int[] a) {
        int n = a.length;
        int l=0,r=n-1;
        int arr[] = new int[n];
        int index=0;
        while(l<r){
            arr[index] = Math.min(a[l],a[r])*(r-l);
            if(a[l]<a[r]) l++;
            else r--;
            index++;
        }
        int max = Integer.MIN_VALUE;
        for(int i:arr){
            if(i>max) max=i;
        }
        return max;
    }
}