def largestDivisibleSubset(self, nums):
    result = []
    def backtrack(i, subset):
        if i == len(nums):
            result.append(subset)
            return
        for j in range(i + 1, len(nums)):
            if not subset or nums[j] % subset[-1] == 0:
                backtrack(j, subset + [nums[j]])

    backtrack(0, [])
    return max(result, key=len) if result else []

