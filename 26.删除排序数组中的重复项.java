/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除排序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int p = 0;

        if (nums.length == 0) {
            return 0;
        }
        for (int q = 1; q < n; ++q) {
            if (nums[p] != nums[q]) {
                p++;
                nums[p] = nums[q];
            }
        }
        //because of p start from 0, so return p + 1
        return p + 1;
    }
}
// @lc code=end

