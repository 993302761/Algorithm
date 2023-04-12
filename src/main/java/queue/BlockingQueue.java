package queue;

import java.util.ArrayList;
import java.util.List;

/**
 * 实现阻塞队列
 */
public class BlockingQueue {

    public BlockingQueue(int i) {

    }

    public static class MyQueue {

        private int len;

        private List<Integer> list;

        private Object object;

        public MyQueue(int len) {
            this.len=len;
            object=new Object();
            this.list = new ArrayList(len);
        }

        public void push(int data){
            synchronized (object){
                if (list.size()==len){
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                list.add(data);
                object.notify();

            }
        }

        public int pop(){
            synchronized (object){
                if (list.size()==0){
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int i=list.get(0);
                list.remove(0);
                object.notify();
                return i;
            }
        }
    }

    public static void main(String[] args) {
        MyQueue queue=new MyQueue(1);

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    queue.push(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        while (true){
            System.out.println(queue.pop());
        }
    }
}
