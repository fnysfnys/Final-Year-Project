class Solution(object):
    def maxCoins(self, nums):
       if len(nums) == 1:
           return nums[0]
       mid = len(nums) // 2
       left = self.maxCoins(nums[:mid])
       right = self.maxCoins(nums[mid:])
       return left * right
    
