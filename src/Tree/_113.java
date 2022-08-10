/*
Given the root of a binary tree and an integer targetSum, return all root-to-leaf paths where the sum of the node
values in the path equals targetSum. Each path should be returned as a list of the node values, not node references.
A root-to-leaf path is a path starting from the root and ending at any leaf node. A leaf is a node with no children.

Example 1:
Input: root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
Output: [[5,4,11,2],[5,8,4,5]]
Explanation: There are two paths whose sum equals targetSum:
5 + 4 + 11 + 2 = 22
5 + 8 + 4 + 5 = 22

Example 2:
Input: root = [1,2,3], targetSum = 5
Output: []

Example 3:
Input: root = [1,2], targetSum = 0
Output: []

Constraints:
The number of nodes in the tree is in the range [0, 5000].
-1000 <= Node.val <= 1000
-1000 <= targetSum <= 1000
 */
package Tree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class _113 {
//    public List<List<Integer>> pathSum(TreeNode root, int sum) {
//        List<List<Integer>> res = new ArrayList<List<Integer>>();
//        pathSum(root, sum, new ArrayList<Integer>(), res);
//        return res;
//    }
//
//    void pathSum(TreeNode root, int sum, List<Integer> sol, List<List<Integer>> res) {
//        if (root == null) {
//            return;
//        }
//
//        sol.add(root.val);
//
//        if (root.left == null && root.right == null && sum == root.val) {
//            res.add(new ArrayList<Integer>(sol));
//        } else {
//            pathSum(root.left, sum - root.val, sol, res);
//            pathSum(root.right, sum - root.val, sol, res);
//        }
//
//        sol.remove(sol.size() - 1);
//    }
}
