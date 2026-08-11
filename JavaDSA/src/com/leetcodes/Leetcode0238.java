package com.leetcodes;

import java.util.Arrays;

public class Leetcode0238 {

    public static void main(String[] args) {

        int nums[] = {1, 2, 3, 4};

        Solution obj = new Solution();

        int ans[] = obj.productExceptSelf(nums);

        System.out.println(Arrays.toString(ans));
    }

    static class Solution {

        public int[] productExceptSelf(int[] nums) {

            int n = nums.length;

            int ans[] = new int[n];

            Arrays.fill(ans, 1);

            // Left product
            for (int i = 1; i < n; i++) {
                ans[i] = ans[i - 1] * nums[i - 1];
            }

            // Right product
            int curr = 1;

            for (int i = n - 1; i >= 0; i--) {
                ans[i] = ans[i] * curr;
                curr = curr * nums[i];
            }

            return ans;
        }
    }
}