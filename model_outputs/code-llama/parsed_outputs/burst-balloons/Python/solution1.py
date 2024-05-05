class Solution(object):
    def maxCoins(self, nums):
       max_coins = 0
       for i in range(len(nums)):
           coins = nums[i-1] * nums[i] * nums[i+1]
           if coins > max_coins:
               max_coins = coins
       return max_coins
    
