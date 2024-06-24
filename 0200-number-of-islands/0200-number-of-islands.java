class Solution {
    public int numIslands(char[][] grid) {
    int m == grid.length;
    int n == grid[0].length;
    int boolean[][]=new boolean[m][n];
    int count=0;
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(grid[i][j]=='1' && boolean[i][j]==false)
                count++;
                dfs(i,j,visited,grid);
        }
    }
    static void dfs(int ,int j,int boolean[],char grid[][]){
        int m == grid.length;
        int n == grid[0].length;
        if(i<0 || j<0 || i>=m || j>=n ||grid[i][j]=='0' || visited[i][j]){
            return;
        }
        visited[i][j]=true;
        dfs(i-1,j,v,grid);
        dfs(i-1,j,v,grid);
        dfs(i-1,j,v,grid);
    } 
    
    }
}