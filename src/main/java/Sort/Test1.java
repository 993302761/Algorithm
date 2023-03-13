package Sort;

public class Test1 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len= nums2.length+nums1.length;
        int p1=0,p2=0;
        int[] n=new int[(len)/2+1];
        for (int i = 0; i < (len)/2+1; i++) {
            if (p1>= nums1.length||p2< nums2.length&&nums1[p1]>nums2[p2]){
                    n[i]=nums2[p2++];

            }else {
                    n[i]=nums1[p1++];

            }
        }
        if (len%2==0){
            return (n[n.length-1]+n[n.length-2])/2.0;
        }else {
            return n[n.length-1];
        }
    }

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1, 2}, new int[]{3,4}));
    }
}
