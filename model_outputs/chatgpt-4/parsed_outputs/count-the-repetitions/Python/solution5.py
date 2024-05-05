class Solution(object):
    def getMaxRepetitions(self, s1, n1, s2, n2, index=0, countS2=0, i=0):
        if i == n1:
            return countS2 // n2
        for char in s1:
            if char == s2[index]:
                index += 1
                if index == len(s2):
                    index = 0
                    countS2 += 1
        return self.getMaxRepetitions(s1, n1, s2, n2, index, countS2, i + 1)
    
