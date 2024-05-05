class Solution(object):
    def canIWin(self, maxChoosableInteger, desiredTotal):
        if (1 + maxChoosableInteger) * maxChoosableInteger // 2 < desiredTotal:
            return False

        def canWin(total, state, dp):
            if dp[state] != None:
                return dp[state]
            for i in range(maxChoosableInteger):
                if not (state >> i) & 1:
                    if total <= i + 1 or not canWin(total - (i + 1), state | (1 << i), dp):
                        dp[state] = True
                        return True
            dp[state] = False
            return False

        return canWin(desiredTotal, 0, [None] * (1 << maxChoosableInteger))
