class Solution(object):
    def getMaxRepetitions(self, s1, n1, s2, n2):
        count1, count2, j = 0, 0, 0
        while count1 < n1:
            for i in range(len(s1)):
                if s1[i] == s2[j]:
                    j += 1
                    if j == len(s2):
                        j, count2 = 0, count2 + 1
            count1 += 1
        return count2 // n2
    
