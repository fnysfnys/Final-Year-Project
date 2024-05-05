from collections import defaultdict

class Solution(object):
    def getMaxRepetitions(self, s1, n1, s2, n2):
        def build_lps(s):
            lps = [0] * len(s)
            i, j = 1, 0
            while i < len(s):
                if s[i] == s[j]:
                    lps[i] = j + 1
                    i, j = i + 1, j + 1
                else:
                    if j > 0:
                        j = lps[j - 1]
                    else:
                        i += 1
            return lps

        lps = build_lps(s2 + s2)
        i, count1, count2 = 0, 0, 0
        while count2 < n2 * len(s2):
            if s1[i % len(s1)] == s2[(i + lps[i]) % len(s2)]:
                i = (i + 1) % len(s1)
                count2 += 1
                if i == 0:
                    count1 += n1
            else:
                if lps[i]:
                    i = (i - lps[i]) % len(s1)
                else:
                    i += 1
        return count2 // len(s2)
