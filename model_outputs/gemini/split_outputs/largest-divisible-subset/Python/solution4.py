def largestDivisibleSubset(self, nums):
    nums.sort()
    dp = {n: 1 for n in nums}
    for i in range(len(nums)):
        for j in range(i):
            if nums[i] % nums[j] == 0 and dp[nums[i]] < dp[nums[j]] + 1:
                dp[nums[i]] = dp[nums[j]] + 1
    subset = []
    n = max(dp, key=dp.get)
    while n in dp:
        subset.append(n)
        n //= dp[n]
    return subset[::-1]

