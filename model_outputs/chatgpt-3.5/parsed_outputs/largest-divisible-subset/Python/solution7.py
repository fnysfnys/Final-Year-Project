from collections import defaultdict

class Solution(object):
    def largestDivisibleSubset(self, nums):
        """
        Given a set of distinct positive integers nums, return the largest subset answer such that every pair (answer[i], answer[j

]) of elements in this subset satisfies:
        
        answer[i] % answer[j] == 0, or
        answer[j] % answer[i] == 0
        
        If there are multiple solutions, return any of them.
        """
        if not nums:
            return []

        nums.sort()
        subsets = defaultdict(list)
        max_subset = []

        for num in nums:
            for prev_num in subsets:
                if num % prev_num == 0 and len(subsets[num]) < len(subsets[prev_num]) + 1:
                    subsets[num] = subsets[prev_num] + [num]
            if not subsets[num]:
                subsets[num] = [num]
            if len(subsets[num]) > len(max_subset):
                max_subset = subsets[num]

        return max_subset