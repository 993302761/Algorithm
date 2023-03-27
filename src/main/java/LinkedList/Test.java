package LinkedList;

/**
 * 给你单链表的头指针 head 和两个整数 left 和 right ，其中 left <= right 。请你反转从位置 left 到位置 right 的链表节点，返回 反转后的链表 。
 *
 */
public class Test {

      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
          ListNode sentry=new ListNode(0);
          sentry.next=head;
          ListNode p1=sentry;
        for (int i = 0; i < left-1; i++) {
            p1=p1.next;
        }
        ListNode p2=p1.next;
        ListNode t;
        for (int i = 0; i < right-left ; i++) {
            t=p2.next;
            p2.next=t.next;
            t.next=p1.next;
            p1.next=t;
        }

         return sentry.next;
    }

    public static void main(String[] args) {
        reverseBetween(new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,null))))),2,4);
//        reverseBetween(new ListNode(1,new ListNode(2,new ListNode(3,null))),1,2);
    }
}
