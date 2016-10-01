package test.java.lists.singlyLinkedList;

import junit.framework.TestCase;
import main.java.lists.singlyLinkedList.ListNode;
import main.java.lists.singlyLinkedList.RemoveKthElementFromLast;

/**
 * Created by rasn on 8/19/16.
 */
public class RemoveKthElementFromLastTest extends TestCase {

    public void testRemoveKthElement() throws Exception {
        ListNode head = ListNode.createList();
        System.out.println("Before Removing  = " + head);
        RemoveKthElementFromLast r = new RemoveKthElementFromLast();
        int k = 0;
        head = r.removeKthElement(head, k);
        System.out.println("K = " + k + ", After Removing  = " + head);

    }

    public void testRemoveKthElement2() throws Exception {
        ListNode head = ListNode.createList();
        System.out.println("Before Removing  = " + head);
        RemoveKthElementFromLast r = new RemoveKthElementFromLast();
        int k = 1;
        head = r.removeKthElement(head, k);
        System.out.println("K = " + k + ", After Removing  = " + head);

    }
    public void testRemoveKthElement3() throws Exception {
        ListNode head = ListNode.createList();
        System.out.println("Before Removing  = " + head);
        RemoveKthElementFromLast r = new RemoveKthElementFromLast();
        int k = 4;
        head = r.removeKthElement(head, k);
        System.out.println("K = " + k + ", After Removing  = " + head);

    }
    public void testRemoveKthElement4() throws Exception {
        ListNode head = ListNode.createList();
        System.out.println("Before Removing  = " + head);
        RemoveKthElementFromLast r = new RemoveKthElementFromLast();
        int k = 2;
        head = r.removeKthElement(head, k);
        System.out.println("K = " + k + ", After Removing  = " + head);

    }
}