class Solution(object):
    def findSubstringInWraproundString(self, s):
        # Docstring...

        dp = [0] * 26
        length = 0

        for i in range(len(s)):
            if i > 0 and (ord(s[i]) - ord(s[i-1])) % 26 == 1:
                length += 1
            else:
                length = 1
            dp[ord(s[i]) - ord('a')] = max(dp[ord(s[i]) - ord('a')], length)

        return sum(dp)
