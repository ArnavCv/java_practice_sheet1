package array_programs;

import java.util.Scanner;

public class Program18 {
    public void matrixMultiply(int[][] nums1, int[][] nums2, int r1, int c1, int r2, int c2) {
        int[][] matrix = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for  (int k = 0; k < c1; k++) {
                    matrix[i][j] += nums1[i][k] * nums2[k][j];
                }
            }
        }
        for  (int i = 0; i < r1; i++) {
            for  (int j = 0; j < c2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Program18 p = new Program18();
        Scanner sc = new Scanner(System.in);
        int R1 = sc.nextInt();
        int C1 = sc.nextInt();
        int[][] A = new int[R1][C1];
        for (int i = 0; i < R1; i++) {
            for (int j = 0; j < C1; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        int R2 = sc.nextInt();
        int C2 = sc.nextInt();
        int[][] B = new int[R2][C2];
        for (int i = 0; i < R2; i++) {
            for (int j = 0; j < C2; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        if (R2 != C1) {
            System.out.println("Matrix multiplication not possible");
            return;
        }
        p.matrixMultiply(A, B, R1, C1, R2, C2);
    }
}
