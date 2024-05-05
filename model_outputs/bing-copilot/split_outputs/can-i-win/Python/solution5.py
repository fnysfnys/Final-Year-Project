class Solution(object):
    def canIWin(self, maxChoosableInteger, desiredTotal):
        if maxChoosableInteger >= desiredTotal:
            return True
        if maxChoosableInteger * (maxChoosableInteger + 1) // 2 < desiredTotal:
            return False
        return desiredTotal % (maxChoosableInteger + 1) != 0
