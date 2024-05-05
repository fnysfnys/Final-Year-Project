class Solution(object):
    def getMaxRepetitions(self, s1, n1, s2, n2):
        longS1 = s1 * n1
        matchCount = 0
        j = 0
        for char in longS1:
            if char == s2[j]:
                j += 1
                if j == len(s2):
                    matchCount += 1
                    j = 0
        return matchCount // n2
