def lengthOfLIS(nums):
   sorted_nums = sorted(nums)
   max_len = 0
   for i in range(len(nums)):
       if sorted_nums[i] > sorted_nums[i-1]:
           max_len += 1
   return max_len
