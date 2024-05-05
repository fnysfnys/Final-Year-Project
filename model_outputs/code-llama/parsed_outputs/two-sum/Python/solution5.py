class Solution(object):
    def twoSum(self, nums, target):
       return (i for i in range(len(nums)) if nums[i] + nums[i+1] == target)
    
