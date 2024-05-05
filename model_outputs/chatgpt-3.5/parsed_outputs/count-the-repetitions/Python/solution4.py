class Solution(object):
    def getMaxRepetitions(self, s1, n1, s2, n2):
        repeats = {}
        count1, count2, i, j = 0, 0, 0, 0
        
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
            
            if j in repeats:
                prev_count1, prev_count2 = repeats[j]
                cycle_count1 = count1 - prev_count1
                cycle_count2 = count2 - prev_count2
                remaining_cycles = (n1 - prev_count1) // cycle_count1
                count1 += remaining_cycles * cycle_count1
                count2 += remaining_cycles * cycle_count2
            
            repeats[j] = (count1, count2)
        
        return count2 // n2