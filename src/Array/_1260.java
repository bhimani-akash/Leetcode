/*
Given a 2D grid of size m x n and an integer k. You need to shift the grid k times.
In one shift operation:
Element at grid[i][j] moves to grid[i][j + 1].
Element at grid[i][n - 1] moves to grid[i + 1][0].
Element at grid[m - 1][n - 1] moves to grid[0][0].
Return the 2D grid after applying shift operation k times.

Example 1:
Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1
Output: [[9,1,2],[3,4,5],[6,7,8]]

Example 2:
Input: grid = [[3,8,1,9],[19,7,2,5],[4,6,11,10],[12,0,21,13]], k = 4
Output: [[12,0,21,13],[3,8,1,9],[19,7,2,5],[4,6,11,10]]

Example 3:
Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 9
Output: [[1,2,3],[4,5,6],[7,8,9]]

Constraints:

m == grid.length
n == grid[i].length
1 <= m <= 50
1 <= n <= 50
-1000 <= grid[i][j] <= 1000
0 <= k <= 100
 */
package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1260 {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int r = grid.length;
        int c = grid[0].length;

        k = k % (r * c);
        while (k-- > 0) {
            int last = grid[r - 1][c - 1];
            for (int i = r - 1; i >= 0; i--) {
                for (int j = c - 1; j >= 0; j--) {
                    if (i == 0 && j == 0)
                        grid[i][j] = last;
                    else if (i != 0 && j == 0)
                        grid[i][j] = grid[i - 1][c - 1];
                    else
                        grid[i][j] = grid[i][j - 1];
                }
            }

        }

        ArrayList<Integer> list = new ArrayList<>();
        return (List) Arrays.asList(grid);
    }
}
