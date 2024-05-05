class Solution {
    public int integerBreak(int n) {
        if (n < 2) return 0;
        if (n <= 3) return n - 1;
        int k = n / 3;
        if (n % 3 == 0) {
            return (int) Math.pow(3, k);
        } else if (n % 3 == 1) {
            return (int) Math.pow(3, k - 1) * 4;
        } else {
            return (int) Math.pow(3, k) * 2;
        }
    }
}
