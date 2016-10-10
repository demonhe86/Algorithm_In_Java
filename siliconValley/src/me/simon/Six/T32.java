package me.simon.Six;

/**
 * Created by DemonHe on 16/10/8.
 * 32 链表去重
 */
public class T32 {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode firstCur = head;
        ListNode cur = head.next;
        while (cur != null) {
            if (firstCur.val != cur.val) {
                firstCur.next = cur;
                firstCur = cur;
            }
            cur = cur.next;
        }

        return head;
    }
}
