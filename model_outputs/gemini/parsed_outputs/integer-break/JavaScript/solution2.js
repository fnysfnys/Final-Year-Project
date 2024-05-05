const memo = {};
function integerBreak(n, memo = {}) {
  if (n in memo) return memo[n];
  if (n < 2) return 1;
  let maxProduct = 0;
  for (let i = 1; i < n; i++) {
    maxProduct = Math.max(maxProduct, Math.max(i, n - i) * integerBreak(n - i, memo), i * integerBreak(i, memo));
  }
  memo[n] = maxProduct;
  return maxProduct;
}
