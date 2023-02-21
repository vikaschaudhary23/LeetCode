import java.lang.*;
class Solution {
    
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        // char a[] = s.toCharArray();
        // ArrayList<Character> list = new ArrayList<>();
        // for(int i=0;i< a.length;i++){
        //     if((a[i]>96 && a[i]<123) || (a[i]<58 && a[i]>47)) list.add(a[i]);
        // }
        // int start=0,end=list.size()-1;
        // while(start<=end) {
        //     if (list.get(start) != list.get(end)) return false;
        //     start++;
        //     end--;
        // }
        // return true;
        
        int l=0,r=s.length()-1;
        while(l<=r){
            if(!Character.isLetterOrDigit(s.charAt(l))) l++;
            else if(!Character.isLetterOrDigit(s.charAt(r))) r--;
            else{
                if(s.charAt(l)!=s.charAt(r)) return false;
                l++;
                r--;
            }
        }
        return true;
    }
}