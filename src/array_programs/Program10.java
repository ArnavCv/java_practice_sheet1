package array_programs;

import java.util.*;

public class Program10 {
    public Map<Integer, Integer> frequency(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        Program10 p = new Program10();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        Map<Integer, Integer> freq = new HashMap<>();
        freq = p.frequency(nums);
        freq.forEach((k, v) -> System.out.println("Element: " + k + " Frequency: " + v));
    }
}
