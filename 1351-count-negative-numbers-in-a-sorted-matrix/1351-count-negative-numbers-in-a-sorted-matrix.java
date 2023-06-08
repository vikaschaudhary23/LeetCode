class Solution {
    public int countNegatives(int[][] grid) {
        int row= grid.length;
        int column = grid[0].length;
        int negative=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(grid[i][j]<0) negative++;
            }
        }
        return negative;
    }
}