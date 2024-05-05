from collections import deque

class Solution(object):
    def coinChange(self, coins, amount):
        queue = deque([(amount, 0)])
        visited = set()
        while queue:
            remaining, steps = queue.popleft()
            if remaining == 0:
                return steps
            for coin in coins:
                next_remaining = remaining - coin
                if next_remaining >= 0 and next_remaining not in visited:
                    queue.append((next_remaining, steps + 1))
                    visited.add(next_remaining)
        return -1
