package main.java.lists.singlyLinkedList;

/**
 * Created by rasn on 8/18/16.
 */
public class Main {
    public static void main(String[] args) {
        ListNode head = ListNode.createList();
        System.out.println("Original list = " + head);
        ReverseSinglyLinkedList reverseSinglyLinkedList = new ReverseSinglyLinkedList();
        head = reverseSinglyLinkedList.reverse(head);
        System.out.println("Reversed list = " + head);

        ListNode head2 = ListNode.createList();
        head2.next.next.next.next = new ListNode(5);
        System.out.println("Original List  = " + head2);
        ReverseSinglyLinkedListPositionMtoN reverse = new ReverseSinglyLinkedListPositionMtoN();
        head2 = reverse.reverse(head2, 1, 3);
        System.out.println("head2 = " + head2);

        ListNode head3 = new ListNode(1);
        head3.next = new ListNode(2);
        head3.next.next = new ListNode(2);
        head3.next.next.next = new ListNode(3);
        head3.next.next.next.next = new ListNode(3);
        head3.next.next.next.next.next = new ListNode(4);
        System.out.println("Before Removing Duplicates = " + head3);
        RemoveDuplicatesInSortedList removeDup = new RemoveDuplicatesInSortedList();
        removeDup.removeDuplicates(head3);
        System.out.println("After Removing Duplicates = " + head3);

        ListNode head4 = new ListNode(1);
        head4.next = new ListNode(2);
        head4.next.next = new ListNode(2);
        head4.next.next.next = new ListNode(3);
        head4.next.next.next.next = new ListNode(3);
        head4.next.next.next.next.next = new ListNode(4);
        System.out.println("Before Removing Duplicates = " + head4);
        RemoveDuplicateNumbersInSortedList r = new RemoveDuplicateNumbersInSortedList();
        head4 = r.removeDuplicates(head4);
        System.out.println("After Removing Duplicates = " + head4);

    }
}
