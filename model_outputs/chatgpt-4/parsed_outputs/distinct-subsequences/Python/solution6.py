class Solution:
    def numDistinct(self, s, t):
        memo = {}
        def dfs(s, t):
            if t == "": return 1
            if s == "": return 0
            if (s, t) in memo: return memo[(s, t)]
            
            count = 0
            if s[0] == t[0]:
                count = dfs(s[1:], t[1:]) + dfs(s[1:], t)
            else:
                count = dfs(s[1:], t)
            memo[(s, t)] = count
            return count
        
        return dfs(s, t)
