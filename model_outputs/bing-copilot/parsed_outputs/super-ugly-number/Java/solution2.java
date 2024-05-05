class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] ugly = new int[n];
        ugly[0] = 1;
        int[] index = new int[primes.length];

        for (int i = 1; i < n; i++) {
            int nextUgly = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                nextUgly = Math.min(nextUgly, primes[j] * ugly[index[j]]);
            }
            ugly[i] = nextUgly;

            for (int j = 0; j < primes.length; j++) {
                if (primes[j] * ugly[index[j]] == nextUgly) {
                    index[j]++;
                }
            }
        }

        return ugly[n - 1];
    }
}
