class Solution(object):
    def combinationSum4(self, nums, target):
       hash_table = {}
       for num in nums:
           hash_table[num] = 1
       count = 0
       for i in range(len(nums)):
           count += hash_table[nums[i]]
       return count
    
