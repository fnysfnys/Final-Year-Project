class Solution(object):
    def coinChange(self, coins, amount):
        """
        [Docstring same as provided]
        """
        memo = {}

        def dp(n):
            if n in memo:
                return memo[n]
            if n == 0: return 0
            if n < 0: return -1

            res = float('inf')
            for coin in coins:
                subproblem = dp(n - coin)
                if subproblem == -1: continue
                res = min(res, 1 + subproblem)

            memo[n] = res if res != float('inf') else -1
            return memo[n]

        return dp(amount)
