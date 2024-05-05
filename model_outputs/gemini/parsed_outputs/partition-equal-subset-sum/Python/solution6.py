class Solution(object):
    def canPartition(self, nums, i, subsetSum):
        if subsetSum == 0:
            return True
        if i >= len(nums) or subsetSum < 0:
            return False
        return self.canPartition(nums, i + 1, subsetSum) or self.canPartition(nums, i + 1, subsetSum - nums[i])

    def canPartition(self, nums):
        target = sum(nums) // 2
        return self.canPartition(nums, 0, target)
