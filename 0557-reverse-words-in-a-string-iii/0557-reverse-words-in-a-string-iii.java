class Solution {
    public static void reverse(char[] a, int i, int j){
        while(i<=j){
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
    public String reverseWords(String s) {
        int i=0,j=1;
        char a[] = s.toCharArray();
        while(j<s.length()){
            if(a[j]==' '){
                reverse(a, i, j-1);
                i = j+1;
                j++;
            }
            else if(j==a.length-1){
                reverse(a, i, j);
                break;
            }
            else j++;
        }
        String str = "";
        for(char c:a) str+=c;
        return str;
    }
}