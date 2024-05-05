public int nthSuperUglyNumber(int n, int[] primes) {
    int[] uglyNumbers = new int[n];
    uglyNumbers[0] = 1;
    HashSet<Integer> set = new HashSet<>();
    set.add(1);

    for (int i = 1; i < n; i++) {
        int minUgly = Integer.MAX_VALUE;
        for (int prime : primes) {
            long next = (long) uglyNumbers[i - 1] * prime;
            if (!set.contains((int) next) && next < minUgly) {
                minUgly = (int) next;
            }
        }
        uglyNumbers[i] = minUgly;
        set.add(minUgly);
    }

    return uglyNumbers[n - 1];
}
