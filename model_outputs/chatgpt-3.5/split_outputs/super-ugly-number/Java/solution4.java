public int nthSuperUglyNumber(int n, int[] primes) {
    int[] uglyNumbers = new int[n];
    uglyNumbers[0] = 1;
    int[] indices = new int[primes.length];

    for (int i = 1; i < n; i++) {
        uglyNumbers[i] = Integer.MAX_VALUE;
        for (int j = 0; j < primes.length; j++) {
            uglyNumbers[i] = Math.min(uglyNumbers[i], primes[j] * uglyNumbers[indices[j]]);
        }
        for (int j = 0; j < primes.length; j++) {
            if (uglyNumbers[i] == primes[j] * uglyNumbers[indices[j]]) {
                indices[j]++;
            }
        }
    }

    return uglyNumbers[n - 1];
}
