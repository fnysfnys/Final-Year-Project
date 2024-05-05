class Solution(object):
    def maxCoins(self, nums):
      coins = 0
      while True:
        changed = False
        for i in range(1, len(nums)-1):
          if nums[i] > nums[i-1] and nums[i] > nums[i+1]:
            coins += nums[i-1] * nums[i] * nums[i+1]
            nums[i] = 0
            changed = True
        if not changed: break
      return coins
    
