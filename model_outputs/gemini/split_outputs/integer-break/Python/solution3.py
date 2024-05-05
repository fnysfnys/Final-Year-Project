def integerBreak(self, n, memo={}):
  if n in memo:
    return memo[n]
  if n <= 2:
    return 1
  if n == 3:
    return 2
  max_product = 0
  for i in range(1, n // 2 + 1):
    max_product = max(max_product, max(i * integerBreak(n - i, memo), i * (n - i)))
  memo[n] = max_product
  return max_product
