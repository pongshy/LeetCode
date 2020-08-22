/*
 * @lc app=leetcode.cn id=75 lang=java
 *
 * [75] 颜色分类
 */

// @lc code=start
class Solution {
    // 交换函数
    private void swap(int[] nums, int x, int y) {
        int tmp = nums[x];
        nums[x] = nums[y];
        nums[y] = tmp;
    }

    public void sortColors(int[] nums) {
        // 计数排序
        // Result: Accepted
        // Your runtime beats 100 % of java submissions
        // Your memory usage beats 15.03 % of java submissions (38.4 MB)
        // int n = nums.length;
        // int[] res = new int[3];

        // for (int i = 0; i < n; ++i) {
        //     if (nums[i] == 0) {
        //         res[0] += 1;
        //     } else if (nums[i] == 1) {
        //         res[1] += 1;
        //     } else {
        //         res[2] += 1;
        //     }
        // }
        // int p0 = res[0];
        // for (int i = 0; i < p0; ++i) {
        //     nums[i] = 0;
        // }
        // int p1 = res[1];
        // for (int i = p0; i < p1 + p0; ++i) {
        //     nums[i] = 1;
        // }
        // int p2 = res[2];
        // for (int i = p0 + p1; i < p0 + p1 + p2; ++i) {
        //     nums[i] = 2;
        // }

        // 快慢指针,通法，即使输入不止是0，1，2，也可以使用下列代码
        // Result: Accepted
        // Your runtime beats 10.7 % of java submissions
        // Your memory usage beats 93.13 % of java submissions (38 MB)
        // int n = nums.length;
        // int low = 0, quick = 1;

        // if (n == 0 || n == 1) {
        //     return;
        // }
        // for (low = 0; low < n - 1; ++low) {
        //     quick = low + 1;
        //     if (nums[low] < nums[quick]) {
        //         while (quick < n) {
        //             if (nums[low] >nums[quick]) {
        //                 break;
        //             }
        //             ++quick;
        //         }
        //         if (quick < n) {
        //             swap(nums, low, quick);
        //         }
        //     } else {
        //         int tmp = nums[quick];
        //         int p = -1;
        //         while (quick < n) {
        //             if (nums[quick] < tmp) {
        //                 //记录，重新设置最小值
        //                 p = quick;
        //                 tmp = nums[p];
        //             }
        //             quick++;
        //         }
        //         if (p == -1) {
        //             swap(nums, low, low + 1);
        //         } else {
        //             swap(nums, low, p);
        //         }
        //     }
        // }

        // 针对该题，可以使用左右指针，更加快捷
        // Result: Accepted
        // Your runtime beats 100 % of java submissions
        // Your memory usage beats 53.34 % of java submissions (38.2 MB)
        int n = nums.length;
        // left追踪的是0的最右边界，right追踪的是1的最左边界
        // curr考虑当前元素
        int curr = 0, left = 0;
        int right = n - 1;

        if (n == 0 || n == 1) {
            return;
        }
        int tmp = 0;
        while (curr <= right) {
            if (nums[curr] == 0) {
                tmp = nums[left];
                nums[left++] = nums[curr];
                nums[curr++] = tmp;
            } else if (nums[curr] == 2) {
                tmp = nums[curr];
                nums[curr] = nums[right];
                nums[right--] = tmp;
            } else {
                curr++;
            }
        }

    }
}
// @lc code=end

