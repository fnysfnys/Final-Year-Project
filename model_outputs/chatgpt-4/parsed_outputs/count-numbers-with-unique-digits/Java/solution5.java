class Solution {
    /**
     * Given an integer n, return the count of all numbers with unique digits, x, where 0 <= x < 10n.
     */
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        if (n > 10) n = 10; // There are no more unique digits after 10 digits

        int count = 1; // start with x = 0
        for (int i = 1; i <= n; i++) {
            count += 9 * A(9, i - 1);
        }
        return count;
    }

    private int A(int m, int n) {
        int ans = 1;
        for (int i = 0; i < n; i++) {
            ans *= m - i;
        }
        return ans;
    }
}
