from itertools import permutations

class Solution(object):
    def getMaxRepetitions(self, s1, n1, s2, n2):
       return len(list(permutations(s1, s2)))
    
