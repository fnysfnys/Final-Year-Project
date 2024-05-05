import java.util.TreeMap;

class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        TreeMap<Long, Integer> map = new TreeMap<>();
        map.put(1L, 1);
        long ugly = 1;
        for (int i = 1; i < n; i++) {
            ugly = map.firstKey();
            map.remove(ugly);
            for (int prime : primes) {
                long next = ugly * prime;
                map.put(next, map.getOrDefault(next, 0) + 1);
            }
        }
        return (int) ugly;
    }
}
