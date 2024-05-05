class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            ans[i] = divideAndConquerBitCount(i);
        }
        return ans;
    }

    private int divideAndConquerBitCount(int number) {
        if (number == 0) return 0;
        return divideAndConquerBitCount(number / 2) + (number % 2);
    }
}