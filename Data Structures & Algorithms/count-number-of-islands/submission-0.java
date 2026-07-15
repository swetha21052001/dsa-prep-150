class Solution {
    public void dfs(char[][] grid, int[][] visited, int i, int j, int m, int n){
        if(visited[i][j]==1) return;
        int[][] vec = {{0,1},{1,0},{0,-1},{-1,0}};
        visited[i][j] = 1;
        for(int[] d: vec){
            int r = i + d[0];
            int c = j + d[1];
            if(r>=0 && c>=0 && r<m && c<n && grid[r][c]=='1' && visited[r][c]==0){
                dfs(grid, visited, r, c, m, n);
            }
        }
    }
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] visited = new int[m][n];
        int count = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == '1' && visited[i][j]==0){
                    dfs(grid, visited, i, j, m, n);
                    count++;
                }
            }
        }
        return count;
    }
}
 