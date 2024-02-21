class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int ans=0;
        int n = words.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                String s = words[j];
                String str = words[i];
                if(s.length()>=str.length() && s.substring(0, str.length()).equals(str) && s.substring(s.length()-str.length(), s.length()).equals(str))
                    ans++;
            }
        }
        return ans;
    }
}