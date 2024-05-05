class Solution(object):
    def getMaxRepetitions(self, s1, n1, s2, n2):
        def dfs(i, j, count):
            if j == len(s2):
                return dfs(i, 0, count + 1)
            if i == len(s1):
                return count
            if s1[i] == s2[j]:
                return dfs(i + 1, j + 1, count)
            return dfs(i + 1, j, count)
        
        return dfs(0, 0, 0) // n2
