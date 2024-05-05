class Solution(object):
    def canIWin(self, maxChoosableInteger, desiredTotal):
        """
        Using a recursive approach with memoization.
        """
        if maxChoosableInteger >= desiredTotal:
            return True
        if (maxChoosableInteger + 1) * maxChoosableInteger // 2 < desiredTotal:
            return False
        
        def can_win(remaining_numbers, total, memo):
            if total >= desiredTotal:
                return False
            if remaining_numbers in memo:
                return memo[remaining_numbers]
            
            for i in range(1, maxChoosableInteger + 1):
                if (remaining_numbers >> (i - 1)) & 1 == 1:
                    if not can_win(remaining_numbers ^ (1 << (i - 1)), total + i, memo):
                        memo[remaining_numbers] = True
                        return True
            
            memo[remaining_numbers] = False
            return False
        
        return can_win((1 << maxChoosableInteger) - 1, 0, {})