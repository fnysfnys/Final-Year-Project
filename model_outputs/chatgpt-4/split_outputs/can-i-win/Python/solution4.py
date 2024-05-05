class Solution(object):
    def canIWin(self, maxChoosableInteger, desiredTotal):
        if (1 + maxChoosableInteger) * maxChoosableInteger / 2 < desiredTotal:
            return False
        memo = {}

        def canWin(used, total):
            if used in memo:
                return memo[used]
            for i in range(maxChoosableInteger, 0, -1):
                if not used & (1 << i):
                    if total <= i or not canWin(used | (1 << i), total - i):
                        memo[used] = True
                        return True
            memo[used] = False
            return False

        return canWin(0, desiredTotal)
