class Solution(object):
    def findSubstringInWraproundString(self, s):
        # Docstring...

        from collections import Counter
        counts = Counter()

        max_length = 0
        for i in range(len(s)):
            if i > 0 and (ord(s[i]) - ord(s[i-1])) % 26 == 1:
                max_length += 1
            else:
                max_length = 1
            counts[s[i]] = max(counts[s[i]], max_length)

        return sum(counts.values())
