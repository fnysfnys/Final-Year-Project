class Solution(object):
    def largestDivisibleSubset(self, nums):
        nums.sort()
        dp = [(0, -1)] * len(nums)  # (count, index of previous element)
        max_index = 0
        for i in range(len(nums)):
            for j in range(i):
                if nums[i] % nums[j] == 0 and dp[j][0] + 1 > dp[i][0]:
                    dp[i] = (dp[j][0] + 1, j)
            if dp[i][0] > dp[max_index][0]:
                max_index = i

        result = []
        while max_index != -1:
            result.append(nums[max_index])
            max_index = dp[max_index][1]
        return result[::-1]
