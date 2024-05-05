    class Solution(object):
        def splitArray(self, nums, k):
            memo = {}

            def dp(start, k):
                if k == 1:
                    return sum(nums[start:])
                if (start, k) in memo:
                    return memo[(start, k)]
                min_sum = float('inf')
                curr_sum = 0
                for i in range(start, len(nums) - k + 1):
                    curr_sum += nums[i]
                    next_sum = dp(i + 1, k - 1)
                    min_sum = min(min_sum, max(curr_sum, next_sum))
                    curr_sum -= nums[i]
                memo[(start, k)] = min_sum
                return min_sum

            return dp(0, k)
    