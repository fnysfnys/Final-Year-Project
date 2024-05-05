class Solution(object):
    def canIWin(self, maxChoosableInteger, desiredTotal):
        if maxChoosableInteger >= desiredTotal:
            return True
        if maxChoosableInteger * (maxChoosableInteger + 1) // 2 < desiredTotal:
            return False
        dp = [False] * (1 << maxChoosableInteger)
        for i in range(1, maxChoosableInteger + 1):
            dp[1 << i] = True
        for mask in range(1 << maxChoosableInteger):
            for i in range(1, maxChoosableInteger + 1):
                if mask & (1 << i):
                    continue
                if dp[mask | (1 << i)]:
                    continue
                if desiredTotal - i <= 0:
                    dp[mask] = True
                    break
        return dp[0]
