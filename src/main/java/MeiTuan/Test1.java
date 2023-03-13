package MeiTuan;

import java.util.Scanner;
import java.util.Set;

/**
 *  输入第一行包含两个正整数n和m，分别代表学生人数和考试科目数量。(n,m<=500)
 *
 * 接下来有n行，每行有m个正整数，每个正整数在1-100之间，中间用空格隔开，表示每个学生的m科考试成绩。
 *
 * 输出
 * 输出仅包含一个整数，表示获得单科成绩优秀奖的人数
 */
public class Test1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int num=0;
        if (n < 2) {
            System.out.println(m);
        } else {
            int[][] array = new int[n][m];
            for (int i = 0; i < n; i++) {
                boolean s=true;
                for (int j = 0; j < m; j++) {
                    array[i][j] = scanner.nextInt();
                    if (array[i][j]>85&&s){
                        num++;
                        s=false;
                    }
                }
            }
            System.out.println(num);
        }
    }
}
