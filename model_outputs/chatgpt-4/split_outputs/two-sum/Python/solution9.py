class Solution(object):
    def twoSum(self, nums, target, index=0):
        if index >= len(nums) - 1:
            return []
        for i in range(index + 1, len(nums)):
            if nums[index] + nums[i] == target:
                return [index, i]
        return self.twoSum(nums, target, index + 1)
