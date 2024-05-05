class Solution {
    public int integerReplacement(int n) {
        if (n == 1) {
            return 0;
        }
        if ((n & (n - 1)) == 0) { // Check if n is a power of 2
            return Integer.bitCount(n) - 1;
        }
        if (n % 2 == 0) {
            return 1 + integerReplacement(n / 2);
        }
        return 1 + Math.min(integerReplacement(n - 1), integerReplacement(n + 1));
    }
}
