package main.java.lists.singlyLinkedList;

/**
 * Created by rasn on 8/18/16.
 */
public class ReverseSinglyLinkedList {

    public ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode node = head.next;
        ListNode lookAhead = head.next.next;
        head.next = null;
        while(node != null){
            node.next = head;
            head = node;
            node = lookAhead;
            if(node == null) break;
            lookAhead = lookAhead.next;
        }
        return head;
    }
}
