/*
 * @lc app=leetcode.cn id=80 lang=java
 *
 * [80] 删除排序数组中的重复项 II
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        // Result: Accepted
        // two-pointers
        // Your runtime beats 97.82 % of java submissions
        // Your memory usage beats 12 % of java submissions (40.2 MB)
        int p1 = 1;
        int count = 1;
        int n = nums.length;

        if (n == 0) {
            return 0;
        }
        for (int p2 = 1; p2 < n; ++p2) {
            if (nums[p2] == nums[p2 - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count <= 2) {
                nums[p1++] = nums[p2]; 
            }
        }
        return p1;
    }
}
// @lc code=end

