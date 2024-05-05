class Solution:
    def numberOfArithmeticSlices(self, nums):
        n = len(nums)
        count = 0
        for i in range(2, n):
            if nums[i] - nums[i-1] == nums[i-1] - nums[i-2]:
                count += 1
            else:
                count = 0
            nums[i] = count
        return sum(nums)
