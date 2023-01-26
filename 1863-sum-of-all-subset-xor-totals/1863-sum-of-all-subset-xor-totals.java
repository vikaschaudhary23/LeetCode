class Solution {
    public int xor(List<Integer> a){
        int sum = 0;
        for(Integer i:a) sum^=i;
        return sum;
    }
    public void solve(int index, int[] a, List<Integer> l,List<List<Integer>> ans){
        if(index==a.length){
            ans.add(new ArrayList<>(l));
            return;
        }
        l.add(a[index]);
        solve(index+1, a, l,ans);
        l.remove(l.size()-1);
        solve(index+1, a, l,ans);
    }
    public int subsetXORSum(int[] nums) {
        List<Integer> l = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        solve(0, nums, l,ans);
        System.out.println(ans);
        int v=0;
        for(int i=0;i<ans.size();i++){
            v += xor(ans.get(i));
        }
        return v;
        
        // int sum=0;
        // for(Integer i:ans) sum+=i;
        // return sum;
    }
}