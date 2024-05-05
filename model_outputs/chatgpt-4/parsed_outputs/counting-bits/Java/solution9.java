class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            ans[i] = iterativeSetBitCount(i);
        }
        return ans;
    }

    private int iterativeSetBitCount(int number) {
        int count = 0;
        while (number != 0) {
            count += number & 1; // add the least significant bit
            number >>>= 1; // shift right
        }
        return count;
    }
}