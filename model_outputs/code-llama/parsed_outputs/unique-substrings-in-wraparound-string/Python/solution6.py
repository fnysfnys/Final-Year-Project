class Solution(object):
    def findSubstringInWraproundString(self, s):
       substrings = {}
       indices = []
       for i in range(len(s)):
           substring = s[i:]
           while substring in substrings:
               substring = substring[1:]
           substrings[substring] = True
           indices.append(i)
       return len(substrings), indices
    
