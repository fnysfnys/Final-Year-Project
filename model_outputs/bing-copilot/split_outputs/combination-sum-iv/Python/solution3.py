class Solution(object):
    def combinationSum4(self, nums, target):
        memo = {}
        def helper(t):
            if t == 0:
                return 1
            if t in memo:
                return memo[t]
            count = 0
            for num in nums:
                if t >= num:
                    count += helper(t - num)
            memo[t] = count
            return count
        return helper(target)
