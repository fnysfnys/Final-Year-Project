from itertools import zip_longest

def getMaxRepetitions(s1, n1, s2, n2):
   return len(list(zip_longest(s1, s2)))
