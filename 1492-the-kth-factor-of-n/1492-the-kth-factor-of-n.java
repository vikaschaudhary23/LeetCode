class Solution {
    public int kthFactor(int n, int k) {
        // if(k>(n/2)) return -1;
        ArrayList<Integer> factors = new ArrayList<>();
        factors.add(1);
        
        for(int i=2;i<n;i++){
            if(n%i==0) factors.add(i);
        }
        if(n!=1) factors.add(n);
        System.out.println(factors);
        if(factors.size()<k) return -1;
        return factors.get(k-1);
    }
}