class Solution(object):
    def combinationSum4(self, nums, target):
        def backtrack(t):
            if t == 0:
                return 1
            count = 0
            for num in nums:
                if t >= num:
                    count += backtrack(t - num)
            return count
        return backtrack(target)
