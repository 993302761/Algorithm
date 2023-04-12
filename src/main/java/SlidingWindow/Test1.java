package SlidingWindow;

import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

//给你一个整数数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
public class Test1 {

    public static int[] maxSlidingWindow(int[] nums, int k) {

            Deque<Integer> queue=new LinkedList();
            int[] s=new int[nums.length-k+1];

            for (int i = 0 ,j=0; i < nums.length ; i++) {
                while (!queue.isEmpty()&&nums[i]>=nums[queue.peekLast()]){
                    queue.pollLast();
                }
                queue.offerLast(i);
                int left=i-k+1;

                while (left>queue.peekFirst()){
                    queue.pollFirst();
                }

                if (i>=k-1){
                    s[j++]=nums[queue.peekFirst()];
                }
            }

            return s;
    }

    public static void main(String[] args) {
        int[] ints = maxSlidingWindow(new int[]{1,3,1,2,0,5}, 3);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }


}
