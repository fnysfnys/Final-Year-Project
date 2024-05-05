class Solution(object):
    def combinationSum4(self, nums, target):
        memo = [0] * (target + 1)
        memo[0] = 1
        for i in range(1, target + 1):
            for num in nums:
                if i >= num:
                    memo[i] += memo[i - num]
        return memo[target]
