class Solution(object):
    def findSubstringInWraproundString(self, s):
        # Docstring...

        def is_consecutive(c1, c2):
            return (ord(c2) - ord(c1)) % 26 == 1

        unique_substrings = set()
        for i in range(len(s)):
            for j in range(i+1, len(s)+1):
                if all(is_consecutive(s[k], s[k+1]) for k in range(i, j-1)):
                    unique_substrings.add(s[i:j])
        return len(unique_substrings)