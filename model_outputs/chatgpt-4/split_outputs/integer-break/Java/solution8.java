class Solution {
    public int integerBreak(int n) {
        if (n <= 3) return n - 1;
        int product = 1;
        while (n > 0) {
            int add = n >= 3 ? 3 : n;
            product *= add;
            n -= add;
            if (n <= 1) break;
        }
        return product;
    }
}
