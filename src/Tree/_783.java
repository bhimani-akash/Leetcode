/*
Given the root of a Binary Search Tree (BST), return the minimum difference between the values of any two different
nodes in the tree.

Example 1:
Input: root = [4,2,6,1,3]
Output: 1

Example 2:
Input: root = [1,0,48,null,null,12,49]
Output: 1

Constraints:
The number of nodes in the tree is in the range [2, 100].
0 <= Node.val <= 105
 */
package Tree;

import java.util.ArrayList;
import java.util.List;

public class _783 {
//    public static List<Integer> ans;
//
//    public static void dfs(TreeNode root) {
//        if (root == null)
//            return;
//
//        dfs(root.left);
//        ans.add(root.val);
//        dfs(root.right);
//    }
//
//    public int minDiffInBST(TreeNode root) {
//        ans = new ArrayList<>();
//
//        dfs(root);
//
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < ans.size() - 1; i++) {
//            int dif = ans.get(i + 1) - ans.get(i);
//
//            if (dif < min)
//                min = dif;
//        }
//
//        return min;
//    }
}
