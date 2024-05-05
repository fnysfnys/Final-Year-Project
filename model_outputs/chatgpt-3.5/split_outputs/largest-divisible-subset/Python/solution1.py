import itertools

class Solution(object):
    def largestDivisibleSubset(self, nums):
        """
        Given a set of distinct positive integers nums, return the largest subset answer such that every pair (answer[i], answer[j]) of elements in this subset satisfies:
        
        answer[i] % answer[j] == 0, or
        answer[j] % answer[i] == 0
        
        If there are multiple solutions, return any of them.
        """
        if not nums:
            return []

        nums.sort()
        max_subset = []
        for i in range(len(nums)):
            subset = [nums[i]]
            for j in range(i + 1, len(nums)):
                if nums[j] % nums[i] == 0:
                    subset.append(nums[j])
            if len(subset) > len(max_subset):
                max_subset = subset
        
        return max_subset
