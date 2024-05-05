class Solution(object):
    def combinationSum4(self, nums, target):
        """
        Given an array of distinct integers nums and a target integer target, return the number of possible combinations that add up to target.
        The test cases are generated so that the answer can fit in a 32-bit integer.
        """
        def helper(target, index):
            if target == 0:
                return 1
            if target < 0 or index == len(nums):
                return 0
            
            count = 0
            count += helper(target - nums[index], index)
            count += helper(target, index + 1)
            
            return count
        
        return helper(target, 0)