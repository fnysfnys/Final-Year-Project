class Solution(object):
    def getMaxRepetitions(self, s1, n1, s2, n2):
        i, j, count1, count2 = 0, 0, 0, 0
        while count2 < n2 * len(s2):
            i = (i + s1[j % len(s1)]) % len(s1)
            j = (j + s2[count2 % len(s2)]) % len(s2)
            if i == j == 0:
                count1 += n1
                count2 += n2 * (count1 // (i + j))
            count2 += 1
        return count2 // len(s2)
