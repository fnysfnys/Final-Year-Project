class Solution {
    public int integerBreak(int n) {
        if (n <= 3) return n - 1;
        return breakInteger(n);
    }

    private int breakInteger(int n) {
        if (n <= 4) return n;
        return 3 * breakInteger(n - 3);
    }
}