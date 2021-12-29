/*
Given the root of a binary tree, return all root-to-leaf paths in any order.
A leaf is a node with no children.

Example 1:
Input: root = [1,2,3,null,5]
Output: ["1->2->5","1->3"]

Example 2:
Input: root = [1]
Output: ["1"]

Constraints:
The number of nodes in the tree is in the range [1, 100].
-100 <= Node.val <= 100
 */
package Tree;

import java.util.ArrayList;
import java.util.List;

public class _257 {
//    public List<String> binaryTreePaths(TreeNode root) {
//        List<String> paths = new ArrayList<>();
//        constructPaths(root, "", paths);
//        return paths;
//    }
//
//    private void constructPaths(TreeNode root, String path, List<String> paths) {
//        if (root != null) {
//            StringBuffer pathSB = new StringBuffer(path);
//            pathSB.append(Integer.toString(root.val));
//
//            if (root.left == null && root.right == null) {
//                paths.add(pathSB.toString());
//            } else {
//                pathSB.append("->");
//                constructPaths(root.left, pathSB.toString(), paths);
//                constructPaths(root.right, pathSB.toString(), paths);
//            }
//        }
//    }
}
