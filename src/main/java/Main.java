import Recurrence.Solution1;
import SlidingWindow.Solution;

import java.util.concurrent.ThreadPoolExecutor;

public class Main {

    //整数反转
    public static int reverse(int x) {
        int num=0;
        int i=1;
        if (x==0){
            return num;
        }else if (x<0){
            i=-1;
            x=-x;
        }

            while (x!=0){
                if (num < Integer.MIN_VALUE / 10 || num > Integer.MAX_VALUE / 10) {
                    return 0;
                }
                num=num*10+x%10;
                x/=10;
            }

        return num*i;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-2147483412));
    }
}
