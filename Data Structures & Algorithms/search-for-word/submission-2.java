class Solution {
    private boolean backtrack(char[][] board, int i, int j, int rows, int cols,
        String word, int[][] visited, int index ){
        if(index==word.length()) return true;
        if(i>=0 && i<rows && j>=0 && j<cols && visited[i][j]==0 && word.charAt(index)==board[i][j]){
            visited[i][j]=1;
            if(backtrack(board,i+1,j,rows,cols,word,visited,index+1)) return true;
            if(backtrack(board,i-1,j,rows,cols,word,visited,index+1)) return true;
            if(backtrack(board,i,j+1,rows,cols,word,visited,index+1)) return true;
            if(backtrack(board,i,j-1,rows,cols,word,visited,index+1)) return true;
             visited[i][j] = 0;
        }
       
        return false;
    }
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        int[][] visited = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(backtrack(board,i,j,rows,cols,word,visited,0)) return true;
            }
        }
        return false;
    }
}
