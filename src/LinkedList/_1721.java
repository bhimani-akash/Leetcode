/*
You are given the head of a linked list, and an integer k.
Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node
from the end (the list is 1-indexed).

Example 1:
Input: head = [1,2,3,4,5], k = 2
Output: [1,4,3,2,5]

Example 2:
Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
Output: [7,9,6,6,8,7,3,0,9,5]

Example 3:
Input: head = [1], k = 1
Output: [1]

Example 4:
Input: head = [1,2], k = 1
Output: [2,1]

Example 5:
Input: head = [1,2,3], k = 2
Output: [1,2,3]

Constraints:
The number of nodes in the list is n.
1 <= k <= n <= 105
0 <= Node.val <= 100
 */
package LinkedList;

public class _1721 {
//    public ListNode swapNodes(ListNode head, int k) {
//        ListNode list1 = head;
//        ListNode list2 = head;
//        ListNode nodeK;
//
//        for (int i = 1; i < k; i++)
//            list1 = list1.next;
//
//        nodeK = list1;
//        list1 = list1.next;
//
//        while (list1 != null) {
//            list1 = list1.next;
//            list2 = list2.next;
//        }
//
//        int temp = nodeK.val;
//        nodeK.val = list2.val;
//        list2.val = temp;
//
//        return head;
//    }
}
