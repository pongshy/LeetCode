import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=268 lang=java
 *
 * [268] 缺失数字
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
        // Result: Accepted
        // Your runtime beats 27.73 % of java submissions
        // Your memory usage beats 80.59 % of java submissions (40.2 MB)
        int n = nums.length;

        if (n == 0) {
            return 0;
        }

        Arrays.sort(nums);
        for (int i = 0; i < n; ++i) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums[n - 1] + 1;
    }
}
// @lc code=end

