class Solution(object):
    def canIWin(self, maxChoosableInteger, desiredTotal):
        if desiredTotal <= maxChoosableInteger:
            return True

        total = (maxChoosableInteger * (maxChoosableInteger + 1)) // 2
        if total < desiredTotal:
            return False

        dp = [False] * (desiredTotal + 1)
        dp[0] = True

        for i in range(1, desiredTotal + 1):
            for j in range(maxChoosableInteger, 0, -1):
                if i - j >= 0:
                    dp[i] = not dp[i - j]
                    if dp[i]:
                        break
        return dp[desiredTotal]