from heapq import heappush, heappop
def coinChange(coins, amount):
    pq = [(0, amount)]
    seen = set()
    while pq:
        count, remaining = heappop(pq)
        if remaining == 0:
            return count
        if remaining in seen:
            continue
        seen.add(remaining)
        for coin in coins:
            if coin <= remaining:
                heappush(pq, (count + 1, remaining - coin))
    return -1
