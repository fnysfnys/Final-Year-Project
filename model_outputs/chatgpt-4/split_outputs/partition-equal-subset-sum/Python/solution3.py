class Solution:
    def canPartition(self, nums):
        total_sum = sum(nums)
        if total_sum % 2 != 0:
            return False
        self.memo = {}
        return self.canFindSubset(nums, 0, total_sum // 2)
    
    def canFindSubset(self, nums, index, sum_left):
        if sum_left == 0:
            return True
        if index >= len(nums) or sum_left < 0:
            return False
        if (index, sum_left) in self.memo:
            return self.memo[(index, sum_left)]
        
        result = self.canFindSubset(nums, index + 1, sum_left - nums[index]) or self.canFindSubset(nums, index + 1, sum_left)
        self.memo[(index, sum_left)] = result
        return result
