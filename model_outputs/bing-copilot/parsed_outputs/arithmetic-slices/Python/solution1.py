class Solution:
    def numberOfArithmeticSlices(self, nums):
        def slices(nums, i):
            if i < 2:
                return 0
            if nums[i] - nums[i-1] == nums[i-1] - nums[i-2]:
                return 1 + slices(nums, i-1)
            else:
                return slices(nums, i-1)
        
        if len(nums) < 3:
            return 0
        return slices(nums, len(nums) - 1)
