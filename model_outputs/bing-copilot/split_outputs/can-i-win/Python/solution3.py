class Solution(object):
    def canIWin(self, maxChoosableInteger, desiredTotal):
        def dfs(remaining, used):
            if desiredTotal - remaining in memo:
                return memo[desiredTotal - remaining]
            for i in range(1, maxChoosableInteger + 1):
                if used & (1 << i) == 0:
                    if remaining - i <= 0 or not dfs(remaining - i, used | (1 << i)):
                        memo[desiredTotal - remaining] = True
                        return True
            memo[desiredTotal - remaining] = False
            return False
        
        if maxChoosableInteger >= desiredTotal:
            return True
        if maxChoosableInteger * (maxChoosableInteger + 1) // 2 < desiredTotal:
            return False
        memo = {}
        return dfs(desiredTotal, 0)
