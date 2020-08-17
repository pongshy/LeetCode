/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        Integer[] ans = new Integer[n + 1];
        ans[0] = 1;
        ans[1] = 1;

        for (int i = 2; i <= n; ++i) {
            ans[i] = ans[i - 1] + ans[i - 2];
        }
        return ans[n];
    }
}
// @lc code=end

