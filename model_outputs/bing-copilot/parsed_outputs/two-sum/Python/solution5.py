from collections import Counter

class Solution(object):
    def twoSum(self, nums, target):
           num_count = Counter(nums)
           for i, num in enumerate(nums):
               complement = target - num
               if complement in num_count and (complement != num or num_count[num] > 1):
                   return [i, nums.index(complement, i + 1)]
       
