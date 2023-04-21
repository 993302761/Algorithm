package DP;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 给你一个只包含 '(' 和 ')' 的字符串，找出最长有效（格式正确且连续）括号子串的长度。
 */
public class Test {

    public static int longestValidParentheses(String s) {
        Deque<Integer> deque=new LinkedList();
        int num=0;
        deque.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='('){
                deque.push(i);
            }else {
                deque.pop();
                if (deque.isEmpty()){
                    deque.push(i);
                }else {
                    num=Math.max(num,i-deque.peek());
                }
            }
        }

        return num;
    }


    public static void main(String[] args) {
        System.out.println(longestValidParentheses("()"));
    }
}
