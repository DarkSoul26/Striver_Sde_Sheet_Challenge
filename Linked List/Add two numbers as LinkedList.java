import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

    class LinkedListNode {
        int data;
        LinkedListNode next;
        
        public LinkedListNode(int data) {
            this.data = data;
        }
    }

*****************************************************************/


public class Solution {
    static LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2) {
        // Write your code here.
        boolean carry = false;
        LinkedListNode ans = new LinkedListNode(0);
        LinkedListNode finalAns = ans;
        LinkedListNode prev = ans;
        while(head1!=null && head2!=null){
            int x = head1.data+head2.data;
            if(carry){
                x++;
                carry = false;
            }
            if(x>9)
                carry = true;
            ans.data = x%10;
            prev = ans;
            ans.next = new LinkedListNode(0);
            ans = ans.next;
            head1 = head1.next;
            head2 = head2.next;
        }
        
        while(head1!=null){
            if(carry){
                head1.data++;
                carry = false;
            }
            if(head1.data>9)
                carry = true;
            prev = ans;
            ans.data = head1.data%10;
            ans.next = new LinkedListNode(0);
            ans = ans.next;
            head1 = head1.next;
        }
        
        while(head2!=null){
            if(carry){
                head2.data++;
                carry = false;
            }
            if(head2.data>9)
                carry = true;
            prev = ans;
            ans.data = head2.data%10;
            ans.next = new LinkedListNode(0);
            ans = ans.next;
            head2 = head2.next;
        }
        if(carry)
            ans.data = 1;
        else
            prev.next = null;
        return finalAns;
    }
}