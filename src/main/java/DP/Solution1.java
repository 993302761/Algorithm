package DP;

/**
 * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 子数组 是数组中的一个连续部分。
 */
public class Solution1 {

    public int maxSubArray(int[] nums) {

        int[] s=new int[nums.length];
        s[0]=nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (s[i-1]<0){
                s[i]=nums[i];
            }else {
                s[i]=nums[i]+s[i-1];
            }
        }

        int p=s[0];
        for (int i = 1; i < s.length; i++) {
            p=Math.max(p,s[i]);
        }

        return p;
    }

}
