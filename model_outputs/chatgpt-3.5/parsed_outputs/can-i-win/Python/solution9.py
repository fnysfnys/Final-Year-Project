class Solution(object):
    def canIWin(self, maxChoosableInteger, desiredTotal):
        """
        Using a top-down approach with memoization and tuple representation.
        """
        if maxChoosableInteger >= desiredTotal:
            return True
        if (maxChoosableInteger + 1) * maxChoosableInteger // 2 < desiredTotal:
            return False
        
        def can_win(remaining_numbers, total, memo):
            if total >= desiredTotal:
                return False
            if tuple(remaining_numbers) in memo:
                return memo[tuple(remaining_numbers)]
            
            for i in range(1, maxChoosableInteger + 1):
                if i in remaining_numbers:
                    remaining_numbers.remove(i)
                    if not can_win(remaining_numbers, total + i, memo):
                        memo[tuple(remaining_numbers)] = True
                        remaining_numbers.add(i)
                        return True
                    remaining_numbers.add(i)
            
            memo[tuple(remaining_numbers)] = False
            return False
        
        return can_win(set(range(1, maxChoosableInteger + 1)), 0, {})