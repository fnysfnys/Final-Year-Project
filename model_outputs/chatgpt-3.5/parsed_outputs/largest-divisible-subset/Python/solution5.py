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
        subsets = {(-1, -1)}
        result = []
        
        for num in nums:
            max_subset = (-1, -1)
            for subset in subsets:
                if num % subset[1] == 0 and max_subset[0] < subset[0] + 1:
                    max_subset = (subset[0] + 1, num)
            subsets.add(max_subset)
        
        max_length = max(subsets, key=lambda x: x[0])[0]
        max_element = max(subsets, key=lambda x: x[0])[1]

        while max_length > 0:
            result.append(max_element)
            max_length -= 1
            for subset in subsets:
                if subset[0] == max_length and max_element % subset[1] == 0:
                    max_element = subset[1]
                    break

        return result[::-1]