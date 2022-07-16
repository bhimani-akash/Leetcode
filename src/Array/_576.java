/*
There is an m x n grid with a ball. The ball is initially at the position [startRow, startColumn].
You are allowed to move the ball to one of the four adjacent cells in the grid (possibly out of the grid
crossing the grid boundary). You can apply at most maxMove moves to the ball.
Given the five integers m, n, maxMove, startRow, startColumn, return the number of paths to move the
ball out of the grid boundary. Since the answer can be very large, return it modulo 109 + 7.

Example 1:
Input: m = 2, n = 2, maxMove = 2, startRow = 0, startColumn = 0
Output: 6

Example 2:
Input: m = 1, n = 3, maxMove = 3, startRow = 0, startColumn = 1
Output: 12

Constraints:
1 <= m, n <= 50
0 <= maxMove <= 50
0 <= startRow < m
0 <= startColumn < n
 */
package Array;

public class _576 {
    private Long[][][] memo = null;
    private int mod = 1000000007;

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        memo = new Long[m + 1][n + 1][maxMove + 1];
        return (int)(findPathsMemoHelper(m, n, maxMove, startRow, startColumn));
    }

    public long findPathsMemoHelper(int m, int n, int maxMove, int row, int col) {
        if (maxMove < 0)
            return 0;

        if (row == m || col == n || row < 0 || col < 0)
            return 1;

        if (memo[row][col][maxMove] != null)
            return memo[row][col][maxMove];

        long total = 0;
        long left_maxMoveReduced = findPathsMemoHelper(m, n, maxMove - 1, row, col - 1);
        long right_maxMoveReduced = findPathsMemoHelper(m, n, maxMove - 1, row, col + 1);
        long up_maxMoveReduced = findPathsMemoHelper(m, n, maxMove - 1, row - 1, col);
        long down_maxMoveReduced = findPathsMemoHelper(m, n, maxMove - 1, row + 1, col);

        total = ((left_maxMoveReduced + right_maxMoveReduced + down_maxMoveReduced + up_maxMoveReduced) % mod);
        memo[row][col][maxMove] = total;
        return total;
    }
}
