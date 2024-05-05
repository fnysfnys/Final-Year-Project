class Solution(object):
    def maxRotateFunction(self, nums):
        n = len(nums)
        max_value = float('-inf')
        
        for k in range(n):
            current_value = 0
            for i in range(n):
                current_value += i * nums[(i + k) % n]
            max_value = max(max_value, current_value)
        
        return max_value
