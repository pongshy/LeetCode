/*
 * @lc app=leetcode.cn id=81 lang=java
 *
 * [81] 搜索旋转排序数组 II
 */

// @lc code=start
class Solution {
    public boolean search(int[] nums, int target) {
        // Result: Accepted
        // Your runtime beats 100 % of java submissions
        // Your memory usage beats 61.82 % of java submissions (39.5 MB)
        int n = nums.length;

        if (n == 0) {
            return false;
        }
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = left + (right - left + 1) / 2;

            if (nums[mid] == target) {
                return true;
            }
            if (nums[mid] == nums[left]) {
                left++;
                continue;
            }
            //前半部分有序
            if (nums[left] < nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                //后半部分有序
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return false;
    }
}
// @lc code=end

