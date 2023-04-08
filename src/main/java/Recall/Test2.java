package Recall;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
 */
public class Test2 {

    public static void create(List<List<Integer>> list,List<Integer> s,int[] nums){
        if (s.size()== nums.length){
            list.add(s);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!s.contains(nums[i])){
                List<Integer> s0=new ArrayList<>(s);
                s0.add(nums[i]);
                create(list,s0,nums);
            }
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> s=new ArrayList<>();
            s.add(nums[i]);
            create(list,s,nums);
        }
        return list;
    }

    public static void main(String[] args) {
        permute(new int[]{1,2,3});
    }

}
