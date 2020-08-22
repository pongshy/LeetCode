/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n == 0) {
            return 0;
        }

        int res = 0;
        int tmp = prices[0];
        for (int i = 1; i < n; ++i) {
            if (prices[i] < tmp) {
                tmp = prices[i];
            } else {
                res = Math.max(res, prices[i] - tmp);
            }
        }
        return res;
    }
}
// @lc code=end

