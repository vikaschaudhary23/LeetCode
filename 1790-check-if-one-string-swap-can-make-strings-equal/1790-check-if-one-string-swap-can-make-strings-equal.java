class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        if(s1.length()<s2.length()) return false;
        int count=0;
        List<Character> l1 = new ArrayList<>();
        List<Character> l2 = new ArrayList<>();
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                l1.add(s1.charAt(i));
                l2.add(s2.charAt(i));
                count++;
            }
            if(count>2) return false;
        }
        if(count!=2) return false;
        if(l1.get(0)!=l2.get(1) || l1.get(1)!=l2.get(0)) return false;
        
        return true;
    }
}