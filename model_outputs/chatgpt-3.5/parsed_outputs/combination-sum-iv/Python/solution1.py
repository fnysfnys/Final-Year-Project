class Solution(object):
    def combinationSum4(self, nums, target):
        """
        Given an array of distinct integers nums and a target integer target, return the number of possible combinations that add up to target.
        The test cases are generated so that the answer can fit in a 32-bit integer.
        """
        def helper(target):
            if target == 0:
                return 1
            if target < 0:
                return 0
            if target in memo:
                return memo[target]
            
            count = 0
            for num in nums:
                count += helper(target - num)
            
            memo[target] = count
            return count
        
        memo = {}
        return helper(target)