class Solution(object):
    def findSubstringInWraproundString(self, s):
       substrings = []
       indices = {}
       for i in range(len(s)):
           substring = s[i:]
           while substring in substrings:
               substring = substring[1:]
           substrings.append(substring)
           indices[substring] = i
       return len(substrings), indices
    
