class Solution {
    public int helper(char a[], int i, int n, String s){
        if(s.length()==n) return 1;
        if(i==a.length) return 0;
        int sel = helper(a, i, n, s+a[i]);
        int dis = helper(a, i+1, n, s);
        return sel + dis;
    }
    public int countVowelStrings(int n) {
        char a[] = {'a','e','i','o','u'};
        return helper(a, 0, n, "");
    }
}