def lengthOfConstrainedLIS(nums, constraint):
    """
    Given an integer array nums, return the length of the longest strictly increasing subsequence that does not exceed the constraint value.
    
    :type nums: List[int]
    :type constraint: int
    :rtype: int
    """
    nums = [num for num in nums if num <= constraint]
    if not nums:
        return 0

    dp = [1] * len(nums)
    for i in range(1, len(nums)):
        for j in range(i):
            if nums[i] > nums[j]:
                dp[i] = max(dp[i], dp[j] + 1)
    return max(dp)
