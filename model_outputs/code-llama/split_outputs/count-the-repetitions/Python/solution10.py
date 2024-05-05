from itertools import permutations

def getMaxRepetitions(s1, n1, s2, n2):
   return len(list(permutations(s1, s2)))
