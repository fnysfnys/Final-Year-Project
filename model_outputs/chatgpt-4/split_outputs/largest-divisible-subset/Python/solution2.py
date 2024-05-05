class Solution(object):
    def largestDivisibleSubset(self, nums):
        nums.sort()
        dp = [1] * len(nums)
        prev = [-1] * len(nums)
        max_index = 0
        for i in range(1, len(nums)):
            for j in range(i):
                if nums[i] % nums[j] == 0 and dp[j] + 1 > dp[i]:
                    dp[i] = dp[j] + 1
                    prev[i] = j
            if dp[i] > dp[max_index]:
                max_index = i

        result = []
        while max_index != -1:
            result.append(nums[max_index])
            max_index = prev[max_index]
        return result[::-1]
