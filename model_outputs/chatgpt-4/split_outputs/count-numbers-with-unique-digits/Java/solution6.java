class Solution {
    /**
     * Given an integer n, return the count of all numbers with unique digits, x, where 0 <= x < 10n.
     */
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        int count = 1; // start with x = 0
        for (int i = 1; i <= n; i++) {
            count += countUnique(i, 0, 0);
        }
        return count;
    }

    private int countUnique(int n, int index, int mask) {
        if (index == n) return 1;
        int total = 0;
        for (int i = (index == 0) ? 1 : 0; i < 10; i++) {
            if ((mask & (1 << i)) == 0) {
                total += countUnique(n, index + 1, mask | (1 << i));
            }
        }
        return total;
    }
}
