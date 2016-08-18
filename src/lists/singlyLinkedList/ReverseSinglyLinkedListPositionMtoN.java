package lists.singlyLinkedList;

/**
 * Created by rasn on 8/18/16.
 */
public class ReverseSinglyLinkedListPositionMtoN {

    public ListNode reverse(ListNode head, int m, int n){
        if(head == null || head.next == null) return head;
        ListNode headOriginal = head;
        ListNode beforeM = null;
        for(int i = 1; i < m ; i++){
            beforeM = head;
            head = head.next;
        }
        if(head == null || head.next == null) return headOriginal;
        ListNode node = head.next;
        ListNode prevNode = head;
        ListNode endNodeOfSubList = head;
        ListNode lookAhead = head.next.next;
        head.next = null;
        for(int j = m; j < n; j++){
            node.next = head;
            prevNode = node;
            head = node;
            node = lookAhead;
            if(node == null) break;
            lookAhead = lookAhead.next;
        }
        if(beforeM != null) beforeM.next = prevNode;
        endNodeOfSubList.next = node;
        return beforeM == null ? head : headOriginal;
    }
}
