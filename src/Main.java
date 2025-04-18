import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2};
        int[] array2 = {3,4};

        System.out.println(findMedianSortedArrays(array1, array2));

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int newSize = nums1.length + nums2.length;

            int merged[] = new int[newSize];
            int k = 0;
            for(int i = 0;i<nums1.length;i++) {
                merged[k++] = nums1[i];
            }
            for(int j =0;j<nums2.length;j++){
                merged[k++] = nums2[j];
            }

            Arrays.sort(merged);
            System.out.println(Arrays.toString(merged));

            int total = merged.length;

            double res = 0.0;
            if(total % 2 == 1){
                System.out.println(merged[total/2]);
                res = merged[total/2];
            }else{
                System.out.println(merged[total/2]);
                System.out.println(merged[(total/2)-1]);

                res = ((double)(merged[(total/2)-1] + (double)merged[total/2]))/2;
            }
            return res;
        }
}
