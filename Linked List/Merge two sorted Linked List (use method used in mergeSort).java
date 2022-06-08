/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

public class Solution {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		// Write your code here.
        LinkedListNode<Integer> merge = new LinkedListNode<Integer>(-1);
        LinkedListNode<Integer> finalMerge = merge;
        while(first!=null && second!=null){
            if(first.data<=second.data){
                merge.next =  new LinkedListNode<Integer>(first.data);
                first = first.next;
            }
            else{
                merge.next = new LinkedListNode<Integer>(second.data);
                second = second.next;
            }
            merge = merge.next;    
        }
        while(first!=null){
            merge.next = new LinkedListNode<Integer>(first.data);
            merge = merge.next;
            first = first.next;
        }
        
        while(second!=null){
            merge.next = new LinkedListNode<Integer>(second.data);
            merge = merge.next;
            second = second.next;
        }
//         if(finalMerge.next == null)
//             return finalMerge;
        return finalMerge.next;
	}
}
