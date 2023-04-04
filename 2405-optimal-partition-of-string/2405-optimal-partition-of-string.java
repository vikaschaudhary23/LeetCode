class Solution {
    public int partitionString(String s) {
        // Map<Character, Integer> map = new HashMap<>();
        // for(int i=0;i<s.length();i++){
        //     if(!map.containsKey(s.charAt(i))) map.put(s.charAt(i), 1);
        //     else{
        //         int freq = map.get(s.charAt(i));
        //         freq++;
        //         map.put(s.charAt(i), freq);
        //     }
        // }
        // int ans=Integer.MIN_VALUE;
        // for(Map.Entry x:map.entrySet()){
        //     if((Integer)x.getValue()>ans) ans = (Integer)x.getValue();
        // }
        // return ans;
        
        boolean a[] = new boolean[26];
        Arrays.fill(a, false);
        int ans=1;
        for(int i=0;i<s.length();i++){
            if(a[(int)s.charAt(i) - 97] == true){
                ans++;
                Arrays.fill(a, false);
            }
            // else 
                a[(int)s.charAt(i) - 97] =true;
        }
        return ans;
    }
}