import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/*
 * @lc app=leetcode.cn id=18 lang=java
 *
 * [18] 四数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        if (n < 4) {
            return res;
        }
        for (int i = 0; i <= n - 4; ++i) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j <= n - 3; ++j) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int left = j + 1, right = n - 1;

                while (left < right) {
                    // System.out.println("left:" + left + " right: " + right);
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum > target) {
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        res.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[left], nums[right])));
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        left++;
                        right--;
                    }
                    // System.out.println("change: ");
                    // System.out.println("left:" + left + " right: " + right + '\n');
                }
            }
        }
        return res;
        // return res.stream().distinct().collect(Collectors.toList());
    }
}
// @lc code=end

