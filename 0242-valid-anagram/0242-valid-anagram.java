class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        ArrayList<Character> l = new ArrayList<>();
        for(int i=0;i<s.length();i++) l.add(s.charAt(i));
        for(int i=0;i<t.length();i++){
            if(!l.contains(t.charAt(i))) return false;
            else l.remove(Character.valueOf(t.charAt(i)));
        }
        return l.isEmpty();
    }
}