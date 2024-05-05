class Solution(object):
    def canIWin(self, maxChoosableInteger, desiredTotal):
        def canWin(choosable, total, memo):
            if choosable[-1] >= total:
                return True
            key = tuple(choosable)
            if key in memo:
                return memo[key]

            for i in range(len(choosable)):
                if not canWin(choosable[:i] + choosable[i + 1:], total - choosable[i], memo):
                    memo[key] = True
                    return True
            memo[key] = False
            return False

        if (1 + maxChoosableInteger) * maxChoosableInteger // 2 < desiredTotal:
            return False
        return canWin(list(range(1, maxChoosableInteger + 1)), desiredTotal, {})
