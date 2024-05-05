class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        count, window = 0, 0
        for i in range(2, len(nums)):
            if nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]:
                window += 1
                count += window
            else:
                window = 0
        return count