class Solution(object):
    def numberOfArithmeticSlices(self, nums, i=0, prev=None):
        if i >= len(nums):
            return 0
        count = 0
        for j in range(i + 1, len(nums)):
            if prev is None or nums[j] - nums[i] == nums[j - 1] - nums[i - 1]:
                count += 1 + self.numberOfArithmeticSlices(nums, j, nums[i])
        return count
    
