class Solution(object):
    def maxCoins(self, nums):
        """
        Recursive solution with memoization.
        Time complexity: O(n^3)
        Space complexity: O(n^2)
        """
        def dfs(left, right):
            if left > right:
                return 0
            if memo[left][right] != -1:
                return memo[left][right]
            
            max_coins = 0
            for k in range(left, right + 1):
                max_coins = max(max_coins, nums[left - 1] * nums[k] * nums[right + 1] + dfs(left, k - 1) + dfs(k + 1, right))
            
            memo[left][right] = max_coins
            return max_coins

        n = len(nums)
        nums = [1] + nums + [1]
        memo = [[-1] * (n + 2) for _ in range(n + 2)]
        
        return dfs(1, n)