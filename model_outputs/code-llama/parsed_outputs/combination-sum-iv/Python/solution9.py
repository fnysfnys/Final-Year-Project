class Solution(object):
    def combinationSum4(self, nums, target):
       memoization_table = {}
       for num in nums:
           memoization_table[num] = 1
       count = 0
       for i in range(len(nums)):
           count += memoization_table[nums[i]]
       return count
    
