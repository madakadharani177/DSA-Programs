package com.DSA.linkedlist;

public class DeleteCase {

    // Node class
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Delete node at beginning
    public ListNode deleteAtBeg(ListNode head) {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        }

        head = head.next;
        return head;
    }

    // Delete node at any position (1-based indexing)
    public ListNode deleteAtPos(ListNode head, int pos) {

        if (head == null) {
            System.out.println("List is empty");
            return null;
        }

        if (pos < 1) {
            System.out.println("Invalid position");
            return head;
        }

        // Delete first node
        if (pos == 1) {
            return head.next;
        }

        ListNode ptr = head;

        for (int i = 1; i < pos - 1 && ptr != null; i++) {
            ptr = ptr.next;
        }

        // Position out of range
        if (ptr == null || ptr.next == null) {
            System.out.println("Position out of range");
            return head;
        }

        // Delete node
        ptr.next = ptr.next.next;

        return head;
    }

    // Delete node at end
    public ListNode deleteAtEnd(ListNode head) {

        if (head == null) {
            System.out.println("List is empty");
            return null;
        }

        // Only one node
        if (head.next == null) {
            return null;
        }

        ListNode ptr = head;

        while (ptr.next.next != null) {
            ptr = ptr.next;
        }

        ptr.next = null;

        return head; 
    }

    // Traverse linked list
    public void traverse(ListNode head) {

        ListNode ptr = head;

        while (ptr != null) {
            System.out.print(ptr.val + " -> ");
            ptr = ptr.next;
        }

        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {

        // Creating nodes
        ListNode l1 = new ListNode(56);
        ListNode l2 = new ListNode(30);
        ListNode l3 = new ListNode(70);
        ListNode l4 = new ListNode(20);

        // Connecting nodes
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        DeleteCase dc = new DeleteCase();

        ListNode head = l1;

        System.out.println("------ Normal Traversal ------");
        dc.traverse(head);

        System.out.println("\n------ Delete at Beginning ------");
        head = dc.deleteAtBeg(head);
        dc.traverse(head);

        System.out.println("\n------ Delete at Position 3 ------");
        head = dc.deleteAtPos(head, 3);
        dc.traverse(head);

        System.out.println("\n------ Delete at End ------");
        head = dc.deleteAtEnd(head);
        dc.traverse(head);
    }
}