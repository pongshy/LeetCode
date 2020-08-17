/*
 * @lc app=leetcode.cn id=45 lang=java
 *
 * [45] 跳跃游戏 II
 */

// @lc code=start
class Solution {
    public int jump(int[] nums) {
        //贪心策略一：时间复杂度为O(n^2)，空间复杂度为：O(1)
        // int n = nums.length;
        // int step = 0;
        // int position = n - 1;

        // while (position > 0) {
        //     for (int i = 0; i < position; ++i) {
        //         if (position <= i + nums[i]) {
        //             position = i;
        //             step++;
        //             break;
        //         }
        //     }
        // }
        // return step;

        //贪心策略二：
        int n = nums.length;
        int max_pos = 0;
        int step = 0;
        int end = 0;
        for (int i = 0; i < n - 1; ++i) {
            max_pos = Math.max(max_pos, nums[i]);
            if (i == end) {
                end = max_pos;
                step++;
            }
        }
        return step;
    }
}
// @lc code=end

