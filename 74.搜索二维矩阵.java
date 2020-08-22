/*
 * @lc app=leetcode.cn id=74 lang=java
 *
 * [74] 搜索二维矩阵
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // 自制二分查找
        // Accepted
        // Your runtime beats 100 % of java submissions
        // Your memory usage beats 64.09 % of java submissions (39.5 MB)
        // if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
        //     return false;
        // }
        // int n = matrix.length;
        // int m = matrix[0].length;
        // int left = 0, right = n - 1;

        // while (left <= right) {
        //     int mid = left + (right - left + 1) / 2;

        //     if (matrix[mid][0] > target) {
        //         right = mid - 1;
        //     } else if (matrix[mid][m - 1] < target) {
        //         left = mid + 1;
        //     } else if (matrix[mid][0] <= target && target <= matrix[mid][m - 1]) {
        //         int l = 0, r = m - 1;

        //         while (l <= r) {
        //             int mid_tmp = l + (r - l + 1) / 2;
   
        //             if (matrix[mid][mid_tmp] == target) {
        //                 return true;
        //             } else if (matrix[mid][mid_tmp] < target) {
        //                 l = mid_tmp + 1;
        //             } else if (matrix[mid][mid_tmp] > target) {
        //                 r = mid_tmp - 1;
        //             }
        //         }
        //         return false;
        //     }
        // }
        // return false;

        // 二分
        // 其实可以把所给拥有这种特性的二维数组，看作是一个有序的一维数组来做
        // 一维数组上的索引值idx (对应) -> 二维数组 matrix[idx / m][idx % m]
        // m表示二维数组的列数
        // 即 row = idx / n, column = idx % n
        // Result: Accepted
        // Your runtime beats 100 % of java submissions
        // Your memory usage beats 97.23 % of java submissions (39.3 MB)
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                return false;
        }
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0;
        int right = m * n - 1;
        int tmp = 0;
        while (left <= right) {
            int mid = left + (right - left + 1) / 2;
            
            tmp = matrix[mid / m][mid % m];
            if (tmp == target) {
                return true;
            } else if (tmp > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
// @lc code=end

