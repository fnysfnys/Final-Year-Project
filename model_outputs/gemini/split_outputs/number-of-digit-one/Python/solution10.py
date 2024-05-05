def countDigitOne(n):
  dp = {0: 0, 1: 1}
  for i in range(2, 10):
    prev_count = i // 10 * dp[i // 10] + (i % 10 == 1)
    if i % 10 > 1:
      prev_count += i // 10 + 1
    dp[i] = prev_count
  return sum(dp[d] * 10**pow for d, pow in enumerate(str(n)[::-1]))
