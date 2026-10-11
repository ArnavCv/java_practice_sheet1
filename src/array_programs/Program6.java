package array_programs;

import java.util.Scanner;

public class Program6 {
    public int[] countAll(int[] nums) {
        int countPos = 0;
        int countNeg = 0;
        int countZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) countZero++;
            else if (nums[i] > 0) countPos++;
            else countNeg++;
        }
        return new int[]{countPos, countNeg, countZero};
    }

    public static void main(String[] args) {
        Program6 p = new Program6();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        int[] results = p.countAll(nums);
        System.out.println("Positive: " + results[0]);
        System.out.println("Negative: " + results[1]);
        System.out.println("Zero: " + results[2]);
    }
}
