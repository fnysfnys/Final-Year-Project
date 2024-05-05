class Solution(object):
    def getMaxRepetitions(self, s1, n1, s2, n2):
        s1 = s1 * n1
        s2 = s2 * n2
        count = sum([1 for i in range(len(s1)) if s1[i:i+len(s2)] == s2])
        return count // n2