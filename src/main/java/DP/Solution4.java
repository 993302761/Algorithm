package DP;

public class Solution4 {

    public static boolean isInterleave(String s1, String s2, String s3) {
        int p1,p2;
        p1=p2=0;

        for (int i = 0; i < s3.length(); i++) {
            if (p1<s1.length()&&s3.charAt(i)==s1.charAt(p1)){
                p1++;
            }else if (p2<s2.length()&&s3.charAt(i)==s2.charAt(p2)){
                p2++;
            }else {
                return false;
            }
        }

        if (p1==s1.length()&&p2==s2.length()){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isInterleave("aabcc","dbbca","aadbbcbcac"));
    }
}
