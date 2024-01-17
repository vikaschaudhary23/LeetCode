class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i:arr){
            if(!map.containsKey(i)) map.put(i,0);
            else{
                int f = map.get(i);
                f++;
                map.put(i,f);
            }
        }
        Set<Integer> set = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) set.add(entry.getValue());
        if(set.size()!=map.size()) return false;
        return true;
    }
}