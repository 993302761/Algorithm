package Sort;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请
 *
 * 你返回所有和为 0 且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 *
 */
public class Test2 {

    public static List<List<Integer>> threeSum(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]>nums[j]){
                    int t=nums[i];
                    nums[i]=nums[j];
                    nums[j]=t;
                }
            }
        }

        List<List<Integer>> list=new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            if (nums[i]>0){
                break;
            }

            if (i>0&&nums[i]==nums[i-1]){
                continue;
            }

            int p=i+1;
            int q= nums.length-1;
            while (p<q){
                if (nums[i]+nums[p]+nums[q]==0){
                    List<Integer> list1=new ArrayList<>();
                    list1.add(nums[i]);
                    list1.add(nums[p]);
                    list1.add(nums[q]);
                    list.add(list1);
                    while (p<q&&p< nums.length){
                        p++;
                        if (nums[p]!=nums[p-1]){
                            break;
                        }
                    }
                    while (p<q&&q>0){
                        q--;
                        if (nums[q]!=nums[q+1]){
                            break;
                        }
                    }

                }else if (nums[i]+nums[p]+nums[q]<0){
                    p++;
                }else {
                    q--;
                }
            }
        }

        return list;
    }

    public static void main(String[] args) {
        threeSum(new int[]{-2,0,0,2,2});
    }
}
