package DP;

/**
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 *
 * 如果字符串的反序与原始字符串相同，则该字符串称为回文字符串。
 *
 * 示例 1：
 *
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案。
 *
 * 示例 2：
 *
 * 输入：s = "cbbd"
 * 输出："bb"
 *
 */
public class Solution {

    public boolean judge(char[] s,int l,int r){
        for (int i = l ,j=r; i<=j; i++,j--) {
            if (s[i]!=s[j]){
                return false;
            }
        }
        return true;
    }

    public String longestPalindrome(String s) {
        if (s.length()<2)
            return s;

        char[] s0 = s.toCharArray();
        int[] pLen={0,1};

        for (int i = 0; i < s.length()-1; i++) {
            int i1 =s.indexOf(s0[i], i  +(pLen[1]-pLen[0]));
            while (i1!=-1){
                if (judge(s0,i,i1)){
                    if (i1-i+1>pLen[1]-pLen[0]){
                        pLen[1]=i1+1;
                        pLen[0]=i;
                    }
                }
                i1 =s.indexOf(s0[i], i1 + 1);
            }
        }
        return s.substring(pLen[0],pLen[1]);
    }

}
