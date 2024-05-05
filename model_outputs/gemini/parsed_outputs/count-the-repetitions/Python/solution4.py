class Solution(object):
    def getMaxRepetitions(self, s1, n1, s2, n2):
        seen = set()
        i, j, count1, count2 = 0, 0, 0, 0
        while (i, j) not in seen:
            seen.add((i, j))
            for _ in range(n1):
                i = (i + s1[j % len(s1)]) % len(s1)
                j = (j + s2[m % len(s2)]) % len(s2)
                if i == j == 0:
                    return n2 * (m // (i + j)) + count2
            count2 += 1
        cycle_len = count2 - seen[(i, j)]
        remaining = n2 * len(s2) - count2
        return count2 + remaining // cycle_len * (count2 - seen[(i, j)])
