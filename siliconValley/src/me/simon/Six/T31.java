package me.simon.Six;

/**
 * Created by DemonHe on 16/10/8.
 * 31 链表分区
 */
public class T31 {
    public static ListNode partitionLinkedList(ListNode head, int x) {
        ListNode dummy = new ListNode(0);
        ListNode pivot = new ListNode(x);
        ListNode first = dummy, second = pivot, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            if (curr.val < x) {
                first.next = curr;
                first = curr;
            } else {
                second.next = curr;
                second = curr;
//                second.next = null;
            }

            curr = next;

        }

        first.next = pivot.next;
        return dummy.next;
    }
}
