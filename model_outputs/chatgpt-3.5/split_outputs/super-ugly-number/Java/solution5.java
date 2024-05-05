import java.util.TreeSet;

public int nthSuperUglyNumber(int n, int[] primes) {
    int[] uglyNumbers = new int[n];
    uglyNumbers[0] = 1;
    TreeSet<Long> set = new TreeSet<>();
    set.add(1L);

    for (int i = 1; i < n; i++) {
        long current = set.pollFirst();
        uglyNumbers[i] = (int) current;
        for (int prime : primes) {
            long next = current * prime;
            set.add(next);
        }
    }

    return uglyNumbers[n - 1];
}
