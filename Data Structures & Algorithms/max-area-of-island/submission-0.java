class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int result = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 1) {
                    result = Math.max(result, dfs(grid, r, c));
                }
            }
        }
        return result;
    }

    private int dfs(int[][] grid, int r, int c) {
        int rows = grid.length, cols = grid[0].length;
        if (c < 0 || c >= cols || r < 0 || r >= rows || grid[r][c] != 1) {
            return 0;
        }

        int result = 1;
        grid[r][c] = 0;
        result += dfs(grid, r+1, c);
        result += dfs(grid, r-1, c);
        result += dfs(grid, r, c+1);
        result += dfs(grid, r, c-1);

        return result;
    }
}
