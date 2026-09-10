class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0, start = 0, min = nums.length + 1;

        for (int i = 0; i < nums.length; i++)
        {
            sum += nums[i];
            while (sum >= target)
            {
                min = Math.min(min, i - start + 1);
                sum -= nums[start];
                start++;
            }
        }
        if (min == nums.length + 1)
            return 0;
        return min;
    }
}