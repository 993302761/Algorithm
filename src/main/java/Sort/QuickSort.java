package Sort;

public class QuickSort {

    //快速排序
    public static void sort(int[] s,int start,int end){
        if (start<end){
            int num=s[start];
            int left=start;
            int right=end;
            while (left<right){

                while (left<right&&s[left]<num){
                    left++;
                }

                while (left<right&&s[right]>num){
                    right--;
                }

                if (left<right){
                    int t=s[right];
                    s[right]=s[left];
                    s[left]=t;
                    left++;
                }
            }

            sort(s,start,right-1);

            sort(s,right+1,end);

        }

    }

    public static void main(String[] args) {
        int[] s=new int[]{5,1,4,3,6,2,8,9,7,10};
//        int[] s=new int[]{2,1,4,3};
        sort(s,0,s.length-1);

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
