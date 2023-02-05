class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length()<ransomNote.length()) return false;
        int n1 = ransomNote.length();
        int n2 = magazine.length();
        int arr[] = new int[26];
        Arrays.fill(arr,0);
        for(int i=0;i<n1;i++){
            arr[ransomNote.charAt(i)-'a'] += 1;
        }
        for(int i=0;i<n2;i++){
            arr[magazine.charAt(i)-'a'] -= 1;
        }
        for(int i:arr){
            if(i>0) return false;
        }
//         Map<Character, Integer> map1 = new HashMap<>();
//         for(int i=0;i<n1;i++){
            
//         }
            
            
//         Map<Character, Integer> map2 = new HashMap<>();
        return true;
    }
}