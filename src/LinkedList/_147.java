/*
Given the head of a singly linked list, sort the list using insertion sort, and return the sorted list's head.
The steps of the insertion sort algorithm:
Insertion sort iterates, consuming one input element each repetition and growing a sorted output list.
At each iteration, insertion sort removes one element from the input data, finds the location it belongs
within the sorted list and inserts it there.
It repeats until no input elements remain.
The following is a graphical example of the insertion sort algorithm. The partially sorted list (black)
initially contains only the first element in the list. One element (red) is removed from the input data
and inserted in-place into the sorted list with each iteration.

Example 1:
Input: head = [4,2,1,3]
Output: [1,2,3,4]

Example 2:
Input: head = [-1,5,3,4,0]
Output: [-1,0,3,4,5]

Constraints:
The number of nodes in the list is in the range [1, 5000].
-5000 <= Node.val <= 5000
 */
package LinkedList;

public class _147 {
//    public ListNode insertionSortList(ListNode head) {
//        ListNode prev = head;
//        ListNode curr = head.next;
//
//        if (head == null || head.next == null)
//            return head;
//
//        while (curr != null) {
//            if (curr.val < prev.val) {
//                prev.next = curr.next;
//
//                if (curr.val <= head.val) {
//                    curr.next = head;
//                    head = curr;
//                } else {
//                    ListNode ptr = head;
//                    while (ptr.next != null && ptr.next.val < curr.val)
//                        ptr = ptr.next;
//
//                    ListNode temp = ptr.next;
//                    ptr.next = curr;
//                    curr.next = temp;
//                }
//
//                curr = prev.next;
//            } else {
//                curr = curr.next;
//                prev = prev.next;
//            }
//        }
//
//        return head;
//    }
}
