class Solution(object):
    def numberOfArithmeticSlices(self, nums):
       memo = {}
       for i in range(len(nums) - 2):
           for j in range(i + 1, len(nums) - 1):
               if nums[j] - nums[i] == nums[j + 1] - nums[j]:
                   memo[i] = memo.get(i, 0) + 1
       return sum(memo.values())
    
