def numberOfArithmeticSlices(self, nums):
    n = len(nums)
    dp = {}
    for i in range(2, n):
        for j in range(i):
            key = (nums[i] - nums[j], j)
            dp[i, j] = dp.get(key, 0) + 1
    return sum(dp.values())
