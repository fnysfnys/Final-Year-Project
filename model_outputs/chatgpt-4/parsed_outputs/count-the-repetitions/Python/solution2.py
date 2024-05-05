class Solution(object):
    def getMaxRepetitions(self, s1, n1, s2, n2):
        index, countS2, i = 0, 0, 0
        while i < n1:
            for char in s1:
                if char == s2[index]:
                    index += 1
                    if index == len(s2):
                        index, countS2 = 0, countS2 + 1
            i += 1
        return countS2 // n2
    
