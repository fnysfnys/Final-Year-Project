function nthSuperUglyNumber(n, primes) {
  const dp = [1];
  const pointers = primes.map(() => 0);
  for (let i = 1; i < n; i++) {
    const nextUgly = Math.min(...primes.map((prime, j) => prime * dp[pointers[j]]));
    for (let j = 0; j < primes.length; j++) {
      if (nextUgly === primes[j] * dp[pointers[j]]) {
        pointers[j]++;
      }
    }
    dp.push(nextUgly);
  }
  return dp[n - 1];
}
