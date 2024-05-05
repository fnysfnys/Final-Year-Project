import re

class Solution(object):
    def findSubstringInWraproundString(self, s):
        substrings = set()
        for i in range(len(s)):
            substrings |= set(re.findall(rf'(?=({s[i]}[a-z]*))', s))
        return len(substrings)
