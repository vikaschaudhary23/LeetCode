class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a[] = new int[2];
		int n = numbers.length;
		int l=0,r=n-1;
        while(r>=l){
            int ans = numbers[l] + numbers[r];
            if(target-ans ==0){
                a[0] = l+1;
                a[1] = r+1;
                return a;
            }
            else if(ans>target) r--;
            else l++;
        }
		return a;
    }
}