class Solution {
    public int integerReplacement(int n) {
        return helper(n, 0);
    }
    
    private int helper(long n, int count) {
        if (n == 1) return count;
        if (n % 2 == 0) {
            return helper(n / 2, count + 1);
        } else {
            return Math.min(helper(n + 1, count + 1), helper(n - 1, count + 1));
        }
    }
}
