import java.util.ArrayList;
import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=34 lang=java
 *
 * [34] 在排序数组中查找元素的第一个和最后一个位置
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1;
        int[] ans = new int[]{-1, -1};

        while (left <= right) {
            // int mid = (left + right + 1) /2;
            int mid = left + (right - left + 1) / 2;
            if (nums[mid] == target) {
                int tmp_l = mid;
                int tmp_r = mid;

                while (tmp_l >= 1 && nums[tmp_l - 1] == nums[tmp_l]) {
                    tmp_l--;
                }
                while (tmp_r <= n - 2 && nums[tmp_r] == nums[tmp_r + 1]) {
                    tmp_r++;
                }
                ans[0] = tmp_l;
                ans[1] = tmp_r;
                return ans;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
// @lc code=end

