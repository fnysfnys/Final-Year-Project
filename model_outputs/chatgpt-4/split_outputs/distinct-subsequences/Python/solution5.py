from collections import Counter

class Solution:
    def numDistinct(self, s, t):
        count_s, count_t = Counter(s), Counter(t)
        for char in count_t:
            if count_t[char] > count_s.get(char, 0):
                return 0
                
        # Follow with a dynamic programming approach similar to above.
        dp = [0] * (len(t) + 1)
        dp[0] = 1
        for i in range(1, len(s) + 1):
            for j in range(len(t), 0, -1):
                if s[i - 1] == t[j - 1]:
                    dp[j] += dp[j - 1]
        return dp[-1]
