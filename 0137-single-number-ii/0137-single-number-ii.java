class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else if(map.get(nums[i])>1) continue;
            else {
                int val = map.get(nums[i]);
                map.put(nums[i],++val);
            }
        }
        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
            if(entry.getValue()==1) return entry.getKey();
        }
        return 0;
    }
}