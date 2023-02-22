class Solution {
    public List<List<Integer>> generate(int numRows) {
        int[][] pascal = new int[numRows][numRows];
        for(int i=0;i<numRows;i++){
            int a[] = new int[i+1];
            a[0] = 1;
            a[i] = 1;
            for(int j=1;j<i;j++){
                a[j] = pascal[i-1][j-1] + pascal[i-1][j];
            }
            pascal[i] = a;
        }
        return (List)Arrays.asList(pascal);
    }
}