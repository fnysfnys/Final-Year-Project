function countBits(n, memo = {}) {
  if (n in memo) return memo[n];
  if (n === 0) return 0;
  const count = countBits(n >> 1, memo) + (n & 1);
  memo[n] = count;
  return count;
}
