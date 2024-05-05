from itertools import accumulate

def getMaxRepetitions(s1, n1, s2, n2):
   return len(list(accumulate(s1, s2)))
