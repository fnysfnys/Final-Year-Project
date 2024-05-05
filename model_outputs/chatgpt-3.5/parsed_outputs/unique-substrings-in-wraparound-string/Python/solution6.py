from collections import defaultdict

class Solution(object):
    def findSubstringInWraproundString(self, s):
        base = "abcdefghijklmnopqrstuvwxyz"
        dp = defaultdict(int)
        max_len = 0
        
        for i in range(len(s)):
            if i > 0 and (ord(s[i]) - ord(s[i-1]) == 1 or ord(s[i-1]) - ord(s[i]) == 25):
                max_len += 1
            else:
                max_len = 1
            
            index = ord(s[i]) - ord('a')
            dp[s[i]] = max(dp[s[i]], max_len)
        
        return sum(dp.values())