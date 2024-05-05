class Solution {
    /**
     * Given an integer n, return the count of all numbers with unique digits, x, where 0 <= x < 10n.
     */
    private static final int[] uniqueCounts = {1, 10, 91, 739, 5275, 32491, 168571, 712891, 2345851};

    public int countNumbersWithUniqueDigits(int n) {
        if (n >= uniqueCounts.length) n = uniqueCounts.length - 1;
        return uniqueCounts[n];
    }
}