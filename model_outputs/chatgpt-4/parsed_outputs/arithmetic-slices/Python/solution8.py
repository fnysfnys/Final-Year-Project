class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        n = len(nums)
        if n < 3:
            return 0
        count = 0
        start = 0
        for end in range(2, n):
            if nums[end] - nums[end - 1] != nums[end - 1] - nums[end - 2]:
                start = end - 1
            if end - start >= 2:
                count += end - start - 1
        return count