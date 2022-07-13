/*
Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you
can see ordered from top to bottom.

Example 1:
Input: root = [1,2,3,null,5,null,4]
Output: [1,3,4]

Example 2:
Input: root = [1,null,3]
Output: [1,3]

Example 3:
Input: root = []
Output: []

Constraints:
The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100
 */
package Tree;

public class _199 {
//    public List<Integer> rightSideView(TreeNode root) {
//        List<Integer> result = new ArrayList<Integer>();
//        rightView(root, result, 0);
//        return result;
//    }
//
//    public void rightView(TreeNode curr, List<Integer> result, int currDepth) {
//        if (curr == null)
//            return;
//
//        if (currDepth == result.size())
//            result.add(curr.val);
//
//        rightView(curr.right, result, currDepth + 1);
//        rightView(curr.left, result, currDepth + 1);
//    }
}
