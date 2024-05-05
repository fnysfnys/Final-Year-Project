class Solution(object):
    def combinationSum4(self, nums, target):
        """
        ... [Docstring here] ...
        """
        def helper(target):
            if target == 0:
                return 1
            if target < 0:
                return 0
            count = 0
            for num in nums:
                count += helper(target - num)
            return count

        return helper(target)
