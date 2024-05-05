def getMaxRepetitions8(s1, n1, s2, n2):
    matchCount = 0
    indexS2 = 0
    for i in range(len(s1) * n1):
        if s1[i % len(s1)] == s2[indexS2]:
            indexS2 += 1
            if indexS2 == len(s2):
                matchCount += 1
                indexS2 = 0
    return matchCount // n2
