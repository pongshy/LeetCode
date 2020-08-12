/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */
// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        // int to String
        // String str = (new StringBuilder(x + "")).reverse().toString();
        // return (x + "").equals(str);
        
        // math method
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reverse = 0;
        while (x > reverse) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        return (reverse == x) || (x == reverse / 10);
    }
}
// @lc code=end

