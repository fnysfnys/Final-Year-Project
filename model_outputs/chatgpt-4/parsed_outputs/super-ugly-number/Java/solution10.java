import java.util.BitSet;

class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        BitSet bitSet = new BitSet();
        int[] ugly = new int[n];
        ugly[0] = 1;
        for (int i = 1, min; i < n; i++) {
            min = Integer.MAX_VALUE;
            for (int prime : primes) {
                int candidate = prime * ugly[bitSet.nextClearBit(prime)];
                min = Math.min(min, candidate);
            }
            for (int prime : primes) {
                if (prime * ugly[bitSet.nextClearBit(prime)] == min) {
                    bitSet.set(bitSet.nextClearBit(prime));
                }
            }
            ugly[i] = min;
        }
        return ugly[n - 1];
    }
}
