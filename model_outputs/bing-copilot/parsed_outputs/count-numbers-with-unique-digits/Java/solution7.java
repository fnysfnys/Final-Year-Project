public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        int[] count = {1};
        boolean[] used = new boolean[10];
        backtrack(n, 0, used, count);
        return count[0];
    }

    private void backtrack(int n, int index, boolean[] used, int[] count) {
        if (index == n) {
            count[0]++;
            return;
        }
        for (int i = 0; i < 10; i++) {
            if (!used[i]) {
                used[i] = true;
                backtrack(n, index + 1, used, count);
                used[i] = false;
            }
        }
    }
}
