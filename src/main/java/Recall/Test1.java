package Recall;

import java.util.ArrayList;
import java.util.List;

/**
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 */
public class Test1 {

    public static void create(List<String> list,String s,int n){
        int left=0;
        int right=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='('){
                left++;
            }else {
                right++;
            }
        }
        if (left==right&&left==n&&right==n){
            list.add(s);
        }else if (left>n||right>n||right>left){
            return;
        }else {
            create(list,s+"(",n);
            create(list,s+")",n);
        }
    }

    public static List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        String s="(";
        create(list,s,n);
        return list;
    }

    public static void main(String[] args) {
        List<String> list = generateParenthesis(3);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
