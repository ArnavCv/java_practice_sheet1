package array_programs;

import java.util.*;

public class Program19 {
    public List<Integer> spiralMatrix(int[][] nums, int row, int col) {
        List<Integer> ans = new ArrayList<>();
        int top = 0;
        int bottom = row - 1;
        int left = 0;
        int right = col - 1;
        if (nums.length == 0) return ans;
        while (top <= bottom && left <= right) {
            // First row
            for (int i = left; i <= right; i++) ans.add(nums[top][i]);
            top++;
            // Last Column
            for (int i = top; i <= bottom; i++) ans.add(nums[i][right]);
            right--;
            // Last row
            if  (top <= bottom) {
                for (int i = right; i >= left; i--) ans.add(nums[bottom][i]);
                bottom--;
            }
            // First Column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) ans.add(nums[i][left]);
                left++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Program19 p = new Program19();
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] matrix = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        List<Integer> ans = p.spiralMatrix(matrix, R, C);
        System.out.println(ans);
    }
}
