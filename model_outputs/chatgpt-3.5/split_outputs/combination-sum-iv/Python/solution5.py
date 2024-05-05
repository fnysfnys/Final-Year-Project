class Solution(object):
    def combinationSum4(self, nums, target):
        """
        Given an array of distinct integers nums and a target integer target, return the number of possible combinations that add up to target.
        The test cases are generated so that the answer can fit in a 32-bit integer.
        """
        if target == 0:
            return 1
        if target < 0:
            return 0
        
        count = 0
        for num in nums:
            count += self.combinationSum4(nums, target - num)
        
        return count
