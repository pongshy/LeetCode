/*
 * @lc app=leetcode.cn id=1518 lang=java
 *
 * [1518] 换酒问题
 */

// @lc code=start
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        //自己思考写的，Accepted
        // int ans = 0;
        // int n = numBottles;
        // int m = 0;
        // while (n > 0) {
        //     ans += n;
        //     n = (n + m) / numExchange;
        //     m = numBottles - n * numExchange;
        //     numBottles = n + m;     //酒瓶总数 = 空瓶 + 换来的酒
        // }
        // return ans;

        int ans = numBottles, bottle = numBottles;
        while (bottle >= numExchange) {
            bottle -= numExchange;      //每次拿numExchange个空瓶换酒
            ans++;                      //换来的酒喝完
            bottle++;                   //空瓶+1
        }
        return ans;
    }
}
// @lc code=end

