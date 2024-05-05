from collections import deque
def coinChange(coins, amount):
    queue = deque([(0, amount)])
    seen = set()
    while queue:
        count, remaining = queue.popleft()
        if remaining == 0:
            return count
        if remaining in seen:
            continue
        seen.add(remaining)
        for coin in coins:
            if coin <= remaining:
                queue.append((count + 1, remaining - coin))
    return -1
