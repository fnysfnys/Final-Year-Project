class Solution(object):
    def canCross(self, stones):
        def dfs(pos, jump, memo):
            if (pos, jump) in memo:
                return memo[(pos, jump)]
            if pos == len(stones) - 1:
                return True
            for next_jump in [jump - 1, jump, jump + 1]:
                if next_jump > 0 and pos + next_jump in stones:
                    if dfs(pos + next_jump, next_jump, memo):
                        memo[(pos, jump)] = True
                        return True
            memo[(pos, jump)] = False
            return False
        
        return dfs(0, 0, {})

# Example usage:
stones1 = [0, 1, 3, 5, 6, 8, 12, 17]
print(Solution().canCross(stones1))  # Output: True

stones2 = [0, 1, 2, 3, 4, 8, 9, 11]
print(Solution().canCross(stones2))  # Output: False
