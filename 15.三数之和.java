import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javafx.scene.Scene;

/*
 * @lc app=leetcode.cn id=15 lang=java
 *
 * [15] 三数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        
        for (int i = 0; i < n; ++i) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int third = n - 1;
            int target = -nums[i];
            for (int second = i + 1; second < n; ++second) {
                if (second > i + 1 && nums[second] == nums[second - 1]) {
                    continue;
                }
                while (second < third && nums[second] + nums[third] > target) {
                    third--;
                }

                if (second == third) {
                    break;
                }
                if (nums[second] + nums[third] == target) {
                    ans.add(new ArrayList<>(Arrays.asList(nums[i], nums[second], nums[third])));
                }                
            }
        }

        return ans;
    }
}
// @lc code=end

