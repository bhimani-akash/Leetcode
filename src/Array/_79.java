/*
Given an m x n grid of characters board and a string word, return true if word exists in the grid.
The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or
vertically neighboring. The same letter cell may not be used more than once.

Example 1:
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
Output: true

Example 2:
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
Output: true

Example 3:
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
Output: false

Constraints:
m == board.length
n = board[i].length
1 <= m, n <= 6
1 <= word.length <= 15
board and word consists of only lowercase and uppercase English letters.
 */
package Array;

public class _79 {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        if (word.length() == 0)
            return true;
        if (rows * cols < word.length())
            return false;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (board[r][c] == word.charAt(0)) {
                    boolean isFound = dfsBoard(board, new boolean[rows][cols], r, c, word, 0);
                    if (isFound)
                        return true;
                }
            }
        }

        return false;
    }

    public boolean dfsBoard(char[][] board, boolean[][] visitedBoard, int row, int col, String word, int wordInd) {
        if ((row < 0 || row >= board.length) || (col < 0 || col >= board[0].length) || board[row][col] != word.charAt(wordInd))
            return false;

        if (visitedBoard[row][col])
            return false;

        if (wordInd == word.length() - 1)
            return true;

        visitedBoard[row][col] = true;

        if (dfsBoard(board, visitedBoard, row, col - 1, word, wordInd + 1))
            return true;
        if (dfsBoard(board, visitedBoard, row, col + 1, word, wordInd + 1))
            return true;
        if (dfsBoard(board, visitedBoard, row - 1, col, word, wordInd + 1))
            return true;
        if (dfsBoard(board, visitedBoard, row + 1, col, word, wordInd + 1))
            return true;

        visitedBoard[row][col] = false;
        return false;
    }
}
