package array_programs;

import java.util.*;

public class Program12 {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        for (; j < nums.length; j++) nums[j] = 0;
    }

    public static void main(String[] args) {
        Program12 p = new Program12();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        p.moveZeroes(nums);
        for (int i = 0; i < N; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
