class Solution {
    /**
     * Given an integer n, return the count of all numbers with unique digits, x, where 0 <= x < 10n.
     */
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        return countUnique(0, n, new HashSet<>());
    }

    private int countUnique(int current, int n, Set<Integer> used) {
        if (current == n) return 1;
        int count = 1;
        for (int i = (current == 0) ? 1 : 0; i < 10; i++) {
            if (!used.contains(i)) {
                used.add(i);
                count += countUnique(current + 1, n, used);
                used.remove(i);
            }
        }
        return count;
    }
}
