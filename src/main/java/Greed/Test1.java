package Greed;

public class Test1 {

    public static int jump0(int[] nums,int i,int n){
        if (i+nums[i]>= nums.length-1){
            return n+1;
        }

        int num= nums.length;
        for (int j = i+1; j <= i+nums[i] && j< nums.length; j++) {
            num=Math.min(num,jump0(nums,j,n+1));
        }
        return num;
    }


    public static int jump(int[] nums) {
//        if (nums.length==0||nums.length==1){
//            return 0;
//        }

        int end=0;
        int n= 0;
        int max=0;
        for (int i = 0; i < nums.length-1; i++) {
            max=Math.max(max,i+nums[i]);
            if (end==i){
                end=max;
                n++;
            }

        }
        return n;


//        return jump0(nums,0,0);
    }

    public static void main(String[] args) {
        System.out.println(jump(new int[]{1,1,1,1}));
    }
}
