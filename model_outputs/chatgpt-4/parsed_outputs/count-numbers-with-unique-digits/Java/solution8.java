class Solution {
    /**
     * Given an integer n, return the count of all numbers with unique digits, x, where 0 <= x < 10n.
     */
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        return countUnique("", n);
    }

    private int countUnique(String current, int n) {
        if (current.length() == n) return 1;
        int count = 1; // counting the current number
        for (int i = (current.length() == 0) ? 1 : 0; i < 10; i++) {
            if (!current.contains(String.valueOf(i))) {
                count += countUnique(current + i, n);
            }
        }
        return count;
    }
}