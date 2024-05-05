class Solution(object):
    def getMaxRepetitions(self, s1, n1, s2, n2):
        m, i, j, dp = 0, 0, 0, {}
        while (i, j) not in dp:
            dp[(i, j)] = m
            for _ in range(n1):
                i = (i + s1[j % len(s1)]) % len(s1)
                j = (j + s2[m % len(s2)]) % len(s2)
                if i == j == 0:
                    return n2 * (m // (i + j)) + dp[(0, 0)]
            m += 1
        return dp[(i, j)] * n2 + dp[(0, 0)] - m
