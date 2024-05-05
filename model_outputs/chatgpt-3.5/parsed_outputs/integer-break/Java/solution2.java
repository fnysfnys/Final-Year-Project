class Solution {
    public int integerBreak(int n) {
        if (n == 2) return 1;
        int maxProduct = 0;
        for (int i = 1; i < n; i++) {
            maxProduct = Math.max(maxProduct, Math.max(i * (n - i), i * integerBreak(n - i)));
        }
        return maxProduct;
    }
}
