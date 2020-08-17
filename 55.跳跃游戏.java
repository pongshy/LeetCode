/*
 * @lc app=leetcode.cn id=55 lang=java
 *
 * [55] 跳跃游戏
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int max_len = nums[0];

        for (int i = 0; i < n; ++i) {
            if (i <= max_len) {
                max_len = Math.max(max_len, i + nums[i]);
                if (max_len >= n - 1) {
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }
}
// @lc code=end

