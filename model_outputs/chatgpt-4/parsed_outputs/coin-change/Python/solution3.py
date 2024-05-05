from collections import deque

class Solution(object):
    def coinChange(self, coins, amount):
        """
        [Docstring same as provided]
        """
        if amount == 0:
            return 0
        queue = deque([(0, 0)])
        visited = set()

        while queue:
            total, steps = queue.popleft()
            if total == amount:
                return steps
            for coin in coins:
                next_total = total + coin
                if next_total <= amount and next_total not in visited:
                    visited.add(next_total)
                    queue.append((next_total, steps + 1))

        return -1