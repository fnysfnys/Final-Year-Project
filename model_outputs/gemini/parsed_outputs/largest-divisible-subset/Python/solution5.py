class Solution(object):
    def largestDivisibleSubset(self, nums, memo={}):
        nums.sort()
        def dfs(i):
            if i in memo:
                return memo[i]
            subset = []
            for j in range(i + 1, len(nums)):
                if not subset or nums[j] % subset[-1] == 0:
                    next_subset = dfs(j)
                    subset = max(subset, next_subset + [nums[j]], key=len)
            memo[i] = subset
            return subset
    
        return dfs(0)
    
    
