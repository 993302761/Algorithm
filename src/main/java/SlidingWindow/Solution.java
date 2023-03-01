package SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class Solution {

    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hashMap=new HashMap<>();
        //left指从哪里开始计数
        int left=0;
        int len=0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (hashMap.containsKey(c)){
                left=Math.max(left,hashMap.get(c)+1);
            }
            hashMap.put(c,i);
            if (len< i-left+1){
                len=i-left+1;
            }
        }
        return len;
    }

}
