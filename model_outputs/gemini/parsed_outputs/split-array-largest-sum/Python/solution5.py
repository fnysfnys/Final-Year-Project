class Solution(object):
    def splitArray(self, nums, k, start, current_sum, subarrays):
        if subarrays == k:
            return current_sum
        
        min_max = float('inf')
        for i in range(start, len(nums)):
            min_max = min(min_max, self.splitArray(nums, k, i + 1, current_sum + nums[i], subarrays + 1))
        return min_max
    
