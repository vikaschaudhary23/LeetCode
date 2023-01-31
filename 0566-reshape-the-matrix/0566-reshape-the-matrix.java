class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = (mat.length)*(mat[0].length);
        if(r*c != n) return mat;
        int[][] ans = new int[r][c];
        
        // 1
        int col = mat[0].length;
        for(int i=0;i<n;i++){
            ans[i/c][i%c] = mat[i/col][i%col];
        }
        
        // 2
//         int row = 0;
//         int col = 0;
//         for(int i=0;i<mat.length;i++){
//             for(int j=0;j<mat[0].length;j++){
//                 ans[row][col] = mat[i][j];
//                 col++;
//                 if(col==c){
//                     row++;
//                     col=0;
//                 }
                
                
                
//             }
//         }
        return ans;
    }
}