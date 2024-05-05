from itertools import groupby

class Solution(object):
    def numberOfArithmeticSlices(self, nums):
       return sum(1 for _, g in groupby(nums, lambda x: x - nums[0]) if len(list(g)) > 2)
    
