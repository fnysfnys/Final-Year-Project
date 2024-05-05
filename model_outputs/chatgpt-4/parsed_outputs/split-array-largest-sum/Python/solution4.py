class Solution:
    def splitArray(self, nums, k):
        memo = {}

        def dfs(i, k):
            if k == 1:
                return sum(nums[i:])
            if (i, k) in memo:
                return memo[(i, k)]
            ans, cur_sum = float('inf'), 0
            for j in range(i, len(nums) - k + 1):
                cur_sum += nums[j]
                largest_sum = max(cur_sum, dfs(j + 1, k - 1))
                ans = min(ans, largest_sum)
                if cur_sum >= ans:
                    break
            memo[(i, k)] = ans
            return ans

        return dfs(0, k)