class Solution(object):
    def getMaxRepetitions(self, s1, n1, s2, n2):
        count1, count2, i, j = 0, 0, 0, 0
        
        while True:
            if s1[i] == s2[j]:
                j += 1
                if j == len(s2):
                    j = 0
                    count2 += 1
            i += 1
            if i == len(s1):
                i = 0
                count1 += 1
            
            if count1 == n1:
                break
        
        return count2 // n2
