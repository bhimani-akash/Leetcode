/*
Given the root of a binary search tree (BST) with duplicates, return all the mode(s) (i.e., the most frequently
occurred element) in it.
If the tree has more than one mode, return them in any order.
Assume a BST is defined as follows:
The left subtree of a node contains only nodes with keys less than or equal to the node's key.
The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
Both the left and right subtrees must also be binary search trees.

Example 1:
Input: root = [1,null,2,2]
Output: [2]

Example 2:
Input: root = [0]
Output: [0]

Constraints:
The number of nodes in the tree is in the range [1, 104].
-105 <= Node.val <= 105
 */
package Tree;

import java.util.HashMap;
import java.util.Map;

public class _501 {
//    int maxCount = 1;
//
//    public int[] findMode(TreeNode root) {
//        Map<Integer, Integer> map = new HashMap<>();
//
//        findMode(root, map);
//
//        int[] result = new int[map.size()];
//        int index = 0;
//
//        for (Integer key : map.keySet()) {
//            if (map.get(key) == maxCount) {
//                result[index++] = key;
//            }
//        }
//
//        return Arrays.copyOf(result, index);
//    }
//
//    public void findMode(TreeNode root, Map<Integer, Integer> map){
//        if (root == null) {
//            return;
//        } else if (map.containsKey(root.val)) {
//            int count = map.get(root.val) + 1;
//            map.put(root.val, count);
//            maxCount = Math.max(maxCount, count);
//        } else {
//            map.put(root.val, 1);
//        }
//
//        findMode(root.left, map);
//        findMode(root.right, map);
//    }
}
