def findSubstringInWraproundString(s):
   substrings = set()
   indices = []
   for i in range(len(s)):
       substring = s[i:]
       while substring in substrings:
           substring = substring[1:]
       substrings.add(substring)
       indices.append(i)
   return len(substrings), indices
