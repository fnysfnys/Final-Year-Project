class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        int[] used = new int[10];
        return backtrack(used, 0, n);
    }

    private int backtrack(int[] used, int pos, int n) {
        if (pos == n) {
            return 1;
        }
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (used[i] == 0) {
                used[i] = 1;
                count += backtrack(used, pos + 1, n);
                used[i] = 0;
            }
        }
        return count;
    }
}
