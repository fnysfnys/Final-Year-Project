import java.util.*;

class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        TreeSet<Long> set = new TreeSet<>();
        set.add(1L);

        for (int i = 1; i < n; i++) {
            long curr = set.pollFirst();
            for (int prime : primes) {
                set.add(curr * prime);
            }
        }

        return set.pollFirst().intValue();
    }
}
