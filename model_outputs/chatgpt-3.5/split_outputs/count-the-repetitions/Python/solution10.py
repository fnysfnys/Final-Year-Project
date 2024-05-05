from collections import Counter

class Solution(object):
    def getMaxRepetitions(self, s1, n1, s2, n2):
        counter1, counter2 = Counter(s1), Counter(s2)
        if not all(counter2[c] <= counter1[c] for c in counter2):
            return 0
        return (n1 * len(s1)) // (n2 * len(s2))
