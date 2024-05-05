public int nthSuperUglyNumber(int n, int[] primes) {
    int[] ugly = new int[n];
    int[] pointers = new int[primes.length];
    Arrays.fill(pointers, 0);
    ugly[0] = 1;
    for (int i = 1; i < n; i++) {
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < primes.length; j++) {
            min = Math.min(min, primes[j] * ugly[pointers[j]]);
        }
        ugly[i] = min;
        for (int j = 0; j < primes.length; j++) {
            if (primes[j] * ugly[pointers[j]] == min) {
                pointers[j]++;
            }
        }
    }
    return ugly[n - 1];
}
