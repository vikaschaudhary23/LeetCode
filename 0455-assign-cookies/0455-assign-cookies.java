class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int ans=0;
        int i=0,j=0;
        int n1=g.length, n2=s.length;
        while(i<n1 && j<n2){
            if(g[i]<=s[j]){
                ans++;
                i++;
                j++;
            }
            else j++;
        }
        return ans;
    }
}