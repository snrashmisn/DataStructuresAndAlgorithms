package main.java.numbers;

/**
 * Created by rasn on 9/3/16.
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(9);
        System.out.println("----- ");
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode s = addTwoNumbers.addTwoNumbers(l1, l2);
        while(s != null){
            System.out.println(s.val);
            s = s.next;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }
        ListNode lTotal = null, current = null;
        int carry = 0;
        while(l1 != null && l2 != null){
            int sum = l1.val + l2.val + carry;
            carry = sum > 9 ? 1 : 0;
            int val = sum % 10;
            if(lTotal == null){
                lTotal = current = new ListNode(val);
            } else {
                current.next = new ListNode(val);
                current = current.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        if(l1 != null) {
            lTotal = addRemaining(l1, lTotal, current, carry);
        } else if(l2 != null){
            lTotal = addRemaining(l2, lTotal, current, carry);
        } else if (carry == 1){
                current.next = new ListNode(1);
        }

        return lTotal;
    }

    private ListNode addRemaining(ListNode l, ListNode lTotal, ListNode current, int carry){
        while(l != null) {
            int sum = l.val + carry;
            carry = sum > 9 ? 1 : 0;
            int val = sum % 10;
            if(lTotal == null){
                lTotal = current = new ListNode(val);
            } else {
                current.next = new ListNode(val);
                current = current.next;
            }
            l = l.next;
        }
        if(carry == 1){
            current.next = new ListNode(1);
        }
        return lTotal;
    }
}

class ListNode{
    public int val;
    public ListNode next;
    ListNode(int val){
        this.val = val;
    }
}
