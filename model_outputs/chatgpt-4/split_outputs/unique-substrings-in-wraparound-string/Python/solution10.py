class Solution(object):
    def findSubstringInWraproundString(self, s):
        # Docstring...

        unique_substrings = set()
        i = 0
        while i < len(s):
            j = i
            while j + 1 < len(s) and (ord(s[j+1]) - ord(s[j])) % 26 == 1:
                j += 1
            for k in range(i, j+1):
                unique_substrings.add(s[i:k+1])
            i = j + 1

        return len(unique_substrings)
