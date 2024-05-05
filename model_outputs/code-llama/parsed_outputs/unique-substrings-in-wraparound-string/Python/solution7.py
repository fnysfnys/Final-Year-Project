class Solution(object):
    def findSubstringInWraproundString(self, s):
       substrings = set()
       indices = {}
       for i in range(len(s)):
           substring = s[i:]
           while substring in substrings:
               substring = substring[1:]
           substrings.add(substring)
           indices[substring] = i
       return len(substrings), indices
    
