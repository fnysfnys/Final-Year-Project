class Solution(object):
    def largestDivisibleSubset(self, nums):
        """
        Given a set of distinct positive integers nums, return the largest subset answer such that every pair (answer[i], answer[j]) of elements in this subset satisfies:
        
        answer[i] % answer[j] == 0, or
        answer[j] % answer[i] == 0
        
        If there are multiple solutions, return any of them.
        """
        def find_largest_subset(curr, index):
            if index == len(nums):
                return curr
            if (curr, index) in memo:
                return memo[(curr, index)]
            inclusive = []
            if not curr or nums[index] % curr[-1] == 0:
                inclusive = find_largest_subset(curr + [nums[index]], index + 1)
            exclusive = find_largest_subset(curr, index + 1)
            memo[(curr, index)] = inclusive if len(inclusive) > len(exclusive) else exclusive
            return memo[(curr, index)]

        nums.sort()
        memo = {}
        return find_largest_subset([], 0)