class Solution(object):
    def largestDivisibleSubset(self, nums):
        nums.sort()
        dp = {num: [num] for num in nums}
        for num in nums:
            for smaller in dp:
                if num % smaller == 0 and len(dp[smaller]) + 1 > len(dp[num]):
                    dp[num] = dp[smaller] + [num]
        return max(dp.values(), key=len)
