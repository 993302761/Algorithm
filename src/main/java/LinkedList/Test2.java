package LinkedList;

import java.util.ArrayDeque;
import java.util.Deque;

//删除链表的倒数第 N 个结点
public class Test2 {

      public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        Deque<ListNode> stack = new ArrayDeque<>();
        ListNode node = head;
        while (node!=null){
            stack.push(node);
            node=node.next;
        }

        ListNode p1=null;
        for (int i = 0; i < n; i++) {
            p1=stack.pop();
        }
        if (!stack.isEmpty()){
            ListNode p2 = stack.pop();
            p2.next=p1.next;
        }else {
            head=p1.next;
        }

        return head;
    }

}
