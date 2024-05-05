class Solution {
    public int nthUglyNumber(int n) {
        if (n == 1) return 1;
        TreeSet<Long> set = new TreeSet<>();
        set.add(1L);
        for (int i = 1; i < n; i++) {
            long first = set.pollFirst();
            set.add(first * 2);
            set.add(first * 3);
            set.add(first * 5);
        }
        return set.first().intValue();
    }
}
