from collections import deque

class Solution(object):
    def maxRotateFunction(self, nums):
        n = len(nums)
        total_sum = sum(nums)
        F_0 = sum(i * nums[i] for i in range(n))
        max_val = F_0
        window_sum = F_0
        dq = deque([F_0])
        for k in range(1, n):
            window_sum += total_sum - n * nums[n - k]
            dq.append(window_sum)
            if k >= n:
                dq.popleft()
            max_val = max(max_val, dq[-1])
        return max_val
