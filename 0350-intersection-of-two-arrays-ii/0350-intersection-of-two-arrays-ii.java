class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> l = new ArrayList<>();
        int i=0,j=0;
        while(i<n1 && j<n2){
            if(nums1[i]==nums2[j]){
                l.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]) i++;
            else j++;
        }
        System.out.println(l);
        int a[] = new int[l.size()];
        for(int v=0;v<l.size();v++) a[v] = l.get(v);
        return a;
    }
}