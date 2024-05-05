class Solution(object):
    def largestDivisibleSubset(self, nums):
        nums.sort(reverse=True)
        subsets = {1: []}
        for num in nums:
            max_subset = []
            for k in subsets:
                if num % k == 0 and len(subsets[k]) > len(max_subset):
                    max_subset = subsets[k].copy()
            max_subset.append(num)
            subsets[num] = max_subset
        return max(subsets.values(), key=len)