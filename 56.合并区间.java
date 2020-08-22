import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=56 lang=java
 *
 * [56] 合并区间
 */

// @lc code=start
class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();
        if (intervals == null || intervals.length == 0 || intervals[0].length == 0) {
            return ans.toArray(new int[0][]);
        }
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int i = 0;
        int n = intervals.length;
        while (i < n) {
            int left = intervals[i][0];
            int right = intervals[i][1];
            while (i < n - 1 && intervals[i + 1][0] <= right) {
                right = Math.max(right, intervals[i + 1][1]);
                ++i;
            }
            ans.add(new int[]{left, right});
            ++i;
        }
        // return ans.toArray(new int[ans.size()][2]);
        //或者可以这么写，在性能上有所提升
        //推荐这样写
        return ans.toArray(new int[0][]);
    }
}
// @lc code=end

