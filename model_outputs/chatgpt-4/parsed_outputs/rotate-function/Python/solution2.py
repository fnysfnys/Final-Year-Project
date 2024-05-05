class Solution(object):
    def maxRotateFunction(self, nums):
        n = len(nums)
        total_sum = sum(nums)
        f0 = sum(i * nums[i] for i in range(n))
        max_value = f0
        current_value = f0
        
        for k in range(1, n):
            current_value += total_sum - n * nums[n - k]
            max_value = max(max_value, current_value)
        
        return max_value