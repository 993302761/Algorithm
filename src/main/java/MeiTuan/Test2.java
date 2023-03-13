package MeiTuan;

import java.util.Scanner;

/**
 * 小美是美团的前端工程师，为了防止系统被恶意攻击，小美必须要在用户输入用户名之前做一个合法性检查，一个合法的用户名必须满足以下几个要求：
 *
 *     用户名的首字符必须是大写或者小写字母。
 *     用户名只能包含大小写字母，数字。
 *     用户名需要包含至少一个字母和一个数字。
 *     如果用户名合法，请输出 "Accept"，反之输出 "Wrong"。
 *
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        n=scanner.nextInt();
        if (n<1||n>100){
            return;
        }
        String[] s=new String[n];

        for (int i = 0; i < n; i++) {
            s[i]= scanner.next();
        }

        for (int i = 0; i < n; i++) {
            int i1=0,i2=0;
            int j=0;
            for (; j < s[i].length(); j++) {
                char c=s[i].charAt(j);
                if (c>='A'&&c<='Z'||c>='a'&&c<='z'){
                    i1++;
                }else if (c>='0'&&c<='9'){
                    i2++;
                    if (j==0){
                        System.out.println("Wrong");
                        break;
                    }
                }else {
                    System.out.println("Wrong");
                    break;
                }
            }
            if (j>=s[i].length()){
                if (i1==0||i2==0){
                    System.out.println("Wrong");
                }else {
                    System.out.println("Accept");
                }
            }
        }
    }
}
