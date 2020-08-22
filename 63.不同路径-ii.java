import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=63 lang=java
 *
 * [63] 不同路径 II
 */

// @lc code=start
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // 自制：Accepted
        // Your runtime beats 100 % of java submissions
        // Your memory usage beats 15.01 % of java submissions (39.3 MB)
        // if (obstacleGrid == null || obstacleGrid.length == 0 || obstacleGrid[0].length == 0) {
        //     return 0;
        // }
        // int m = obstacleGrid.length;
        // int n = obstacleGrid[0].length;
        // int[][] res = new int[m][n];
        // for (int i = 0; i < n; ++i) {
        //     if (obstacleGrid[0][i] == 1) {
        //         break;
        //     } else {
        //         res[0][i] = 1;
        //     }
        // }
        // for (int i = 0; i < m; ++i) {
        //     if (obstacleGrid[i][0] == 1) {
        //         break;
        //     } else {
        //         res[i][0] = 1;
        //     }
        // }
        // for (int i = 1; i < m; ++i) {
        //     for (int j = 1; j < n; ++j) {
        //         if (obstacleGrid[i][j] == 1) {
        //             res[i][j] = 0;
        //         } else {
        //             res[i][j] = res[i - 1][j] + res[i][j - 1];
        //         }
        //     }
        // }
        // return res[m - 1][n - 1];
        
        // 滚动数组的思想
        // Accepted
        // Your runtime beats 100 % of java submissions
        // Your memory usage beats 82.58 % of java submissions (37.8 MB)
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int[] res = new int[m];

        res[0] = obstacleGrid[0][0] == 0 ? 1 : 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (obstacleGrid[i][j] == 1) {
                    res[j] = 0;
                    continue;
                }
                if (j - 1 >= 0 && obstacleGrid[i][j - 1] == 0) {
                    res[j] += res[j - 1];
                }
            }
        }
        return res[m - 1];
    }
}
// @lc code=end

