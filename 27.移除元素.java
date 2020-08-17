/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int p = 0;
        for (int q = 0; q < n; ++q) {
            if (nums[q] != val) {
                nums[p++] = nums[q];
            }
        }
        return p;
        // int n = nums.length;
        // int p = 0;
        
        // if (n == 0) {
        //     return 0;
        // }
        // if (n == 1) {
        //     if (nums[0] == val) {
        //         return 0;
        //     } else {
        //         return 1;
        //     }
        // }
        // for (int q = 1; q < n; ++q) {
        //     if (nums[p] == val) {
        //         while (q < n - 1 && nums[q] == val) {
        //             ++q;
        //         }
        //         if (nums[q] != val) {
        //             int tmp = nums[p];
        //             nums[p] = nums[q];
        //             nums[q] = tmp;
        //             p++;
        //         }
        //     } else {
        //         p++;
        //     }
        // }
        // if (nums[p] != val) {
        //     return p + 1;
        // } else {
        //     return p;
        // }
    }
}
// @lc code=end

