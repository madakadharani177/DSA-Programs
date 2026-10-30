package com.DSA.linkedlist;

public class TraverseList {

    public void traverse(ListNode head) {

        ListNode ptr = head;

        while (ptr != null) {
            System.out.print(ptr.val + "->");
            ptr = ptr.next;
        }
    }

    public static void main(String[] args) {

        // Creating multiple nodes
        ListNode l1 = new ListNode(56);
        ListNode l2 = new ListNode(30);
        ListNode l3 = new ListNode(70);
        ListNode l4 = new ListNode(20);

        // Connecting the nodes
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        TraverseList list = new TraverseList();
        list.traverse(l1);
    }
}