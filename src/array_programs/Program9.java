package array_programs;

import java.util.*;

public class Program9 {
    public int secondLargest(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                slargest = largest;
                largest = nums[i];
            }
            else if (nums[i] > slargest && nums[i] < largest) slargest = nums[i];
        }
        return slargest;
    }

    public static void main(String[] args) {
        Program9 p = new Program9();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Second Largest: " + p.secondLargest(nums));
    }
}
