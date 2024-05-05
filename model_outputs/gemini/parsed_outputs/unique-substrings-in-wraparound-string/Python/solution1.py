class Solution:
    def findSubstringInWraproundString(self, s: str) -> int:
        dp = [0] * 26
        count = 1
        for i in range(1, len(s)):
            if (ord(s[i]) - ord(s[i - 1]) + 26) % 26 == 1:
                count += 1
            else:
                count = 1
            dp[ord(s[i]) - ord('a')] = max(dp[ord(s[i]) - ord('a')], count)
        return sum(dp)
