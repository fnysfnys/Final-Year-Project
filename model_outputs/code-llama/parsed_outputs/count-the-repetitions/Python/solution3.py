class Solution(object):
    def getMaxRepetitions(self, s1, n1, s2, n2):
       return len(list(zip(s1, s2)))
    
