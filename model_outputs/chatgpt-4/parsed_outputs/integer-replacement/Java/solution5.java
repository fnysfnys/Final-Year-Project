class Solution {
    public int integerReplacement(int n) {
        return integerReplacementHelper(n, 0);
    }

    private int integerReplacementHelper(int n, int count) {
        if (n == 1) {
            return count;
        }
        if (n % 2 == 0) {
            return integerReplacementHelper(n / 2, count + 1);
        }
        return Math.min(integerReplacementHelper(n - 1, count + 1),
                        integerReplacementHelper(n + 1, count + 1));
    }
}