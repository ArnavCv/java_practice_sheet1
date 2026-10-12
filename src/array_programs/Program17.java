package array_programs;

import java.util.*;

public class Program17 {
    public void studentReport(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int highest =  Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        int passCount = 0;
        int failCount = 0;
        int aboveAvg = 0;
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > highest) highest = nums[i];
            if (nums[i] < lowest) lowest = nums[i];
            if (nums[i] >= 40) passCount++;
            else failCount++;
            total += nums[i];
        }
        float average = (float) total / (float) nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > average) aboveAvg++;
        }
        System.out.printf("Average: %.2f\n", average);
        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
        System.out.println("Passed: " + passCount);
        System.out.println("Failed: " + failCount);
        System.out.println("Above Average: " + aboveAvg);
    }

    public static void main(String[] args) {
        Program17 p = new Program17();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        p.studentReport(nums);
    }
}
