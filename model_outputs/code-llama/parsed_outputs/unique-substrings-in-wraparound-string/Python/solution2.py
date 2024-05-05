class Solution(object):
    def findSubstringInWraproundString(self, s):
       substrings = []
       for i in range(len(s)):
           substring = s[i:]
           while substring in substrings:
               substring = substring[1:]
           substrings.append(substring)
       return len(substrings)
    
