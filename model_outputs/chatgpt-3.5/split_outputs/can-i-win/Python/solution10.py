class Solution(object):
    def canIWin(self, maxChoosableInteger, desiredTotal):
        """
        Using a top-down approach with memoization and a bitmask.
        """
        if maxChoosableInteger >= desiredTotal:
            return True
        if (maxChoosableInteger + 1) * maxChoosableInteger // 2 < desiredTotal:
            return False
        
        def can_win(mask, total, memo):
            if total >= desiredTotal:
                return False
            if memo[mask] is not None:
                return memo[mask]
            
            for i in range(1, maxChoosableInteger + 1):
                if (mask >> (i - 1)) & 1 == 1:
                    if not can_win(mask ^ (1 << (i - 1)), total + i, memo):
                        memo[mask] = True
                        return True
            
            memo[mask] = False
            return False
        
        return can_win((1 << maxChoosableInteger) - 1, 0, [None] * (1 << maxChoosableInteger))
