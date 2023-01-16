class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int i=0,j=0;
        List<Integer> l = new ArrayList<>();
        while(i<n && j<n){
            l.add(matrix[i][j]);
            
            if(j==n-1){
                i++;
                j=0;
            }
            else j++;
        }
        Collections.sort(l);
        return l.get(k-1);
    }
}