package array_programs;

import java.util.Scanner;

public class Program2 {
    public int[] countEvenOdd(int[] nums) {
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) countEven++;
            else countOdd++;
        }
        return new int[]{countEven, countOdd};
    }

    public static void main(String[] args) {
        Program2 p = new Program2();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        int[] results = p.countEvenOdd(nums);
        System.out.println("Even: " + results[0]);
        System.out.println("Odd: " + results[1]);
    }
}
