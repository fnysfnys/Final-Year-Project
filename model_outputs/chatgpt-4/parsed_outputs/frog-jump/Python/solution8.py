class Solution(object):
    def canCross(self, stones):
        from collections import deque
        queue = deque([(0, 1)])  # position, jump
        visited = set()
        while queue:
            position, jump = queue.popleft()
            if (position, jump) in visited:
                continue
            visited.add((position, jump))
            if position == stones[-1]:
                return True
            for nextJump in range(jump-1, jump+2):
                if nextJump > 0 and position+nextJump in stones:
                    queue.append((position+nextJump, nextJump))
        return False
    
