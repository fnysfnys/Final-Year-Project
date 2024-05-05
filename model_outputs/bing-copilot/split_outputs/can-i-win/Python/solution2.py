class Solution(object):
    def canIWin(self, maxChoosableInteger, desiredTotal):
        if maxChoosableInteger * (maxChoosableInteger + 1) // 2 < desiredTotal:
            return False
        dp = [None] * (1 << maxChoosableInteger)
        
        def dfs(used, total):
            if total <= 0:
                return False
            if dp[used] is not None:
                return dp[used]
            for i in range(maxChoosableInteger):
                if not (used & (1 << i)):
                    if not dfs(used | (1 << i), total - i - 1):
                        dp[used] = True
                        return True
            dp[used] = False
            return False
        
        return dfs(0, desiredTotal)
