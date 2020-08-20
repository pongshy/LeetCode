/*
 * @lc app=leetcode.cn id=64 lang=java
 *
 * [64] 最小路径和
 */

// @lc code=start
class Solution {
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int[] pre = new int[n];
        int[] now = new int[n];
        pre[0] = grid[0][0];
        for (int i = 1; i < n; ++i) {
            grid[0][i] += grid[0][i - 1];
            // System.out.println(grid[0][i]);
            pre[i] = grid[0][i];
        }
        for (int i = 1; i < m; ++i) {
            grid[i][0] += grid[i - 1][0];
            // System.out.println(grid[i][0]);
            // pre[i] = grid[i][0];
        }
        if (m == 1) {
            return grid[0][n - 1];
        }

        for (int i = 1; i < m; ++i) {
            now[0] = grid[i][0];
            for (int j = 1; j < n; ++j) {
                now[j] = grid[i][j] + Math.min(now[j - 1], pre[j]);
                // System.out.println(pre[j]);
            }
            pre = now.clone();
        }

        return now[n - 1];
    }
}
// @lc code=end

