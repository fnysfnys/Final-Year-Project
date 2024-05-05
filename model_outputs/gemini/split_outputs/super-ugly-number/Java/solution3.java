public int nthSuperUglyNumber(int n, int[] primes) {
    boolean[] sieve = new boolean[100001]; // Sieve for marking super ugly numbers
    int count = 0;

    for (int num = 1; count < n; num++) {
        int divisor = num;
        for (int prime : primes) {
            while (divisor % prime == 0) {
                divisor /= prime;
                if (!sieve[divisor]) {
                    count++;
                    sieve[divisor] = true;
                }
            }
        }
    }

    return num - 1; // Last number explored during sieve creation
}
