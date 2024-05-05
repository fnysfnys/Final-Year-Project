from collections import deque

def nthSuperUglyNumber(n, primes):
  seen = set([1])
  q = deque([(1, 0)])
  for _ in range(n):
    num, i = q.popleft()
    for p in primes:
      new_num = num * p
      if new_num not in seen:
        q.append((new_num, i + 1))
        seen.add(new_num)
  return num
