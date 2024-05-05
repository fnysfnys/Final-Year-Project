from itertools import compress

class Solution(object):
    def getMaxRepetitions(self, s1, n1, s2, n2):
       return len(list(compress(s1, s2)))
    
