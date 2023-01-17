class Solution {
    void combinations(int[] arr, int index, int target, List<List<Integer>> list, List<Integer> a){
        if(index==arr.length){
            if(target==0){
                list.add(new ArrayList<>(a));
            }
            return;
        }
        if(arr[index]<=target){
            a.add(arr[index]);
            combinations(arr, index,target-arr[index],list,a);
            a.remove(a.size()-1);
        }
        combinations(arr,index+1,target,list,a);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans  = new ArrayList<>();
        combinations(candidates,0,target,ans, new ArrayList<>());
        return ans;
    }
}