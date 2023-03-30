package LinkedList;

import java.util.HashSet;

//链表去重

public class Test3 {



    public static ListNode deleteDuplicates(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }
        HashSet<Integer> hashSet=new HashSet<>();
        ListNode p1 = head;
        ListNode p2 = p1.next;
        hashSet.add(p1.val);
        while (p2!=null){
            if (!hashSet.contains(p2.val)) {
                hashSet.add(p2.val);
                p1.next = p2;
                p1=p2;
                p2=p2.next;
            }
            p2=p2.next;
        }

        return head;
    }

    public static void main(String[] args) {
        deleteDuplicates(new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(3,new ListNode(4,new ListNode(4,new ListNode(5,null))))))));
    }
}
