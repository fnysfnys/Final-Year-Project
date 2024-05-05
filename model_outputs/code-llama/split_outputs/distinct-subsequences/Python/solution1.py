def numDistinct(s, t):
   count = 0
   for i in range(len(s)):
       for j in range(i, len(s)):
           if s[i:j+1] == t:
               count += 1
   return count
