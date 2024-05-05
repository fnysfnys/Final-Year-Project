from itertools import chain

def getMaxRepetitions(s1, n1, s2, n2):
   return len(list(chain(s1, s2)))
