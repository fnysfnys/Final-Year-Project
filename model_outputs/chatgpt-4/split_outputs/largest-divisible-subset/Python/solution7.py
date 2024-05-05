class Solution(object):
    def largestDivisibleSubset(self, nums):
        nums.sort

()
        n = len(nums)
        dp = [1] * n
        parent = [-1] * n
        max_size, max_val = 0, -1
        for i in range(n):
            for j in range(i - 1, -1, -1):
                if nums[i] % nums[j] == 0 and dp[j] + 1 > dp[i]:
                    dp[i] = dp[j] + 1
                    parent[i] = j
            if dp[i] > max_size:
                max_size, max_val = dp[i], nums[i]

        result = []
        for i in range(n - 1, -1, -1):
            if nums[i] == max_val:
                while i >= 0:
                    result.append(nums[i])
                    i = parent[i]
                break
        return result[::-1]
