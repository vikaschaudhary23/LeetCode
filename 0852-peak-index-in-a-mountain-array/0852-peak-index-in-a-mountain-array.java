class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int l=0,r=n-1;
        int mid = l+(r-l)/2;
        while(l<=r){
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]) return mid;
            else if(arr[mid]<arr[mid+1]) l = mid+1;
            else r = mid-1;
            mid = l+(r-l)/2;
        }
        return 0;
    }
}