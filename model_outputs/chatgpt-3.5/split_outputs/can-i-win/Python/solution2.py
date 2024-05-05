class Solution(object):
    def canIWin(self, maxChoosableInteger, desiredTotal):
        """
        Using dynamic programming (DP) approach.
        """
        if maxChoosableInteger >= desiredTotal:
            return True
        if (maxChoosableInteger + 1) * maxChoosableInteger // 2 < desiredTotal:
            return False
        
        def can_win(mask, total, memo):
            if total >= desiredTotal:
                return False
            if memo[mask] != 0:
                return memo[mask] == 1
            
            for i in range(1, maxChoosableInteger + 1):
                if (mask >> i) & 1 == 0:
                    if not can_win(mask | (1 << i), total + i, memo):
                        memo[mask] = 1
                        return True
            
            memo[mask] = -1
            return False
        
        memo = [0] * (1 << (maxChoosableInteger + 1))
        return can_win(0, 0, memo)
