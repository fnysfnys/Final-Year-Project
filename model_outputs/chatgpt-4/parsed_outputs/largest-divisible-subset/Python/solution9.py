class Solution(object):
    def largestDivisibleSubset(self, nums):
        if not nums:
            return []
        nums.sort()
        dp = [1] * len(nums)
        max_len, last_index = 1, 0
        for i in range(1, len(nums)):
            for j in range(i):
                if nums[i] % nums[j] == 0:
                    if dp[j] + 1 > dp[i]:
                        dp[i] = dp[j] + 1
                        if dp[i] > max_len:
                            max_len = dp[i]
                            last_index = i

        result = []
        current_len = max_len
        for i in range(last_index, -1, -1):
            if dp[i] == current_len:
                result.append(nums[i])
                current_len -= 1
        return result[::-1]