import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=73 lang=java
 *
 * [73] 矩阵置零
 */

// @lc code=start
class Solution {
    public void setZeroes(int[][] matrix) {
        // 直接暴力破解
        // Accepted
        // 空间复杂度 O(mn)
        // 时间复杂度 O(mn)
        // Your runtime beats 43.19 % of java submissions
        // Your memory usage beats 69.32 % of java submissions (41.2 MB)
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] ans = new int[m][n];

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                ans[i][j] = matrix[i][j];
            }
        }

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (matrix[i][j] == 0 && ans[i][j] == 0) {
                    for (int x = 0; x < m; ++x) {
                        matrix[x][j] = 0;
                    }
                    for (int y = 0; y < n; ++y) {
                        matrix[i][y] = 0;
                    }
                }
            }
        }
    }
}
// @lc code=end

