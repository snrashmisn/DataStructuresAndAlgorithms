package main.java.lists.singlyLinkedList;

/**
 * Created by rasn on 8/19/16.
 */
public class RemoveKthElementFromLast {
    public ListNode removeKthElement(ListNode head, int k){
        if(head == null || k <= 0) return head;

        ListNode NMinusKminusOnePointer = null;
        int N = 0;
        ListNode currentNode = head;
        while(currentNode != null){
            N++;
            if (N - k > 0) {
                if(NMinusKminusOnePointer == null){
                    NMinusKminusOnePointer = head;
                } else {
                    NMinusKminusOnePointer = NMinusKminusOnePointer.next;
                }
            }
            currentNode = currentNode.next;
        }
        if(k < N){
            NMinusKminusOnePointer.next = NMinusKminusOnePointer.next.next;
        } else if(k == N){
            head = head.next;
        }
        return head;
    }
}
