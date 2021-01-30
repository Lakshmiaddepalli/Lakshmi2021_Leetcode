class Solution {
    int m, n;
    public int orangesRotting(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int time = 2;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    dfs(grid, i, j, 2);
                }
            }
        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
                time = Math.max(time, grid[i][j]);
            }
        }
        
        return time - 2;
    }
    
    private void dfs(int[][] grid, int r, int c, int time) {
        if (r < 0 || r >= m || c < 0 || c >= n || grid[r][c] == 0) return;
        
        if (grid[r][c] > 1 && grid[r][c] < time)   return;
        grid[r][c] = time;
        
        dfs(grid, r + 1, c, time + 1);
        dfs(grid, r - 1, c, time + 1);
        dfs(grid, r, c + 1, time + 1);
        dfs(grid, r, c - 1, time + 1);
    }
}