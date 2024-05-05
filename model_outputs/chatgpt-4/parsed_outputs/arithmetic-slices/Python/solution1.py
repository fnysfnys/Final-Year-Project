class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        n = len(nums)
        if n < 3:
            return 0
        count, length = 0, 2
        for i in range(2, n):
            if nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]:
                length += 1
                count += length - 2
            else:
                length = 2
        return count