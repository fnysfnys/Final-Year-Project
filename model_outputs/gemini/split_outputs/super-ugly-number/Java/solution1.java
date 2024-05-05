public int nthSuperUglyNumber(int n, int[] primes) {
    int[] dp = new int[n + 1];
    int[] heap = new int[n + 1]; // Min-heap of next multiples
    int[] idx = new int[primes.length]; // Pointers to next multiples

    dp[1] = heap[1] = 1;
    for (int i = 2; i <= n; i++) {
        int min = heap[1];
        for (int j = 0; j < primes.length; j++) {
            while (idx[j] > 0 && dp[idx[j]] * primes[j] <= min) {
                idx[j]++;
            }
            heap[i] = Math.min(heap[i], dp[idx[j]] * primes[j]);
        }
        dp[i] = heap[i];
    }

    return dp[n];
}
