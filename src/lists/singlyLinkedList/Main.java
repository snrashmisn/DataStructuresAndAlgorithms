package lists.singlyLinkedList;

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
    }
}
