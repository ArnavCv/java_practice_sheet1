package array_programs;

import java.util.*;

public class Program14 {
    public void diagAnalysis(int[][] nums, int row, int col) {
        int[] rowSum = new int[row];
        int[] colSum = new int[col];
        int highest = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < row; i++) {
            int current = 0;
            for (int j = 0; j < col; j++) {
                colSum[j] += nums[i][j];
                current += nums[i][j];
            }
            rowSum[i] = current;
        }
        for (int i = 0; i < row; i++) {
            System.out.println("Row " + (i + 1) + " Sum: " + rowSum[i]);
            if  (rowSum[i] > highest) {
                highest = rowSum[i];
                index = i + 1;
            }
        }
        for (int j = 0; j < col; j++) {
            System.out.println("Column "+ (j + 1) + " Sum: " + colSum[j]);
        }
        System.out.println("Highest Sales Branch: " + index);
        System.out.println("Highest Sales: " + highest);
    }

    public static void main(String[] args) {
        Program14 p = new Program14();
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] matrix = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        p.diagAnalysis(matrix, R, C);
    }
}
