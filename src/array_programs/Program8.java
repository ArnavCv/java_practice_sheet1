package array_programs;

import java.util.Scanner;

public class Program8 {
    public int[][] matrixTranspose(int[][] nums, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                int temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        Program8 p = new Program8();
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int maxi = Math.max(R, C);
        int[][] nums = new int[maxi][maxi];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                nums[i][j] = sc.nextInt();
            }
        }
        int[][] ans = p.matrixTranspose(nums, maxi);
        for (int i = 0; i < C; i++) {
            for (int j = 0; j < R; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
