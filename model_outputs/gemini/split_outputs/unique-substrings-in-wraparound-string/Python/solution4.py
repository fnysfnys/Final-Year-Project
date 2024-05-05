class Solution:
    def findSubstringInWraproundString(self, s: str) -> int:
        def countSubstrs(start, end):
            if start >= end:
                return 0
            max_len = 1
            for i in range(start, end):
                if (ord(s[i]) - ord(s[i + 1]) + 26) % 26 == 1:
                    max_len += 1
                else:
                    break
            return max_len + countSubstrs(start + max_len, end) + countSubstrs(start + 1, end)
        return countSubstrs(0, len(s))
