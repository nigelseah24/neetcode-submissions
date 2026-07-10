class Solution {
    public void solve(char[][] board) {
        markBorderConnected(board);
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if (board[r][c] == 'O') {
                    board[r][c] = 'X';
                } else if (board[r][c] == 'T') {
                    board[r][c] = 'O';
                }
            }
        }
        return;
    }

    private void dfs (char[][] board, int r, int c) {
        int rows = board.length, cols = board[0].length;
        if (r < 0 || r >= rows || c < 0 || c >= cols || board[r][c] != 'O') {
            return;
        }

        board[r][c] = 'T';
        dfs(board, r+1, c);
        dfs(board, r-1, c);
        dfs(board, r, c+1);
        dfs(board, r, c-1);
    }

    private void markBorderConnected(char[][] board) {
        int rows = board.length, cols = board[0].length;
        for (int r = 0; r < board.length; r++) {
            dfs(board, r, 0);
            dfs(board, r, cols - 1);
        }
        for (int c = 0; c < board[0].length; c++) {
            dfs(board, 0, c);
            dfs(board, rows - 1, c);
        }
    }
};
