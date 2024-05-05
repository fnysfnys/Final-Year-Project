from itertools import groupby

class Solution(object):
    def getMaxRepetitions(self, s1, n1, s2, n2):
       return len(list(groupby(s1, s2)))
    
