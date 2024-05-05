def lengthOfLIS(nums):
   max_len = 0
   for i in range(len(nums)):
       for j in range(i+1, len(nums)):
           if nums[i] < nums[j]:
               max_len = max(max_len, j-i)
   return max_len
