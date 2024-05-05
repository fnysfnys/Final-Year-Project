def countBits_kernighan(n):
  ans = [0] * (n + 1)
  for i in range(n + 1):
    count = 0
    while i > 0:
      i &= i - 1
      count += 1
    ans[i] = count
  return ans
