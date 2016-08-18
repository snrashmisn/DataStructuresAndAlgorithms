package test.java.lists.singlyLinkedList;

import junit.framework.TestCase;
import main.java.lists.singlyLinkedList.ListNode;
import main.java.lists.singlyLinkedList.RemoveDuplicateNumbersInSortedList;

/**
 * Created by rasn on 8/18/16.
 */
public class RemoveDuplicateNumbersInSortedListTest extends TestCase {

    public void testRemoveDuplicates() throws Exception {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(4);
        System.out.println("Before Removing Duplicates = " + head);
        RemoveDuplicateNumbersInSortedList r = new RemoveDuplicateNumbersInSortedList();
        head = r.removeDuplicates(head);
        System.out.println("After Removing Duplicates = " + head);
        assertTrue(head.toString().equals("1 -> 4"));
    }

    public void testRemoveDuplicates2() throws Exception {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        System.out.println("Before Removing Duplicates = " + head);
        RemoveDuplicateNumbersInSortedList r = new RemoveDuplicateNumbersInSortedList();
        head = r.removeDuplicates(head);
        System.out.println("After Removing Duplicates = " + head);
        assertTrue(head == null);
    }


}