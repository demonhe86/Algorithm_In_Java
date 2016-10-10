package me.simon.Six;

import java.awt.*;

/**
 * Created by DemonHe on 16/10/8.
 */
public class ListNode {
    int val;
    ListNode next;
    public ListNode (int val) {
        this.val = val;
        this.next = null;
    }

    public static void printList(ListNode l) {
        while (l != null) {
            System.out.println(l.val);
            l = l.next;
        }
    }
}
