class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])) map.put(nums[i],1);
            else
                map.put(nums[i],map.get(nums[i])+1);
        }
        List<Integer> l = new ArrayList<>();
        for(Map.Entry x:map.entrySet()){
            l.add((Integer)x.getValue());
        }
        Collections.sort(l);
        System.out.println(l);
        int arr[] = new int[k];
        for(int i=0; i<k; i++){
            Integer temp = l.get(l.size()-i-1);
            for(Map.Entry x:map.entrySet()){
                if(temp == x.getValue()){
                    arr[i] = (int)x.getKey();
                    map.remove(x.getKey());
                    break;
                }
            }
        }
        return arr;
    }
}
