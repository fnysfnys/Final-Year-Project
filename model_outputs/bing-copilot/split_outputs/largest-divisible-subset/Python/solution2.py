class Solution(object):
    def largestDivisibleSubset(self, nums):
        nums.sort()
        n = len(nums)
        dp = [1] * n

        for i in range(n - 2, -1, -1):
            for j in range(i + 1, n):
                if nums[j] % nums[i] == 0:
                    dp[i] = max(dp[i], dp[j] + 1)

        max_size = max(dp)
        max_subset = []
        for i in range(n):
            if dp[i] == max_size:
                max_subset.append(nums[i])

        return max_subset
