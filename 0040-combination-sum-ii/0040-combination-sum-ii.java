class Solution {
    void combinations(int[] arr, int index, int target, List<List<Integer>> list, List<Integer> a){
            if(target==0){
                list.add(new ArrayList<>(a));
                return;
        }
        for(int i=index;i<arr.length;i++){
            if(i>index && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;
        
            a.add(arr[i]);
            combinations(arr, i+1,target-arr[i],list,a);
            a.remove(a.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans  = new ArrayList<>();
        combinations(candidates,0,target,ans, new ArrayList<>());
        return ans;
    }
}