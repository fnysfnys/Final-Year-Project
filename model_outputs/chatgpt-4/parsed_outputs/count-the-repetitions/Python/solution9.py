class Solution(object):
    def getMaxRepetitions(self, s1, n1, s2, n2):
        state = [0] * len(s2)
        curState = 0
        for _ in range(n1):
            for char in s1:
                if char == s2[curState]:
                    curState += 1
                    if curState == len(s2):
                        curState = 0
                        state[curState] += 1
        return sum(state) // n2
    
