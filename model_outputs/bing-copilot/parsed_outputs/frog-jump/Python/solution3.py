from collections import deque

class Solution(object):
    def canCross(self, stones):
        target = stones[-1]
        stone_set = set(stones)
        queue = deque([(0, 0)])  # (position, last_jump)
        visited = set()
        while queue:
            pos, jump = queue.popleft()
            if pos == target:
                return True
            for next_jump in [jump - 1, jump, jump + 1]:
                if next_jump > 0 and pos + next_jump in stone_set and (pos + next_jump, next_jump) not in visited:
                    queue.append((pos + next_jump, next_jump))
                    visited.add((pos + next_jump, next_jump))
        return False

# Example usage (same as above)
