class Solution {
    public int singleNonDuplicate(int[] nums) {
        int v=0;
        for(int i:nums) v^=i;
        return v;
    }
}