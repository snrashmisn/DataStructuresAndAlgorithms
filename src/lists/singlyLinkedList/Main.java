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
    }
}
