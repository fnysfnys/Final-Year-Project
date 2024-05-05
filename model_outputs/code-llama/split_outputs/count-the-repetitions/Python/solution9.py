from itertools import product

def getMaxRepetitions(s1, n1, s2, n2):
   return len(list(product(s1, s2)))
