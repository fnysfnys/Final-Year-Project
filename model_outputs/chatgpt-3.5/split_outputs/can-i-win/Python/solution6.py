class Solution(object):
    def canIWin(self, maxChoosableInteger, desiredTotal):
        """
        Using a depth-first search (DFS) approach.
        """
        if maxChoosableInteger >= desiredTotal:
            return True
        if (maxChoosableInteger + 1) * maxChoosableInteger // 2 < desiredTotal:
            return False
        
        def dfs(remaining_numbers, total):
            if total >= desiredTotal:
                return False
            if remaining_numbers in memo:
                return memo[remaining_numbers]
            
            for i in range(1, maxChoosableInteger + 1):
                if (remaining_numbers >> (i - 1)) & 1 == 1:
                    if not dfs(remaining_numbers ^ (1 << (i - 1)), total + i):
                        memo[remaining_numbers] = True
                        return True
            
            memo[remaining_numbers] = False
            return False
        
        memo = {}
        return dfs((1 << maxChoosableInteger) - 1, 0)
