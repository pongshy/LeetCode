import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=120 lang=java
 *
 * [120] 三角形最小路径和
 */

// @lc code=start
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        // Result: Accepted
        // Your runtime beats 95.33 % of java submissions
        // Your memory usage beats 20.49 % of java submissions (40.1 MB)
        int n = triangle.size();

        if (n == 0 || triangle.get(0).size() == 0) {
            return 0;
        }
        int[] res = new int[n];
        res[0] = triangle.get(0).get(0);

        for (int i = 1; i < n; ++i) {
            List<Integer> tmp = triangle.get(i);

            res[i] = res[i - 1] + tmp.get(i);
            // 要从后往前遍历
            // 从前往后遍历的话，会与已经更改的数据相比较
            // 从而出现问题
            // for (int j = 1; j < tmp.size() - 1; ++j) {
            //     res[j] = tmp.get(j) + Math.min(res[j], res[j - 1]);
            // }
            for (int j = i - 1; j > 0; --j) {
                res[j] = tmp.get(j) + Math.min(res[j], res[j - 1]);
            }
            res[0] += tmp.get(0);
        }
        // Arrays.sort(res);
        int re = res[0];

        for (int i = 1; i < n; ++i) {
            re = Math.min(re, res[i]);
        }
        return re;
    }
}
// @lc code=end

