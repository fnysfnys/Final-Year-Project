class Solution(object):
    def getMaxRepetitions(self, s1, n1, s2, n2):
       m = 0
       for i in range(n1):
           if s1[i] == s2[i]:
               m += 1
       return m
    
