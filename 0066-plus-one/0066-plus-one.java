class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length-1;
        for(int i=n;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int a[] = new int[n+2];
        a[0] = 1;
        return a;
    }
}