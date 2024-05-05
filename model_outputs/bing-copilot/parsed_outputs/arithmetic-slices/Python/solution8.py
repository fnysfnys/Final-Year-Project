class Solution:
    def numberOfArithmeticSlices(self, nums):
        n = len(nums)
        prefix_sum = [0] * (n + 1)
        total_slices = 0
        for i in range(1, n):
            if nums[i] - nums[i-1] == nums[i-1] - nums[i-2]:
                prefix_sum[i+1] = prefix_sum[i] + 1
                total_slices += prefix_sum[i+1]
        return total_slices
