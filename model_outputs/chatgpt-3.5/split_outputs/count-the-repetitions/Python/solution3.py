class Solution(object):
    def getMaxRepetitions(self, s1, n1, s2, n2):
        dp = [[-1, -1] for _ in range(len(s2))]
        i, j, count1, count2 = 0, 0, 0, 0
        
        while count1 < n1:
            if s1[i] == s2[j]:
                j += 1
                if j == len(s2):
                    j = 0
                    count2 += 1
            i += 1
            if i == len(s1):
                i = 0
                count1 += 1
            
            if dp[j][0] == count1 and dp[j][1] == count2:
                break
            
            dp[j] = [count1, count2]
        
        return count2 // n2
