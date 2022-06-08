import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

       class Node 
        { 
        public:
            int data;
            Node next;
            Node(int data) 
            {
              this.data = data;
              this.next = null;
            }
        };

*****************************************************************/

public class Solution {
    public static Node findMiddle(Node head) 
    {
        // Write your code here
        int count = 0;
        Node temp = head;
        while(head.next!=null){
            if(head.next.next!=null){
                count++;
                head = head.next.next;
            }
            else{
                count++;
                break;
            }
        }
        while(count--!=0)
            temp = temp.next;     
        return temp;
    }
}
