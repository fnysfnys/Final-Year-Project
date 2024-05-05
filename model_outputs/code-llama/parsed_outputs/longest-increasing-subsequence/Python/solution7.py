class Solution(object):
    def lengthOfLIS(self, nums):
       sorted_nums = sorted(nums)
       max_len = 0
       for i in range(len(nums)):
           j = i + 1
           while j < len(nums) and sorted_nums[j] > sorted_nums[i]:
               j += 1
           max_len = max(max_len, j - i)
       return max_len
    
