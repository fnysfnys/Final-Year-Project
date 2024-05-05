class Solution(object):
    def getMaxRepetitions(self, s1, n1, s2, n2):
        memo = {}
        
        def dfs(i, j, count):
            if j == len(s2):
                return dfs(i, 0, count + 1)
            if i == len(s1):
                return count
            if (i, j) in memo:
                return memo[(i, j)]
            if s1[i] == s2[j]:
                memo[(i, j)] = dfs(i + 1, j + 1, count)
            else:
                memo[(i, j)] = dfs(i + 1, j, count)
            return memo[(i, j)]
        
        return dfs(0, 0, 0) // n2
