def lengthOfLIS(nums):
   sorted_nums = sorted(nums)
   max_len = 0
   for i in range(len(nums)):
       max_len = max(max_len, binary_search(sorted_nums, nums[i]))
   return max_len

def binary_search(sorted_nums, target):
   low = 0
   high = len(sorted_nums) - 1
   while low <= high:
       mid = (low + high) // 2
       if sorted_nums[mid] == target:
           return mid
       elif sorted_nums[mid] < target:
           low = mid + 1
       else:
           high = mid - 1
   return -1
