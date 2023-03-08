package Recurrence;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 给你一个字符串 s 和一个整数 k ，请你找出 s 中的最长子串， 要求该子串中的每一字符出现次数都不少于 k 。返回这一子串的长度。
 */
public class Solution1 {
    public int longestSubstring(String s, int k) {
        Map<Character,Integer> map=new HashMap();
        for (int i = 0; i < s.length(); i++) {
            Integer integer=1;
            Character c=s.charAt(i);
            if (map.containsKey(c)){
                integer = map.get(c)+1;
            }
            map.put(c,integer);
        }

        Set<Character> characters = map.keySet();
        for (Character character : characters) {
            if (map.get(character)<k){
                int len=0;
                for (String s1 : s.split(String.valueOf(character))) {
                    len = Math.max(len, longestSubstring(s1, k));
                }
                return len;
            }
        }

        return s.length();
    }
}
