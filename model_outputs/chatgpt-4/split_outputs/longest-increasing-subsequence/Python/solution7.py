def countOfLIS(nums):
    """
    Given an integer array nums, return the number of longest strictly increasing subsequences.
    
    :type nums: List[int]
    :rtype: int
    """
    if not nums:
        return 0

    lengths = [1] * len(nums)
    counts = [1] * len(nums)

    for i in range(1, len(nums)):
        for j in range(i):
            if nums[i] > nums[j]:
                if lengths[j] + 1 > lengths[i]:
                    lengths[i] = lengths[j] + 1
                    counts[i] = counts[j]
                elif lengths[j] + 1 == lengths[i]:
                    counts[i] += counts[j]

    longest = max(lengths)
    return sum(c for l, c in zip(lengths, counts) if l == longest)