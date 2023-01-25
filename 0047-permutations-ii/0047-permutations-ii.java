class Solution {
    public void permutations(boolean[] arr, int[] a, Set<List<Integer>> ans, List<Integer> l, int size){
        if(l.size()==size){
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<size;i++){
            if(!arr[i]){
                arr[i] = true;
                l.add(a[i]);
                permutations(arr, a, ans, l, size);
                l.remove(l.size()-1);
                arr[i] = false;
            }
        }

    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        int size = nums.length;
        boolean arr[] = new boolean[size];
        Arrays.fill(arr,false);
        List<Integer> l = new ArrayList<>();
        Set<List<Integer>> s = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        permutations(arr, nums, s, l, size);
        for(List<Integer> i:s)
            ans.add(i);
        return ans;
    }
}