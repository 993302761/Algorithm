package MeiTuan;

import java.util.Scanner;

/**
 * 小美是美团仓库的管理员，她会根据单据的要求按顺序取出仓库中的货物，每取出一件货物后会把剩余货物重新堆放，
 * 使得自己方便查找。已知货物入库的时候是按顺序堆放在一起的。如果小美取出其中一件货物，
 * 则会把货物所在的一堆物品以取出的货物为界分成两堆，这样可以保证货物局部的顺序不变。
 * 已知货物最初是按 1~n 的顺序堆放的，每件货物的重量为 w[i] ,小美会根据单据依次不放回的取出货物。
 * 请问根据上述操作，小美每取出一件货物之后，重量和最大的一堆货物重量是多少？
 *
 */
public class Test3 {



    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] w=new int[n];
        int[] num=new int[n];

        for (int i = 0; i < n; i++) {
            w[i]= scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            num[i]= scanner.nextInt();
        }

        int[] wSum=new int[n];
        for (int i = 0; i < n-1; i++) {
            w[num[i]-1]=0;
            int p2=0;
            for (int j = 0; j < w.length; j++) {
                if (w[j]==0){
                    wSum[i]=Math.max(wSum[i],p2);
                    p2=0;
                }else {
                    p2+=w[j];
                }
            }
            wSum[i]=Math.max(wSum[i],p2);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(wSum[i]);
        }
    }
}
