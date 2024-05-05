public int maxEnvelopes(int[][] envelopes) {
  int n = envelopes.length;
  Arrays.sort(envelopes, (a, b) -> a[0] == b[0] ? Integer.compare(b[1], a[1]) : Integer.compare(a[0], b[0]));
  int[] dp = new int[n];
  int maxEnvelope = 0;
  for (int i = 0; i < n; i++) {
    dp[i] = 1;
    for (int j = 0; j < i; j++) {
      if (envelopes[i][0] > envelopes[j][0] && envelopes[i][1] > envelopes[j][1]) {
        dp[i] = Math.max(dp[i], dp[j] + 1);
      }
    }
    maxEnvelope = Math.max(maxEnvelope, dp[i]);
  }
  return maxEnvelope;
}
