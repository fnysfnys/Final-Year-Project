class Solution(object):
    def canIWin(self, maxChoosableInteger, desiredTotal):
        if (1 + maxChoosableInteger) * maxChoosableInteger // 2 < desiredTotal:
            return False

        def canWin(total, used, memo):
            if total <= 0:
                return False
            if used in memo:
                return memo[used]

            for i in range(1, maxChoosableInteger + 1):
                if not used & (1 << i):
                    if not canWin(total - i, used | (1 << i), memo):
                        memo[used] = True
                        return True

            memo[used] = False
            return False

        return canWin(desiredTotal, 0, {})