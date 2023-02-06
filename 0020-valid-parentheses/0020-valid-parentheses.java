class Solution {
    public boolean open(char c){
        return c=='(' || c=='{' || c=='[';
    }
    public boolean match(char a, char b){
        return (a=='(' && b==')') || (a=='[' && b==']') || (a=='{' && b=='}');
    }
    public boolean isValid(String s) {
        int n=s.length();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(open(c)) st.push(c);
            else{
                if(st.isEmpty()) return false;
                else if(!match(st.peek(), c)) return false;
                else st.pop();
            }
        }
        return st.isEmpty();
    }
}