/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] x 的平方根
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        // double y = Math.sqrt((double)x);
        // return (int)y;
        
        //dichotomy
        if (x == 0) {
            return 0;
        }

        long left = 1;
        long right = x / 2;
        while (left < right) {
            long mid = (left + right + 1) >> 1;
            long re = mid * mid;
            
            if (re > x) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        return (int)left;
    }
}
// @lc code=end

