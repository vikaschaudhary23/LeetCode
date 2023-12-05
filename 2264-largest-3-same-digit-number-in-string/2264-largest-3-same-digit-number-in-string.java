class Solution {
    public String largestGoodInteger(String num) {
        List<String> l = new ArrayList<>();
        for(int i=0,j=1;i<num.length()-1 && j<num.length()-1;){
            if(num.charAt(i)==num.charAt(j) && num.charAt(j)==num.charAt(j+1)){
                String s = ""+num.charAt(j)+num.charAt(j)+num.charAt(j);
                l.add(s);
                j+=2;
                i = j-1;
            }
            i++;
            j++;
        }
        System.out.println(l);
        String ans = "";
        int max = Integer.MIN_VALUE;
        for(String s:l){
            if(Integer.parseInt(s)>max){
                ans = s;
                max = Integer.parseInt(s);
            }
        }
        return ans;
    }
}