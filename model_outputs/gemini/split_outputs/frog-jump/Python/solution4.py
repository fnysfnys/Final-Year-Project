from collections import deque

def canCross(self, stones):
    n = len(stones)
    queue = deque([(0, 1)])
    visited = set()
    while queue:
        i, lastJump = queue.popleft()
        if i == n - 1:
            return True
        if (i, lastJump) in visited:
            continue
        visited.add((i, lastJump))
        for newJump in range(lastJump - 1, lastJump + 2):
            if 0 <= i + newJump < n and stones[i + newJump] > stones[i]:
                queue.append((i + newJump, newJump))
    return False
