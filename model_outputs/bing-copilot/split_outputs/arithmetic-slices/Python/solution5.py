class Solution:
    def numberOfArithmeticSlices(self, nums):
        n = len(nums)
        count = 0
        total_slices = 0
        for i in range(1, n-1):
            if nums[i] - nums[i-1] == nums[i+1] - nums[i]:
                count += 1
                total_slices += count
            else:
                count = 0
        return total_slices
