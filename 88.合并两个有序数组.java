import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 直接合并后排序
        // Result: Accepted
        // Your runtime beats 23.14 % of java submissions
        // Your memory usage beats 9.95 % of java submissions (40.1 MB)
        // System.arraycopy(nums2, 0, nums1, m, n);
        // Arrays.sort(nums1);

        // two-pointers
        // 从后往前排
        // Your runtime beats 100 % of java submissions
        // Your memory usage beats 15.6 % of java submissions (40.1 MB)
        int p1 = m - 1, p2 = n - 1;
        int p = m + n - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] < nums2[p2]) {
                nums1[p--] = nums2[p2--];
            } else if (nums1[p1] >= nums2[p2]) {
                nums1[p--] = nums1[p1--];
            } 
        }
        // add missing elements from nums2
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }
}
// @lc code=end

