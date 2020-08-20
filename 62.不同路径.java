import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=62 lang=java
 *
 * [62] 不同路径
 */

// @lc code=start
class Solution {
    //递归法
    // Map<Object, Integer> map = new HashMap<>();
    // private int cal(int m, int n) {
    //     if (m < 0 || n < 0) {
    //         return 0;
    //     }
    //     if (m >= 0 && n == 0) {
    //         return 1;
    //     } else if (m == 0 && n >= 0) {
    //         return 1;
    //     }

    //     if (!map.containsKey(Arrays.asList(m, n))) {
    //         int sum = cal(m, n - 1) + cal(m - 1, n);
    //         map.put(Arrays.asList(m, n), sum);
    //         return sum;
    //     } else {
    //         return map.get(Arrays.asList(m, n));
    //     }
        
    // }

    public int uniquePaths(int m, int n) {
        //递归法
        //递归深度大，而且需要优化过，不然普通的递归就会直接爆栈，显示Time Limited
        // return cal(m - 1, n - 1);

        //动态规划
        // f(m, n) = f(m, n - 1) + f(m - 1, n)
        // int[][] res = new int[n][m];
        // for (int i = 0; i < n; ++i) {
        //     res[i][0] = 1;
        // }
        // for (int j = 0; j < m; ++j) {
        //     res[0][j] = 1;
        // }

        // for (int i = 1; i < n; ++i) {
        //     for (int j = 1; j < m; ++j) {
        //         res[i][j] = res[i][j - 1] + res[i - 1][j];
        //     }
        // }
        // return res[n - 1][m - 1];

        //优化1:
        //时间复杂度为：O(2n)
        //只需要保留当前行与上一行的数据即可
        //变相的杨辉三角
        int[] pre = new int[n];
        int[] cur = new int[n];
        Arrays.fill(pre, 1);
        Arrays.fill(cur, 1);

        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                cur[j] = cur[j - 1] + pre[j];
            }
            pre = cur.clone();
        }
        return cur[n - 1];
    }
}
// @lc code=end

