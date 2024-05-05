def getMaxRepetitions4(s1, n1, s2, n2):
    index, countS2, repeatCount = 0, 0, {}
    for i in range(n1):
        for char in s1:
            if char == s2[index]:
                index += 1
                if index == len(s2):
                    index = 0
                    countS2 += 1
        if index in repeatCount:
            prevCountS2, prevI = repeatCount[index]
            cycleLen = i - prevI
            cycleCount = countS2 - prevCountS2
            cyclesLeft = (n1 - 1 - i) // cycleLen
            countS2 += cyclesLeft * cycleCount
            i += cyclesLeft * cycleLen
        else:
            repeatCount[index] = (countS2, i)
    return countS2 // n2
