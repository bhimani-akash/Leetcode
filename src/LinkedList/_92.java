/*
Given the head of a singly linked list and two integers left and right where left <= right, reverse the
nodes of the list from position left to position right, and return the reversed list.

Example 1:
Input: head = [1,2,3,4,5], left = 2, right = 4
Output: [1,4,3,2,5]

Example 2:
Input: head = [5], left = 1, right = 1
Output: [5]

Constraints:
The number of nodes in the list is n.
1 <= n <= 500
-500 <= Node.val <= 500
1 <= left <= right <= n
 */
package LinkedList;

public class _92 {
//    public ListNode reverseBetween(ListNode head, int left, int right) {
//        if (head == null)
//            return null;
//
//        ListNode prev = null;
//        ListNode curr_node = head;
//
//        while (left > 1) {
//            prev = curr_node;
//            curr_node = curr_node.next;
//            left--;
//            right--;
//        }
//
//        ListNode conn = prev;
//        ListNode tail = curr_node;
//
//        while (right > 0) {
//            ListNode next_node = curr_node.next;
//            curr_node.next = prev;
//            prev = curr_node;
//            curr_node = next_node;
//            right--;
//        }
//
//        if (conn != null)
//            conn.next = prev;
//        else
//            head = prev;
//
//        tail.next = curr_node;
//        return head;
//    }
}
