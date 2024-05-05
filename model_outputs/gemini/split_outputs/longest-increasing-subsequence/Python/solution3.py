def lengthOfLIS(nums):
    n = len(nums)
    dp = [float('inf')] * n  # Initialize with infinity

    def bisect_left(nums, target):
        low, high = 0, n
        while low < high:
            mid = (low + high) // 2
            if nums[mid] < target:
                low = mid + 1
            else:
                high = mid
        return low

    for num in nums:
        i = bisect_left(dp, num)
        dp[i] = num

    return max(i for i, _ in enumerate(dp) if _ != float('inf'))

# Time complexity: O(n log n), Space complexity: O(n)
