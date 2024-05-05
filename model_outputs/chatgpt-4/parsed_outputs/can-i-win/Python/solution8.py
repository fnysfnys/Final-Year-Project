class Solution(object):
    def canIWin(self, maxChoosableInteger, desiredTotal):
        if desiredTotal <= 0:
            return True
        if (maxChoosableInteger * (maxChoosableInteger + 1)) // 2 < desiredTotal:
            return False

        memo = {}

        def canWin(currentTotal, state):
            if currentTotal >= desiredTotal:
                return False
            if state in memo:
                return memo[state]

            for i in range(maxChoosableInteger):
                if not state & (1 << i):
                    if not canWin(currentTotal + i + 1, state | (1 << i)):
                        memo[state] = True
                        return True

            memo[state] = False
            return False

        return canWin(0, 0)