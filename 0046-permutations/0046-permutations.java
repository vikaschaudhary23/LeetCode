class Solution {
    public void swap(int i, int j, int[] a){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    public void permutations2(int index, int[] a, List<List<Integer>> ans, int size){
        if(index==size){
            List<Integer> l = new ArrayList<>();
            for(int j:a) l.add(j);
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int i=index;i<size;i++){
            swap(i,index,a);
            permutations2(index+1, a, ans, size);
            swap(i, index, a);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permutations2(0, nums, ans, nums.length);
        return ans;
    }
}