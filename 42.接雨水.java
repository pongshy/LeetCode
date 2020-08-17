/*
 * @lc app=leetcode.cn id=42 lang=java
 *
 * [42] 接雨水
 */

// @lc code=start
class Solution {
    public int trap(int[] height) {
        //暴力法
        // int ans = 0;
        // int n = height.length;
        
        // for (int i = 1; i < n - 1; ++i) {
        //     int max_left = 0, max_right = 0;

        //     for (int j = i; j >= 0; --j) {
        //         max_left = Math.max(max_left, height[j]);
        //     }
        //     for (int p = i; p < n; ++p) {
        //         max_right = Math.max(max_right, height[p]);
        //     }
        //     ans += Math.min(max_left, max_right) - height[i];
        // }
        // return ans;

        //动态编程——预先存储最大值
        // int ans = 0;
        // int n = height.length;

        // if (n == 0) {
        //     return 0;
        // }

        // int[] max_left = new int[n];
        // max_left[0] = height[0];
        // //i及i左侧最高
        // for (int i = 1; i < n; ++i) {
        //     max_left[i] = Math.max(max_left[i - 1], height[i]);
        // }
        // //j及j右侧最高
        // int[] max_right = new int[n];
        // max_right[n - 1] = height[n - 1];
        // for (int j = n - 2; j >= 0; --j) {
        //     max_right[j] = Math.max(max_right[j + 1], height[j]);
        // }
        // //计算能接雨水量
        // for (int i = 1; i < n - 1; ++i) {
        //     ans += Math.min(max_right[i], max_left[i]) - height[i];
        // }
        // return ans;

        //使用双指针
        int ans = 0;
        int n = height.length;
        int max_left = 0, max_right = 0;
        int left = 0, right = n - 1;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= max_left) {
                    max_left = height[left];
                } else {
                    ans += max_left - height[left];
                }
                left++;
            } else {
                if (height[right] >= max_right) {
                    max_right = height[right];
                } else {
                    ans += max_right - height[right];
                }
                right--;
            }
        }
        return ans;
    }
}
// @lc code=end

