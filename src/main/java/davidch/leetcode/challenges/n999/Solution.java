package davidch.leetcode.challenges.n999;

public class Solution {
    public int numRookCaptures(char[][] board) {
        final var rook = findRook(board);
        var result = 0;
        for (var i = rook.i + 1; i < board.length; i++) {
            if (board[i][rook.j] == 'p') result++;
            if (board[i][rook.j] != '.') break;
        }

        for (var i = rook.i - 1; i >= 0; i--) {
            if (board[i][rook.j] == 'p') result++;
            if (board[i][rook.j] != '.') break;
        }

        for (var j = rook.j + 1; j < board[0].length; j++) {
            if (board[rook.i][j] == 'p') result++;
            if (board[rook.i][j] != '.') break;
        }

        for (var j = rook.j - 1; j >= 0; j--) {
            if (board[rook.i][j] == 'p') result++;
            if (board[rook.i][j] != '.') break;
        }

        return result;
    }

    private Rook findRook(char[][] board) {
        for (var i = 0; i < board.length; i++) {
            for (var j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'R') {
                    return new Rook(i, j);
                }
            }
        }

        throw new UnsupportedOperationException("There must be at least one rook");
    }

    private record Rook(int i, int j) {
    }
}
