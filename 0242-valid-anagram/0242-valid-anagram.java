class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))) map.put(s.charAt(i),1);
            else{
                int freq = map.get(s.charAt(i));
                freq++;
                map.put(s.charAt(i),freq);
            }
        }
        System.out.println(map);
        for(int i=0;i<t.length();i++){
            if(!map.containsKey(t.charAt(i))) return false;
            else{
                int freq = map.get(t.charAt(i));
                freq--;
                map.put(t.charAt(i),freq);
            }
        }
        System.out.println(map);
        for(Map.Entry x:map.entrySet()){
            if((Integer)x.getValue()!=0) return false;
        }
        return true;
    }
}