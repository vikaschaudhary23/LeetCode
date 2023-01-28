import java.util.TreeSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        TreeSet<Integer> s = new TreeSet<>();
        for(int i:nums){
            s.add(i);
        }
        if(s.size() == nums.length)
            return false;
        else
            return true;
    }
}