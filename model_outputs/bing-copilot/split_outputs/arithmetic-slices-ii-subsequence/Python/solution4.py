class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        total = 0
        count = 0
        for i in range(2, len(nums)):
            if nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]:
                count += 1
                total += count
            else:
                count = 0
        return total
