class Solution(object):
    def getMaxRepetitions(self, s1, n1, s2, n2):
        cache = {}
        countS2, index, i = 0, 0, 0
        while i < n1:
            if index in cache:
                i0, countS20 = cache[index]
                cycleLen = i - i0
                cycleCount = countS2 - countS20
                remainingCycles = (n1 - i) // cycleLen
                countS2 += cycleCount * remainingCycles
                i += cycleLen * remainingCycles
            cache[index] = (i, countS2)
            if i < n1:
                for char in s1:
                    if char == s2[index]:
                        index = (index + 1) % len(s2)
                        if index == 0:
                            countS2 += 1
                i += 1
        return countS2 // n2
    
