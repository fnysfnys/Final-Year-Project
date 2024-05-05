def lengthOfLIS(nums):
   return lengthOfLISRecursive(nums, 0, len(nums) - 1)

def lengthOfLISRecursive(nums, low, high):
   if low == high:
       return 1
   mid = (low + high) // 2
   left = lengthOfLISRecursive(nums, low, mid)
   right = lengthOfLISRecursive(nums, mid + 1, high)
   return max(left, right)
