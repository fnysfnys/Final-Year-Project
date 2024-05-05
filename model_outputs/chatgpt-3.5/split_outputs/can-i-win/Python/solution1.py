class Solution(object):
    def canIWin(self, maxChoosableInteger, desiredTotal):
        """
        Simple recursive approach.
        """
        def can_win(maxChoosableInteger, desiredTotal, memo):
            if tuple(memo) in memo:
                return memo[tuple(memo)]
            
            for i in range(1, maxChoosableInteger + 1):
                if not memo[i]:
                    memo[i] = True
                    if desiredTotal <= i or not can_win(maxChoosableInteger, desiredTotal - i, memo):
                        memo[i] = False
                        return True
                    memo[i] = False
            
            return False
        
        if maxChoosableInteger >= desiredTotal:
            return True
        if (maxChoosableInteger + 1) * maxChoosableInteger // 2 < desiredTotal:
            return False
        memo = [False] * (maxChoosableInteger + 1)
        return can_win(maxChoosableInteger, desiredTotal, memo)
