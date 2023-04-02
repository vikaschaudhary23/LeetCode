class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length, m = potions.length;
        int[] pairs = new int[n];
        Arrays.sort(potions);
        int index=0;
        for(int i=0;i<n;i++){
            int l=0,r=m-1;
            while(l<=r){
                int mid = l+ (r-l)/2;
                long product = (long)spells[i]*potions[mid];
                if(product>=success) r = mid-1;
                else l = mid+1;
            }
            pairs[i] = m-l;
        }
        
        return pairs;
    }
}