function nthSuperUglyNumber(n, primes) {
  const dp = [];
  dp[0] = 1;
  let i = 1, j = 0, k = 0;
  while (i < n) {
    const nextUgly = Math.min(dp[j] * primes[0], dp[k] * primes[1], ...dp.slice(j, k + 1).map(x => x * primes[primes.length - 1]));
    if (nextUgly === dp[j] * primes[0]) j++;
    if (nextUgly === dp[k] * primes[1]) k++;
    dp[i] = nextUgly;
    i++;
  }
  return dp[n - 1];
}
