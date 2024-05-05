class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        int count = 1;
        for (int i = 1; i <= n; i++) {
            count += choose(9, i) * (9 - i) * factorial(i - 1);
        }
        return count;
    }

    private int choose(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return choose(n - 1, k - 1) + choose(n - 1, k);
    }
}
