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
        subsets = [{num} for num in nums]
        max_subset = []

        for i in range(len(nums)):
            for j in range(i):
                if nums[i] % nums[j] == 0 and len(subsets[i]) < len(subsets[j]) + 1:
                    subsets[i] = subsets[j] | {nums[i]}
            if len(subsets[i]) > len(max_subset):
                max_subset = subsets[i]

        return list(max_subset)