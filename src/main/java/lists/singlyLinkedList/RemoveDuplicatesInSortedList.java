package main.java.lists.singlyLinkedList;

/**
 * Created by rasn on 8/18/16.
 */
public class RemoveDuplicatesInSortedList {
    public void removeDuplicates(ListNode head){
        if(head == null || head.next == null){
            return;
        }
        ListNode prevNode = head;
        ListNode currentNode = head.next;

        while(currentNode != null){
            if(currentNode.value == prevNode.value){
                prevNode.next = currentNode.next;
            } else {
                prevNode = currentNode;
            }
            currentNode = currentNode.next;
        }
    }
}
