package array_programs;

import java.util.*;

public class Program14 {
    public int[] diagAnalysis(int[][] nums, int size) {
        int diag = 0;
        int sdiag = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) diag += nums[i][j];
                if (i + j == size - 1) sdiag += nums[i][j];
            }
        }
        return new int[]{diag, sdiag, Math.abs(diag - sdiag)};
    }

    public static void main(String[] args) {
        Program14 p = new Program14();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[] result =  p.diagAnalysis(matrix, N);
        System.out.println("Main Diagonal Sum: " + result[0]);
        System.out.println("Secondary Diagonal Sum: " + result[1]);
        System.out.println("Difference: " + result[2]);
    }
}
