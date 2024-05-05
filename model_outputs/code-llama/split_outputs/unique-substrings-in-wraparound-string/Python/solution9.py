def findSubstringInWraproundString(s):
   substrings = {}
   indices = set()
   for i in range(len(s)):
       substring = s[i:]
       while substring in substrings:
           substring = substring[1:]
       substrings[substring] = True
       indices.add(i)
   return len(substrings), indices
