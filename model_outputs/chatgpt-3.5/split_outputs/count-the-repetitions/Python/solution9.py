class Solution(object):
    def getMaxRepetitions(self, s1, n1, s2, n2):
        s1 = s1 * n1
        s2 = s2 * n2
        count = sum(1 for _ in range(len(s1)) if s1.startswith(s2, _))
        return count // n2
