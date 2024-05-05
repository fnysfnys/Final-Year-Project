class Solution:
    def combinationSum4(self, nums, target):
        cache = {}

        def dfs(i, remaining):
            if remaining == 0:
                return 1
            if (i, remaining) in cache:
                return cache[(i, remaining)]
            count = 0
            for j in range(i, len(nums)):
                if nums[j] <= remaining:
                    count += dfs(j, remaining - nums[j])
            cache[(i, remaining)] = count
            return count

        return dfs(0, target)
