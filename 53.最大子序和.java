/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int max_ans = nums[0];
        int pre = 0;

        for (int x : nums) {
            pre = Math.max(pre + x, x);     //f(i - 1) + x = f(i)
            max_ans = Math.max(max_ans, pre);
        }
        return max_ans;
    }
}
// @lc code=end

