package main.java.lists.singlyLinkedList;

/**
 * Created by rasn on 8/18/16.
 */
public class RotateList {

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k <= 0) return head;
        ListNode kthpointer = null;
        ListNode currentNode = head;
        ListNode prevNode = null;
        int i = 1;
        while(currentNode != null){
            if(i == k){
                kthpointer = currentNode;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
            i++;
        }
        if(i == k || k % i == 0) return head;
        if(k > i){
            k = k % i;
            kthpointer = null;
            currentNode = head;
            i = 1;
            while(currentNode != null){
                if(i == k){
                    kthpointer = currentNode;
                }
                prevNode = currentNode;
                currentNode = currentNode.next;
                i++;
            }
        }

        prevNode.next = head;
        head = kthpointer.next;
        kthpointer.next = null;

        return head;
    }
}
