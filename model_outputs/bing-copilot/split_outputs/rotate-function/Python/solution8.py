class Solution(object):
    def maxRotateFunction(self, nums):
        n = len(nums)
        total_sum = sum(nums)
        F_0 = sum(i * nums[i] for i in range(n))
        max_val = F_0
        for k in range(1, n):
            F_k = F_0 + total_sum - n * nums[n - k]
            max_val = max(max_val, F_k)
        return max_val % (10**9 + 7)
