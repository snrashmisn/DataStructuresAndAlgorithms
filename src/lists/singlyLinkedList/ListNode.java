package lists.singlyLinkedList;

/**
 * Created by rasn on 8/18/16.
 */
public class ListNode {
    int value;
    ListNode next;
    ListNode(int value){
        this.value = value;
    }

    public static ListNode createList() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        return head;
    }

    @Override
    public String toString() {
        StringBuilder list = new StringBuilder(String.valueOf(value));

        ListNode node = next;
        while(node != null){
            list.append(" -> ");
            list.append(node.value);
            node = node.next;
        }
        return list.toString();
    }
}
