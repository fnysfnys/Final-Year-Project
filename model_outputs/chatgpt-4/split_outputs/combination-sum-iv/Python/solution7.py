class Solution(object):
    def combinationSum4(self, nums, target):
        """
        ... [Docstring here] ...
        """
        def dp(target):
            if target == 0:
                return 1
            return sum(dp(target - num) for num in nums if target >= num)

        return dp(target)
