class Solution {
    /**
     * Given an integer n, return the count of all numbers with unique digits, x, where 0 <= x < 10n.
     */
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        return backtrack(n, 0, new boolean[10]);
    }

    private int backtrack(int n, int index, boolean[] used) {
        if (index == n) return 1;
        int count = 1;
        for (int i = (index == 0) ? 1 : 0; i < 10; i++) {
            if (!used[i]) {
                used[i] = true;
                count += backtrack(n, index + 1, used);
                used[i] = false;
            }
        }
        return count;
    }
}
