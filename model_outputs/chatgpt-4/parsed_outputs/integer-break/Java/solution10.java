class Solution {
    public int integerBreak(int n) {
        if (n == 2) return 1;
        if (n == 3) return 2;
        return calculateMaxProduct(n);
    }

    private int calculateMaxProduct(int n) {
        if (n <= 4) return n;
        return 3 * calculateMaxProduct(n - 3);
    }
}