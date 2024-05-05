class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        int base = 9;
        for (int i = 2; i <= n; i++) {
            base *= (10 - i);
        }
        return 10 * base + 1 - base;
    }
}
