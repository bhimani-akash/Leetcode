/*
Given the head of a linked list, rotate the list to the right by k places.

Example 1:
Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]

Example 2:
Input: head = [0,1,2], k = 4
Output: [2,0,1]

Constraints:
The number of nodes in the list is in the range [0, 500].
-100 <= Node.val <= 100
0 <= k <= 2 * 109
 */
package LinkedList;

public class _61 {
//    public ListNode rotateRight(ListNode head, int k) {
//        if (head == null || head.next == null || k == 0)
//            return head;
//
//        ListNode cur = head;
//        int len = 1;
//        while (cur.next != null) {
//            len++;
//            cur = cur.next;
//        }
//
//        cur.next = head;
//        k = k % len;
//        k = len - k;
//
//        while (k-- > 0)
//            cur = cur.next;
//
//        head = cur.next;
//        cur.next = null;
//
//        return head;
//    }
}
