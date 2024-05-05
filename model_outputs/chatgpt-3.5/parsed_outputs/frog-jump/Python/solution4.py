from collections import deque

class Solution(object):
    def canCross(self, stones):
        stone_set = set(stones)
        visited = set()
        queue = deque([(0, 0)])
        
        while queue:
            pos, jump = queue.popleft()
            if pos == stones[-1]:
                return True
            for next_jump in (jump - 1, jump, jump + 1):
                if next_jump > 0 and pos + next_jump in stone_set and (pos + next_jump, next_jump) not in visited:
                    visited.add((pos + next_jump, next_jump))
                    queue.append((pos + next_jump, next_jump))
        
        return False