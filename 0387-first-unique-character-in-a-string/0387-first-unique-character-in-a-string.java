class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        if(n==1) return 0;
        boolean flag=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(s.charAt(i)==s.charAt(j) && i!=j){
                    flag=true;
                    break;
                }
            }
            if(flag==false) return i;
            flag=false;
        }
        return -1;
    }
}