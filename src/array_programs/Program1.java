package array_programs;

import java.util.Scanner;

public class Program1 {
    public int sum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public float average(int sum, int n) {
        float avg = (float) sum / (float) n;
        return avg;
    }

    public static void main(String[] args) {
        Program1 p = new Program1();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        int sum = p.sum(nums);
        float avg = p.average(sum, N);
        System.out.println("Total: " + sum);
        System.out.printf("Average: %.2f", avg);
    }
}
