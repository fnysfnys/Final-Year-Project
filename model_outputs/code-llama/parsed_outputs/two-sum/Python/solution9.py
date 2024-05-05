class Solution(object):
    def twoSum(self, nums, target):
       for i in range(len(nums)):
           low = 0
           high = len(nums) - 1
           while low <= high:
               mid = (low + high) // 2
               if nums[mid] == target - nums[i]:
                   return [i, mid]
               elif nums[mid] < target - nums[i]:
                   low = mid + 1
               else:
                   high = mid - 1
       return []
    
