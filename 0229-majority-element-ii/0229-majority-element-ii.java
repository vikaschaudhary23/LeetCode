class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,  Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])) map.put(nums[i],1);
            else{
                map.put(nums[i], map.get(nums[i])+1);
            }
        }
        int n = (int)nums.length/3;
        List<Integer> l = new ArrayList<>();
        for(Map.Entry<Integer, Integer> i: map.entrySet()){
            if(i.getValue()>n) l.add(i.getKey());
        }
        return l;
    }
}