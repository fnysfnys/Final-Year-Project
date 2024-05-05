public int maxEnvelopes(int[][] envelopes) {
    Arrays.sort(envelopes, (a, b) -> a[0] - b[0]);
    int n = envelopes.length;
    int[] dp = new int[n];
    int len = 0;

    for (int[] envelope : envelopes) {
        int idx = Arrays.binarySearch(dp, 0, len, envelope[1]);
        if (idx < 0) {
            idx = -(idx + 1);
        }
        dp[idx] = envelope[1];
        if (idx == len) {
            len++;
        }
    }

    return len;
}
