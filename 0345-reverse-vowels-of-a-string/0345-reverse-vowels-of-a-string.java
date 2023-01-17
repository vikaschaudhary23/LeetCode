class Solution {
    public String reverseVowels(String s) {
        char c[] = s.toCharArray();
        int n = c.length;
        if(n==1) return s;
        List<Character> l =new ArrayList<>();
        List<Integer> in =new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u' || c[i]=='A' || c[i]=='E' || c[i]=='I' || c[i]=='O' || c[i]=='U'){
                l.add(c[i]);
                in.add(i);
            }
        }
        for(int i=0;i<in.size();i++){
            c[in.get(i)] = l.get(in.size()-i-1);
        }
        System.out.println(l);
        System.out.println(in);
        String st = "";
        for(char i:c)
            st+=i;  
        return st;
    }
}