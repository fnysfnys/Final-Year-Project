class Solution(object):
    def maxCoins(self, nums):
       coins = 0
       for i in range(len(nums)):
           coins += nums[i-1] * nums[i] * nums[i+1]
       return coins
    
