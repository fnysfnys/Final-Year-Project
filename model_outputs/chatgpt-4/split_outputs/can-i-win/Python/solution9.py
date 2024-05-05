class Solution(object):
    def canIWin(self, maxChoosableInteger, desiredTotal):
        if (1 + maxChoosableInteger) * maxChoosableInteger // 2 < desiredTotal:
            return False

        def canWin(total, chosen):
            if total <= 0:
                return False
            for i in range(1, maxChoosableInteger + 1):
                if i not in chosen:
                    if total - i <= 0 or not canWin(total - i, chosen | {i}):
                        return True
            return False

        return canWin(desiredTotal, set())
