/*
Given the root of a Binary Search Tree and a target number k, return true if there exist two elements in the BST
such that their sum is equal to the given target.

Example 1:
Input: root = [5,3,6,2,4,null,7], k = 9
Output: true

Example 2:
Input: root = [5,3,6,2,4,null,7], k = 28
Output: false

Constraints:
The number of nodes in the tree is in the range [1, 104].
-104 <= Node.val <= 104
root is guaranteed to be a valid binary search tree.
-105 <= k <= 105
 */
package Tree;

import java.util.ArrayList;
import java.util.List;

public class _653 {
//    public boolean findTarget(TreeNode root, int k) {
//        List<Integer> vals = new ArrayList<>();
//
//        if (root == null)
//            return false;
//
//        getInorderTraversal(root, vals);
//
//        int start = 0, end = vals.size() - 1, sum;
//
//        while (start < end) {
//            sum = vals.get(start) + vals.get(end);
//
//            if (sum == k)
//                return true;
//            else if (sum < k)
//                start++;
//            else
//                end--;
//        }
//
//        return false;
//    }
//
//    private void getInorderTraversal(TreeNode root, List<Integer> vals) {
//        if (root == null)
//            return;
//
//        if (root.left != null)
//            getInorderTraversal(root.left, vals);
//
//        vals.add(root.val);
//
//        if (root.right != null)
//            getInorderTraversal(root.right, vals);
//    }
}
