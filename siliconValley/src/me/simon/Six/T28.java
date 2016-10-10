package me.simon.Six;

/**
 * Created by DemonHe on 16/10/8.
 * 反转链表
 */
public class T28 {

    //递归
//    public static ListNode reverseList(ListNode head, ListNode newHead) {
//        if (head == null || head.next == null) {
//            newHead = head;
//            return head;
//        }
//
//        ListNode pre = reverseList(head.next, newHead);
//        pre.next = head;
//        head.next = null;
//        return head;
//    }


    // 非递归
    public static ListNode reverseList(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        if (head == null) {
            return head;
        }
        ListNode cur = head.next;
        head.next = null;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = dummy.next;
            dummy.next = cur;
            cur = next;
        }

        return dummy.next;
    }
}
