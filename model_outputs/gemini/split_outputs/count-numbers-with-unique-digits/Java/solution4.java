class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        int total = 9;
        for (int i = 2; i <= n; i++) {
            total *= (9 - i + 1) * factorial(i - 1);
        }
        return total;
    }

    private int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
