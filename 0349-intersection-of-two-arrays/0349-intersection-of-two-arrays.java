class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j] && l.contains(nums1[i])!= true) l.add(nums1[i]);
            }
        }
        int a[] = new int[l.size()];
        for(int i=0;i<l.size();i++) a[i] = l.get(i);
        return a;
    }
}