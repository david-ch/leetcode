package davidch.leetcode.challenges.n79;

public class Solution {
    public boolean exist(char[][] board, String word) {
        final var chars = word.toCharArray();

        for (var i = 0; i < board.length; i++)
            for (var j = 0; j < board[i].length; j++)
                if (board[i][j] == chars[0])
                    if (continueWord(board, i, j, chars, 0)) return true;

        return false;
    }

    private boolean continueWord(char[][] board, int i, int j, char[] word, int w) {
        if (w == word.length - 1) return true;
        board[i][j] = ' ';
        if (i > 0 && board[i - 1][j] == word[w + 1] && continueWord(board, i - 1, j, word, w + 1)) return true;
        if (i < board.length - 1 && board[i + 1][j] == word[w + 1] && continueWord(board, i + 1, j, word, w + 1)) return true;
        if (j > 0 && board[i][j - 1] == word[w + 1] && continueWord(board, i, j - 1, word, w + 1)) return true;
        if (j < board[i].length - 1 && board[i][j + 1] == word[w + 1] && continueWord(board, i, j + 1, word, w + 1)) return true;
        board[i][j] = word[w];
        return false;
    }
}
