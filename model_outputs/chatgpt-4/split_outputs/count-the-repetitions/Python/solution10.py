def getMaxRepetitions10(s1, n1, s2, n2):
    indexS2, countS2 = 0, 0
    for _ in range(n1):
        for char in s1:
            if char == s2[indexS2]:
                indexS2 += 1
                if indexS2 == len(s2):
                    indexS2 = 0
                    countS2 += 1
    return countS2 // n2
