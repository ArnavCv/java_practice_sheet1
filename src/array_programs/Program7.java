package array_programs;

import java.util.Scanner;

public class Program7 {
    public int[][] matrixAdd(int[][] nums1, int[][] nums2, int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
           for (int j = 0; j < cols; j++) {
               matrix[i][j] = nums1[i][j] + nums2[i][j];
           }
        }
        return matrix;
    }

    public static void main(String[] args) {
        Program7 p = new Program7();
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] A = new int[R][C];
        int[][] B = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        int[][] ans = p.matrixAdd(A, B, R, C);
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
