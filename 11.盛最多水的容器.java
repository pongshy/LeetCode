/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int result = 0;

        while (left < right) {
            int tmp = Math.min(height[left], height[right]);
            result = Math.max(result, tmp * (right - left));
            
            if (height[left] < height[right]) {
                left += 1;
            } else {
                right -= 1;
            }
        }
        return result;
    }
}
// @lc code=end

