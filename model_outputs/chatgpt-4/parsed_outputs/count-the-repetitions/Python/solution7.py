class Solution(object):
    def getMaxRepetitions(self, s1, n1, s2, n2):
        totalLenS1 = len(s1) * n1
        indexS1, indexS2, matchCount = 0, 0, 0
        while indexS1 < totalLenS1:
            if s1[indexS1 % len(s1)] == s2[indexS2]:
                indexS2 += 1
                if indexS2 == len(s2):
                    indexS2 = 0
                    matchCount += 1
            indexS1 += 1
        return matchCount // n2
    
