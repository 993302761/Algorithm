package Sort;

//数组的快速排序
public class Quicksort {

    private static void quickSort(int[] num,int start,int end){
        if (num.length==0||start>=end){
            return ;
        }

        boolean p=true;
        int i=start,j=end-1;
        while ( i < j) {
            if (p){
                if (num[i]>num[j]){
                    int t=num[i];
                    num[i]=num[j];
                    num[j]=t;
                    i++;
                    p= false;
                }else {
                    j--;
                }
            }else {
                if (num[i]>num[j]){
                    int t=num[i];
                    num[i]=num[j];
                    num[j]=t;
                    j--;
                    p= true;
                }else {
                    i++;
                }
            }
            quickSort(num,start,i);
            quickSort(num,i+1,end);
        }
    }

    public static void sort(int[] num){
        if (num.length==0){
            return;
        }
        quickSort(num,0,num.length);
    }

    public static void main(String[] args) {
        int[] ints = {8,8,8,8,8,8,8};

        sort(ints);


        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

    }
}
