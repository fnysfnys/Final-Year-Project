class Solution(object):
    def getMaxRepetitions(self, s1, n1, s2, n2):
        dp = [0] * (len(s2) + 1)
        next_idx = [0] * (len(s2) + 1)
        j, count = 0, 0
        
        for _ in range(n1):
            for i in range(len(s1)):
                if s1[i] == s2[j]:
                    j += 1
                    if j == len(s2):
                        j = 0
                        count += 1
            dp[j] = count
            next_idx[j] = i + 1
        
        return dp[0] * (n1 // len(s1)) + dp[0:n1 % len(s1)][next_idx[0]]
