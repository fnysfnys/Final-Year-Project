class Solution(object):
    def getMaxRepetitions(self, s1, n1, s2, n2):
        idx_map = {}
        j, count = 0, 0
        
        for _ in range(n1):
            for i in range(len(s1)):
                if s1[i] == s2[j]:
                    j += 1
                    if j == len(s2):
                        j = 0
                        count += 1
                        if i not in idx_map:
                            idx_map[i] = count
                        else:
                            prev_count = idx_map[i]
                            cycle_count = count - prev_count
                            remaining_cycles = (n1 - i - 1) // (i - prev_count + 1)
                            count += remaining_cycles * cycle_count
                            i += remaining_cycles * (i - prev_count + 1)
        
        return count // n2
