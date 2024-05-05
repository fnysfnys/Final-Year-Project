class Solution(object):
    def maxCoins(self, nums):
       if len(nums) == 1:
           return nums[0]
       else:
           return max(nums[0] * nums[1] * nums[2], self.maxCoins(nums[1:]))
    
