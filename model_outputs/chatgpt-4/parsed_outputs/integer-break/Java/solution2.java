class Solution {
    private int[] memo;
    
    public int integerBreak(int n) {
        memo = new int[n + 1];
        return breakInteger(n);
    }

    private int breakInteger(int n) {
        if (n == 2) return 1;
        if (memo[n] != 0) return memo[n];
        int maxProduct = 0;
        for (int i = 1; i < n; i++) {
            maxProduct = Math.max(maxProduct, Math.max(i * (n - i), i * breakInteger(n - i)));
        }
        memo[n] = maxProduct;
        return maxProduct;
    }
}