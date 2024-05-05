class Solution(object):
    def lengthOfLIS(self, nums):
        def dfs(i, prev, memo):
            if i == len(nums):
                return 0
            if (i, prev) in memo:
                return memo[(i, prev)]
            take = 1 + dfs(i + 1, nums[i], memo) if nums[i] > prev else 0
            skip = dfs(i + 1, prev, memo)
            memo[(i, prev)] = max(take, skip)
            return memo[(i, prev)]

        return dfs(0, float('-inf'), {})
