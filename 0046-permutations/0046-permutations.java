class Solution {
    public void permutations(boolean[] arr, int[] a, List<List<Integer>> ans, List<Integer> l, int size){
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
    public List<List<Integer>> permute(int[] nums) {
        int size = nums.length;
        boolean arr[] = new boolean[size];
        Arrays.fill(arr,false);
        List<Integer> l = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        permutations(arr, nums, ans, l, size);
        return ans;
    }
}