package array_programs;

import java.util.*;

public class Program13 {
    public int[] mergeArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] ans = new int[nums1.length + nums2.length];
        while (i != nums1.length && j != nums2.length) {
            if (nums1[i] < nums2[j]) ans[k++] = nums1[i++];
            else if (nums1[i] > nums2[j]) ans[k++] = nums2[j++];
            else {
                ans[k++] = nums1[i++];
                j++;
            }
        }
        while  (i != nums1.length) ans[k++] = nums1[i++];
        while  (j != nums2.length) ans[k++] = nums2[j++];
        return ans;
    }

    public static void main(String[] args) {
        Program13 p = new Program13();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums1 = new int[N];
        for (int i = 0; i < N; i++) {
            nums1[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        int[] nums2 = new int[M];
        for (int i = 0; i < M; i++) {
            nums2[i] = sc.nextInt();
        }
        int[] result =  p.mergeArrays(nums1, nums2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
