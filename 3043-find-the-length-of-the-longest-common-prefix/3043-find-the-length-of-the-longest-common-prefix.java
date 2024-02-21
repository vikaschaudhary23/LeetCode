class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Map<String, Integer> map1 = new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            String s = Integer.toString(arr1[i]);
            String str ="";
            for(int j=0;j<s.length();j++){
                str += s.charAt(j);
                if(!map1.containsKey(str)) map1.put(str, 1);
            }
        }
        // System.out.println(map1);
        Map<String, Integer> map2 = new HashMap<>();
        for(int i=0;i<arr2.length;i++){
            String s = Integer.toString(arr2[i]);
            String str ="";
            for(int j=0;j<s.length();j++){
                str += s.charAt(j);
                if(!map2.containsKey(str)) map2.put(str, 1);
            }
        }
        // System.out.println(map2);
        int ans=0;
        for(Map.Entry<String, Integer> entry : map2.entrySet()){
            if(map1.containsKey(entry.getKey()))
                ans = Math.max(ans, entry.getKey().length());
        }
        return ans;
    }
}