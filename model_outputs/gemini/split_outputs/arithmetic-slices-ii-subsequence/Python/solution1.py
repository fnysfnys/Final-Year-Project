def numberOfArithmeticSlices(self, nums):
    n = len(nums)
    dp = [[0] * n for _ in range(n)]
    for i in range(2, n):
        for j in range(i):
            if nums[i] - nums[j] == nums[j + 1] - nums[j]:
                dp[i][j] = dp[j + 1][j] + 1
    return sum(sum(row) for row in dp)
