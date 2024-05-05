class Solution(object):
    def maxRotateFunction(self, nums):
        n = len(nums)
        return max([sum(nums[i:] * range(n - i)) for i in range(n)])
    
