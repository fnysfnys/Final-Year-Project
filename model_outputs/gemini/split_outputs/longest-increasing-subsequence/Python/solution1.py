def lengthOfLIS(nums):
    n = len(nums)
    dp = [1] * n  # Length of LIS ending at each index
    for i in range(1, n):
        for j in range(i):
            if nums[i] > nums[j]:
                dp[i] = max(dp[i], dp[j] + 1)
    return max(dp)

# Time complexity: O(n^2), Space complexity: O(n)
