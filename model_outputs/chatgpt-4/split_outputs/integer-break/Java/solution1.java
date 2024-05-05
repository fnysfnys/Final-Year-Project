class Solution {
    public int integerBreak(int n) {
        if (n == 2) return 1;
        if (n == 3) return 2;
        int maxProduct = 0;
        for (int i = 1; i < n; i++) {
            maxProduct = Math.max(maxProduct, i * integerBreak(n - i));
        }
        return maxProduct;
    }
}
