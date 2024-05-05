def canCross(self, stones):
    for i in range(1, len(stones)):
        reached = False
        for j in range(i):
            if stones[j] + j - 1 <= stones[i] < stones[j] + j + 1:
                reached = True
                break
        if not reached:
            return False
    return True
