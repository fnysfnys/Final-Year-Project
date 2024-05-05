def largestDivisibleSubset(self, nums):
    def dfs(i, subset):
        if i == len(nums):
            return subset
        next_subset = dfs(i + 1, subset)
        if not subset or nums[i] % subset[-1] == 0:
            return max(next_subset, subset + [nums[i]], key=len)
        return next_subset

    return dfs(0, [])

