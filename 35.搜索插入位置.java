/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; ++i) {
            if (target == nums[i]) {
                return i;
            }
        }
        if (target < nums[0]) {
            return 0;
        }
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] < target && target < nums[i + 1]) {
                return i + 1;
            }
        }
        return nums.length;
    }
}
// @lc code=end

