class Solution(object):
    def numberOfArithmeticSlices(self, nums):
        """
        Given an integer array nums, return the number of all the arithmetic subsequences of nums.
        A sequence of numbers is called arithmetic if it consists of at least three elements and if the difference between any two consecutive elements is the same.
        ...
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)
        dp = [[0] * n for _ in range(n)]
        count = 0
        
        for i in range(2, n):
            for j in range(1, i):
                diff = nums[i] - nums[j]
                if nums[j] - diff >= 0:
                    dp[i][diff] += dp[j][diff] + 1
                    count += dp[j][diff]
        
        return count