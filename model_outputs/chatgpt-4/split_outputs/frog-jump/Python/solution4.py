def canCross(stones):
    stack = [(0, 1)]  # position, next jump
    stoneSet = set(stones)
    while stack:
        position, jump = stack.pop()
        if position == stones[-1]:
            return True
        for nextJump in range(jump-1, jump+2):
            if nextJump > 0 and position+nextJump in stoneSet:
                stack.append((position+nextJump, nextJump))
    return False
