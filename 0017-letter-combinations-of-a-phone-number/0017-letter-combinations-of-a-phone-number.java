class Solution {
    public void helper(String digits, String output, int index, List<String> ans, String options[]){
        if(index>=digits.length()){
            ans.add(output);
            return;
        }
        int number = digits.charAt(index)-48;
        String str = options[number];
        for(int i=0;i<str.length();i++){
            helper(digits, output+str.charAt(i),index+1,ans,options);
        }
    }
        
        
    public List<String> letterCombinations(String digits) {
        String options[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> ans = new ArrayList<>();
        if(digits.length()==0) return ans;
        int index=0;
        String output = "";
        helper(digits, output, index, ans, options);
        return ans;
    }
}