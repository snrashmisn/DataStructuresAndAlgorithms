package main.java.lists.singlyLinkedList;

/**
 * Created by rasn on 8/18/16.
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
 * Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

 For example,
 Given 1->2->3->3->4->4->5, return 1->2->5.
 Given 1->1->1->2->3, return 2->3.
 */
public class RemoveDuplicateNumbersInSortedList {
    public ListNode removeDuplicates(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = null;
        ListNode navigator = head;
        ListNode prevNode = head;
        ListNode currentNode = head.next;
        boolean isCurrentValDuplicate = false;

        while(currentNode != null){
            if(currentNode.value != prevNode.value) {
                if(isCurrentValDuplicate ==  false) {
                    if (newHead == null) {
                        newHead = prevNode;
                        navigator = newHead;
                        newHead.next = null;
                    } else {
                        navigator.next = prevNode;
                        navigator = navigator.next;
                    }
                }
                isCurrentValDuplicate = false;
                prevNode = currentNode;
            } else {
                isCurrentValDuplicate = true;
            }
            currentNode = currentNode.next;
        }
        if(isCurrentValDuplicate == false){
            if(newHead != null ){
                navigator.next = prevNode;
            } else {
                newHead = prevNode;
            }
        } else {
            navigator.next = null;
        }
        return newHead;
    }
}
