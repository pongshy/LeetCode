/*
 * @lc app=leetcode.cn id=59 lang=java
 *
 * [59] 螺旋矩阵 II
 */

// @lc code=start
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int num = 1;
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; ++i) {
                res[top][i] = num;
                ++num;
            }
            top++;
            if (top > bottom) {
                break;
            }

            for (int i = top; i <= bottom; ++i) {
                res[i][right] = num;
                num++;
            }
            right--;
            if (left > right) {
                break;
            }
            
            for (int i = right; i >= left; --i) {
                res[bottom][i] = num;
                num++;
            }
            bottom--;
            if (top > bottom) {
                break;
            }
            
            for (int i = bottom; i >= top; --i) {
                res[i][left] = num;
                num++;
            }
            left++;
        }
        return res;
    }
}
// @lc code=end

