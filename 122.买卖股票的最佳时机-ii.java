/*
 * @lc app=leetcode.cn id=122 lang=java
 *
 * [122] 买卖股票的最佳时机 II
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        //自制：Accepted
        // int n = prices.length;
        // int buy = prices[0];
        // int ans = 0;

        // for (int i = 1; i < n; ++i) {
        //     if (prices[i - 1] < prices[i] && i != n - 1) {
        //         buy = Math.min(prices[i - 1], buy);
        //     } else if (prices[i - 1] >= prices[i]) {
        //         ans += prices[i - 1] - buy;
        //         buy = prices[i];
        //     } else if (prices[i - 1] < prices[i] && i == n - 1) {
        //         ans += prices[i] - buy;
        //     } 
        // }
        // return ans;

        //峰谷法: Accepted
        //时间复杂度为: O(n), 空间复杂度为: O(1)
        // int n = prices.length;
        // int valley = prices[0], peak = prices[0];
        // int ans = 0;
        // int i = 0;

        // while (i < n - 1) {
        //     while (i < n - 1 && prices[i] >= prices[i + 1]) {
        //         ++i;
        //     }
        //     valley = prices[i];
            
        //     while (i < n - 1 && prices[i] <= prices[i + 1]) {
        //         ++i;
        //     }
        //     peak = prices[i];

        //     ans += peak - valley;
        // }
        // return ans;

        //在峰谷法的基础上，进行改进：Accepted
        //无需寻峰值与峰谷，并存储进行计算，直接对连续数字的差值进行累计
        //时间复杂度为：O(n)，空间复杂度为：O(1)
        int n = prices.length;
        int ans = 0;

        for (int i = 0; i < n - 1; ++i) {
            if (prices[i] <= prices[i + 1]) {
                ans += prices[i + 1] - prices[i];
            }
        }
        return ans;
    }
}
// @lc code=end

