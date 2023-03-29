package Sort;

//双向链表的快速排序
public class QuickSort {

    public static class Node{
        public int data;
        public Node next;
        public Node pre;

        public Node(int data) {
            this.data = data;
            this.next=null;
            this.pre=null;
        }
    }


    public static class LinkedList{
        public Node root;

        public void addNode(int data){
            if (root==null){
                root=new Node(data);
            }else {
                Node node = this.root;
                while (node.next!=null){
                    node=node.next;
                }
                Node node1 = new Node(data);
                node.next=node1;
                node1.pre=node;
            }
        }



        private void  quickSort(Node head,Node tail){
            if (head==null||tail==null||head==tail){
                return;
            }

            Node p1,p2;
            p1=head;
            p2=tail;
            boolean state=true;
            while (p1!=p2){
                if (state){
                    if (p1.data> p2.data){
                        int t= p1.data;
                        p1.data= p2.data;;
                        p2.data=t;
                        p1=p1.next;
                        state=false;
                    }else {
                        p2=p2.pre;
                    }
                }else {
                    if (p1.data> p2.data){
                        int t= p1.data;
                        p1.data= p2.data;;
                        p2.data=t;
                        p2=p2.pre;
                        state=true;
                    }else {
                        p1=p1.next;
                    }
                }
            }

            quickSort(head,p1);
            quickSort(p1.next,tail);

        }

        public void sort(){
            if (root==null||root.next==null){
                return;
            }
            Node sentry=new Node(0);
            sentry.next=root;
            root.pre=sentry;
            Node head = this.root;
            Node tail=this.root;

            while (tail.next!=null){
                tail=tail.next;
            }

            quickSort(head,tail);
            root=sentry.next;
            root.pre=null;
        }

        public void show(){
            Node node = this.root;
            while (node!=null){
                System.out.println(node.data);
                node=node.next;
            }
        }

    }


    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.addNode(1);
        list.addNode(9);
        list.addNode(6);
        list.addNode(5);
        list.addNode(7);
        list.addNode(8);
        list.addNode(5);
        list.sort();
        list.show();
    }
}
