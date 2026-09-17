class Solution {
    public int sumOfUnique(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int n = nums.length;
        if (n == 1)
        {
            return nums[0];
        }
        if (nums[0] == nums[1])
            sum = 0;
        else 
            sum = nums[0];
        for (int i = 1; i < n - 1; i++)
        {
            if (nums[i] != nums[i - 1] &&  nums[i] != nums[i + 1])
                sum += nums[i];
        }
        if (nums[n - 1] != nums[n - 2])
            return sum + nums[n - 1];
        return sum;
    }
}