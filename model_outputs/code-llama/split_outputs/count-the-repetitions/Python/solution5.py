from itertools import groupby

def getMaxRepetitions(s1, n1, s2, n2):
   return len(list(groupby(s1, s2)))
