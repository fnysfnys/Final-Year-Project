class Solution(object):
    def canIWin(self, maxChoosableInteger, desiredTotal):
        def dfs(used, total):
            if total <= 0:
                return False
            if used in memo:
                return memo[used]
            for i in range(1, maxChoosableInteger + 1):
                if not (used & (1 << i)):
                    if not dfs(used | (1 << i), total - i):
                        memo[used] = True
                        return True
            memo[used] = False
            return False
        
        if maxChoosableInteger * (maxChoosableInteger + 1) // 2 < desiredTotal:
            return False
        memo = {}
        return dfs(0, desiredTotal)
