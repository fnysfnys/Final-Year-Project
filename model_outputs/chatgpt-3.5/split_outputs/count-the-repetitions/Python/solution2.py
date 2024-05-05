class Solution(object):
    def getMaxRepetitions(self, s1, n1, s2, n2):
        s1 = s1 * n1
        s2 = s2 * n2
        count = s1.count(s2)
        return count // n2
