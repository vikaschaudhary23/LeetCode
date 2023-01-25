class Solution {
    
    public static void sum(int index, int[] nums, Set<List<Integer>> s, List<Integer> l){
        if(index==nums.length){
            s.add(new ArrayList<>(l));
            return;
        }
        l.add(nums[index]);
        sum(index+1, nums, s, l);
        l.remove(l.size()-1);
        sum(index+1, nums, s, l);
    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> cur = new ArrayList<>();
        List<List<Integer>> v = new ArrayList<>();
        Set<List<Integer>> ans = new HashSet<>();
        sum(0,nums,ans,cur);
        for(List<Integer> i:ans) v.add(i);
        return v;
    }
}