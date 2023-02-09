class Solution {
    public boolean isSubsequence(String s, String t) {
        // List<Character> l = new ArrayList<>();
        // for(int i=0;i<t.length();i++) l.add(t.charAt(i));
        // for(int i=0;i<s.length();i++){
        //     if(!l.contains(s.charAt(i))) return false;
        // }
        // return true;
        
        long l=0,r=0;
        while(r<t.length() && l<s.length()){
            if(s.charAt((int)l)==t.charAt((int)r)){
                l++;
                // r++;
            }
            r++;
        }
        if(l==s.length()) return true;
        return false;
    }
}