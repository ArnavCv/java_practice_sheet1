package array_programs;

import java.util.*;

public class Program5 {
    public void reverseArray(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        Program5 p = new Program5();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        p.reverseArray(nums);
        for (int i = 0; i < N; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
