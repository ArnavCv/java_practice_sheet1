package array_programs;

import java.util.*;

public class Program3 {
    public int[] maxMin(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxi) maxi = nums[i];
            if (nums[i] < mini) mini = nums[i];
        }
        return new int[]{maxi, mini};
    }

    public static void main(String[] args) {
        Program3 p = new Program3();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        int[] results = p.maxMin(nums);
        System.out.println("Maximum: " + results[0]);
        System.out.println("Minimum: " + results[1]);
    }
}
