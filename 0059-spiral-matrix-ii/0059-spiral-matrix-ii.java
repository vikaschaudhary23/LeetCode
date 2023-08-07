class Solution {
    public int[][] generateMatrix(int n) {
        int[][] a = new int[n][n];
        int num=1;
        int top = 0, bottom = n-1, left=0, right = n-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                a[top][i] = num;
                num++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                a[i][right] = num;
                num++;
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    a[bottom][i] = num;
                    num++;
                }
                bottom--;
            }
            
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    a[i][left] = num;
                    num++;
                }
                left++;
            }
        }
        return a;
    }
}