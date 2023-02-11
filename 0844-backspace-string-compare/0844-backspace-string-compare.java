class Solution {
    public boolean backspaceCompare(String s, String t) {
        
    return backspace(t).equals(backspace(s));
    }

    public String backspace(String s){
        StringBuilder sb = new StringBuilder(s);
        int index = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '#') {
                index = Math.max(i - 2, -1);
                if (i == 0) sb.delete(0, 1);
                    else sb.delete(i - 1, i + 1);
                i = index;
            }
        }
        return sb.toString();
    } 
}