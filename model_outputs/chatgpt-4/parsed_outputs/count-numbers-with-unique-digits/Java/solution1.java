class Solution {
    /**
     * Given an integer n, return the count of all numbers with unique digits, x, where 0 <= x < 10n.
     */
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        return countUniqueDigits(0, n, new boolean[10]);
    }

    private int countUniqueDigits(int current, int n, boolean[] used) {
        if (current == n) return 1;
        
        int count = 1; // counting the current number
        for (int i = (current == 0) ? 1 : 0; i < 10; i++) {
            if (!used[i]) {
                used[i] = true;
                count += countUniqueDigits(current + 1, n, used);
                used[i] = false;
            }
        }
        return count;
    }
}