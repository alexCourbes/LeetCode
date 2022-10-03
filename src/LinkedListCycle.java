import java.util.LinkedList;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {

        if (head == null){ return false; }

        ListNode slowPointer = head;
        ListNode fastPointer = head.next;



        while(slowPointer != fastPointer ){

            if(fastPointer == null || fastPointer.next ==null){
                return false;
            }

            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }



        return true;
    }


}
