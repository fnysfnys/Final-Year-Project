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
        dp = [{} for _ in range(n)]
        count = 0
        
        for i in range(n):
            for j in range(i):
                diff = nums[i] - nums[j]
                if diff in dp[j]:
                    count += dp[j][diff]
                    if diff in dp[i]:
                        dp[i][diff] += dp[j][diff] + 1
                    else:
                        dp[i][diff] = dp[j][diff] + 1
                elif diff in dp[i]:
                    dp[i][diff] += 1
                else:
                    dp[i][diff] = 1
        
        return count