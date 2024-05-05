class Solution(object):
    def getMaxRepetitions(self, s1, n1, s2, n2):
        set1, set2 = set(s1), set(s2)
        if not set2.issubset(set1):
            return 0
        return (n1 * len(s1)) // (n2 * len(s2))
