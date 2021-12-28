/*
Given the root of a binary tree, return the average value of the nodes on each level in the form of an array.
Answers within 10-5 of the actual answer will be accepted.

Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: [3.00000,14.50000,11.00000]
Explanation: The average value of nodes on level 0 is 3, on level 1 is 14.5, and on level 2 is 11.
Hence return [3, 14.5, 11].

Example 2:
Input: root = [3,9,20,15,7]
Output: [3.00000,14.50000,11.00000]

Constraints:
The number of nodes in the tree is in the range [1, 104].
-231 <= Node.val <= 231 - 1
 */
package Tree;

import java.util.List;

public class _637 {
//    public List<Double> averageOfLevels(TreeNode root) {
//        List<Double> result = new ArrayList<>();
//        Queue<TreeNode> queue = new LinkedList();
//        double level_sum = 0;
//
//        queue.offer(root);
//        while (!queue.isEmpty()) {
//            level_sum = 0;
//            int size = queue.size();
//
//            for (int i = 0; i < size; i++) {
//                TreeNode current_node = queue.poll();
//                level_sum += current_node.val;
//
//                if (current_node.left != null)
//                    queue.offer(current_node.left);
//
//                if (current_node.right != null)
//                    queue.offer(current_node.right);
//            }
//
//            double level_avg = level_sum / size;
//            result.add(level_avg);
//        }
//
//        return result;
//    }
}
