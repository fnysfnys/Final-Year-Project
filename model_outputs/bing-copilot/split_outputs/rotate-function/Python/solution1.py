class Solution(object):
    def maxRotateFunction(self, nums):
        n = len(nums)
        max_val = float('-inf')
        for k in range(n):
            F_k = sum(i * nums[(i + k) % n] for i in range(n))
            max_val = max(max_val, F_k)
        return max_val
