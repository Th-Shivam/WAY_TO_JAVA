class WordSearch {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dfs(board, word, 0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int idx, int r, int c) {
        if (idx == word.length()) return true;

        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length ||
            board[r][c] != word.charAt(idx)) {
            return false;
        }

        char temp = board[r][c];
        board[r][c] = '#'; 
        boolean found =
                dfs(board, word, idx + 1, r + 1, c) ||
                dfs(board, word, idx + 1, r - 1, c) ||
                dfs(board, word, idx + 1, r, c + 1) ||
                dfs(board, word, idx + 1, r, c - 1);

        board[r][c] = temp;

        return found;
    }
}
