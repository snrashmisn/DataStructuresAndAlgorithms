package main.java.lists.singlyLinkedList;

/**
 * Created by rasn on 8/18/16.
 */
public class RotateList {

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k <= 0) return head;
        ListNode kthpointer = null;
        ListNode currentNode = head;
        int i = 1;
        while(currentNode.next != null){
            if(i == k){
                kthpointer = currentNode;
            }
            currentNode = currentNode.next;
            i++;
        }
        System.out.println("i = " + i);

        if(i == k || k % i == 0) return head;
        if(k > i){
            k = k % i;
            kthpointer = null;
            currentNode = head;
            i = 1;
            while(currentNode.next != null){
                if(i == k){
                    kthpointer = currentNode;
                }
                currentNode = currentNode.next;
                i++;
            }
        }

        currentNode.next = head;
        head = kthpointer.next;
        kthpointer.next = null;

        return head;
    }
}
