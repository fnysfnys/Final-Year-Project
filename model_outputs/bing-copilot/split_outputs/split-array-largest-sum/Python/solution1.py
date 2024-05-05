    class Solution(object):
        def splitArray(self, nums, k):
            def dfs(start, k, curr_sum):
                if k == 1:
                    return sum(nums[start:])
                min_sum = float('inf')
                for i in range(start, len(nums) - k + 1):
                    curr_sum += nums[i]
                    next_sum = dfs(i + 1, k - 1, 0)
                    min_sum = min(min_sum, max(curr_sum, next_sum))
                    curr_sum -= nums[i]
                return min_sum

            return dfs(0, k, 0)
    