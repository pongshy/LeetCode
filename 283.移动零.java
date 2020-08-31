/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        // Result: Accepted
        // Your runtime beats 100 % of java submissions
        // Your memory usage beats 88.86 % of java submissions (39.9 MB)
        int p1 = 0, p2 = 0;
        int n = nums.length;

        for (p2 = 0; p2 < n; ++p2) {
            if (nums[p1] == 0) {
                if (nums[p2] != 0) {
                    int tmp = nums[p1];
                    nums[p1] = nums[p2];
                    nums[p2] = tmp;
                    p1++;
                }
            } else {
                ++p1;
            }
        }
    }
}
// @lc code=end

