public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        int[] memo = new int[n + 1];
        return countHelper(n, memo);
    }

    private int countHelper(int n, int[] memo) {
        if (n == 0) {
            return 1;
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = countHelper(n - 1, memo) + (int) Math.pow(10, n) - countHelper(n - 1, memo);
        return memo[n];
    }
}
