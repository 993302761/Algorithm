package LinkedList;

import java.util.HashSet;
import java.util.List;

public class Test4 {

    public static ListNode deleteDuplicates(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }
        ListNode s=new ListNode(0,head);
        ListNode node=s;

        while (node.next!=null&&node.next.next!=null){
            if (node.next.val==node.next.next.val){
                int a=node.next.val;
                while (node.next!=null&&node.next.val==a){
                    node.next=node.next.next;
                }
            }else {
                node=node.next;
            }
        }

        return s.next;
    }

}
