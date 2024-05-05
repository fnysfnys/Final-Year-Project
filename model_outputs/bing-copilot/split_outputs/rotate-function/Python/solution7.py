class Solution(object):
    def maxRotateFunction(self, nums):
        n = len(nums)
        total_sum = sum(nums)
        rolling_sum = sum(i * nums[i] for i in range(n))
        max_val = rolling_sum
        for k in range(1, n):
            rolling_sum += total_sum - n * nums[n - k]
            max_val = max(max_val, rolling_sum)
        return max_val
