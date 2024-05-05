from heapq import heappush, heappop

def nthSuperUglyNumber(n, primes):
  heap = [(1, 0, 0)]
  seen = set()
  for _ in range(n):
    val, i, p = heappop(heap)
    if val not in seen:
      seen.add(val)
      for j, prime in enumerate(primes):
        heappush(heap, (val * prime, i + 1, j))
  return val
