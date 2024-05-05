class Solution(object):
    def findSubstringInWraproundString(self, s):
        # Docstring...

        p = set()
        k = 0
        for i in range(len(s)):
            if i > 0 and (ord(s[i]) - ord(s[i-1]) - 1) % 26 == 0:
                k += 1
            else:
                k = 1
            p.add(s[i-k+1:i+1])
        return len(p)