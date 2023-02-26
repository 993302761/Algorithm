package Sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 给定一个大小为 n 的整数数组，找出其中所有出现超过 ⌊ n/3 ⌋ 次的元素。
 */
public class Solution2 {

    public static List<Integer> majorityElement(int[] nums) {
        int n=nums.length/3;
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.get(nums[i])!=null){
                int s=hashMap.get(nums[i]);
                hashMap.put(nums[i],s+1);
            }else {
                hashMap.put(nums[i],1);
            }
        }

        for (int s :
                hashMap.keySet()) {
            if (hashMap.get(s)>n){
                list.add(s);
            }
        }


        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = majorityElement(new int[]{3, 2, 3});
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
