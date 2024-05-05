class Solution(object):
    def combinationSum4(self, nums, target):
        """
        ... [Docstring here] ...
        """
        memo = {}
        def helper(target):
            if target in memo:
                return memo[target]
            if target == 0:
                return 1
            if target < 0:
                return 0
            count = 0
            for num in nums:
                count += helper(target - num)
            memo[target] = count
            return count

        return helper(target)