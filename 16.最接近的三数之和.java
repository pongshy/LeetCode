import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=16 lang=java
 *
 * [16] 最接近的三数之和
 */

// @lc code=start
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int ans = 0;
        int min = 100000;
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < n - 2; ++i) {
            int p = i + 1, q = n - 1;

            while (p < q) {
                int sum = nums[p] + nums[q] + nums[i];
                if (Math.abs(sum - target) < min) {
                    min = Math.abs(sum - target);
                    ans = sum;
                }

                if (sum < target) {
                    p++;
                } else if (sum > target) {
                    q--;
                } else {
                    return sum;
                }
            }
        }
        
        return ans;
    }
}
// @lc code=end

