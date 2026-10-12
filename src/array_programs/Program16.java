package array_programs;

import java.util.*;

public class Program16 {
    public int maximumSubarray(int[] nums) {
        int maximum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum < 0) sum = nums[i];
            else sum += nums[i];
            if (sum > maximum) maximum = sum;
        }
        return maximum;
    }

    public static void main(String[] args) {
        Program16 p = new Program16();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Maximum Subarray Sum: " + p.maximumSubarray(nums));
    }
}
