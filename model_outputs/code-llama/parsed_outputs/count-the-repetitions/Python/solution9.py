from itertools import product

class Solution(object):
    def getMaxRepetitions(self, s1, n1, s2, n2):
       return len(list(product(s1, s2)))
    
