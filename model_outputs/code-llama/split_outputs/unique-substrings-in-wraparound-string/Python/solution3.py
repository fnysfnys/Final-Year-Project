def findSubstringInWraproundString(s):
   substrings = {}
   for i in range(len(s)):
       substring = s[i:]
       while substring in substrings:
           substring = substring[1:]
       substrings[substring] = True
   return len(substrings)
