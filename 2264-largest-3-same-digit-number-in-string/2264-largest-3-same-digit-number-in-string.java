class Solution {
    public String largestGoodInteger(String num) {
        int n = num.length();
        int max = Integer.MIN_VALUE;
        String ans = "";
        for(int i=0,j=2;i<n-2 && j<n;i++,j++){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(j)==num.charAt(i+1)){
                String s = ""+num.substring(i,j+1);
                if(Integer.parseInt(s)>max) {
                    ans = s;
                    max = Integer.parseInt(s);
                }
            }
        }
        return ans;
    }
}