class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> l = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(!l.contains(nums1[i]) && nums1[i]==nums2[j]){
                l.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]) i++;
            else j++;
        }
        int a[] = new int[l.size()];
        for(int v=0;v<l.size();v++) a[v] = l.get(v);
        return a;
    }
}