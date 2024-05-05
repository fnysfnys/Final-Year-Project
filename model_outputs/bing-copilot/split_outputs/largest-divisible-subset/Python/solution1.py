class Solution(object):
    def largestDivisibleSubset(self, nums):
        def is_valid_subset(subset):
            for i in range(len(subset)):
                for j in range(i + 1, len(subset)):
                    if subset[i] % subset[j] != 0 and subset[j] % subset[i] != 0:
                        return False
            return True

        max_subset = []
        n = len(nums)
        for i in range(1 << n):
            subset = [nums[j] for j in range(n) if i & (1 << j)]
            if is_valid_subset(subset) and len(subset) > len(max_subset):
                max_subset = subset

        return max_subset
