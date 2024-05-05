class Solution(object):
    def canIWin(self, maxChoosableInteger, desiredTotal):
        if desiredTotal == 0:
            return True
        if (maxChoosableInteger * (maxChoosableInteger + 1)) // 2 < desiredTotal:
            return False

        dp = [False] * (desiredTotal + 1)
        for i in range(desiredTotal, -1, -1):
            for j in range(1, maxChoosableInteger + 1):
                if i + j <= desiredTotal and not dp[i + j]:
                    dp[i] = True
                    break
        return dp[0]
