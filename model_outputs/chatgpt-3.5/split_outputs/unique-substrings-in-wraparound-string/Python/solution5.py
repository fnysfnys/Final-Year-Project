class Solution(object):
    def findSubstringInWraproundString(self, s):
        base = "abcdefghijklmnopqrstuvwxyz"
        substrings = set()
        for i in range(len(s)):
            for j in range(i, len(s)):
                if base[j % 26] not in s[i:j+1]:
                    break
                substrings.add(s[i:j+1])
        return len(substrings)
