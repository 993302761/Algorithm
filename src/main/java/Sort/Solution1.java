package Sort;

/**
 * 给定一个包含红色、白色和蓝色、共 n 个元素的数组 nums ，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 *
 * 我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 *
 */
public class Solution1 {

    public static void sortColors(int[] nums) {
        int p0,p1;
        p0=p1=0;
        for (int i = 0; i < nums.length;i++ ) {
            if (nums[i]==0){
                int t=nums[p0];
                nums[p0]=nums[i];
                nums[i]=t;
                if (p0<p1){
                    t=nums[p1];
                    nums[p1]=nums[i];
                    nums[i]=t;
                }
                p0++;
                p1++;
            }else if (nums[i]==1){
                int t=nums[p1];
                nums[p1]=nums[i];
                nums[i]=t;
                p1++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {
        sortColors(new int[]{2,0,2,1,1,0});
    }
}
