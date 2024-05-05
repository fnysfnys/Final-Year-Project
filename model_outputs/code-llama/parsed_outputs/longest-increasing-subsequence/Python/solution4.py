class Solution(object):
    def lengthOfLIS(self, nums):
       return self.lengthOfLISRecursive(nums, 0, len(nums) - 1)
    
    def lengthOfLISRecursive(self, nums, low, high):
       if low == high:
           return 1
       mid = (low + high) // 2
       left = self.lengthOfLISRecursive(nums, low, mid)
       right = self.lengthOfLISRecursive(nums, mid + 1, high)
       return max(left, right)
    
