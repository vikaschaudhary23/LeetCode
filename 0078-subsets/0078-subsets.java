class Solution {
    public void sum(int index, int[] nums, List<List<Integer>> s, List<Integer> l){
        if(index==nums.length){
            s.add(new ArrayList<>(l));
            return;
        }
        l.add(nums[index]);
        sum(index+1, nums, s, l);
        l.remove(l.size()-1);
        //not picking the element
        sum(index+1, nums, s, l);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> cur = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        sum(0,nums,ans,cur);
        return ans;
    }
}