class Solution(object):
    def lengthOfLIS(self, nums):
       hash_table = {}
       max_len = 0
       for i in range(len(nums)):
           if nums[i] not in hash_table:
               hash_table[nums[i]] = i
           else:
               max_len = max(max_len, i - hash_table[nums[i]])
       return max_len
    
