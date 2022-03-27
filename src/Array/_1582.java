/*
Given an m x n binary matrix mat, return the number of special positions in mat.
A position (i, j) is called special if mat[i][j] == 1 and all other elements in row i and column j are 0
(rows and columns are 0-indexed).

Example 1:
Input: mat = [[1,0,0],[0,0,1],[1,0,0]]
Output: 1
Explanation: (1, 2) is a special position because mat[1][2] == 1 and all other elements in row 1 and column 2 are 0.

Example 2:
Input: mat = [[1,0,0],[0,1,0],[0,0,1]]
Output: 3
Explanation: (0, 0), (1, 1) and (2, 2) are special positions.

Constraints:
m == mat.length
n == mat[i].length
1 <= m, n <= 100
mat[i][j] is either 0 or 1.
 */
package Array;

public class _1582 {
    static int r, c;
    static int[][] arr;

    public static boolean isSpecial(int row, int col) {
        for (int i = 0; i < c; i++)
            if (arr[row][i] == 1 && i != col)
                return false;

        for (int i = 0; i < r; i++)
            if (arr[i][col] == 1 && i != row)
                return false;

        return true;
    }

    public static int numSpecial(int[][] mat) {
        r = mat.length;
        c = mat[0].length;
        arr = mat;
        int count = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (mat[i][j] == 1 && isSpecial(i, j))
                    count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int ans = numSpecial(new int[][]{{0,0,1,0},{0,0,0,0},{0,0,0,0},{0,1,0,0}});
        System.out.println("ans = " + ans);
    }
}
