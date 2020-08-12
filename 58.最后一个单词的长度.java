/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        s = s.trim();
        int lastIndex = s.lastIndexOf(" ");
        if (lastIndex != -1) {
            if (lastIndex == s.length() - 1) {
                String str = s.substring(0, lastIndex);
                return str.length();
            } else {
                String str = s.substring(lastIndex + 1);
                return str.length();
            }
        } else {
            return s.length();
        }
    }
}
// @lc code=end

