def nthSuperUglyNumber(n, primes):
  dp = [1] * n
  i = [0] * len(primes)
  for j in range(1, n):
    min_val = float('inf')
    for k in range(len(primes)):
      min_val = min(min_val, dp[i[k]] * primes[k])
    for k in range(len(primes)):
      if min_val == dp[i[k]] * primes[k]:
        i[k] += 1
    dp[j] = min_val
  return dp[n-1]
