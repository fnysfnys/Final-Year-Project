class Solution {
    /**
     * Given an integer n, return the count of all numbers with unique digits, x, where 0 <= x < 10n.
     */
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        if (n == 1) return 10;
        
        int total = 10, uniqueDigits = 9;
        for (int i = 2; i <= n; i++) {
            uniqueDigits *= (11 - i);
            total += uniqueDigits;
        }
        return total;
    }
}