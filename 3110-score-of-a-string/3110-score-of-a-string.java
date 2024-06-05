class Solution {
    public int scoreOfString(String s) {
        int ans = 0;
        int i=0,j=1;
        while(j<s.length()){
            ans += Math.abs(s.charAt(i) - s.charAt(j));
            i++;
            j++;
        }
        return ans;
    }
}