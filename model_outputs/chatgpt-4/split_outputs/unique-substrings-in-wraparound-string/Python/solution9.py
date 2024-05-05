class Solution(object):
    def findSubstringInWraproundString(self, s):
        # Docstring...

        left = 0
        unique_substrings = set()
        for right in range(len(s)):
            while right > left and (ord(s[right]) - ord(s[right-1])) % 26 != 1:
                left += 1
            for i in range(left, right+1):
                unique_substrings.add(s[i:right+1])

        return len(unique_substrings)
