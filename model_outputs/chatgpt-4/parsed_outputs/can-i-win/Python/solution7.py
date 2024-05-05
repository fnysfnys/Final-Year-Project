class Solution(object):
    def canIWin(self, maxChoosableInteger, desiredTotal):
        if desiredTotal <= maxChoosableInteger:
            return True

        total = sum(range(1, maxChoosableInteger + 1))
        if total < desiredTotal:
            return False

        for i in range(maxChoosableInteger, 0, -1):
            if desiredTotal - i <= 0:
                return True
            desiredTotal -= i
        return False