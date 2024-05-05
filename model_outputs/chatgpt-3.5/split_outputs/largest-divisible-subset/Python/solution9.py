class Solution(object):
    def largestDivisibleSubset(self, nums):
        """
        Given a set of distinct positive integers nums, return the largest subset answer such that every pair (answer[i], answer[j]) of elements in this subset satisfies:
        
        answer[i] % answer[j] == 0, or
        answer[j] % answer[i] == 0
        
        If there are multiple solutions, return any of them.
        """
        if not nums:
            return []

        nums.sort()
        n = len(nums)
        dp = [0] * n
        prev = [-1] * n
        max_len = 1
        max_idx = 0

        for i in range(1, n):
            for j in range(i):
                if nums[i] % nums[j] == 0 and dp[i] < dp[j] + 1:
                    dp[i] = dp[j] + 1
                    prev[i] = j
                    if dp[i] > max_len:
                        max_len = dp[i]
                        max_idx = i

        result = []
        while max_idx != -1:
            result.append(nums[max_idx])
            max_idx = prev[max_idx]

        return result[::-1]
