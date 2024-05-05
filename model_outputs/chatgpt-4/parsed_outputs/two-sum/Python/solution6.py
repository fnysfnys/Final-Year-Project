class Solution(object):
    def twoSum(self, nums, target):
        for i in range(len(nums) - 1):
            complement = target - nums[i]
            if complement in nums[i+1:]:
                return [i, nums.index(complement, i+1)]