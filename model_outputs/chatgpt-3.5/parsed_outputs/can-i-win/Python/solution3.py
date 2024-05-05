class Solution(object):
    def canIWin(self, maxChoosableInteger, desiredTotal):
        """
        Using a bottom-up DP approach.
        """
        if maxChoosableInteger >= desiredTotal:
            return True
        if (maxChoosableInteger + 1) * maxChoosableInteger // 2 < desiredTotal:
            return False
        
        dp = [False] * (1 << maxChoosableInteger)
        
        for i in range(1, maxChoosableInteger + 1):
            dp[(1 << i) - 1] = True
        
        for mask in range((1 << maxChoosableInteger) - 1, -1, -1):
            total = 0
            for i in range(maxChoosableInteger, 0, -1):
                if ((mask >> (i - 1)) & 1) == 0:
                    total += i
                    if not dp[mask | (1 << (i - 1))]:
                        dp[mask] = True
                        break
            if total < desiredTotal:
                dp[mask] = False
        
        return dp[0]