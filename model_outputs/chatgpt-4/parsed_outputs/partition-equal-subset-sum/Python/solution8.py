class Solution:
    def canPartition(self, nums):
        total = sum(nums)
        if total % 2 != 0:
            return False
        return self.helper(nums, 0, total // 2)
    
    def helper(self, nums, index, sum_left):
        if sum_left == 0:
            return True
        if index >= len(nums) or sum_left < 0:
            return False
        return self.helper(nums, index + 1, sum_left - nums[index]) or self.helper(nums, index + 1, sum_left)