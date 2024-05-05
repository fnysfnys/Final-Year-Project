class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] ugly = new int[n];
        ugly[0] = 1;
        int[] next = new int[primes.length];

        for (int i = 1; i < n; i++) {
            int nextUgly = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                nextUgly = Math.min(nextUgly, primes[j] * ugly[next[j]]);
            }
            ugly[i] = nextUgly;

            for (int j = 0; j < primes.length; j++) {
                if (primes[j] * ugly[next[j]] == nextUgly) {
                    next[j]++;
                }
            }
        }

        return ugly[n - 1];
    }
}
