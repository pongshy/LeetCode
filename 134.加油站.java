/*
 * @lc app=leetcode.cn id=134 lang=java
 *
 * [134] 加油站
 */

// @lc code=start
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int start = 0;
        int curr_tank = 0;
        int total_tank = 0;

        for (int i = 0; i < n; ++i) {
            total_tank += gas[i] - cost[i];
            curr_tank += gas[i] - cost[i];

            if (curr_tank < 0) {
                start = i + 1;
                curr_tank = 0;
            }
        }
        return total_tank >= 0 ? start : -1;
    }
}
// @lc code=end

