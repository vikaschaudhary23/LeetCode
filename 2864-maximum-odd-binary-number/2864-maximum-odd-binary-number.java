class Solution {
    public String maximumOddBinaryNumber(String s) {
        int ones=0,n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1') ones++;
        }
        String ans="";
        if(ones==0) return s;
        else{
            for(int i=0;i<n-1;i++){
                if(ones-->1) ans+='1';
                else ans+='0';
            }
            ans+='1';
        }
        return ans;
    }
}