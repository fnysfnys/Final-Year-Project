class Solution(object):
    def canIWin(self, maxChoosableInteger, desiredTotal):
        if desiredTotal <= maxChoosableInteger:
            return True

        total = (maxChoosableInteger * (maxChoosableInteger + 1)) // 2
        if total < desiredTotal:
            return False

        dp = [False] * (1 << maxChoosableInteger)
        for i in range((1 << maxChoosableInteger) - 1, -1, -1):
            sum_ = 0
            for j in range(maxChoosableInteger):
                if not i & (1 << j):
                    sum_ += j + 1
                    if sum_ >= desiredTotal:
                        dp[i] = True
                        break
                    if not dp[i | (1 << j)]:
                        dp[i] = True
                        break
        return dp[0]