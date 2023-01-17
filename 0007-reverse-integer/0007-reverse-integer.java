class Solution {
    public int reverse(int x) {
        // boolean isNegative  = x<0;
        int neg=x;
        if(x<0){
            x *= -1;
        }
        long reverse=0;
        int lasdigit;
        while(x>0){
            // lastdigit = x%10;
            reverse = reverse*10 + (x%10);
            x = x/10;
        }
        if(reverse>Integer.MAX_VALUE || reverse<Integer.MIN_VALUE)
            return 0;
        if(neg<0) return -1*(int)reverse;
        return (int)reverse;
    }
}