class Solution {
    public:
    bool safe(int row, int col, int n, vector<string> &board){
        int drow=row;
        int dcol=col;
        while(row>=0 && col>=0){
            if(board[row][col]=='Q') return false;
            row--;
            col--;
        }
        row=drow;
        col=dcol;
        while(col>=0){
            if(board[row][col]=='Q') return false;
            col--;
        }
        row=drow;
        col=dcol;
        while(row<n && col>=0){
            if(board[row][col]=='Q') return false;
            row++;
            col--;
        }
        return true;
    }
    
public:
    void queens(int col, int n, vector<vector<string>> &ans, vector<string> &board){
        if(col==n){
            ans.push_back(board);
            return;
        }
        for(int row=0;row<n;row++){
            if(safe(row,col,n,board)){
                board[row][col] = 'Q';
                queens(col+1,n,ans,board);
                board[row][col]='.';
            }
        }
    }
public:
    int totalNQueens(int n) {
        vector<vector<string>> ans;
        vector<string> board(n);
        string s(n,'.');
        for(int i=0;i<n;i++) board[i]=s;
        queens(0,n,ans,board);
        return ans.size();
    }
};