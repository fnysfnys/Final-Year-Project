def coinChange(coins, amount):
    stack = [(0, amount, [])]
    seen = set()
    while stack:
        count, remaining, path = stack.pop()
        if remaining == 0:
            return count
        if remaining in seen:
            continue
        seen.add(remaining)
        for coin in coins:
            if coin <= remaining:
                stack.append((count + 1, remaining - coin, path + [coin]))
    return -1
