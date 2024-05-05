class Solution(object):
    def canPartition(self, nums):
        totalSum = sum(nums)
        if totalSum % 2 != 0:
            return False
        target = totalSum // 2
        n = len(nums)
        dp = 1 << n
        for num in nums:
            dp |= dp << num
        return dp & (1 << target) != 0
