import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.basic.BasicBorders.MarginBorder;

/*
 * @lc app=leetcode.cn id=54 lang=java
 *
 * [54] 螺旋矩阵
 */

// @lc code=start
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<Integer>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return ans;
        }
        int row = matrix.length;
        int line = matrix[0].length;
        int left = 0, right = line - 1;
        int top = 0, bottom = row - 1;

        /*矩阵：
        1 1 1 1 1 1
        1 2 2 2 2 1
        1 2 3 3 2 1
        1 2 2 2 2 1
        1 1 1 1 1 1
        */
        while (left <= right && top <= bottom) {
            //最上面一排，从左到右
            for (int i = left; i <= right; ++i) {
                ans.add(matrix[top][i]);
            }
            for (int i = top + 1; i <= bottom; ++i) {
                ans.add(matrix[i][right]);
            }
            if (left < right && top < bottom) {
                for (int i = right - 1; i > left; --i) {
                    ans.add(matrix[bottom][i]);
                }
                for (int i = bottom; i > top; --i) {
                    ans.add(matrix[i][left]);
                }
            }
            ++left;
            --right;
            ++top;
            --bottom;
        }
        
        return ans;
    }
}
// @lc code=end

