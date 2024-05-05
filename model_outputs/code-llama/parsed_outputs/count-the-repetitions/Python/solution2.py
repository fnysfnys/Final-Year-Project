class Solution(object):
    def getMaxRepetitions(self, s1, n1, s2, n2):
       return len([i for i in range(n1) if s1[i] == s2[i]])
    
