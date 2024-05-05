def largestDivisibleSubset(self, nums):
    nums.sort()
    dp = [1] * len(nums)
    prev = [-1] * len(nums)
    for i in range(1, len(nums)):
        for j in range(i):
            if nums[i] % nums[j] == 0 and dp[i] < dp[j] + 1:
                dp[i] = dp[j] + 1
                prev[i] = j
    subset = []
    i = nums.index(max(dp))
    while i != -1:
        subset.append(nums[i])
        i = prev[i]
    return subset[::-1]

