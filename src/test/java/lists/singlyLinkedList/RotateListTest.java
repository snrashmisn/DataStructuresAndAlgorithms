package test.java.lists.singlyLinkedList;

import junit.framework.TestCase;
import main.java.lists.singlyLinkedList.ListNode;
import main.java.lists.singlyLinkedList.RotateList;

/**
 * Created by rasn on 8/18/16.
 */
public class RotateListTest extends TestCase {

    public void testRotateRight() throws Exception {

        ListNode head = ListNode.createList();
        RotateList rotate = new RotateList();
        System.out.println("head = " + head);
        head = rotate.rotateRight(head, 0);
        System.out.println("head = " + head);
        assertTrue(head.toString().equals("1 -> 2 -> 3 -> 4"));
    }

    public void testRotateRight2() throws Exception {

        ListNode head = ListNode.createList();
        RotateList rotate = new RotateList();
        System.out.println("head = " + head);
        head = rotate.rotateRight(head, 2);
        System.out.println("head = " + head);
        assertTrue(head.toString().equals("3 -> 4 -> 1 -> 2"));

    }
    public void testRotateRight3() throws Exception {

        ListNode head = ListNode.createList();
        RotateList rotate = new RotateList();
        System.out.println("head = " + head);
        head = rotate.rotateRight(head, 4);
        System.out.println("head = " + head);
        assertTrue(head.toString().equals("1 -> 2 -> 3 -> 4"));
    }

    public void testRotateRight4() throws Exception {

        ListNode head = ListNode.createList();
        RotateList rotate = new RotateList();
        System.out.println("head = " + head);
        head = rotate.rotateRight(head, 10);
        System.out.println("head = " + head);
        assertTrue(head.toString().equals("3 -> 4 -> 1 -> 2"));
    }

    public void testRotateRight5() throws Exception {

        ListNode head = ListNode.createList();
        head.next.next.next = null;
        RotateList rotate = new RotateList();
        System.out.println("head = " + head);
        head = rotate.rotateRight(head, 2);
        System.out.println("head = " + head);
        assertTrue(head.toString().equals("3 -> 1 -> 2"));
    }
}