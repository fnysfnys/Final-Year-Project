from itertools import compress

def getMaxRepetitions(s1, n1, s2, n2):
   return len(list(compress(s1, s2)))
