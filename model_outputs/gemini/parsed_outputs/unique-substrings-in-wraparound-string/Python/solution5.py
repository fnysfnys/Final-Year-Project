class Solution:
    def findSubstringInWraproundString(self, s: str) -> int:
        count = collections.Counter()
        max_len = 1
        left = 0
        for right in range(1, len(s)):
            if (ord(s[right]) - ord(s[right - 1]) + 26) % 26 == 1:
                max_len += 1
            else:
                max_len = 1
            for i in range(max_len):
                count[s[right - i]] += max_len - i
            left = right - max_len + 1
        return sum(count.values())
