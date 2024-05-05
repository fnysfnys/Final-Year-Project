    public int integerBreak(int n) {
        if (n == 2 || n == 3) return n - 1;
        int maxProduct = 0;
        for (int i = 1; i < n; i++) {
            maxProduct = Math.max(maxProduct, i * integerBreak(n - i));
        }
        return maxProduct;
    }
    