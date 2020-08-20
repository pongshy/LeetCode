import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        List<Integer> res = new ArrayList<>();
        int ans = 1;
        for (int i = n - 1; i >= 0; --i) {
            res.add(0, (digits[i] + ans) % 10);
            //进位
            ans = (digits[i] + ans) / 10;
        }
        if (ans != 0) {
            res.add(0, ans);
        }
        // 流处理方式
        // return res.stream().mapToInt(Integer::valueOf).toArray();
        // 循环遍历赋值的方式，实现List<Integer> -> int[]
        // 效率比java8 stream流方式处理"高"
        int[] tmp = new int[res.size()];
        int i = 0;
        for (Integer num : res) {
            tmp[i++] = num;
        }
        return tmp;
    }
}
// @lc code=end

