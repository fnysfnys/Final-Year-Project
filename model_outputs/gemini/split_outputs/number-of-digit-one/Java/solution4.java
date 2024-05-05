public int countDigitOne(int n) {
  int[] dp = new int[n + 1];
  dp[0] = 0;
  for (int i = 1; i <= n; i++) {
    int firstDigit = i / 10;
    int lastDigit = i % 10;
    dp[i] = dp[firstDigit] * 10 + (lastDigit == 0 ? 0 : (lastDigit == 1 ? firstDigit + 1 : firstDigit * 10 + 10));
  }
  return dp[n];
}
