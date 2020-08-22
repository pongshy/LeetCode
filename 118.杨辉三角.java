import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=118 lang=java
 *
 * [118] 杨辉三角
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        if (numRows == 0) {
            return res;
        }
        res.add(new ArrayList<>());
        res.get(0).add(1);

        for (int i = 1; i < numRows; ++i) {
            List<Integer> row = new ArrayList<>();
            List<Integer> preRow = res.get(i - 1);

            row.add(1);

            for (int j = 1; j < i; ++j) {
                row.add(preRow.get(j) + preRow.get(j - 1));
            }
            row.add(1);

            res.add(row);
        }
        return res;
    }
}
// @lc code=end

