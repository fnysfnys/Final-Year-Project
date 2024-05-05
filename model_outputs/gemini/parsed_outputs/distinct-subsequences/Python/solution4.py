class Solution(object):
    def numDistinct(self, s, t):
        i, j, count = 0, 0, 0
        while i < len(s):
            if s[i] == t[j]:
                count += (i - j) if j else 1
                j += 1
            i += 1
        return count
    
